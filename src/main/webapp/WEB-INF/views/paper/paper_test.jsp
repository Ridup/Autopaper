<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class=" XL">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="renderer" content="webkit"><!--用在360中-->
    <meta name="force-rendering" content="webkit"><!--用在其它-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
    <link rel="shortcut icon" type="image/x-icon" href="<%=request.getContextPath()%>/static/images/favicon.ico">
    <meta name="csrf-param" content="_csrf">
    <meta name="csrf-token"
          content="CuLu_5_b5pKzlDz2vF0s8oF0235xNpoeksCnr1yLttF6kZu71aqP2ur7bb3oDnq4yRajGAJwxUHc8sTBZO3Ygg==">
    <title>试卷详情</title>
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
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/test-preview.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/layer.css" id="layuicss-skinlayercss">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/layui/css/layui.css" id="layuicss-skinlayercss">


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
    <script src="<%=request.getContextPath()%>/static/js/lib/layer.js"></script>
    <script src="<%=request.getContextPath()%>/static/layui/layui.js"></script>
    <%--<script src="<%=request.getContextPath()%>/static/js/extends/profile.min.js"></script>--%>
    <style>html, * {
        -webkit-user-select: text !important;
        -moz-user-select: text !important;
    }</style>

</head>


<body>
<!--[if lt IE 7]>
<link href="<%=request.getContextPath()%>/static/css/kill-ie.css" rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath()%>/static/js/extends/kill-ie.js"></script>
<![endif]-->
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/inner-user.min.css">


<!--顶部导航开始（公用）-->
<div class="header">
    <div class="header-inner g-container f-cb">
        <style>
            .user-news {
                position: absolute;
                top: 40px;
                right: 0;
                background: #fefefe;
                width: 260px;
                min-height: 112px;
                line-height: 24px;
                border: 1px solid #ccc;
                border-radius: 4px;
                font-size: 14px;
                box-shadow: 0 0 10px #dcdcdc;
                display: none;
            }

            .user-news-hd {
                border-bottom: 1px solid #efefef;
                padding-bottom: 4px;
                margin: 6px 10px;
                font-size: 12px;
                color: #666;
            }

            .user-news .icon {
                display: block;
                top: -8px;
                right: 40px;
                position: absolute;
            }

            .user-news-close {
                position: absolute;
                right: 10px;
                top: 10px;
                width: 16px;
                height: 16px;
            }

            .user-news-close img {
                width: 100%;
                height: 100%;
            }

            .vip-overtip {
                text-align: center;
            }

            .vip-overtip {
                padding-top: 6px;
            }

            .vip-overtip p strong {
                color: red;
                margin: 0 3px;
            }

            .vip-overtip .tip-notice {
                color: red;
                font-size: 16px;
                font-weight: bold;
            }

            .vip-overtip a {
                color: #52c684;
            }
        </style>

        <div class="header-logo">
            <a href="<%=request.getContextPath()%>/index.do">
                <img src="<%=request.getContextPath()%>/static/images/login-logo1.png" alt="自动组卷平台" title="自动组卷平台">
            </a>
        </div>
        <div class="header-logo-sd f-fr">
            <div class="user f-fr f-pr topbar-dropmap" style="float: right">
                <c:choose>
                    <c:when test="${user!=null}">
                        <a href="<%=request.getContextPath()%>/ucenter/" target="_blank" style="float: right" >${user.nickName}<i
                                class="icona-tri ml"></i></a>
                        <div class="drop-bd" style="display: none;">
                            <ul>
                                <li><a href="<%=request.getContextPath()%>/ucenter/download_record.do" target="_blank">下载记录</a>
                                </li>
                                <li><a href="<%=request.getContextPath()%>/ucenter/generate_record.do" target="_blank">组卷记录</a>
                                </li>
                                <li><a href="<%=request.getContextPath()%>/ucenter/test_record.do" target="_blank">测试记录</a></li>
<%--
                                <li><a href="<%=request.getContextPath()%>/ucenter/error_record.do" target="_blank">纠错记录</a>
