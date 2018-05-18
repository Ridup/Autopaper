<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html class=" XL">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta name="renderer" content="webkit"><!--用在360中-->
    <meta name="force-rendering" content="webkit"><!--用在其它-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
    <link rel="shortcut icon" type="image/x-icon" href="https://zujuan.21cnjy.com/images/favicon.ico">
    <link rel="apple-touch-icon" href="https://zujuan.21cnjy.com/images/touchicon.png">
    <meta name="csrf-param" content="_csrf">
    <meta name="csrf-token"
          content="2tObdh4PcaU3_IZf-TfVW6GrfER5u1R8xJCNGWaFLkSNot8hREU9zFzE3C2wZp8EzOMMLjLXZjiOvftRDNdGAA==">
    <title>试卷搜索</title>
    <script src="<%=request.getContextPath()%>/static/js/extends/hm.js"></script>
    <script>
        (function (doc, win) {
            // 基于 window.screen.width 实现自适应布局
            var screenWidth = 0,
                size = 'XL',
                root = doc.documentElement;
            if (window.screen && screen.width) {
                screenWidth = screen.width;
                if (screenWidth >= 1200) size = 'XL'; // 大屏 - 1200px
                else if (screenWidth < 1200) size = 'XS'; // 小屏 - 1000px
            }
            root.className += " " + size; // 标记CSS
            win.SIZE = size; // 标记JS
        })(document, window);

        window.OT2 = {}; // 全局命名空间
        OT2.AboveIE9 = true; // 默认非iE或IE9及以上
        OT2.ns = function (name) {
            var container = OT2;
            var parts = name.split('.');
            var current = '';
            if (parts[0] == 'OT2') parts.shift();
            while (current = parts.shift()) {
                if (!container[current]) container[current] = {};
                container = container[current];
            }
            return container;
        };
        var HostInfo = "https://zujuan.21cnjy.com/";
        USER = {};//通知js用户的信息
        OT2.CSRF = {"_csrf": "2tObdh4PcaU3_IZf-TfVW6GrfER5u1R8xJCNGWaFLkSNot8hREU9zFzE3C2wZp8EzOMMLjLXZjiOvftRDNdGAA=="};
    </script>
    <!--[if lt IE 9]>
    <script> OT2.AboveIE9 = false;</script>
    <![endif]-->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/base.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/spriter-mix.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/ui-dialog.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/artDialog-skin-ot2.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/main.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/popup.min.css">
    <script src="<%=request.getContextPath()%>/static/js/lib/jquery.min.js"></script>
    <script type="text/javascript">$.ajaxSetup({cache: false});</script>
    <script src="<%=request.getContextPath()%>/static/js/lib/underscore-min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/cookie.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/lib/json3.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/lib/dialog-plus.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/artDialog-config.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/element.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/localdata.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/util.min.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/search.min.css">
    <style>html, * {
        -webkit-user-select: text !important;
        -moz-user-select: text !important;
    }</style>
    <%--    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/layer.css" id="layuicss-skinlayercss">--%>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/layui/css/layui.css">
    <script src="<%=request.getContextPath()%>/static/layui/layui.js"></script>
</head>


<body>
<!--[if lt IE 7]>
<link href="<%=request.getContextPath()%>/static/css/kill-ie.css" rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath()%>/static/js/extends//kill-ie.js"></script>
<![endif]-->


<div class="bg-header">
    <div class="g-content">
        <div class="main">
            <div class="form-wrap">
                <form class="f-cb" action="<%=request.getContextPath()%>/question/search.do?grade=${currentGrade.grade}&amp;gradeName=${currentGrade.gradeName}&amp;course=${currentCourse.course}&amp;courseName=${currentCourse.courseName}&amp;questionType=${currentQuestionType}" id="global-search-form">
                    <input type="hidden" name="chid" value="">
                    <input type="hidden" name="xd" value="">
                    <div class="search-text" id="J_SearchMenu">
                        <span class="text-select"><em class="J_tit">试题</em></span>
                    </div>
                    <div class="search-inputbox">
                        <input type="text" name="content" value="${currentContent}" class="search-input" placeholder="请输入关键词搜索">
                        <input type="hidden" name="grade" value="${currentGrade.grade}">
                        <input type="hidden" name="gradeName" value="${currentGrade.gradeName}">
                        <input type="hidden" name="course" value="${currentCourse.course}">
                        <input type="hidden" name="courseName" value="${currentCourse.courseName}">
                        <input type="hidden" name="currentQuestionType" value="${currentQuestionType}">

                    </div>
                    <div class="search-btn">
                        <button class="btn" type="submit"><i class="icona-search1"></i></button>
                    </div>
                </form>
            </div>
        </div>
        <div class="left">
            <a href="<%=request.getContextPath()%>/index.do"><img src="<%=request.getContextPath()%>/static/images/search-logo.png" alt="logo"></a>
        </div>
        <c:if test="${!isLogin}">
            <div class="right">
                <a href="<%=request.getContextPath()%>/user/login.do" class="login" onclick="OT2.Global.initLogin(); return false;">登录</a>
                <a href="<%=request.getContextPath()%>/user/register.do" class="register">注册</a>
            </div>
        </c:if>
    </div>
