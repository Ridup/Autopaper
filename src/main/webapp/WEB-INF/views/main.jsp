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
        </style>
        <div class="slogan">
            <a href="<%=request.getContextPath()%>/">Ridup旗下产品</a>
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
                    <li><a href="<%=request.getContextPath()%>/ucenter/error_record.do" target="_blank">纠错记录</a></li>

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
        <%--<div class="contactbox">
            <a class="link-into" href="https://zujuan.21cnjy.com/payment/vip" target="_blank">
                <img src="<%=request.getContextPath()%>/static/images/VIP.gif">
                <strong>购买VIP</strong>
            </a>
            <a class="link-into" href="https://zujuan.21cnjy.com/help/request" target="_blank">
                <img src="<%=request.getContextPath()%>/static/images/xwt.gif">
                <strong>开通学校服务</strong>
            </a>
        </div>--%>
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
            <a href="https://zujuan.21cnjy.com/?1=1#" class="item">当前：<span>${currentGrade.gradeName}${currentCourse.courseName}</span><i class="icona-tri2"></i></a>
            <div class="item-list">
                <c:forEach items="${allCourses}" var="courses">
                    <div class="list-${courses.gradeId}">
                        <h3>${courses.gradeName}</h3>
                        <c:forEach items="${courses.coursePojos}" var="course">
                            <a href="<%=request.getContextPath()%>/course/saveCurrentCourse.do?grade=${courses.gradeId}&amp;gradeName=${courses.gradeName}&amp;course=${course.course}&amp;courseName=${course.courseName}"
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
                        <a href="https://zujuan.21cnjy.com/question?tree_type=category&amp;chid=3&amp;xd=2"><i>章节同步选题</i></a>
                        <a href="https://zujuan.21cnjy.com/question?tree_type=knowledge&amp;chid=3&amp;xd=2"><i>知识点选题</i></a>
                    </div>
                </li>
                <li class="complex-nav-item">
                    <a href="javascript:;" class="">智能组卷</a>
                    <div class="dd-list">
                        <a href="https://zujuan.21cnjy.com/smarter?tree_type=category"><i>章节智能组卷</i></a>
                        <a href="https://zujuan.21cnjy.com/smarter?tree_type=knowledge"><i>知识点智能组卷</i></a>
                        <a onclick="return OT2.Global.initLogin();"><i>双向细目表组卷</i></a>
                    </div>
                </li>
                <li class="complex-nav-item">
                    <a class="" href="javascript:;" onclick=" return true;">试卷库</a>
                    <div class="dd-list">
                        <a href="https://zujuan.21cnjy.com/paper/new-index"><i>同步试卷</i></a>
                        <a href="https://zujuan.21cnjy.com/paper/new-index?tree_type=sync"><i>测试试卷</i></a>
                        <a href="https://zujuan.21cnjy.com/paper/new-index?tree_type=exam"><i>真卷&amp;模拟卷</i></a>
                    </div>
                </li>
                <li>
                    <a class="" href="https://zujuan.21cnjy.com/subject" onclick=" return true;">专题特供</a>
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


