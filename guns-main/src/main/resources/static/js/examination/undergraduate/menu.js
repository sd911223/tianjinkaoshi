/*
 * @Author: kevin
 * @Date: 2021-01-11 17:40:34
 * @LastEditors: Do not edit
 * @Description:
 */
/**

 @Name：招聘考试-左侧菜单
 @Author：zyc
 @License：MIT

 */
layui.define(['element', 'form','jquery','laytpl'],function(exports){
    var element = layui.element
    ,form = layui.form
    ,$ = layui.jquery
    ,laytpl = layui.laytpl

    form.render();

    //左侧菜单效果
    var srcForStudy = [
        'undergraduate-index.html'
        ,'undergraduate-info.html'
        ,'undergraduate-commit.html'//报名信息提交
        ,'undergraduate-interviewResult.html'//信息审核状态
        ,'undergraduate-paymentOfInterview.html'// 在线缴费
        ,'undergraduate-printWriteTicketCard.html'// 报名表和准考证打印
        ,'undergraduate-printInterviewTicketCard.html'// 打印成绩单
        ,'undergraduate-paymentOfInterview.html'// 面试缴费
        ,'undergraduate-printWriteTicketCard.html'// 综合笔试准考证打印

    ]
    var iframe = $("#showMenuframe")[0];
    $("#left-menu").find("li").on('click',function(){
        $("#left-menu").find("li").removeClass("visited");
        $(this).addClass("visited");
        IframeOpenUrl(iframe,srcForStudy[$("#left-menu").find("li").index($(this))]);
    })
    /**
     * 在指定iframe中打开页面
     * @param {obj} ifr
     * @param {string} url
     */
    function IframeOpenUrl(ifr, url){
        ifr.src = url;
    }


    //输出接口
    exports('menu', {});
  });
