<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
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
          content="r7FZtSK7tjkAAsfu7xmhU2vUGReAkvI9Nl2yNJh_LqjV0G34Wt_UXmhMk7arUMZiWOxxXfrLsFYBP9BV-QZH-g==">
    <title>自动组卷系统</title>
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
        var HostInfo = "https://www.baidu.com/";
        USER = {};//通知js用户的信息
        OT2.CSRF = {"_csrf": "r7FZtSK7tjkAAsfu7xmhU2vUGReAkvI9Nl2yNJh_LqjV0G34Wt_UXmhMk7arUMZiWOxxXfrLsFYBP9BV-QZH-g=="};
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
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/smarter.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/layer.css" id="layuicss-skinlayercss">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/layui/css/layui.css">
    <script src="<%=request.getContextPath()%>/static/layui/layui.js"></script>


    <meta name="keywords" content="组卷,自动组卷,试卷,试题,在线测试">
    <meta name="description" content="自动组卷系统适用于小学、中学、高中的试卷生成，并且能够在线测评">

    <!-- JS lib库 -->
    <script src="<%=request.getContextPath()%>/static/js/lib/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/lib/jquery.js"></script>

    <script type="text/javascript">$.ajaxSetup({cache: false});</script>
    <script src="<%=request.getContextPath()%>/static/js/lib/underscore-min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/lib/json3.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/lib/dialog-plus.js"></script>

    <!-- JS extends库 -->
    <script src="<%=request.getContextPath()%>/static/js/extends/cookie.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/artDialog-config.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/element.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/localdata.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/util.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/smart-v2.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/extends/layui-xtree.js"></script>





</head>


<body>
<!--[if lt IE 7]>
<link href="<%=request.getContextPath()%>/static/css/kill-ie.css" rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath()%>/static/js/extends/kill-ie.js"></script>
<![endif]-->
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/index.min.css">

<!--顶部导航开始（公用）-->
<div class="topbox">
    <div class="topinner g-container">
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
            #qdstar span{
                margin-left: 0px;
                float: none;
            }
        </style>
        <div class="slogan">

        </div>

        <%--登录成功显示用户信息--%>
        <input type="hidden" value="${loginUser}" id="checkLogin">
        <input type="hidden" value="${tips}" id="tips">
        <div class="user f-fr f-pr topbar-dropmap" style="display: none" id="userBar">
            <a href="<%=request.getContextPath()%>/ucenter/" target="_blank">${loginUser.nickName}<i
                    class="icona-tri ml"></i></a>
            <div class="drop-bd" style="display: none" id="userSelection">
                <ul>
                    <li><a href="<%=request.getContextPath()%>/ucenter/download_record.do" target="_blank">下载记录</a></li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/generate_record.do" target="_blank">组卷记录</a></li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/test_record.do" target="_blank">测试记录</a></li>
<%--
                    <li><a href="<%=request.getContextPath()%>/ucenter/error_record.do" target="_blank">纠错记录</a></li>
--%>

                    <li><a href="<%=request.getContextPath()%>/ucenter/question_in_record.do" target="_blank">试题录入记录</a>
                    </li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/error_question.do" target="_blank">错题本</a></li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/u_question.do" target="_blank">我的收藏</a></li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/index.do" target="_blank">个人信息</a></li>
                    <li class="split-line"></li>
                    <li><a data-method="post" href="<%=request.getContextPath()%>/user/logout.do">退出</a></li>
                </ul>
                <span class="icona-dia-tri"></span>
            </div>
        </div>

        <%--消息--%>
        <div class="user f-fr" style="display: none">
            <a href="<%=request.getContextPath()%>/ucenter/u_msg.do" target="_blank"><i class="icona-xinxi"></i>消息<span>(0)</span></a>
        </div>

        <%--导航条--%>
        <div class="webhelp">
            <a href="<%=request.getContextPath()%>/index.do" class="help"><i class="icona-home"></i>网站首页</a>
            <span class="split"></span>
            <c:if test="${loginUser.userType=='1'}">
                <a href="<%=request.getContextPath()%>/question/question_in.do" class="help" target="_blank"><i
                        class="icona-leixing"></i>试题录入</a>
                <span class="split"></span>
            </c:if>
            <a href="<%=request.getContextPath()%>/main/help.do" class="help" target="_blank"><i class="icona-help"></i>帮助中心(可请求一个操作文档)</a>
            <span class="split"></span>
            <div class="loginbox">
                <a href="<%=request.getContextPath()%>/user/login.do" class="login"
                   onclick="OT2.Global.initLogin(); return false;"><span>登录</span></a>
                <a href="<%=request.getContextPath()%>/user/register.do" class="register"><span>注册</span></a>
            </div>
            <span class="split"></span>
        </div>
    </div>