<!--banner部分开始-->
<div class="banner">
    <div class="silderbox">
        <ul style="position: relative; width: 100%; height: 350px;">
            <li style="background: url('http://tikupic.21cnjy.com/5a/86/5a8625a40d290a00385138c1763c048b.') center center no-repeat rgb(17, 137, 171); position: absolute; width: 100%; left: 0px; top: 0px; display: none;">
                <a href="https://zujuan.21cnjy.com/merge?id=38" target="_blank"></a>
            </li>
            <li style="background: url('http://tikupic.21cnjy.com/36/36/3636216cfefc9bbaf76c48b88ae7aaee') center center no-repeat rgb(17, 137, 171); position: absolute; width: 100%; left: 0px; top: 0px; display: none;">
                <a href="https://zujuan.21cnjy.com/merge?id=34" target="_blank"></a>
            </li>
            <li style="background: url('http://tikupic.21cnjy.com/36/36/3636216cfefc9bbaf76c48b88ae7aaee') center center no-repeat rgb(17, 137, 171); position: absolute; width: 100%; left: 0px; top: 0px; display: none;">
                <a href="https://zujuan.21cnjy.com/merge?id=36" target="_blank"></a>
            </li>
            <li style="background: url('http://tikupic.21cnjy.com/36/36/3636216cfefc9bbaf76c48b88ae7aaee') center center no-repeat rgb(17, 137, 171); position: absolute; width: 100%; left: 0px; top: 0px; display: none;">
                <a href="https://zujuan.21cnjy.com/merge?id=40" target="_blank"></a>
            </li>
            <li style="background: url('http://tikupic.21cnjy.com/36/36/3636216cfefc9bbaf76c48b88ae7aaee') center center no-repeat rgb(17, 137, 171); position: absolute; width: 100%; left: 0px; top: 0px; display: none;">
                <a href="https://zujuan.21cnjy.com/merge?id=32" target="_blank"></a>
            </li>
            <li style="background: url('http://tikupic.21cnjy.com/36/36/3636216cfefc9bbaf76c48b88ae7aaee') center center no-repeat rgb(17, 137, 171); position: absolute; width: 100%; left: 0px; top: 0px; display: none;">
                <a href="https://zujuan.21cnjy.com/merge?id=28" target="_blank"></a>
            </li>
        </ul>
        <div class="control-l prev"><i class="iconb-banner-left"></i></div>
        <div class="control-r next"><i class="iconb-banner-right"></i></div>
        <div class="control-s">
            <ul>
                <li class=""></li>
                <li class="on"></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
            </ul>
        </div>
    </div>
</div>
<!--banner部分结束-->


