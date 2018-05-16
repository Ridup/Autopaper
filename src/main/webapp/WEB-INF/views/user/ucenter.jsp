<%@ page contentType="text/html;charset=UTF-8" language="java"  import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <meta name="csrf-token" content="CuLu_5_b5pKzlDz2vF0s8oF0235xNpoeksCnr1yLttF6kZu71aqP2ur7bb3oDnq4yRajGAJwxUHc8sTBZO3Ygg==">
    <title>个人信息</title>
    <script src="<%=request.getContextPath()%>/static/js/extends/hm.js"></script>
    <script>
        (function(doc, win) {
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
        OT2.ns = function(name) {
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
        USER = {} ;
    </script>
    <!--[if lt IE 9]>
    <script> OT2.AboveIE9= false;</script>
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
    <%--<script src="<%=request.getContextPath()%>/static/js/extends/profile.min.js"></script>--%>
    <style>html, * {-webkit-user-select:text!important; -moz-user-select:text!important;}</style>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/layer.css" id="layuicss-skinlayercss">
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
            .user-news { position: absolute; top: 40px; right: 0; background: #fefefe; width: 260px; min-height: 112px;  line-height: 24px; border: 1px solid #ccc; border-radius: 4px; font-size: 14px; box-shadow: 0 0 10px #dcdcdc; display: none; }
            .user-news-hd { border-bottom: 1px solid #efefef; padding-bottom: 4px; margin: 6px 10px; font-size: 12px; color:#666; }
            .user-news .icon { display: block; top: -8px; right: 40px; position: absolute; }
            .user-news-close { position: absolute; right: 10px; top: 10px; width: 16px; height: 16px; }
            .user-news-close img { width: 100%; height: 100%;}
            .vip-overtip {text-align: center; }
            .vip-overtip { padding-top: 6px;}
            .vip-overtip p strong { color: red; margin:0 3px; }
            .vip-overtip .tip-notice { color: red; font-size: 16px; font-weight: bold; }
            .vip-overtip a { color: #52c684; }
        </style>

        <div class="header-logo">
            <a href="<%=request.getContextPath()%>/index.do">
                <img src="<%=request.getContextPath()%>/static/images/login-logo1.png" alt="自动组卷平台" title="自动组卷平台">
            </a>
        </div>
        <div class="header-logo-sd f-fr">
            <div class="user f-fr f-pr topbar-dropmap">
                <a href="<%=request.getContextPath()%>/ucenter/" target="_blank">${user.nickName}<i class="icona-tri ml"></i></a>
                <div class="drop-bd" style="display: none;">
                    <ul>
                        <li><a href="<%=request.getContextPath()%>/ucenter/download_record.do" target="_blank">下载记录</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/generate_record.do" target="_blank">组卷记录</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/test_record.do" target="_blank">测试记录</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/error_record.do" target="_blank">纠错记录</a></li>
                        <c:if test="${loginUser.userType=='1'}"><li><a href="<%=request.getContextPath()%>/ucenter/question_in_record.do" target="_blank">试题录入记录</a></li></c:if>
                        <li><a href="<%=request.getContextPath()%>/ucenter/error_question.do" target="_blank">错题本</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/myfavorite.do" target="_blank">我的收藏</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/index.do" target="_blank">个人信息</a></li>
                        <li class="split-line"></li>
                        <li><a data-method="post" href="<%=request.getContextPath()%>/user/logout.do">退出</a></li>
                    </ul>
                    <span class="icona-dia-tri"></span>
                </div>
            </div>
            <div class="user f-fr"><a href="<%=request.getContextPath()%>/ucenter/u-msg.do"><i class="icona-xinxi"></i>消息<span>(0)</span></a></div>
            <div class="header-nav">
                <a href="<%=request.getContextPath()%>/index.do" class="help"><i class="icona-home"></i>网站首页</a>
                <span class="split"></span>
                <c:if test="${loginUser.userType=='1'}">
                    <a href="<%=request.getContextPath()%>/question/question_in.do" class="help" target="_blank"><i class="icona-leixing"></i>试题录入</a>
                    <span class="split"></span>
                </c:if>
                <a href="<%=request.getContextPath()%>/main/help.do" class="help" target="_blank"><i class="icona-help"></i>帮助中心(可请求一个操作文档)</a>
                <span class="split"></span>
            </div>
        </div>
    </div>
</div>
<script>
    $(document).ready(function () {
        var tips = $("#tips").val();
        var ucenter_position = $("#ucenter_position").val();
        if(tips!=null&&tips!=""){
            layer.alert("<span style='margin-left: 70px;text-align: center;'>"+tips+"</span>");
        }
        $(".topbar-dropmap").hover(function () {
            $(".drop-bd").css("display","block");
        },function () {
            $(".drop-bd").css("display","none");
        });

        /* 判断UCenter位置*/
        if(ucenter_position!=null&&ucenter_position!=""){
            $("#"+ucenter_position).css({"background-color": "#3db06e","color":"#FFF"});
            $("#"+ucenter_position).unbind().unbind();
        }
    });
</script>

<input type="hidden" value="${ucenter_position}" id="ucenter_position"/>
<!--顶部导航结束（公用）-->

<%--中部内容开始--%>
<div class="g-bd1 f-cb g-container">
    <%--右部开始--%>
    <div class="g-sd1">
        <div class="user-msg">
            <%--用户头开始--%>
            <div class="msg-box">
                <div class="user-pic">
                    <div class="pic-border">
                        <img src="<%=request.getContextPath()%>/static/images/10.png">
                    </div>
                </div>

                <div class="user-id">
                    <p class="user-idname">${user.nickName}</p>
                    <c:if test="${user.userType=='1'}">
                        <p class="user-level"><i class="icona-lv-gold"></i>教师</p>
                    </c:if>
                    <c:if test="${user.userType=='2'}">
                        <p class="user-level"><i class="icona-lv-gold"></i>学生</p>
                    </c:if>
                </div>
            </div>
            <div class="points">
                <ul>
                    <li><p><span>0</span>积分</p></li>
                    <li><p class="line-border"><span>0</span>积分</p></li>
                </ul>
            </div>
            <%--用户头结束--%>

            <%--右部下--%>
            <div class="user-using">
                <ul>
                    <li><a href="<%=request.getContextPath()%>/ucenter/download_record.do" id="download_record"><i class="icona-download3"></i>下载记录</a></li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/generate_record.do" id="generate_record"><i class="icona-zjjl"></i>组卷记录</a></li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/test_record.do" id="test_record"><i class="icona-csjl"></i>测试记录</a></li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/error_record.do" id="error_record"><i class="dj-error"></i>纠错记录</a></li>
                    <c:if test="${loginUser.userType=='1'}"><li><a href="<%=request.getContextPath()%>/ucenter/question_in_record.do" target="_blank"><i class="icona-dtk"></i>试题录入记录</a></li></c:if>
                    <li><a href="<%=request.getContextPath()%>/ucenter/error_question.do" id="error_question"><i class="icona-ctb"></i>错题本</a></li>
                    <li>
                        <div class="mt"><span href="javascript:;"><i class="icona-shoucang2"></i>我的收藏</span><b class="icona-right2"></b></div>
                        <div class="mc">
                            <p><a href="<%=request.getContextPath()%>/ucenter/u_question.do" id="u_question"><i class="icona-ellipsesm"></i>试题收藏</a></p>
                            <p><a href="<%=request.getContextPath()%>/ucenter/u_paper.do" id="u_paper"><i class="icona-ellipsesm"></i>试卷收藏</a></p>
                        </div>
                    </li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/index.do" id="index"><i class="icona-set"></i>个人信息</a></li>
                </ul>
            </div>
            <%--右部下--%>
        </div>
    </div>
    <%--右部结束--%>
    <script>
        $(function(){

            var toNote = '';
            if(toNote){
                var d = dialog({
                    title: '安全提醒',
                    content: '<div class="email-con"><h1>邮箱未验证</h1><p>验证邮箱可大大提高账号的安全性</p></div>',
                    okValue: '去验证',
                    ok: function () {
                        window.location.href = '/ucenter/u-safe';
                    },
                    fixed: true,
                    cancelValue: '取消',
                    cancel: function() {}
                });
                d.showModal();
            }
        });

        var umenu_slider = function() {
            var _url = '/ucenter';
            $(".user-using").find("[href='"+_url+"']").each(function() {
                $(this).addClass("using-active");
                var li = $(this).closest('li');
                if (li.find('.mt').length > 0) li.addClass('active');
            });
            $('.user-using').on('click', '.mt', function(evt) {
                $(this).parent('li').toggleClass('active');
            });
        };
        setTimeout(umenu_slider, 0);
    </script>





    <div class="g-mn1">
        <div class="g-mn1c">
            <div class="user-con">
                <%--  内容开始！！！!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!--%>
                <script type="application/javascript" src="<%=request.getContextPath()%>/static/js/module/uc.js"></script>
                <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/ucenter.css">

                <h1>个人信息</h1>
                <form id="w0" class="form-info" action="https://zujuan.21cnjy.com/ucenter" method="post">
                    <input type="hidden" name="_csrf" value="CuLu_5_b5pKzlDz2vF0s8oF0235xNpoeksCnr1yLttF6kZu71aqP2ur7bb3oDnq4yRajGAJwxUHc8sTBZO3Ygg==">
                    <fieldset>
                        <legend class="form-title">基本信息</legend>

                        <%--基本信息查界面——————————————————————————————————————————--%>
                        <div class="ucenter_border viewinfo" id="viewinfodiv">
                            <span class="uoption"  id="viewinfo" ><a href="javascript:void(0)"><i class="icona-bianji"></i>[修改]</a></span>
                            <div class="form-line">
                                <label>昵称：</label>
                                <span>${user.nickName}</span>
                            </div>
                            <div class="form-line">
                                <label>用户身份：</label>
                                <c:if test="${user.userType=='1'}">
                                    <span>教师</span>
                                </c:if>
                                <c:if test="${user.userType=='2'}">
                                    <span>学生</span>
                                </c:if>
                            </div>
                            <div class="form-line">
                                <label>性别：</label>
                                <c:if test="${user.userSex==0}">
                                    <span class="radiobox checked">
                                <i class="icona-radio"></i>
                                <input type="radio" name=""  style="display: none;"> 男
                                </span>
                                    <span class="radiobox ">
                                <i class="icona-radio"></i>
                                <input type="radio" name="" style="display: none;"> 女
                                </span>
                                </c:if>
                                <c:if test="${user.userSex==1}">
                                       <span class="radiobox">
                                <i class="icona-radio"></i>
                                <input type="radio" name=""  style="display: none;"> 男
                                </span>
                                    <span class="radiobox checked">
                                <i class="icona-radio"></i>
                                <input type="radio" name="" style="display: none;"> 女
                                </span>
                                </c:if>
                            </div>
                            <div class="form-line ">
                                <label>年龄：</label>
                                <span><c:out value="${user.userAge}" default="未知"/> </span>
                            </div>
                            <div class="form-line ">
                                <label>真实姓名：</label>
                                <span><c:out value="${user.userName}" default="未知"/> </span>
                            </div>
                            <div class="form-line ">
                                <label>注册时间：</label>
                                <span><fmt:formatDate value="${user.registerTime}" type="date" dateStyle="full"/>&nbsp;&nbsp;
                                    <fmt:formatDate value="${user.registerTime}" type="time" timeStyle="long"/></span>

                            </div>
                            <div class="form-line ">
                                <label>修改时间：</label>
                                <span>
                                <fmt:formatDate value="${user.modifyTime}" type="date" dateStyle="full"/>&nbsp;&nbsp;
                                    <fmt:formatDate value="${user.modifyTime}" type="time" timeStyle="long"/></span>
                            </div>
                        </div>
                        <%--基本信息改界面————————————————————————————————————————————————--%>
                        <div class="ucenter_border editinfo" id="editinfodiv" style="display: none">
                            <span class="uoption" id="editinfo"><a href="javascript:void(0)"><i class="icona-save2"></i>[保存]</a></span>
                            <div class="form-line">
                                <label>昵称：</label>
                                <div class="inputbox reg-form-input">
                                    <input type="text" value="${user.nickName}" name="nickName" id="nickName" class="f-fl" placeholder="请输入昵称">
                                    <div class="fm-warn"><p></p><i></i></div>
                                </div>
                            </div>
                            <%--<div class="form-line">
                                <label>用户身份：</label>
                                <input type="hidden" name="userTyp" id="userTyp" value="${user.userType}">
                                <c:if test="${user.userType=='1'}">
                                    <span class="userTyp radiobox checked">
                                <i class="icona-radio"></i>
                                <input type="radio" name=""  style="display: none;" value="1"> 教师
                                </span>
                                    <span class="userTyp radiobox ">
                                <i class="icona-radio"></i>
                                <input type="radio" name="" style="display: none;" value="2"> 学生
                                </span>
                                </c:if>
                                <c:if test="${user.userType=='2'}">
                                    <span class="userTyp radiobox ">
                                <i class="icona-radio"></i>
                                <input type="radio" name=""  style="display: none;" value="1"> 教师
                                </span>
                                    <span class="userTyp radiobox checked">
                                <i class="icona-radio"></i>
                                <input type="radio" name="" style="display: none;" value="2"> 学生
                                </span>
                                </c:if>
                            </div>--%>
                            <div class="form-line">
                                <label>性别：</label>
                                <input type="hidden" name="userSex" id="userSex" value="${user.userSex}">
                                <c:if test="${user.userSex==0}">
                                    <span class="userSex radiobox checked">
                                <i class="icona-radio"></i>
                                <input type="radio" name=""  style="display: none;" value="0"> 男
                                </span>
                                    <span class="userSex radiobox ">
                                <i class="icona-radio"></i>
                                <input type="radio" name="" style="display: none;" value="1"> 女
                                </span>
                                </c:if>
                                <c:if test="${user.userSex==1}">
                                       <span class="userSex radiobox">
                                <i class="icona-radio"></i>
                                <input type="radio" name=""  style="display: none;" value="0"> 男
                                </span>
                                    <span class="userSex radiobox checked">
                                <i class="icona-radio"></i>
                                <input type="radio" name="" style="display: none;" value="1"> 女
                                </span>
                                </c:if>
                            </div>
                            <div class="form-line ">
                                <label>年龄：</label>
                                <div class="inputbox reg-form-input">
                                    <input type="text" value="${user.userAge}" name="userAge" id="userAge" class="f-fl" placeholder="请输入年龄">
                                </div>
                            </div>
                            <div class="form-line ">
                                <label>真实姓名：</label>
                                <div class="inputbox reg-form-input">
                                    <input type="text" value="${user.userName}" name="userName" id="userName" class="f-fl" placeholder="请输入真实姓名">
                                </div>
                            </div>
                        </div>
                    </fieldset>


                    <fieldset>
                        <legend class="form-title">账户安全</legend>
                        <div class="ucenter_border viewinfo">
                            <div class="form-line">
                                <label>修改密码：</label>
                                <div class="inputbox reg-form-input">
                                    <input type="password" value="${user.userPassword}" name="userPassword" id="userPassword" class="f-fl" disabled>
                                </div>
                                <span id="editpassword"><a href="javascript:void(0)"><i class="icona-bianji"></i>[修改密码]</a></span>
                                <span id="savepassword" style="display: none"><a href="javascript:void(0)"><i class="icona-save2"></i>[保存密码]</a></span>
                            </div>
                            <div class="form-line">
                                <label>绑定手机：</label>
                                <div class="inputbox reg-form-input">
                                    <input type="text" value="${user.userPhone}" name="userPhone" id="userPhone" class="f-fl" disabled>
                                </div>
                                <span id="edituserPhone"><a href="javascript:void(0)"><i class="icona-bianji"></i>[修改手机]</a></span>
                                <span id="saveuserPhone" style="display: none"><a href="javascript:void(0)"><i class="icona-save2"></i>[保存手机]</a></span>
                            </div>
                            <div class="form-line">
                                <label>绑定邮箱：</label>
                                <c:if test="${user.userEmail!=null&&user.userEmail!=''}">
                                    <div class="inputbox reg-form-input">
                                        <input type="text" value="${user.userEmail}" name="userEmail"  class="f-fl userEmail" disabled>
                                    </div>
                                    <span id="edituserEmail"><a href="javascript:void(0)"><i class="icona-bianji"></i>[修改邮箱]</a></span>
                                    <span id="saveuserEmail" style="display: none"><a href="javascript:void(0)"><i class="icona-save2"></i>[保存邮箱]</a></span>
                                </c:if>
                                <c:if test="${user.userEmail==null||user.userEmail==''}">
                                    <div class="inputbox reg-form-input" id="userEmailinput" style="display: none">
                                        <input type="text" value="${user.userEmail}" name="userEmail" class="f-fl userEmail" disabled>
                                    </div>
                                    <span id="edituserEmail" style="display: none"><a href="javascript:void(0)"><i class="icona-bianji"></i>[修改邮箱]</a></span>
                                    <span id="saveuserEmail" style="display: none"><a href="javascript:void(0)"><i class="icona-save2"></i>[保存邮箱]</a></span>
                                    <span id="createEmails"><span style="color:red;">未绑定</span><a href="javascript:void(0)" id="createEmail">[绑定]</a></span>
                                </c:if>
                            </div>
                        </div>
                    </fieldset>
                    <fieldset>
                        <legend class="form-title">其他信息</legend>
                        <div class="ucenter_border viewinfo">
                            <c:if test="${teacher!=null}">
                                <div class="form-line ">
                                    <label>所在学校：</label>
                                    <span><c:out value="${teacher.teacherSchool}" default="未知"/> </span>
                                </div>
                                <div class="form-line ">
                                    <label>所在地址：</label>
                                    <span><c:out value="${teacher.teacherAddr}" default="未知"/> </span>
                                </div>
                                <div class="form-line">
                                    <label>教师编号：</label>
                                    <span><c:out value="${teacher.teacherNo}" default="未知"/> </span>
                                </div>
                                <div class="form-line">
                                    <label>教授年级：</label>
                                    <span><c:out value="${teacher.teacherGrade}" default="未知"/> </span>
                                </div>
                                <div class="form-line">
                                    <label>学科：</label>
                                    <span><c:out value="${teacher.teacherTc}" default="未知"/> </span>
                                </div>
                                <div class="form-line">
                                    <label>版本：</label>
                                    <span><c:out value="${teacher.teachVersion}" default="未知"/> </span>
                                </div>
                            </c:if>
                            <c:if test="${student!=null}">
                                <div class="form-line ">
                                    <label>所在学校：</label>
                                    <span><c:out value="${student.studentSchool}" default="未知"/> </span>
                                </div>
                                <div class="form-line ">
                                    <label>所在地址：</label>
                                    <span><c:out value="${student.studentAddr}" default="未知"/> </span>
                                </div>
                                <div class="form-line">
                                    <label>学号：</label>
                                    <span><c:out value="${student.studentNo}" default="未知"/> </span>
                                </div>
                                <div class="form-line">
                                    <label>年级：</label>
                                    <span><c:out value="${student.studentGrade}" default="未知"/> </span>
                                </div>
                                <div class="form-line">
                                    <label>学科：</label>
                                    <span><c:out value="${student.studentCourse}" default="未知"/> </span>
                                </div>
                                <div class="form-line">
                                    <label>版本：</label>
                                    <span><c:out value="${student.studentVersion}" default="未知"/> </span>
                                </div>
                            </c:if>
                        </div>
                    </fieldset>

                </form>









                <%--  内容结束！！！--%>
            </div>
        </div>
    </div>
</div>
<%--中部内容结束--%>



<script src="<%=request.getContextPath()%>/static/js/extends/element.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/field.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/module/ucenter.min.js"></script>
<script>
    OT2.Ucenter.userinfo().form.init(function() {
        // console.log(this);
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
            <p class="copyright">2017-2018 版权所有©Ridup <a href="https://github.com/Ridup" rel="nofollow" target="_blank">GitHub</a></p>
            <p class="footer-adress">
                <span>邮编：330031</span>
                <span>江西省南昌市南昌大学</span>
            </p>
        </div>
    </div>
</div>
<!--footer结束-->







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
});</script>

</body>
</html>