</div>
<!--顶部导航结束（公用）-->


<script>
    /* 登录用户判断显示*/
    $(document).ready(function () {
        var loginUser = $("#checkLogin").val();
        var tips = $("#tips").val();
        if (tips != null && tips != "") {
            layer.alert("<span style='margin-left: 70px;text-align: center;'>" + tips + "</span>");
        } else {
            var param = window.location.search.substr(1, 4);
            if (param == "tips") {
                var tips = window.location.search.substring(6);
                console.log(tips);
                if (tips == "e01") {
                    contentTips = "请重新登录！";
                }
                if(tips =="p05"){
                    contentTips = "试题库试题太少！";
                }
                layer.alert("<span style='margin-left: 70px;text-align: center;color:#e65439'>" + contentTips + "</span>");
            }
        }
        if (loginUser != null && loginUser != "") {
            $(".loginbox").hide();
            $(".f-fr").show();
        } else {
            $(".loginbox").show();
        }

        $(".topbar-dropmap").hover(function () {
            $("#userSelection").css("display", "block");
        }, function () {
            $("#userSelection").css("display", "none");
        });

    });
</script>


<!--头部搜索部分开始-->
<div class="top-middle">
    <div class="top-minner g-container f-cb">
        <div class="logobox">
            <a href="<%=request.getContextPath()%>/index.do">
                <img src="<%=request.getContextPath()%>/static/images/test_logo.png" alt="Ridup教育在线组卷平台" title="在线组卷平台"></a>
        </div>
        <div class="g-mn">
            <div class="searchbox">
                <form id="search-form" action="<%=request.getContextPath()%>/question/search.do" method="get">
                    <div class="search-text" id="J_SearchMenu">
                        <span class="text-select"><em class="J_tit">试题</em><i class="icona-tri"></i></span>
                        <p class="select-items">
                            <a href="javascript:;"><input type="radio" name="" value="<%=request.getContextPath()%>/question/search.do" class="f-dn" checked=""><span>试题</span></a>
                            <a href="javascript:;"><input type="radio" name="" value="<%=request.getContextPath()%>/paper/search.do" class="f-dn"><span>试卷</span></a>
                        </p>
                    </div>
                    <div class="search-inputbox">
                        <input type="text" name="content" value="" class="search-input" placeholder="">
                        <input type="hidden" name="grade" value="${currentGrade.grade}">
                        <input type="hidden" name="gradeName" value="${currentGrade.gradeName}">
                        <input type="hidden" name="course" value="${currentCourse.course}">
                        <input type="hidden" name="courseName" value="${currentCourse.courseName}">
                        <%--          <input type="hidden" name="grade" value="${currentGrade.grade}">
                                  <input type="hidden" name="grade" value="${currentGrade.grade}">--%>

                    </div>
                    <div class="search-btn">
                        <button class="btn" type="submit"><i class="icona-search"></i></button>
                    </div>
                </form>
                <script>
                    $(function () {
                        var name = $(".nav-items a.item span").html();
                        $("input[name='content']").attr({
                            'placeholder': '请输入关键词搜索 ' + name + ' 资源'
                        });
                    })
                </script>
            </div>
        </div>
    </div>