</div>
<div class="g-content">
    <div class="breadcrumb">
        <i class="icona-dingwei"></i>当前位置：<a href="<%=request.getContextPath()%>/index.do">首页</a><b>&gt;</b><a
            href="<%=request.getContextPath()%>/question/search.do?content=">${currentGrade.gradeName}${currentCourse.courseName}</a>
    </div>
    <div class="search-type">


        <%--多条件搜索开始--%>
        <div class="type-items">
            <div class="type-tit">学科：</div>
            <div class="type-conbox">
                <div class="type-con expand-mode">
                    <div class="con-items">
                        <c:choose>
                            <c:when test="${currentGrade.grade==null||currentGrade.grade==''}">
                                <a class="type-active" href="<%=request.getContextPath()%>/paper/search.do?content=${currentContent}" style="float: left;margin-top: 11px;">不限</a>
                            </c:when>
                            <c:otherwise><a class="" href="<%=request.getContextPath()%>/paper/search.do?content=${currentContent}" style="float: left;margin-top: 11px;">不限</a></c:otherwise>
                        </c:choose>
                        <c:forEach items="${allCourses}" var="courses">
                            <div>
                                <c:forEach items="${courses.coursePojos}" var="course">
                                    <c:choose>
                                        <c:when test="${courses.gradeId==currentGrade.grade&&course.course==currentCourse.course}">
                                            <a class="type-active" href="<%=request.getContextPath()%>/paper/search.do?grade=${courses.gradeId}&amp;gradeName=${courses.gradeName}&amp;course=${course.course}&amp;courseName=${course.courseName}&amp;content=${currentContent}">${courses.gradeName}${course.courseName}</a>
                                        </c:when>
                                        <c:otherwise>
                                            <a class="" href="<%=request.getContextPath()%>/paper/search.do?grade=${courses.gradeId}&amp;gradeName=${courses.gradeName}&amp;course=${course.course}&amp;courseName=${course.courseName}&amp;content=${currentContent}">${courses.gradeName}${course.courseName}</a>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </div>
                        </c:forEach>
                    </div>
                    <span class="show-more">更多<i></i></span></div>
            </div>
        </div>



        <%--多条件搜索结束--%>























    </div>
    <div class="all-search f-cb">
        <div class="relevant-search">
            相关试卷共<strong>${count}</strong>道
        </div>
    </div>
    <div class="search-list">
        <c:if test="${count==0}">
            <i class="layui-icon layui-icon-face-surprised" style="font-size: 30px; color: #FF5722;margin: auto">没有找到相关的试卷呢</i>
        </c:if>
        <ul id="J_QuestionList">


            <c:forEach items="${papers}" var="paper">

                <li style="height: 100px;">
                    <div class="search-list-left" >
                        <div class="test-pic">
                            <i class="icona-test"></i>
                        </div>
                        <div class="test-txt">
                            <p><a href="<%=request.getContextPath()%>/paper/view.do?paperId=${paper.paperId}" target="_blank" title="${paper.paperName}">${paper.paperName}</a></p>
                            <p>
                                <span><i class="icona-time"></i>修改时间：<fmt:formatDate value="${paper.createTime}" type="date"/></span>
                                <span><i class="icona-see5"></i>下载次数：${paper.downloadTimes}</span>
                                <span><i class="icona-leixing"></i>类型：同步试卷</span>
                            </p>
                        </div>
                    </div>
                    <div class="search-list-right">
                        <%--<a href="javascript:;" onclick="OT2.PaperAnalysis.show('/paper/pie/929606')"><i class="icona-fenxi2"></i>试卷分析</a>--%>
                        <a href="<%=request.getContextPath()%>/paper/test?paperId=${paper.paperId}" target="_blank"><i class="icona-ceshi"></i>开始测试</a>
                        <a href="javascript:;" onclick="paper_download(${paper.paperId})" class="download-btn"><i class="icona-download1"></i>下载</a>
                    </div>
                </li>

            </c:forEach>





            <%--            列表开始*******************************************************************************************************************************  --%>