--%>
                                </li>
                                <c:if test="${loginUser.userType=='1'}">
                                    <li><a href="<%=request.getContextPath()%>/ucenter/question_in_record.do" target="_blank">试题录入记录</a>
                                    </li>
                                </c:if>
                                <li><a href="<%=request.getContextPath()%>/ucenter/error_question.do" target="_blank">错题本</a>
                                </li>
                                <li><a href="<%=request.getContextPath()%>/ucenter/myfavorite.do" target="_blank">我的收藏</a></li>
                                <li><a href="<%=request.getContextPath()%>/ucenter/index.do" target="_blank">个人信息</a></li>
                                <li class="split-line"></li>
                                <li><a data-method="post" href="<%=request.getContextPath()%>/user/logout.do">退出</a></li>
                            </ul>
                            <span class="icona-dia-tri"></span>
                        </div
                    </c:when>
                    <c:otherwise>
                        <div class="loginbox">
                            <a href="<%=request.getContextPath()%>/user/login.do" class="login"><span style="color:#0C0C0C ">登录</span></a>
                            <a href="<%=request.getContextPath()%>/user/register.do" class="register"><span style="color:#0C0C0C ">注册</span></a>
                        </div>
                    </c:otherwise>
                </c:choose>

            </div>
            <div class="user f-fr"><a href="<%=request.getContextPath()%>/ucenter/u-msg.do"><i class="icona-xinxi"></i>消息<span>(0)</span></a>
            </div>
            <div class="header-nav">
                <a href="<%=request.getContextPath()%>/index.do" class="help"><i class="icona-home"></i>网站首页</a>
                <span class="split"></span>
                <c:if test="${loginUser.userType=='1'}">
                    <a href="<%=request.getContextPath()%>/question/question_in.do" class="help" target="_blank"><i
                            class="icona-leixing"></i>试题录入</a>
                    <span class="split"></span>
                </c:if>
                <a href="<%=request.getContextPath()%>/main/help.do" class="help" target="_blank"><i
                        class="icona-help"></i>帮助中心(可请求一个操作文档)</a>
                <span class="split"></span>
            </div>
        </div>
    </div>
</div>

<input type="hidden" value="${ucenter_position}" id="ucenter_position"/>
<!--顶部导航结束（公用）-->
<div class="breadcrumb g-container">
    <i class="icona-dingwei"></i>当前位置：
    <a href="/">首页</a>->测试</div>
<%--中部内容开始--%>