</div>
<!--头部搜索部分结束-->


<!--头部导航部分开始-->
<script>
    OT2.xd_chid = {"chid": 3, "xd": 2} || null;
</script>
<div class="top-navbox">
    <div class="top-nav g-container">
        <div class="nav-items">
            <a href="" class="item">当前：<span>${currentGrade.gradeName}${currentCourse.courseName}</span><i class="icona-tri2"></i></a>
            <div class="item-list">
                <c:forEach items="${allCourses}" var="courses">
                    <div class="list-${courses.gradeId}">
                        <h3>${courses.gradeName}</h3>
                        <c:forEach items="${courses.coursePojos}" var="course">
                            <a href="<%=request.getContextPath()%>/paper/change_course.do?grade=${courses.gradeId}&amp;gradeName=${courses.gradeName}&amp;course=${course.course}&amp;courseName=${course.courseName}"
                               onclick=" return true;">${course.courseName}</a>
                        </c:forEach>
                    </div>
                </c:forEach>
            </div>
        </div>


        <div class="nav-list">
            <ul>
                <li>
                    <a class="active" href="<%=request.getContextPath()%>/index.do">首页</a>
                </li>
                <li class="complex-nav-item">
                    <a href="javascript:;" class="">手动组卷</a>
                    <div class="dd-list">
                        <a href="<%=request.getContextPath()%>/paper/search.do?grade=${currentGrade.grade}&amp;gradeName=${currentGrade.gradeName}&amp;course=${currentCourse.course}&amp;courseName=${currentCourse.courseName}&amp;content="><i>手动选题</i></a>
                        <%--       <a href="<%=request.getContextPath()%>/paper/search_point.do"><i>知识点选题</i></a>--%>
                    </div>
                </li>
                <li class="complex-nav-item">
                    <a href="javascript:;" class="">智能组卷</a>
                    <div class="dd-list">
                        <%--<a href="<%=request.getContextPath()%>/paper/auto_chapter.do"><i>章节智能组卷</i></a>--%>
                        <a href="<%=request.getContextPath()%>/paper/auto_point.do"><i>知识点智能组卷</i></a>
                    </div>
                </li>
                <li class="complex-nav-item">
                    <a class="" href="javascript:;" onclick=" return true;">试卷库</a>
                    <div class="dd-list">
                        <%--
                                                <a href="<%=request.getContextPath()%>/paper/search.do?grade=${currentGrade.grade}&amp;gradeName=${currentGrade.gradeName}&amp;course=${currentCourse.course}&amp;courseName=${currentCourse.courseName}&amp;content="><i>同步试卷</i></a>
                        --%>
                        <a href="<%=request.getContextPath()%>/paper/search.do?grade=${currentGrade.grade}&amp;gradeName=${currentGrade.gradeName}&amp;course=${currentCourse.course}&amp;courseName=${currentCourse.courseName}&amp;content="><i>测试试卷</i></a>
                        <%--                        <a href="<%=request.getContextPath()%>/paper/search.do?grade=${currentGrade.grade}&amp;gradeName=${currentGrade.gradeName}&amp;course=${currentCourse.course}&amp;courseName=${currentCourse.courseName}&amp;content="><i>真卷&amp;模拟卷</i></a>--%>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
<script>
    function mechanToLogin() {
        var tologin = 0;
        if (tologin) {
            OT2.Global.initLogin();
            return false;
        }
        return true;
    }
</script>
<!--头部导航部分结束-->

<div class="breadcrumb g-container">
    <i class="icona-dingwei"></i>当前位置：<a href="<%=request.getContextPath()%>/index.do">首页</a><b>&gt;</b><a
        href="<%=request.getContextPath()%>/question/search.do?content=">${currentGrade.gradeName}${currentCourse.courseName}</a>
</div>

