/**

 @Name：招聘考试-左侧菜单
 @Author：zyc
 @License：MIT

 */
layui.define(['transfer', 'jquery', 'layer', 'util'], function(){
    var $ = layui.jquery
      ,transfer = layui.transfer
      ,layer = layui.layer
      ,util = layui.util;

    //模拟数据
    var data1 = [
        {"value": "1", "title": "李白"}
        ,{"value": "2", "title": "杜甫"}
        ,{"value": "3", "title": "苏轼"}
        ,{"value": "4", "title": "李清照"}
        ,{"value": "5", "title": "鲁迅", "disabled": true}
        ,{"value": "6", "title": "巴金"}
        ,{"value": "7", "title": "冰心"}
        ,{"value": "8", "title": "矛盾"}
        ,{"value": "9", "title": "贤心"}
    ]

      ,data2 = [
        {"value": "1", "title": "瓦罐汤"}
        ,{"value": "2", "title": "油酥饼"}
        ,{"value": "3", "title": "炸酱面"}
        ,{"value": "4", "title": "串串香", "disabled": true}
        ,{"value": "5", "title": "豆腐脑"}
        ,{"value": "6", "title": "驴打滚"}
        ,{"value": "7", "title": "北京烤鸭"}
        ,{"value": "8", "title": "烤冷面"}
        ,{"value": "9", "title": "毛血旺", "disabled": true}
        ,{"value": "10", "title": "肉夹馍"}
        ,{"value": "11", "title": "臊子面"}
        ,{"value": "12", "title": "凉皮"}
        ,{"value": "13", "title": "羊肉泡馍"}
        ,{"value": "14", "title": "冰糖葫芦", "disabled": true}
        ,{"value": "15", "title": "狼牙土豆"}
    ]

    //基础效果
    transfer.render({
        elem: 'test1'
        ,data: data1
    });

    //穿梭时的回调
    /* transfer.render({
       elem: '#test6'
       ,data: data1
       ,onchange: function(obj, index){
         var arr = ['左边', '右边'];
         layer.alert('来自 <strong>'+ arr[index] + '</strong> 的数据：'+ JSON.stringify(obj)); //获得被穿梭时的数据
       }
     })*/

    exports('choiceUnit', {});
});

    //输出接口

