/**

 @Name：应聘信息查看
 @Author：kevin
 @License：MIT

 */

layui.define(['table'],function(exports){
  var table = layui.table;
  //驳回信息查看
  table.on('tool(rejTable)', function(obj){
    console.log('666', 666)
    var data = obj.data;

    if(obj.event === 'edit'){
      layer.alert('编辑行：<br>'+ JSON.stringify(data))
    }
  });
  var $ = layui.$, active = {
    getCheckData: function(){ //获取选中数据
      var checkStatus = table.checkStatus('rejTable')
        ,data = checkStatus.data;
      layer.alert(JSON.stringify(data));
    }
  }

  //输出接口
  exports('tableData', {});
});