<!--主体部分开始------------------------->
<div class="g-container f-cb" id="smarter-view">
    <form id="select-form" class="layui-form" method="post" action="<%=request.getContextPath()%>/paper/auto_generate.do">
        <div class="g-sd1" style="background: #fff none repeat scroll 0 0;">
            <div class="chapter-con f-usn" onselectstart="return false">
                <h1>选择知识点</h1>
                <div id="xtree1" class="t2-tree-smart" style="font-size: 6px!important;"></div>
            </div>
        </div>


        <div class="g-mn1">
            <div class="g-mn1c" style="background: #fff none repeat scroll 0 0;">
                <!-- 章节 -->
                <div class="smarter-section" id="J_ResultRegion">
                    <h3>试卷设置</h3>
                    <div class="smart-paper-setting">
                        <div id="J_Difficulty" class="q-set f-usn"><em style="margin-top: 10px;">试卷难度：</em>
                            <div id="qdstar" class="layui-input-inline" style="display: inline;width: 200px;"></div>
                            <input type="hidden" id="difficulty" name="difficulty" lay-verify="required|number" value="">
                            <input type="hidden" id = "pointIds" name="pointIds" lay-verify="required" value="">
                        </div>
                        <div id="J_SelectType" class="q-set f-usn q-select-type"><em>出卷方式：</em>
                            <span class="radiobox checked">
                                <input type="radio" name="gaType" value="related" style="display:none" checked="" title="关联出题">
                            </span>
                            <b class="icona-help1 J_IconTip">提示</b><div class="t-tip" style="left: 188.156px; top: 240px; position: absolute; display: none;"><i class="icona-dia-tri"></i>匹配出来的试题包含的知识点（章节），最少有一个在已选的知识点（章节）中，这个方式适用于期末考试、学业考试、升学考试等试卷类型。出题的综合性较强。</div>
                            <span class="radiobox">
                                <input type="radio" name="gaType" value="accurate" style="display:none" title="精准出题">
                            </span>
                            <b class="icona-help1 J_IconTip">提示</b><div class="t-tip" style="left: 304.313px; top: 240px; position: absolute; display: none;"><i class="icona-dia-tri"></i>匹配出来的试题包含的知识点（章节）。都在已选的知识点（章节）中，这个方式保证了组卷的精准性，避免超纲试题的出现，适用于同步类型的试卷。</div>
                        </div>
                    </div>
                    <h3>题型/题量/分数设置设置</h3>
                    <div class="section-table">
                        <div class="qtype-zone f-cb" id="J_TypeItems">
                            <div class="w f-fl">
                                <div class="qtype-selected">
                                    <ul>
                                        <!-- type-item -->
                                        <li class="t-item">
                                            <b class="t-mark">0 道试题可用</b>
                                            <span><em title="单选题">单选题</em></span>
                                            <div>
                                                <input type="text" name="singleNum" value="" lay-verify="required|number" placeholder="数量">
                                                <input type="text" name="singleScore" value="" lay-verify="required|number" placeholder="每题分数">
                                                <a href="javascript:;"><i class="icona-del1"></i></a>
                                            </div>
                                        </li>
                                        <li class="t-item">
                                            <b class="t-mark">0 道试题可用</b>
                                            <span><em title="判断题">判断题</em></span>
                                            <div>
                                                <input type="text" name="judgmentNum" value="" lay-verify="required|number" placeholder="数量">
                                                <input type="text" name="judgmentScore" value="" lay-verify="required|number" placeholder="每题分数">
                                                <a href="javascript:;"><i class="icona-del1"></i></a>
                                            </div>
                                        </li>
                                        <li class="t-item">
                                            <b class="t-mark">0 道试题可用</b>
                                            <span><em title="填空题">填空题</em></span>
                                            <div>
                                                <input type="text" name="completeNum" value="" lay-verify="required|number" placeholder="数量">
                                                <input type="text" name="completeScore" value="" lay-verify="required|number" placeholder="每题分数">
                                                <a href="javascript:;"><i class="icona-del1"></i></a>
                                            </div>
                                        </li>
                                        <li class="t-item">
                                            <b class="t-mark">0 道试题可用</b>
                                            <span><em title="简答题">简答题</em></span>
                                            <div>
                                                <input type="text" name="simpleNum" value="" lay-verify="required|number" placeholder="数量">
                                                <input type="text" name="simpleScore" value="" lay-verify="required|number" placeholder="每题分数">
                                                <a href="javascript:;"><i class="icona-del1"></i></a>
                                            </div>
                                        </li>
                                        <li class="t-item">
                                            <b class="t-mark">0 道试题可用</b>
                                            <span><em title="作文">作文</em></span>
                                            <div>
                                                <input type="text" name="compositionNum" value="" lay-verify="required|number" placeholder="数量">
                                                <input type="text" name="compositionScore" value="" lay-verify="required|number" placeholder="每题分数">
                                                <a href="javascript:;"><i class="icona-del1"></i></a>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <%--<div class="qtype-list f-fr">
                                <dl>
                                    <dd><!-- 学科题型种类 -->
                                        <a href="javascript:;" class="" title="单选题">单选题</a>
                                        <a href="javascript:;" class="" title="填空题">填空题</a>
                                        <a href="javascript:;" class="active" title="计算题">计算题</a>
                                        <a href="javascript:;" class="active" title="解答题">解答题</a>
                                        <a href="javascript:;" class="active" title="作图题">作图题</a>
                                        <a href="javascript:;" class="active" title="综合题">综合题</a>
                                    </dd>
                                </dl>
                            </div>--%>
                        </div>

                    </div>
                </div>
                <div class="smarter-footer">
                    <button lay-submit lay-filter="*" class="set-btn">生成试卷</button>
                </div>
            </div>
        </div>

    </form>