<%--
            <c:forEach items="${papers}" var="paper" varStatus="vs">
                <li data-qid="${question.questionId}">
                    <div class="search-exam">
                        <div class="exam-head">
                            <p class="exam-head-left">
                                <span>题型：${question.enumQuestionType.desc}</span><i class="line"></i>
                                <span>题类：${question.enumQuestionClass.desc}</span><i class="line"></i>
                                <span>难易度：${question.enumQuestionDifficulty.desc}</span>&lt;%&ndash;TODO 难易度评分星星&ndash;%&gt;
                            </p>
                            <p class="exam-head-right">



                                <c:if test="${question.source!=null&&question.source!=''}">
                                    <span>试题来源：<a href="javascript:void(0)" target="_blank">${question.source}</a></span>
                                </c:if>



                            </p>
                        </div>
                        <div class="exam-con">
                            <div class="exam-q">
                                    ${vs.index+1}. ${question.questionContent}
                            </div>




                            <c:if test="${question.questionType==101}">
                                <div class="exam-s">
                            <span class="op-item" style="width: 289px; margin-right: 0px; height: 32px; clear: none;">
                                <span class="op-item-nut" style="margin-top: 4px;">A . </span>
                                <span class="op-item-meat" style="margin-top: 4px;">
                                        ${question.selectionA}
                                </span>
                            </span>
                                    <span class="op-item" style="width: 289px; margin-right: 0px; height: 32px; clear: none;">
                                 <span class="op-item-nut" style="margin-top: 4px;">B . </span>
                                 <span class="op-item-meat" style="margin-top: 4px;">
                                         ${question.selectionB}
                                 </span>
                             </span>
                                    <span class="op-item" style="width: 289px; margin-right: 0px; height: 32px; clear: none;">
                                  <span class="op-item-nut" style="margin-top: 4px;">C . </span>
                                  <span class="op-item-meat" style="margin-top: 4px;">
                                          ${question.selectionC}
                                  </span>
                              </span>
                                    <span class="op-item" style="width: 289px; margin-right: 0px; height: 32px; clear: none;">
                                   <span class="op-item-nut" style="margin-top: 4px;">D . </span>
                                   <span class="op-item-meat" style="margin-top: 4px;">
                                           ${question.selectionD}
                                   </span>
                               </span>
                                </div>
                            </c:if>
                            <c:if test="${question.questionType==102}">
                                <div class="exam-s">
                                    <span class="op-item" style="width: 200px; margin-right: 0px; height: 32px; clear: none;">
                                <i class="layui-icon">&#xe605;</i> 对
                            </span>
                                    <span class="op-item" style="width: 200px; margin-right: 0px; height: 32px; clear: none;">
                                <i class="layui-icon">&#x1006;</i> 错
                            </span>
                                </div>
                            </c:if>




                        </div>
                        <div class="exam-foot">
                            <p class="exam-foot-left">
                                <a target="_blank" href="<%=request.getContextPath()%>/question/detail/.do?questionId=${question.questionId}"><i
                                        class="icona-jiexi"></i>查看解析</a>
                                <c:choose>
                                    <c:when test="${question.questionFav!=null}">
                                        <a href="javascript:;" onclick="questionFav(this, ${question.questionId} )"><i class="icona-quxiaosc"></i>取消收藏</a>
                                    </c:when>
                                    <c:otherwise><a href="javascript:;" onclick="questionFav(this, ${question.questionId} )"><i class="icona-shoucang"></i>收藏</a></c:otherwise>
                                </c:choose>

                                <a href="javascript:;" onclick="questionErrorReport( ${question.questionId} )"><i class="icona-jiucuo"></i>纠错</a>
                            </p>
                            <p class="exam-foot-right">
                                <span>组卷次数：${question.usetimes}次</span>
                                <span>
                                        <c:choose>
                                            <c:when test="${question.inBasket}">
                                                <a class="J_AddQuestion removebtn" href="javascript:;" onclick="questionDelete(this, ${question.questionId},${question.questionType})"><b>-</b>移除</a>
                                            </c:when>
                                            <c:otherwise><a class="addbtn J_AddQuestion" href="javascript:;" onclick="questionAdd(this, ${question.questionId} ,${question.questionType})"><b>+</b>选题</a></c:otherwise>
                                        </c:choose>
                                    </span>
                            </p>
                            <div class="choice-tips" style="display: none;"><i class="icona-triangle"></i>选题功能需确定学科，请确定学科后再选题组卷。
                            </div>
                        </div>
                    </div>
                </li>
            </c:forEach>--%>










            <%--            列表结束*******************************************************************************************************************************  --%>

        </ul>
    </div>
    <div class="page">
        <div id="pagenum1"></div>
        <%--<div class="pagenum">

            <a data-page="1" href="javascript:;" class="current">1</a>
            <a data-page="2" href="https://zujuan.21cnjy.com/question/search?content=&amp;page=2&amp;per-page=10">2</a>
            <a data-page="3" href="https://zujuan.21cnjy.com/question/search?content=&amp;page=3&amp;per-page=10">3</a>
            <a data-page="4" href="https://zujuan.21cnjy.com/question/search?content=&amp;page=4&amp;per-page=10">4</a>
            <a data-page="5" href="https://zujuan.21cnjy.com/question/search?content=&amp;page=5&amp;per-page=10">5</a>

            <a data-page="2"
               href="<%=request.getContextPath()%>/question/search?content=&amp;page=2&amp;per-page=10">下一页</a>

            <input style="
                border: 1px solid #dcdcdc;
                color: #333;
                display: inline-block;
                font-size: 12px;
                height: 32px;
                width: 30px;
                line-height: 32px;
                margin: 0 5px;
                padding: 0 5px;
                text-align: center;
                white-space: nowrap;" name="page" onkeyup="toPaperNum(this)" type="text" value="1">
            <button type="submit" id="paper-jump" class="current">跳转</button>
            <script>
                function toPaperNum(ob) {
                    var v = parseInt($.trim(ob.value).toString().replace(/\D/, '').substr(0, 4)) || 0;
                    ob.value = v ? v : '';
                }
            </script>
        </div>--%>
    </div>
