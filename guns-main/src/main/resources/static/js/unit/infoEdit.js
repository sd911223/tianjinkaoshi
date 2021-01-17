layui.define(['element', 'form','jquery','laytpl'],function(exports){
  var element = layui.element
    ,form = layui.form
    ,$ = layui.jquery
    ,laytpl = layui.laytpl

  form.render();

  form.on('submit(unitSave)', function(data){

    console.log('JSON.stringify(data.field)',data.field)
    /* regObj.province = regObj.province,
        city = resData.city,
        district = resData.district */

    return false;
  });


  //输出接口
  exports('infoEdit', {});
});