</div>
<%--主题部分结束-------------------------------------------------------------------------%>

<script src="<%=request.getContextPath()%>/static/js/lib/jquery.superslide.2.1.1.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/home.min.js"></script>
<script>

    layui.use(['rate'], function () {
        var rate = layui.rate;
        //自定义文本
        rate.render({
            elem: '#qdstar'
            , value: 0
            , text: true
            , half: true
            , theme: "#50AD54"
            , readonly: false
            ,choose: function(value){
                $("#difficulty").val(value);
            }
            , setText: function (value) { //自定义文本的回调
                var arrs = {
                    '0': '难度0'
                    , '0.5': '难度1'
                    , '1': '难度2'
                    , '1.5': '难度3'
                    , '2': '难度4'
                    , '2.5': '难度5'
                    , '3': '难度6'
                    , '3.5': '难度7'
                    , '4': '难度8'
                    , '4.5': '难度9'
                    , '5': '难度10'
                };
                this.span.text(arrs[value] || (value + "星"));
            }
        })
    });
    $(function () {
        mechanToLogin();
    })


    layui.use('form', function () {
        var form = layui.form;
        //各种基于事件的操作
        var ddd =${vcp};
        var xtree1 = new layuiXtree({
            elem: 'xtree1'   //(必填) 放置xtree的容器id，不要带#号
            , form: form     //(必填) layui 的 from
            , data: ddd     //(必填) json数组（数据格式在下面）
            , click: function (data) {  //节点选中状态改变事件监听，全选框有自己的监听事件
                console.log(data.elem.value); //得到checkbox原始DOM对象
                console.log(data.elem.checked); //开关是否开启，true或者false
                console.log(data.value); //开关value值，也可以通过data.elem.value得到
                console.log(data.othis); //得到美化后的DOM对象
                var p = xtree1.GetChecked();
                if(null!=p){
                    if(p.length!=0){
                        var points = new Array();
                        for(var i=0;i<p.length;i++){
                            points.push($(p[i]).val());
                        }
                        $("#pointIds").val(points);
                    }
                }
            }
        });
        form.on('submit(*)', function(data){
            //加载层-风格4
            layer.msg('自动生成中', {
                icon: 16
                ,shade: 0.01
            });
            return true; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });


    });