</div>















<!--footer开始-->
<div class="footer">
    <div class="footer-con g-container">
        <div class="footer-top f-cb">
            <div class="con-gs">
                <h3>系统介绍</h3>
                <p>System Introduction</p>
                <ul>
                    <li><i class="icona-ellipse"></i><a href="javascript:void(0);" target="_blank">系统简介</a></li>
                    <li><i class="icona-ellipse"></i><a href="javascript:void(0);" target="_blank">版权声明</a></li>
                </ul>
            </div>
            <div class="con-fw">
                <h3>服务介绍</h3>
                <p>Service Introduction</p>
                <ul class="fw-list">
                    <li><i class="icona-ellipse"></i><a href="javascript:void(0);" target="_blank">组卷服务</a></li>
                    <li><i class="icona-ellipse"></i><a href="javascript:void(0);" target="_blank">测试服务</a></li>
                    <li><i class="icona-ellipse"></i><a href="javascript:void(0);" target="_blank">后台服务</a></li>
                </ul>
            </div>
            <div class="con-bz">
                <h3>帮助中心</h3>
                <p>Help center</p>
                <ul>
                    <li><i class="icona-ellipse"></i><a href="javascript:void(0);" target="_blank">常见问题</a></li>
                    <li><i class="icona-ellipse"></i><a href="javascript:void(0);" target="_blank">如何组卷</a></li>
                    <li><i class="icona-ellipse"></i><a href="javascript:void(0);" target="_blank">下载试卷</a></li>
                    <li><i class="icona-ellipse"></i><a href="javascript:void(0);" target="_blank">在线测试</a></li>
                    <li><i class="icona-ellipse"></i><a href="javascript:void(0);" target="_blank">最新试题</a></li>
                </ul>
            </div>
        </div>
        <div class="footer-bottom">
            <p class="copyright">2017-2018 版权所有©Ridup <a href="https://github.com/Ridup" rel="nofollow" target="_blank">GitHub</a></p>
            <p class="footer-adress">
                <span>邮编：330031</span>
                <span>江西省南昌市南昌大学</span>
            </p>
        </div>
    </div>
