/*
 * @Author: kevin
 * @Date: 2021-01-08 10:34:24
 * @LastEditors: Do not edit
 * @Description: 
 */

 
layui.define(['element', 'form','laypage','jquery','laytpl','layer','laydate','cookie','common','upload'],function(exports){
  var element = layui.element
  ,form = layui.form
  ,laypage = layui.laypage
  ,$ = layui.jquery
  ,laytpl = layui.laytpl
  ,layer = layui.layer
  ,laydate = layui.laydate
  ,cookie = layui.cookie
  ,common = layui.common
  ,upload =layui.upload

  common.showCity('province', 'city', 'district');
  // common.showCity('province', 'city');

  form.render();
  $.each(['startTime','startTime1','startTime2','endTime','endTime1','endTime2','birthday'],function (i,key) {
    laydate.render({
      elem: '#'+key
      ,format: 'yyyy年MM月dd日'
    });
  })

  //监听提交
  form.on('submit(formSubmit)', function(data){  
    var regObj = null;
    regObj = getFormJson("#form",$);
    console.log('regObj',regObj);
    console.log('JSON.stringify(data.field)',data.field)
    /* regObj.province = regObj.province,
        city = resData.city,
        district = resData.district */

    return false;
  });
  //三级地址联动
  // 个人信息
  getUuserInfo($)

  // 民族数据
  common.initNationOption()
  
  form.render('select');

  //拖拽上传
  upload.render({
    elem: '#upload-header'
    ,url: 'https://httpbin.org/post' //改成您自己的上传接口
    ,done: function(res){
      layer.msg('上传成功');
      layui.$('#uploadDemoView').removeClass('layui-hide').find('img').attr('src', res.files.file);
      console.log(res)
    }
  });

  //输出接口
  exports('userInfo', {}); 
});  

// 个人信息
function getUuserInfo($){
  $.ajax({
    url: '/api/basicInfo/detail',
    //data: //JSON.stringify(data),
    type: 'get',
    dataType: 'json',
    headers: {
      Authorization: $.cookie('Token')
    },
    // contentType: "application/json; charset=utf-8",
    beforeSend: function (request) {
      console.log('request',request);
       request.setRequestHeader("Authorization", $.cookie('Token'));
    },
    success: function (res) {
      if (res.code == 200) {
        layer.msg('注册成功！');
      
      } else {
        layer.msg(res.message || '未知错误');
      }
    },
    error: function () {
      layer.msg('注册失败！');
    },
  })
}


// 格式化from数据
function getFormJson(form,$) {
  var o = {};
  var a = $(form).serializeArray();
  $.each(a, function () {
    if (o[this.name] !== undefined) {
      if (!o[this.name].push) {
        o[this.name] = [o[this.name]];
      }
      o[this.name].push(this.value || '');
    } else {
      if (this.name.indexOf('.') > -1) {
        var t = this.name.split('.');
        if (!o[t[0]]) {
          o[t[0]] = []
        }
        if (!o[t[0]][t[1]]) {
          o[t[0]][t[1]] = {}
        }
        o[t[0]][t[1]][t[2]] = this.value || ''
      } else {
        o[this.name] = this.value || '';
      }
    }
  });
  return o;
}

 