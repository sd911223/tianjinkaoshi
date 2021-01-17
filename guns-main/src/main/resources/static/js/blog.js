/**

 @Name：招聘考试
 @Author：zyc
 @License：MIT

 */
layui.define(['element', 'form','laypage','jquery','laytpl','layer','cookie'],function(exports){
  var element = layui.element
  ,form = layui.form
  ,laypage = layui.laypage
  ,$ = layui.jquery
  ,laytpl = layui.laytpl
  ,layer = layui.layer
  ,cookie = layui.cookie

  let token = $.cookie('Token')
  if(token){
    // location.href = '/html/study-main.html'
  }
  // 获得表单数据
  $.fn.getFormData = function(){
    var data = {};
    var dataArray = $(this).serializeArray();
    for(var i=0;i<dataArray.length;i++){
      data[dataArray[i].name] = dataArray[i].value;
    }
    return data;
  }

  function getBaseOps(options){
    return {
      type: options.type ||2
      ,offset: options.type //具体配置参考：http://www.layui.com/doc/modules/layer.html#offset
      ,id: options.id+type //防止重复弹出
      ,content: options.url
      ,btn: ['提交','关闭']
      ,btnAlign: 'c' //按钮居中
      ,shade: 0.8 // 0不显示遮罩
      ,success: function(layero, index){
        console.log(layero.find('iframe')[0]['name'],index,window)
        alert(window[layero.find('iframe')[0]['name']])
        //var body = layer.getChildFrame('body', index);
        //var iframeWin = window[layero.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
        //console.log(body) //得到iframe页的body内容
        //body.find('input').val('Hi，我是从父页来的')
      }
      ,yes: function(){
        alert("yes");
      }
      ,btn2: function(index, layero){
        layer.closeAll();
      }
    }
  }

  //注册
  $("#regBtn").on('click', function(){
    var type = "auto";
    layer.open({
      area:['500px','580px']
      ,title:'注册'
      ,type: 2
      ,offset: type //具体配置参考：http://www.layui.com/doc/modules/layer.html#offset
      ,id: 'layerReg'+type //防止重复弹出
      ,content: './comm/reg.html'
      ,btn: ['提交','关闭']
      ,btnAlign: 'c' //按钮居中
      ,shade: 0.3 // 0不显示遮罩
      ,success: function(layero, index){
        console.log(layero.find('iframe')[0]['name'],index,window)
        // alert(window[layero.find('iframe')[0]['name']])
        // var body = layer.getChildFrame('body', index);
        //var iframeWin = window[layero.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
        //console.log(body) //得到iframe页的body内容
        //body.find('input').val('Hi，我是从父页来的')
      }
      ,yes: function(index,layero){
        var value = $(layero).find("iframe").contents().find("#reg-form")
        console.log('value.val()',value.getFormData());
        let data = value.getFormData()
        console.log('data',data);
        $.ajax({
          url: '/sysUser/add',
          data: JSON.stringify(data),
          type: 'post',
          dataType: 'json',
          contentType: "application/json; charset=utf-8",
          beforeSend: function (request) {
            console.log('request',request);
            // request.setRequestHeader("Token", $.cookie('Token'));
          },
          success: function (res) {
            if (res.code == 200) {
              layer.msg('注册成功！');

            } else {
              layer.msg(res.status.msg || '未知错误');
            }
          },
          error: function () {
            layer.msg('注册失败！');
          },
        })

      }
      ,btn2: function(index, layero){
        layer.closeAll();
      }
    });
  })

  // 登录
  // var regObj = null;
  form.on('submit(login)', function(data){
    console.log('JSON.stringify(data.field)',data.field)
    $.ajax({
      url: '/api/login',
      data: JSON.stringify(data.field),
      type: 'post',
      dataType: 'json',
      contentType: "application/json; charset=utf-8",
      beforeSend: function (request) {
        console.log('request',request);
        // request.setRequestHeader("Token", $.cookie('Token'));
      },
      success: function (res) {
        console.log('res',res);
        if (res.code == 200) {
          layer.msg('登录成功！');
          var token = res.data;
          location.href = '/html/zp/student/study-main.html'
          $.cookie('Token', 'Bearer ' +token);
        } else {
          layer.msg(res.message || '未知错误！');
        }
      },
      error: function () {
        layer.msg('登录失败！');
      },
    })
    return false;
  });

  //忘记密码
  $("#forgetBtn").on('click', function(){
    var type = "auto";
    layer.open({
      area:['500px','580px']
      ,title:'注册'
      ,type: 2
      ,offset: type //具体配置参考：http://www.layui.com/doc/modules/layer.html#offset
      ,id: 'layerForget'+type //防止重复弹出
      ,content: './comm/forgetpwd.html'
      ,btn: ['提交','关闭']
      ,btnAlign: 'c' //按钮居中
      ,shade: 0.3 // 0不显示遮罩
      ,success: function(layero, index){
        console.log(layero.find('iframe')[0]['name'],index,window)
        alert(window[layero.find('iframe')[0]['name']])
        //var body = layer.getChildFrame('body', index);
        //var iframeWin = window[layero.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
        //console.log(body) //得到iframe页的body内容
        //body.find('input').val('Hi，我是从父页来的')
      }
      ,yes: function(){
        alert("yes");
      }
      ,btn2: function(index, layero){
        layer.closeAll();
      }
    });
  })

  //statr 分页

  laypage.render({
    elem: 'test1' //注意，这里的 test1 是 ID，不用加 # 号
    ,count: 50 //数据总数，从服务端得到
    ,theme: '#1e9fff'
  });

  // end 分頁



  // start 导航显示隐藏

  $("#mobile-nav").on('click', function(){
    $("#pop-nav").toggle();
  });

  // end 导航显示隐藏




  //start 评论的特效

  (function ($) {
    $.extend({
        tipsBox: function (options) {
          options = $.extend({
            obj: null,  //jq对象，要在那个html标签上显示
            str: "+1",  //字符串，要显示的内容;也可以传一段html，如: "<b style='font-family:Microsoft YaHei;'>+1</b>"
            startSize: "12px",  //动画开始的文字大小
            endSize: "30px",    //动画结束的文字大小
            interval: 600,  //动画时间间隔
            color: "red",    //文字颜色
            callback: function () { }    //回调函数
          }, options);

          $("body").append("<span class='num'>" + options.str + "</span>");

          var box = $(".num");
          var left = options.obj.offset().left + options.obj.width() / 2;
          var top = options.obj.offset().top - 10;
          box.css({
            "position": "absolute",
            "left": left + "px",
            "top": top + "px",
            "z-index": 9999,
            "font-size": options.startSize,
            "line-height": options.endSize,
            "color": options.color
          });
          box.animate({
            "font-size": options.endSize,
            "opacity": "0",
            "top": top - parseInt(options.endSize) + "px"
          }, options.interval, function () {
            box.remove();
            options.callback();
          });
        }
      });
  })($);

  function niceIn(prop){
    prop.find('i').addClass('niceIn');
    setTimeout(function(){
      prop.find('i').removeClass('niceIn');
    },1000);
  }

  $(function () {
    $(".like").on('click',function () {

      if(!($(this).hasClass("layblog-this"))){
        this.text = '已赞';
        $(this).addClass('layblog-this');
        $.tipsBox({
          obj: $(this),
          str: "+1",
          callback: function () {
          }
        });
        niceIn($(this));
        layer.msg('点赞成功', {
          icon: 6
          ,time: 1000
        })
      }
    });
  });

  //end 评论的特效


  // start点赞图标变身
  $('#LAY-msg-box').on('click', '.info-img', function(){
    $(this).addClass('layblog-this');
  })


  // end点赞图标变身

  //end 提交
  $('#item-btn').on('click', function(){
    var elemCont = $('#LAY-msg-content')
    ,content = elemCont.val();
    if(content.replace(/\s/g, '') == ""){
      layer.msg('请先输入留言');
      return elemCont.focus();
    }

    var view = $('#LAY-msg-tpl').html()

    //模拟数据
    ,data = {
      username: '闲心'
      ,avatar: '../res/static/images/info-img.png'
      ,praise: 0
      ,content: content
    };

    //模板渲染
    laytpl(view).render(data, function(html){
      $('#LAY-msg-box').prepend(html);
      elemCont.val('');
      layer.msg('留言成功', {
        icon: 1
      })
    });

  })

  // 提交报名信息
  $('#submit-info').on('click', function(){
    console.log('8888', 8888)
    $('#submit-first').hide()
    $('#submit-second').show()
  })

  // 去缴费
  $('#gotoPay').on('click', function(){
    console.log('Goto Pay',)
  })

  // start  图片遮罩
  var layerphotos = document.getElementsByClassName('layer-photos-demo');
  for(var i = 1;i <= layerphotos.length;i++){
    layer.photos({
      photos: ".layer-photos-demo"+i+""
      ,anim: 0
    });
  }
  // end 图片遮罩




  //输出test接口
  exports('blog', {});
});