</div>
<!--footer结束-->


<script>
    var localObj = window.location;
    var server_context = localObj.protocol+"//"+localObj.host+"/"+localObj.pathname.split("/")[1];

    $(document).ready(function(){
        var param = window.location.search.substr(1, 4);
        if (param == "tips") {
            var tips = window.location.search.substring(6);
            console.log(tips);
            if (tips == "e01") {
                contentTips = "请重新登录！";
                layer.alert("<span style='margin-left: 70px;text-align: center;color:#e65439'>" + contentTips + "</span>");
            }
            if (tips == "e02") {
                contentTips = "试题篮为空，请重新添加试题！";
                layer.alert("<span style='margin-left: 70px;text-align: center;color:#e65439'>" + contentTips + "</span>");
            }
        }
    });


    function paper_download(paperId){
        var iframeUrl = server_context+"/paper/download_paper_doc.do?paperId="+paperId;
        var ss = "<a href='"+iframeUrl+"' target='_blank'>Doc</a>";
        var a = $(""+ss).get(0);
        var e = document.createEvent('MouseEvents');
        e.initEvent( 'click', true, true );
        a.dispatchEvent(e);

    }

    Date.prototype.format = function(fmt) {
        var o = {
            "M+" : this.getMonth()+1,                 //月份
            "d+" : this.getDate(),                    //日
            "h+" : this.getHours(),                   //小时
            "m+" : this.getMinutes(),                 //分
            "s+" : this.getSeconds(),                 //秒
            "q+" : Math.floor((this.getMonth()+3)/3), //季度
            "S"  : this.getMilliseconds()             //毫秒
        };
        if(/(y+)/.test(fmt)) {
            fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
        }
        for(var k in o) {
            if(new RegExp("("+ k +")").test(fmt)){
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
            }
        }
        return fmt;
    }


</script>



<script src="<%=request.getContextPath()%>/static/js/extends/global.min.js"></script>
<a class="return" href="javascript:;" style="right: 9px; display: none;"><i class="icona-top"></i></a>
<!--<script src="https://wpa.b.qq.com/cgi/wpa.php" type="text/javascript"></script>-->
<script>
    //    BizQQWPA.addCustom({aty: '0', a: '0', nameAccount: 4006379991, selector: 'jBizQQWPA'});
    (function (window, undefined) {
        try {
            var document = window.document;
            document.getElementById('jBizQQWPA').onclick = function(){
                window.open('http://wpa.b.qq.com/cgi/wpa.php?ln=1&key=XzkzODE4MjQ4OF80NjM1NzhfNDAwNjM3OTk5MV8yXw&uin=', '_blank', 'height=544, width=644,toolbar=no,scrollbars=no,menubar=no,status=no');
            }
        } catch (e) {
        }
    }(window));
</script>
<div class="data">
    <div class="inner-data">
        <script type="text/javascript">
            var _hmt = _hmt || [];
            (function() {
                var hm = document.createElement("script");
                hm.src = "https://hm.baidu.com/hm.js?5d70f3704df08b4bfedf4a7c4fb415ef";
                var s = document.getElementsByTagName("script")[0];
                s.parentNode.insertBefore(hm, s);
            })();
            var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1668216'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s95.cnzz.com/stat.php%3Fid%3D1668216%26show%3Dpic1' type='text/javascript'%3E%3C/script%3E"));
        </script>
    </div>
