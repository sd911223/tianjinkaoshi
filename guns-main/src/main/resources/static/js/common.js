/**
 * @authors Mzong(mzong121491@gmail.com)
 * @date    2019-01-18 11:15
 * @requires  layui
 * @version $1.1.0$
 */
layui.define("layer", function (exports) {
  //提示：模块也可以依赖其它模块，如：layui.define('layer', callback);
  var $ = layui.jquery,
    form = layui.form;
  // 返回的对象
  var returnObj = {
		/**
		 * 省市县三级联动
		 *
		 * @param { string } [form] [form是layui.form对象]
		 * @param {string} [province] [省容器的name名字 ]
		 *    eg:<select name="province">
		 * @param {string} [city] [省容器的name名字]
		 * @param {string} [district] [县容器的name名字]
		 * @return {undefined} [无返回值]
		 */
    showCity: function (province, city, district) {
      //AreaData是地址传过来的json对象
      var AreaData = $.rawCitiesData;
      if ("undefined" == typeof AreaData) {
        layer.open({
          title: '系统提示'
          , content: '调用showCity之前请引入地址数据'
        });
        return;
      }
      var htmlProvince = '',
        htmlCity = '',
        htmlDistrict = '',
        cityData = '',
        districtData = '',
        $province = $('select[name=' + province + ']'),
        $city = $('select[name=' + city + ']'),
        $district = $('select[name=' + district + ']'),
        provVal = $province.attr('data-area') || '', // 省默认值
        cityVal = $city.attr('data-area') || '', // 市默认值
        distVal = $district.attr('data-area') || ''; // 县默认值
      $province.find('option').not(':first').remove();
      $city.find('option').not(':first').remove();
      $district.find('option').not(':first').remove();
      form.render('select');

      // 加载省数据
      loadProvince();
      function loadProvince() {
        AreaData.forEach(function (v, i) {
          htmlProvince += '<option value=' + v.code + '>' + v.name + '</option>';
        });
        $province.append(htmlProvince);

        // 默认选中省
        defaultSelect($province, provVal, function (code) {
          console.log('6',6);
          cityData = findPlace(AreaData, code);
          console.log('cityData',cityData);
          loadCity(cityData, true);
        });

        console.log('6666',6666);
        form.render('select');

      }

      // 加载城市数据
      function loadCity(city, hasDefault) {
        console.log('city',city);
        $city.find('option').not(':first').remove();
        htmlCity = '';
        var city = city || [];
        city.forEach(function (v, i) {
          htmlCity += '<option value=' + v.code + '>' + v.name + '</option>';
        });
        $city.append(htmlCity);

        // 默认加载才执行，手动选中不执行
        if (hasDefault) {
          // 默认选中城市
          defaultSelect($city, cityVal, function (code) {
            // console.log(code)
            // 加载默认城市数据
            districtData = findPlace(cityData, code);
            loadDistrict(districtData, true);
          });
        }

        form.render('select');
      }

      // 加载县数据
      function loadDistrict(districtData, hasDefault) {
        $district.find('option').not(':first').remove();
        htmlDistrict = '';
        var districtData = districtData || [];
        districtData.forEach(function (v, i) {
          htmlDistrict += '<option value=' + v.code + '>' + v.name + '</option>';
        });
        $district.append(htmlDistrict);

        if (hasDefault) {
          // 默认选中县
          defaultSelect($district, distVal);
        }

        form.render('select');
      }

      // 查找地点数据
      function findPlace(data, code) {
        var resData = [];
        data.forEach(function (v, i) {
          if (v.code === code) {
            resData = v.sub
          }
        });

        return resData;
      }

			/* 
			* 查找默认选中项
			* @param {object} jq元素
			* @param {string} 默认值
			* @param {function} 回调函数
			*/
      function defaultSelect($el, SelectVal, callback) {
        $('option', $el).each(function (i, el) {
          var $this = $(this);
          var optVal = $this.html();
          var code;
          if (optVal == SelectVal) {
            $this.attr("selected", true);
            code = $this.val();
            // 加载默认城市数据
            callback && callback(code);
          }
        });
      }

      // 省选择
      form.on('select(' + province + ')', function (data) {
        var code = data.value;
        // console.log(data.elem); //得到select原始DOM对象
        // console.log(code); //得到被选中的值
        if (code != '') {

          cityData = findPlace(AreaData, code);

          loadCity(cityData);
          loadDistrict();

        } else {
          loadCity();
          loadDistrict();
        }
        // console.log(data.othis); //得到美化后的DOM对象
      });
      // 市选择
      form.on('select(' + city + ')', function (data) {
        var code = data.value;
        if (code != '') {

          districtData = findPlace(cityData, code);

          loadDistrict(districtData);
          // console.log(data.elem); //得到select原始DOM对象
        } else {
          loadDistrict();
        }
        // console.log(data.othis); //得到美化后的DOM对象
      });
      form.on('select(' + district + ')', function (data) {
        // console.log(data.elem); //得到select原始DOM对象
        // console.log(data.value); //得到被选中的值
        // console.log(data.othis); //得到美化后的DOM对象
      });
    },
		/**
		 * 获取省市县数据
		 *
		 * @param { object } [address] [address eg:广东省广州市天河区]
		 * @return {object} [address][根据code码返回地址名称]
		 */
    getCity: function (address) {
      //AreaData是地址传过来的json对象
      var AreaData = $.rawCitiesData;
      if ("undefined" == typeof AreaData) {
        layer.open({
          title: '系统提示'
          , content: '调用getCity之前请引入地址数据'
        });
        return;
      }
      var province = address.province,
        city = address.city,
        district = address.district,
        provinceName = '',
        cityName = '',
        districtName = '';

      function findIndex(arr, target) {
        return arr.findIndex(function (v, i) {
          return target == v.code;
        })
      }

      if (province) {
        var findProvinceIndex = findIndex(AreaData, province);
        provinceName = AreaData[findProvinceIndex].name;
      }

      if (province && city) {
        var findCityIndex = findIndex(AreaData[findProvinceIndex].sub, city);
        cityName = AreaData[findProvinceIndex].sub[findCityIndex].name;
      }

      if (province && city && district) {
        var findDistrictIndex = findIndex(AreaData[findProvinceIndex].sub[findCityIndex].sub, district);

        districtName = AreaData[findProvinceIndex].sub[findCityIndex].sub[findDistrictIndex].name;
      }

      return {
        provinceName: provinceName,
        cityName: cityName,
        districtName: districtName
      }
    },

    initNationOption: function () {
      var opArr = [];
      var nationArr = [{
        "id": "汉族",
        "name": "汉族"
      }, {
        "id": "蒙古族",
        "name": "蒙古族"
      }, {
        "id": "回族",
        "name": "回族"
      },
      {
        "id": "藏族",
        "name": "藏族"
      }, {
        "id": "维吾尔族",
        "name": "维吾尔族"
      }, {
        "id": "苗族",
        "name": "苗族"
      },
      {
        "id": "彝族",
        "name": "彝族"
      }, {
        "id": "壮族",
        "name": "壮族"
      }, {
        "id": "布依族",
        "name": "布依族"
      },
      {
        "id": "朝鲜族",
        "name": "朝鲜族"
      }, {
        "id": "满族",
        "name": "满族"
      }, {
        "id": "侗族",
        "name": "侗族"
      },
      {
        "id": "瑶族",
        "name": "瑶族"
      }, {
        "id": "白族",
        "name": "白族"
      }, {
        "id": "土家族",
        "name": "土家族"
      },
      {
        "id": "哈尼族",
        "name": "哈尼族"
      }, {
        "id": "哈萨克族",
        "name": "哈萨克族"
      }, {
        "id": "傣族",
        "name": "傣族"
      },
      {
        "id": "黎族",
        "name": "黎族"
      }, {
        "id": "傈僳族",
        "name": "傈僳族"
      }, {
        "id": "佤族",
        "name": "佤族"
      },
      {
        "id": "畲族",
        "name": "畲族"
      }, {
        "id": "高山族",
        "name": "高山族"
      }, {
        "id": "拉祜族",
        "name": "拉祜族"
      },
      {
        "id": "水族",
        "name": "水族"
      }, {
        "id": "东乡族",
        "name": "东乡族"
      }, {
        "id": "纳西族",
        "name": "纳西族"
      },
      {
        "id": "景颇族",
        "name": "景颇族"
      }, {
        "id": "柯尔克孜族",
        "name": "柯尔克孜族"
      }, {
        "id": "土族",
        "name": "土族"
      },
      {
        "id": "达斡尔族",
        "name": "达斡尔族"
      }, {
        "id": "仫佬族",
        "name": "仫佬族"
      }, {
        "id": "羌族",
        "name": "羌族"
      },
      {
        "id": "布朗族",
        "name": "布朗族"
      }, {
        "id": "撒拉族",
        "name": "撒拉族"
      }, {
        "id": "毛难族",
        "name": "毛难族"
      },
      {
        "id": "仡佬族",
        "name": "仡佬族"
      }, {
        "id": "锡伯族",
        "name": "锡伯族"
      }, {
        "id": "阿昌族",
        "name": "阿昌族"
      },
      {
        "id": "普米族",
        "name": "普米族"
      }, {
        "id": "塔吉克族",
        "name": "塔吉克族"
      }, {
        "id": "怒族",
        "name": "怒族"
      },
      {
        "id": "乌孜别克族",
        "name": "乌孜别克族"
      }, {
        "id": "俄罗斯族",
        "name": "俄罗斯族"
      }, {
        "id": "鄂温克族",
        "name": "鄂温克族"
      },
      {
        "id": "崩龙族",
        "name": "崩龙族"
      }, {
        "id": "保安族",
        "name": "保安族"
      }, {
        "id": "裕固族",
        "name": "裕固族"
      },
      {
        "id": "京族",
        "name": "京族"
      }, {
        "id": "塔塔尔族",
        "name": "塔塔尔族"
      }, {
        "id": "独龙族",
        "name": "独龙族"
      },
      {
        "id": "鄂伦春族",
        "name": "鄂伦春族"
      }, {
        "id": "赫哲族",
        "name": "赫哲族"
      }, {
        "id": "门巴族",
        "name": "门巴族"
      },
      {
        "id": "珞巴族",
        "name": "珞巴族"
      }, {
        "id": "基诺族",
        "name": "基诺族"
      }
      ];
      var i = -1;
      var l = nationArr.length;
      while (++i < l) {
        opArr.push('<option value="' + nationArr[i].id + '">' + nationArr[i].name + '</option>');
      }
      $('#nation').html(opArr.join(''))
    }

  }

  // exports module
  exports('common', returnObj);
});
