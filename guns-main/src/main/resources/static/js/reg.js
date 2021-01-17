/**

 @Name：招聘考试
 @Author：zyc
 @License：MIT
    
 */
layui.define(['element', 'form','laypage','jquery','laytpl','layer'],function(exports){
    var element = layui.element
    ,form = layui.form
    ,laypage = layui.laypage
    ,$ = layui.jquery
    ,laytpl = layui.laytpl
    ,layer = layui.layer;
    
    form.render();

    //监听提交
    form.on('submit(formDemo)', function(data){
      layer.msg(JSON.stringify(data.field));
      return false;
    });
    
    //输出接口
    exports('reg', {}); 
  });  