<!--主体部分开始-->
<div class="g-bd2 f-cb g-container">
    <div class="g-mn">

        <div class="g-mn2c">
            <!--主体部分左半部分开始-->
            <!--主体部分学科分类开始-->
            <c:forEach items="${allCourses}" var="courses">
                <div class="subject">
                    <h3><i class="iconb-ruler"></i>${courses.gradeName}资源导航</h3>
                    <div class="subject-items">
                        <ul>
                            <c:forEach items="${courses.coursePojos}" var="course">
                                <li>
                                    <div class="itemsbox">
                                        <i class="iconb-${course.course}"></i>
                                        <div class="subject-list">
                                            <p class="list-txt1"><a
                                                    href="javascript:;"><span>${courses.gradeName}</span>${course.courseName}
                                            </a></p>
                                            <p class="list-txt2">
                                                <a href="<%=request.getContextPath()%>/question/search.do?grade=${courses.gradeId}&amp;gradeName=${courses.gradeName}&amp;course=${course.course}&amp;courseName=${course.courseName}&amp;content=">试题</a>
                                                <span></span>
                                                <a href="<%=request.getContextPath()%>/paper/search.do?grade=${courses.gradeId}&amp;gradeName=${courses.gradeName}&amp;course=${course.course}&amp;courseName=${course.courseName}&amp;content=">试卷</a>
                                            </p>
                                        </div>
                                    </div>
                                </li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
            </c:forEach>
            <!--主体部分学科分类结束-->
            <!--主体部分左半部分结束-->
        </div>
    </div>


    <div class="g-sd2">
        <!--主体部分右半部分开始-->
        <div class="con-right">
            <div class="section-zt">
                <h3><i class="iconb-ts"></i>推荐<a href="javascript:void (0);" target="_blank">更多&gt;</a></h3>

                <div class="sidebar-zt">
                    <table>
                        <tbody>
                        <tr class="zt-tbgz1">
                            <td>
                                <div class="zt-pic"><i></i></div>
                            </td>
                            <td>
                                <p class="sub-list-txt1"><a href="javascript:void (0);">同步跟踪训练</a></p>
                                <p class="sub-list-txt2"><a href="javascript:void (0);"
                                                            title="2017-2018学年部编版初中道德与法治八年级下册同步跟踪训练">2017-2018学年部编版初中道德与法治八年级下册同步跟踪训练</a>
                                </p>
                            </td>
                        </tr>
                        <tr class="zt-tbgz1">
                            <td>
                                <div class="zt-pic"><i></i></div>
                            </td>
                            <td>
                                <p class="sub-list-txt1"><a href="javascript:void (0);">同步跟踪训练</a></p>
                                <p class="sub-list-txt2"><a href="javascript:void (0);"
                                                            title="2017-2018学年部编版初中历史八年级下册同步跟踪训练">2017-2018学年部编版初中历史八年级下册同步跟踪训练</a>
                                </p>
                            </td>
                        </tr>
                        <tr class="zt-tbgz1">
                            <td>
                                <div class="zt-pic"><i></i></div>
                            </td>
                            <td>
                                <p class="sub-list-txt1"><a href="javascript:void (0);">同步跟踪训练</a></p>
                                <p class="sub-list-txt2"><a href="javascript:void (0);"
                                                            title="2017-2018学年部编版初中道德与法治七年级下册同步跟踪训练">2017-2018学年部编版初中道德与法治七年级下册同步跟踪训练</a>
                                </p>
                            </td>
                        </tr>
                        <tr class="zt-tbgz2">
                            <td>
                                <div class="zt-pic"><i></i></div>
                            </td>
                            <td>
                                <p class="sub-list-txt1"><a href="javascript:void (0);">中考复习</a></p>
                                <p class="sub-list-txt2"><a href="javascript:void (0);" title="2018年初中英语中考备战一轮复习（语法专题）">2018年初中英语中考备战一轮复习（语法专题）</a>
                                </p>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="section-gg">
                    <h3><i class="iconb-gg"></i>公告</h3>

                    <ul>

                        <li><i class="icona-ellipse"></i><a href="javascript:void (0);" title="组卷编辑页面" target="_blank">组卷编辑页面</a>
                            <span class="gg-time">2017-4-11</span>
                            <div id="test2">

                            </div>
                        </li>
                        <li><i class="icona-ellipse"></i><a href="javascript:void (0);" title="组卷"
                                                            target="_blank">组卷</a>
                            <span class="gg-time">2016-9-12</span>
                        </li>
                        <li><i class="icona-ellipse"></i><a href="javascript:void (0);" title="双向细目表组卷" target="_blank">双向细目表组卷</a>
                            <span class="gg-time">2017-3-31</span>
                        </li>
                    </ul>
                </div>
            </div>
            <!--主体部分右半部分结束-->
        </div>
    </div>

    <div class="content g-container">
        <!--主体部分底部数据开始-->
        <div class="con-bottom">
            <div class="section-sj">
                <h3><i class="iconb-data"></i>数据</h3>
                <ul>
                    <li>
                        <div class="sj-list sj-list-first">
                            <a href="javascript:void (0);"><i class="iconb-book1"></i></a>
                            <a href="javascript:void (0);"><h2>试题库</h2></a>
                            <p class="p-cl1">试题总量</p>
                            <h4>3344179</h4>
                            <p class="p-cl2">今日更新试题：2894道</p>
                        </div>
                    </li>
                    <li>
                        <div class="sj-list">
                            <a href="javascript:void (0);"><i class="iconb-book2"></i></a>
                            <a href="javascript:void (0);"><h2>试卷库</h2></a>
                            <p class="p-cl1">试卷总量</p>
                            <h4>496272</h4>
                            <p class="p-cl2">今日更新试卷：221份</p>
                        </div>
                    </li>
                    <li>
                        <div class="sj-list">
                            <a href="javascript:void (0);"><i class="iconb-computer"></i></a>
                            <a href="javascript:void (0);"><h2>智能组卷</h2></a>
                            <p class="p-cl1">组卷总量</p>
                            <h4>406986</h4>
                            <p class="p-cl2">今日组卷数量：4301份</p>
                        </div>
                    </li>
                    <li>
                        <div class="sj-list">
                            <a href="javascript:void (0);"><i class="iconb-data1"></i></a>
                            <a href="javascript:void (0);"><h2>在线测试</h2></a>
                            <p class="p-cl1">测试总量</p>
                            <h4>225818</h4>
                            <p class="p-cl2">今日测试次数：424次</p>
                        </div>
                    </li>
                    <li>
                        <div class="sj-list sj-list-last">
                            <a href="javascript:void (0);"><i class="iconb-hezuoschool"></i></a>
                            <a href="javascript:void (0);"><h2>合作学校</h2></a>
                            <p class="p-cl1">学校总量</p>
                            <h4>121276</h4>
                            <p class="p-cl2">今日新增学校：12所</p>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="section-ts">
                <h3><i class="iconb-fk"></i>特色</h3>
                <ul>
                    <li>
                        <div class="ts-list">
                            <div><i class="iconb-tese1"></i></div>
                            <p class="ts-txt">为老师用户提供</p>
                            <p class="ts-nav">
                                <a href="javascript:void (0);" target="_blank">优质试题</a>
                                <a href="javascript:void (0);" target="_blank">海量试卷</a>
                                <a href="javascript:void (0);" target="_blank">精品专题</a>
                                <a href="javascript:void (0);" target="_blank">在线组卷</a>
                            </p>
                        </div>
                    </li>
                    <li>
                        <div class="ts-list">
                            <div><i class="iconb-tese2"></i></div>
                            <p class="ts-txt">为学生用户提供</p>
                            <p class="ts-nav">
                                <a href="javascript:void (0);" target="_blank">自我测试</a>
                                <a href="javascript:void (0);" target="_blank">测试报告</a>
                                <a href="javascript:void (0);" target="_blank">好题本</a>
                                <a href="javascript:void (0);" target="_blank">错题本</a>
                            </p>
                        </div>
                    </li>
                    <li>
                        <div class="ts-list">
                            <div><i class="iconb-tese3"></i></div>
                            <p class="ts-txt">为学校用户提供</p>
                            <p class="ts-nav">
                                <a href="javascript:void (0);" target="_blank">优质资源</a>
                                <a href="javascript:void (0);" target="_blank">智能组卷</a>
                                <a href="javascript:void (0);" target="_blank">定制化服务</a>
                            </p>
                        </div>
                    </li>
                </ul>
            </div>

        </div>
        <!--主体部分底部数据结束-->
    </div>
    <!--主体部分结束-->
</div>


<script src="<%=request.getContextPath()%>/static/js/lib/jquery.superslide.2.1.1.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/home.min.js"></script>
<script>

    layui.use(['rate'], function() {
        var rate = layui.rate;
        //自定义文本
        //显示文字
        rate.render({
            elem: '#test2'
            ,value: 2 //初始值
            ,text: true //开启文本
        });
    });
    $(function () {
        mechanToLogin();
    })
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

<div class="data">
    <div class="inner-data">
        <script type="text/javascript">
            var _hmt = _hmt || [];
            (function () {
                var hm = document.createElement("script");
                hm.src = "https://hm.baidu.com/hm.js?5d70f3704df08b4bfedf4a7c4fb415ef";
                var s = document.getElementsByTagName("script")[0];
                s.parentNode.insertBefore(hm, s);
            })();
            //var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1668216'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s95.cnzz.com/stat.php%3Fid%3D1668216%26show%3Dpic1' type='text/javascript'%3E%3C/script%3E"));
        </script>
    </div>
</div>
<script src="<%=request.getContextPath()%>/static/js/extends/yii.js"></script>
<script src="<%=request.getContextPath()%>/static/js/lib/layer.js"></script>
</body>
</html>