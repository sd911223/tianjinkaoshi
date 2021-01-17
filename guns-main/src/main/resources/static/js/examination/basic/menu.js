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
        'basic-index.html'
        ,'basic-info.html'
        ,'basic-commit.html'//报名信息提交
        ,'basic-interviewResult.html'//信息审核状态
        ,'basic-paymentOfInterview.html'// 在线缴费
        ,'basic-printWriteTicketCard.html'// 报名表和准考证打印
        ,'basic-printInterviewTicketCard.html'// 打印成绩单
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