<div class="preview-con g-container">
    <div class=" f-fl f-w">

        <%--        试卷内容左--%>
        <div class="dj-preview">
            <div class="preview-title">
                <h1>${paperPojo.paperName}</h1>
                <p>
                    <span><i class="icona-time2"></i>修改时间：<fmt:formatDate value="${paperPojo.createTime}" type="date" dateStyle="full"/></span>
                    <span><i class="icona-see5"></i>下载次数：${downloadTimes}</span>
                    <span><i class="icona-leixing"></i>类型：同步测试</span>
                    <span class="editfooter"><a target="_blank" style="display:none" data-method="post"
                                                href="/paper/admin-edit?pid=849277&amp;xd=1&amp;chid=3"><i
                            class="icona-bianji"></i>编辑</a></span>
                </p>
            </div>



            <div class="preview-body" id="J_PaperBody">
                <form class="layui-form" action="<%=request.getContextPath()%>/paper/test_over.do?paperId=${paperPojo.paperId}" method="post">
                <c:set var="question_index" value="1"></c:set>
                <c:forEach items="${paperPojo.paperQCResponsePojos}" var="paperQC">
                <h3>${paperQC.typeNumName}、${paperQC.questionTypeName}</h3>
                <div class="search-list">
                    <ul>
                        <c:forEach items="${paperQC.questionResponsePojos}" var="question" varStatus="vs">
                        <li data-qid="${question.questionId}">
                            <div class="search-exam">
                                <div class="exam-con">
                                    <div class="exam-q">
                                            ${question_index+vs.index}. ${question.questionContent}
                                    </div>
                                    <div class="exam-s">
                                        <c:choose>
                                            <c:when test="${question.questionType==101}">
                                                <div class="layui-input-block" style="margin-left: 10px;">
                                                    <span class="op-item"
                                                          style="width: 170px; margin-right: 0px; height: 24px; clear: none;">
                                                    <input type="radio"  name="Q${question_index+vs.index}" value="A" title="A . ${question.selectionA}" >
                                                    </span>
                                                    <span class="op-item"
                                                          style="width: 170px; margin-right: 0px; height: 24px;clear: none;">
                                                    <input type="radio"  name="Q${question_index+vs.index}" value="B" title="B . ${question.selectionB}" >
                                                    </span>
                                                    <span class="op-item"
                                                          style="width: 170px; margin-right: 0px; height: 24px; clear: none;">
                                                    <input type="radio" name="Q${question_index+vs.index}" value="C" title="C . ${question.selectionC}" >
                                                    </span>
                                                    <span class="op-item"
                                                          style="width: 170px; margin-right: 0px; height: 24px; clear: none;">
                                                    <input type="radio"  name="Q${question_index+vs.index}" value="D" title="D . ${question.selectionD}">
                                                    </span>
                                                </div>
                                            </c:when>
                                            <c:when test="${question.questionType==102}">
                                                <div class="layui-input-block" style="margin-left: 10px;">
                                                    <span class="op-item"
                                                          style="width: 170px; margin-right: 0px; height: 24px; clear: none;">
                                                    <input type="radio"  name="Q${question_index+vs.index}" value="Y" title="对" >
                                                    </span>
                                                    <span class="op-item"
                                                          style="width: 170px; margin-right: 0px; height: 24px;clear: none;">
                                                    <input type="radio"  name="Q${question_index+vs.index}" value="N" title="错" >
                                                    </span>
                                                </div>
                                            </c:when>
                                            <c:otherwise>
                                                <label class="layui-form-label" style="text-align: left">答案：</label>
                                                <div class="layui-input-block" style="text-align: left;margin-left: auto" >
                                                    <input type="text" name="Q${question_index+vs.index}"    placeholder="请输入答案" autocomplete="off" class="layui-input">
                                                </div>
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                </div>
<%--
                                <div class="exam-foot">
                                    <p class="exam-foot-left">
                                    </p>
                                    <p class="exam-foot-right">
                                    </p>
                                </div>--%>
                            </div>
                        </li>
                        </c:forEach>
                            <c:set var="question_index" value="${question_index+paperQC.questionCount}"></c:set>
                        </c:forEach>


                </div>

                    <input type="hidden" id="stop_status">
                    <input type="hidden" name="" id="time_clock">
                    <input type="hidden" name="spendTime" id="spendTime">
                    <input type="hidden" name="paperId" value="${paperPojo.paperId}">
                    <input type="hidden" name="startTime" value="${startTime}">
                    <button id="paper_test_submit" class="layui-btn" lay-submit lay-filter="*" style="display: none;">立即提交</button>
                </form>






            </div>
        </div>


        <div class="dj-about" style="position: fixed; margin-left: 950px; z-index: 9; top: 110px;">


            <blockquote class="layui-elem-quote" style="background-color:snow;font-size: 24px;color:#09A74D ">
                测试剩余时间：<div id="clock_test" style="margin-top: 15px"></div>
            </blockquote>
            <div class="view-toolbars f-cb">
                <a href="javascript:;" onclick="test_submit(${paperPojo.paperId})" class="download-btn"><i class="layui-icon">&#xe609;</i>马上提交</a>
                <a href="javascript:;" onclick="test_stop()" class="download-btn" style="width: 70%;text-align: center"><i class="layui-icon">&#xe651;</i>暂停测试</a>
                <a href="javascript:;" onclick="test_restart()" class="download-btn" style="width: 70%;text-align: center"><i class="layui-icon">&#xe669;</i>重新测试</a>
            </div>
            <script>

                var localObj = window.location;
                var server_context = localObj.protocol+"//"+localObj.host+"/"+localObj.pathname.split("/")[1];





                //相关试卷展开收起
                $(document).ready(function () {


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

            </script>
        </div>
    </div>
</div>



<%--中部内容结束--%>


<script src="<%=request.getContextPath()%>/static/js/extends/element.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/field.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/module/ucenter.min.js"></script>
<script>
    OT2.Ucenter.userinfo().form.init(function () {
        // console.log(this);
    });
</script>










<script src="<%=request.getContextPath()%>/static/js/extends/global.min.js"></script>
<a class="return" href="javascript:;" style="right: 9px; display: none;"><i class="icona-top"></i></a>
<!--<script src="https://wpa.b.qq.com/cgi/wpa.php" type="text/javascript"></script>-->
<script>
    //    BizQQWPA.addCustom({aty: '0', a: '0', nameAccount: 4006379991, selector: 'jBizQQWPA'});
    (function (window, undefined) {
        try {
            var document = window.document;
            document.getElementById('jBizQQWPA').onclick = function () {
                window.open('http://wpa.b.qq.com/cgi/wpa.php?ln=1&key=XzkzODE4MjQ4OF80NjM1NzhfNDAwNjM3OTk5MV8yXw&uin=', '_blank', 'height=544, width=644,toolbar=no,scrollbars=no,menubar=no,status=no');
            }
        } catch (e) {
        }
    }(window));



</script>




<script src="<%=request.getContextPath()%>/static/js/lib/jquery.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/yii.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/yii.activeForm.js"></script>

<script type="text/javascript">

    var localObj = window.location;
    var server_context = localObj.protocol+"//"+localObj.host+"/"+localObj.pathname.split("/")[1];
    $(document).ready(function () {
        var tips = $("#tips").val();
        var ucenter_position = $("#ucenter_position").val();
        if (tips != null && tips != "") {
            layer.alert("<span style='margin-left: 70px;text-align: center;'>" + tips + "</span>");
        }
        $(".topbar-dropmap").hover(function () {
            $(".drop-bd").css("display", "block");
        }, function () {
            $(".drop-bd").css("display", "none");
        });
        var currentTimer;
        clockTime(132);
    });

    function clockTime(currentTimer) {
        layui.use(['util', 'laydate', 'layer'], function () {
            var util = layui.util
                , laydate = layui.laydate
                , layer = layui.layer;
            //倒计时
            setCountdown = function (y, M, d, H, m, s) {
                var endTime = new Date(y, M || 0, d || 1, H || 0, m || 0, s || 0) //结束日期
                    , serverTime = new Date(${startTime}); //假设为当前服务器时间，这里采用的是本地时间，实际使用一般是取服务端的

                clearTimeout(currentTimer);
                util.countdown(endTime, serverTime, function (date, serverTime, currentTimer) {
                    var str = date[0] + '天' + date[1] + '时' + date[2] + '分' + date[3] + '秒';
                    lay('#clock_test').html(str);
                    var str = util.timeAgo(date);
                    //console.log("======" + str);
                    var a = $("#stop_status").val();
                    if (null != a && "" != a) {
                        if (a == "stop") {
                            clearTimeout(currentTimer);

                        }
                    }
                    var paperTime = ${paperPojo.time};
                    var leftTime = date[0]*1440+date[1]*60+date[2];
                    var spendTime = paperTime-leftTime;
                    if (date[0] == 0 && date[1] == 0 && date[2] == 0 && date[3] == 0) {
                        //结束，则提交试卷
                        alert("结束");
                    }
                    //clearTimeout(thisTimer);
                    //console.log("2222=" + currentTimer);
                    $("#spendTime").val(spendTime);
                    $("#time_clock").val(currentTimer);
                });
            };
            setCountdown(${endTime});
        });

    }


    layui.use('form', function(){
        var form = layui.form;

        form.on('submit(*)', function(data1){
            console.log(data1.elem) //被执行事件的元素DOM对象，一般为button对象
            console.log(data1.form) //被执行提交的form对象，一般在存在form标签时才会返回
            console.log(data1.field) //当前容器的全部表单字段，名值对形式：{name: value}
            var spendTime = $("#spendTime").val();
            var paperId = $("#paperId").val();

            layer.load();
            $.ajax({
                url: server_context + '/paper/test_over.do?paperId='+${paperPojo.paperId},
                type: 'POST', //GET
                async: true,    //或false,是否异步
                data: data1.field,
                timeout: 5000,    //超时时间
                dataType: 'text',    //返回的数据格式：json/xml/html/script/jsonp/text
                success: function (data, textStatus, jqXHR) {
                    console.log(data);
                    layer.closeAll('loading');
                    if(data!=null){
                        if(data==0){
                            layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                        }else{
                            window.localObj.href = server_context+ "/paper/test_report.do?testId="+data;
                        }
                    }
                  /*  if("X01"==jsonResult.code){
                        if($(favChange).hasClass("icona-shoucang")){
                            $(obj).html("<i class=\"icona-quxiaosc\"></i>取消收藏");
                        }else{
                            $(obj).html("<i class=\"icona-shoucang\"></i>收藏");
                        }
                    }
                    else if("X03"==jsonResult.code){
                        window.localObj.href = server_context+ "/index.do?tips=e01";
                    }
                    else{

                    }*/

                },
                error: function (xhr, textStatus) {
                    layer.closeAll('loading');
                    layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                }
            });

        });






    });


    function test_stop() {
        var a = $("#stop_status").val();
        if (null == a || "" == a || "start" == a) {
            $("#stop_status").val("stop");
            console.log("暂停");
        }
    }

    function test_restart() {
        var a = $("#stop_status").val();
        if (a == "stop") {
            $("#stop_status").val("start");
            var b = $("#time_clock").val() - 1;
            b += 1;
            console.log("开始" + b);
            clockTime(b);
        }
    }


    function test_submit(paperId) {

        /*for(var i=1;i<=totalQuestion;i++){
            var a = $("input[name='"+i+"']").val();
           console.log("aa=="+a);
        }*/
        document.getElementById("paper_test_submit").click();

    }



</script>

</body>
</html>