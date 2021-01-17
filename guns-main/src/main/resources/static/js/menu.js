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
        'study-index.html'
        ,'study-reg.html'
        ,'study-choiceUnit.html'
        ,'study-commit.html'
        ,'study-interviewResult.html'
        ,'study-paymentOfWrite.html'
        ,'study-printWriteTicketCard.html'
        ,'study-interview.html'
        ,'study-paymentOfInterview.html'
        ,'study-printInterviewTicketCard.html']
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