</script>


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
            <p class="copyright">2017-2018 版权所有©Ridup <a href="https://github.com/Ridup" rel="nofollow" target="_blank">GitHub</a>
            </p>
            <p class="footer-adress">
                <span>邮编：330031</span>
                <span>江西省南昌市南昌大学</span>
            </p>
        </div>
    </div>
</div>
<!--footer结束-->


<div id="Login_Pal" style="display: none">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/reg.min.css">
    <style>
        .reg-form {
            z-index: 1110;
            left: 50%;
            margin-left: -180px;
            top: 0;
        }

        .reg-mask {
            position: fixed;
            left: 0;
            top: 0;
            bottom: 0;
            right: 0;
            background: #000;
            opacity: 0.5;
            filter: alpha(opacity=50);
            z-index: 1000;
        }

        .reg-form .btn-close {
            position: absolute;
            right: 16px;
            top: 16px;
            display: block;
            text-indent: -9999px;
            width: 24px;
            height: 24px;
            background: url("<%=request.getContextPath()%>/images/close_24.png") no-repeat center center;
        }

        .reg-form .btn-close:hover {
            opacity: 0.8;
        }
    </style>
    <div class="reg-mask"></div>
    <div class="reg-form">
        <ul>
            <li>
                <a href="javascript:;" class="reg-active">登录</a>
            </li>
        </ul>
        <a class="btn-close J_CloseForm">x</a>
        <form id="J_LoginForm" class="reg-form-detail" action="<%=request.getContextPath()%>/user/loginIn.do"
              method="post">
            <input type="hidden" name="_csrf"
                   value="r7FZtSK7tjkAAsfu7xmhU2vUGReAkvI9Nl2yNJh_LqjV0G34Wt_UXmhMk7arUMZiWOxxXfrLsFYBP9BV-QZH-g==">
            <div class="reg-form-input">
                <label for="account" class="placeholder">请输入手机号码</label>
                <input type="text" name="username" id="account" placeholder="请输入手机号码">
                <div class="fm-warn"><p></p><i></i></div>

            </div>
            <div class="reg-form-input">
                <label for="password" class="placeholder">请输入密码</label>
                <input type="password" name="password" id="password" placeholder="请输入密码">
                <div class="fm-warn"><p></p><i></i></div>

            </div>
            <div class="login-line">
                <div class="login-auto">
                    <span class="checkbox checked f-usn" onselectstart="return false"><i class="icona-check"></i><input
                            type="checkbox" checked="" value="1" class="f-dn" name="LoginForm[rememberMe]">自动登录</span>
                </div>
                <div class="login-pwd">
                    <a href="javascript:void (0);" target="_blank">忘记密码</a>
                </div>
            </div>
            <div class="reg-btn">
                <button type="submit">登录</button>
            </div>
        </form>
        <div class="login-others">
            <div class="login-others-method">其它登录方式：
                <a href="javascript:void (0);"><i class="icona-wxloginbtn"> </i></a>
                <a href="javascript:void (0);"><i class="icona-qqloginbtn"> </i></a>
            </div>
            <div class="login-reg">
                <a target="_blank" href="<%=request.getContextPath()%>/user/register.do">免费注册<i
                        class="icona-right-arrow"></i></a>
            </div>
        </div>
    </div>
</div>

<script src="<%=request.getContextPath()%>/static/js/extends/element.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/field.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/user.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/global.min.js"></script>

<a class="return" href="javascript:;" style="right: 9px;"><i class="icona-top"></i></a>

<script src="<%=request.getContextPath()%>/static/js/extends/yii.js"></script>
<script src="<%=request.getContextPath()%>/static/js/lib/layer.js"></script>
</body>
</html>