</div>
<script src="<%=request.getContextPath()%>/static/js/lib/jquery.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/yii.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/yii.activeForm.js"></script>
<script src="<%=request.getContextPath()%>/static/js/lib/layer.js"></script>
<script type="text/javascript">jQuery(function ($) {
    jQuery('#w0').yiiActiveForm([], []);
});
</script>
<script>
    layui.use(['laypage', 'layer'], function() {
        var laypage = layui.laypage
            , layer = layui.layer;
        //完整功能
        laypage.render({
            elem: 'pagenum1'
            , count: ${count}  //数据总数，从服务端得到
            , layout: ['count', 'prev', 'page', 'next','skip'] // TODO   'limit',  隐藏了功能
            , jump: function (obj,first) {
                var localObj = window.location;
                var server_context = localObj.protocol+"//"+localObj.host+"/"+localObj.pathname.split("/")[1];
                console.log(obj);
                console.log("当前第"+obj.curr+"页"+obj.limit+"条");
                console.log("是否首次，一般用于初始加载的判断:"+first);




                if(!first){

                    $("html,body").animate({scrollTop: $("#J_QuestionList").offset().top}, 1000);
                    $("#J_QuestionList").html("");
                    //试题分页查询
                    $.ajax({
                        url: server_context + '/paper/searchPage.do?grade=${currentGrade.grade}&gradeName=${currentGrade.gradeName}&course=${currentCourse.course}&courseName=${currentCourse.courseName}&content=${currentContent}',
                        type: 'POST', //GET
                        async: true,    //或false,是否异步
                        data: {
                            page: obj.curr
                        },
                        timeout: 5000,    //超时时间
                        dataType: 'json',    //返回的数据格式：json/xml/html/script/jsonp/text
                        success: function (data, textStatus, jqXHR) {
                            console.log("data:" + data);
                            /* console.log(data[0].chapter);
                             console.log(data[0].pointPojoList);*/
                            if (data != null) {
                                console.log(data.result);
                                var papers = data.result.paperList;
                                $.each(papers,function(index,item){
                                    console.log("item"+item+index);
                                    var cdt = new Date(item.createTime);
                                    var timeStr=cdt.format("yyyy-MM-dd");
                                    var paperHtml = "<li style=\"height: 100px;\">\n" +
                                        "                    <div class=\"search-list-left\" >\n" +
                                        "                        <div class=\"test-pic\">\n" +
                                        "                            <i class=\"icona-test\"></i>\n" +
                                        "                        </div>\n" +
                                        "                        <div class=\"test-txt\">\n" +
                                        "                            <p><a href=\"<%=request.getContextPath()%>/paper/view.do?paperId="+item.paperId+"\" target=\"_blank\" title=\""+item.paperName+"\">"+item.paperName+"</a></p>\n" +
                                        "                            <p>\n" +
                                        "                                <span><i class=\"icona-time\"></i>修改时间："+timeStr+"</span>\n" +
                                        "                                <span><i class=\"icona-see5\"></i>下载次数："+item.downloadTimes+"</span>\n" +
                                        "                                <span><i class=\"icona-leixing\"></i>类型：同步试卷</span>\n" +
                                        "                            </p>\n" +
                                        "                        </div>\n" +
                                        "                    </div>\n" +
                                        "                    <div class=\"search-list-right\">\n" +
                                        "                        <%--<a href=\"javascript:;\" onclick=\"OT2.PaperAnalysis.show('/paper/pie/929606')\"><i class=\"icona-fenxi2\"></i>试卷分析</a>--%>\n" +
                                        "                        <a href=\"<%=request.getContextPath()%>/paper/test?paperId="+item.paperId+"\" target=\"_blank\"><i class=\"icona-ceshi\"></i>开始测试</a>\n" +
                                        "                        <a href=\"javascript:;\" onclick=\"paper_download("+item.paperId+")\" class=\"download-btn\"><i class=\"icona-download1\"></i>下载</a>\n" +
                                        "                    </div>\n" +
                                        "                </li>";


                                    $("#J_QuestionList").append(paperHtml);
                                });
                                /*  layui.use(['form', 'layer'], function () {
                                      $ = layui.jquery;
                                      var form = layui.form;
                                      for (var i = 0; i < data.length; i++) {

                                          var points = "";
                                          for (var n = 0; n < data[i].pointPojoList.length; n++) {
                                              points = points + "<input type=\"checkbox\" name=\"point\" title=\"" + data[i].pointPojoList[n].pointName + "\" value=\"" + data[i].pointPojoList[n].courseId + "\" lay-skin=\"primary\">";
                                          }
                                          var pointHtml = "<div class=\"layui-colla-item\"><h2 class=\"layui-colla-title\">" +"<input type=\"checkbox\" name=\"chapterName\" value=\""+ data[i].chapter+"\" lay-skin=\"primary\">"+ data[i].chapter + "<i class=\"layui-icon layui-colla-icon\"></i></h2><div class=\"layui-colla-content layui-show\" >" + points + "</div></div>";
                                          $('#chapterList').append(pointHtml);
                                      }
                                      form.render();
                                  });*/


                            }else{
                                layer.alert("<span style='margin-left: 70px;text-align: center;'>未查到数据！</span>");
                            }
                        },
                        error: function (xhr, textStatus) {
                            layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                        }
                    });
                }





            }
        });
    });


</script>
</body>
</html>