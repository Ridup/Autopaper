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
    <meta name="csrf-token" content="r7FZtSK7tjkAAsfu7xmhU2vUGReAkvI9Nl2yNJh_LqjV0G34Wt_UXmhMk7arUMZiWOxxXfrLsFYBP9BV-QZH-g==">
    <title>自动组卷系统</title>
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
        var HostInfo = "https://www.baidu.com/";
        USER = {};//通知js用户的信息
        OT2.CSRF = {"_csrf": "r7FZtSK7tjkAAsfu7xmhU2vUGReAkvI9Nl2yNJh_LqjV0G34Wt_UXmhMk7arUMZiWOxxXfrLsFYBP9BV-QZH-g=="} ;
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
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/layer.css" id="layuicss-skinlayercss">
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
        <div class="slogan">
            <a href="<%=request.getContextPath()%>/">Ridup旗下产品</a>
        </div>

        <%--登陆成功显示用户信息--%>
        <input type="hidden" value="${loginUser}" id="checkLogin">
        <input type="hidden" value="${tips}" id="tips">
        <div class="user f-fr f-pr topbar-dropmap" style="display: none" id="userBar">
            <a href="<%=request.getContextPath()%>/ucenter/" target="_blank">${loginUser.nickName}<i class="icona-tri ml"></i></a>
            <div class="drop-bd"  style="display: none" id="userSelection">
                <ul>
                    <li><a href="<%=request.getContextPath()%>/ucenter/download_record.do" target="_blank">下载记录</a></li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/generate_record.do" target="_blank">组卷记录</a></li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/test_record.do" target="_blank">测试记录</a></li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/error_record.do" target="_blank">纠错记录</a></li>
                    <li><a href="<%=request.getContextPath()%>/ucenter/question_in_record.do" target="_blank">试题录入记录</a></li>
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
            <a href="<%=request.getContextPath()%>" class="help"><i class="icona-home"></i>网站首页</a>
            <span class="split"></span>
            <a href="<%=request.getContextPath()%>/ucenter/question_in.do" class="help" target="_blank"><i class="icona-leixing"></i>试题录入</a>
            <span class="split"></span>
            <a href="<%=request.getContextPath()%>/main/help.do" class="help" target="_blank"><i class="icona-help"></i>帮助中心(可请求一个操作文档)</a>
            <span class="split"></span>
            <div class="loginbox">
                <a href="<%=request.getContextPath()%>/user/login.do" class="login" onclick="OT2.Global.initLogin(); return false;"><span>登录</span></a>
                <a href="<%=request.getContextPath()%>/user/register.do" class="register"><span>注册</span></a>
            </div>
            <span class="split"></span>
        </div>
    </div>
</div>
<!--顶部导航结束（公用）-->


<script>
    /* 登陆用户判断显示*/
    $(document).ready(function () {
        var loginUser = $("#checkLogin").val();
        var tips = $("#tips").val();
        if(tips!=null&&tips!=""){
            layer.alert("<span style='margin-left: 70px;text-align: center;'>"+tips+"</span>");
        }else{
            var param = window.location.search.substr(1,4);
            if(param=="tips"){
                var tips = window.location.search.substring(6);
                console.log(tips);
                if(tips=="e01"){contentTips="请重新登陆！";}
                layer.alert("<span style='margin-left: 70px;text-align: center;color:#e65439'>"+contentTips+"</span>");
            }
        }
        if(loginUser!=null&&loginUser!=""){
            $(".loginbox").hide();
            $(".f-fr").show();
        }else{
            $(".loginbox").show();
        }

        $(".topbar-dropmap").hover(function () {
            $("#userSelection").css("display","block");
        },function () {
            $("#userSelection").css("display","none");
        });

    });
</script>




<!--头部搜索部分开始-->
<div class="top-middle">
    <div class="top-minner g-container f-cb">
        <div class="logobox">
            <a href="<%=request.getContextPath()%>">
                <img src="<%=request.getContextPath()%>/static/images/test_logo.png" alt="Ridup教育在线组卷平台" title="在线组卷平台"></a>
        </div>
        <div class="g-mn">
            <div class="searchbox">
                <form id="search-form" action="https://zujuan.21cnjy.com/paper/search" method="get">
                    <div class="search-text" id="J_SearchMenu">
                        <span class="text-select"><em class="J_tit">试卷</em><i class="icona-tri"></i></span>
                        <p class="select-items">
                            <a href="javascript:;">
                                <input type="radio" name="" value="/question/search" class="f-dn" checked="">
                                <span>试题</span>
                            </a>
                            <a href="javascript:;"><input type="radio" name="" value="/paper/search" class="f-dn"><span>试卷</span></a>
                        </p>
                    </div>
                    <div class="search-inputbox">
                        <input type="text" name="content" value="" class="search-input" placeholder="请输入关键词搜索 初中数学 资源">
                    </div>
                    <div class="search-btn">
                        <button class="btn" type="submit"><i class="icona-search"></i></button>
                    </div>
                </form>
                <script>
                    $(function(){
                        var name = $(".nav-items a.item span").html();
                        $("input[name='content']").attr({
                            'placeholder':'请输入关键词搜索 '+name+' 资源'
                        });
                    })
                </script>
            </div>
        </div>
        <div class="contactbox">
            <a class="link-into" href="https://zujuan.21cnjy.com/payment/vip" target="_blank">
                <img src="<%=request.getContextPath()%>/static/images/VIP.gif">
                <strong>购买VIP</strong>
            </a>
            <a class="link-into" href="https://zujuan.21cnjy.com/help/request" target="_blank">
                <img src="<%=request.getContextPath()%>/static/images/xwt.gif">
                <strong>开通学校服务</strong>
            </a>
        </div>
    </div>
</div>
<!--头部搜索部分结束-->






<!--头部导航部分开始-->
<script>
    OT2.xd_chid = {"chid":3,"xd":2} || null;
</script>
<div class="top-navbox">
    <div class="top-nav g-container">
        <div class="nav-items">
            <a href="https://zujuan.21cnjy.com/?1=1#" class="item">当前：<span>初中数学</span><i class="icona-tri2"></i></a>
            <div class="item-list">
                <div class="list-xx">
                    <h3>小学</h3>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=2&amp;xd=1&amp;tree_type=knowledge" onclick=" return true;">语文</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=3&amp;xd=1&amp;tree_type=knowledge" onclick=" return true;">数学</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=4&amp;xd=1&amp;tree_type=knowledge" onclick=" return true;">英语</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=5&amp;xd=1&amp;tree_type=knowledge" onclick=" return true;">科学</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=9&amp;xd=1&amp;tree_type=knowledge" onclick=" return true;">政治思品</a>
                </div>
                <div class="list-cz">
                    <h3>初中</h3>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=2&amp;xd=2&amp;tree_type=knowledge" onclick=" return true;">语文</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=3&amp;xd=2&amp;tree_type=knowledge" onclick=" return true;">数学</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=4&amp;xd=2&amp;tree_type=knowledge" onclick=" return true;">英语</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=5&amp;xd=2&amp;tree_type=knowledge" onclick=" return true;">科学</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=6&amp;xd=2&amp;tree_type=knowledge" onclick=" return true;">物理</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=7&amp;xd=2&amp;tree_type=knowledge" onclick=" return true;">化学</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=8&amp;xd=2&amp;tree_type=knowledge" onclick=" return true;">历史</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=9&amp;xd=2&amp;tree_type=knowledge" onclick=" return true;">政治思品</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=10&amp;xd=2&amp;tree_type=knowledge" onclick=" return true;">地理</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=20&amp;xd=2&amp;tree_type=knowledge" onclick=" return true;">历史与社会</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=21&amp;xd=2&amp;tree_type=knowledge" onclick=" return true;">社会思品</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=11&amp;xd=2&amp;tree_type=knowledge" onclick=" return true;">生物</a>
                </div>
                <div class="list-gz">
                    <h3>高中</h3>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=2&amp;xd=3&amp;tree_type=knowledge" onclick=" return true;">语文</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=3&amp;xd=3&amp;tree_type=knowledge" onclick=" return true;">数学</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=4&amp;xd=3&amp;tree_type=knowledge" onclick=" return true;">英语</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=6&amp;xd=3&amp;tree_type=knowledge" onclick=" return true;">物理</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=7&amp;xd=3&amp;tree_type=knowledge" onclick=" return true;">化学</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=8&amp;xd=3&amp;tree_type=knowledge" onclick=" return true;">历史</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=9&amp;xd=3&amp;tree_type=knowledge" onclick=" return true;">政治思品</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=10&amp;xd=3&amp;tree_type=knowledge" onclick=" return true;">地理</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=11&amp;xd=3&amp;tree_type=knowledge" onclick=" return true;">生物</a>
                    <a href="https://zujuan.21cnjy.com/site/index?chid=14&amp;xd=3&amp;tree_type=knowledge" onclick=" return true;">信息技术</a>
                </div>
            </div>
        </div>


        <div class="nav-list">
            <ul>
                <li>
                    <a class="active" href="https://zujuan.21cnjy.com/">首页</a>
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
                    <a class="" href="javascript:;" onclick=" return true;">试卷库</a>                    <div class="dd-list">
                    <a href="https://zujuan.21cnjy.com/paper/new-index"><i>同步试卷</i></a>
                    <a href="https://zujuan.21cnjy.com/paper/new-index?tree_type=sync"><i>测试试卷</i></a>
                    <a href="https://zujuan.21cnjy.com/paper/new-index?tree_type=exam"><i>真卷&amp;模拟卷</i></a>
                </div>
                </li>
                <li>
                    <a class="" href="https://zujuan.21cnjy.com/subject" onclick=" return true;">专题特供</a>
                </li>
            </ul>
        </div></div>
</div>
<script>
    function mechanToLogin(){
        var tologin = 0;
        if(tologin){
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
            <div class="subject">
                <h3><i class="iconb-abcfill"></i>小学资源导航</h3>
                <div class="subject-items">
                    <ul>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-yuwen"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>小学</span>语文                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=2&amp;xd=1">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=2&amp;xd=1">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-shuxue"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>小学</span>数学                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=3&amp;xd=1">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=3&amp;xd=1">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-yingyu"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>小学</span>英语                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=4&amp;xd=1">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=4&amp;xd=1">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-kexue"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>小学</span>科学                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=5&amp;xd=1">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=5&amp;xd=1">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-zhengzi"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>小学</span>政治思品</a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=9&amp;xd=1">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=9&amp;xd=1">试卷</a></p>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="subject">
                <h3><i class="iconb-ruler"></i>初中资源导航</h3>
                <div class="subject-items">
                    <ul>


                        <li>
                            <div class="itemsbox">
                                <i class="iconb-yuwen"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>初中</span>语文                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=2&amp;xd=2">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=2&amp;xd=2">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-shuxue"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>初中</span>数学                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=3&amp;xd=2">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=3&amp;xd=2">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-yingyu"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>初中</span>英语                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=4&amp;xd=2">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=4&amp;xd=2">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-kexue"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>初中</span>科学                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=5&amp;xd=2">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=5&amp;xd=2">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-wuli"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>初中</span>物理                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=6&amp;xd=2">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=6&amp;xd=2">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-huaxue"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>初中</span>化学                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=7&amp;xd=2">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=7&amp;xd=2">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-lishi"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>初中</span>历史                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=8&amp;xd=2">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=8&amp;xd=2">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-zhengzi"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>初中</span>政治思品                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=9&amp;xd=2">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=9&amp;xd=2">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-dili"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>初中</span>地理                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=10&amp;xd=2">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=10&amp;xd=2">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-shihui"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>初中</span>历史与社会                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=20&amp;xd=2">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=20&amp;xd=2">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-yuwen"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>初中</span>社会思品                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=21&amp;xd=2">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=21&amp;xd=2">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-shengwu"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>初中</span>生物                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=11&amp;xd=2">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=11&amp;xd=2">试卷</a></p>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="subject">
                <h3><i class="iconb-book"></i>高中资源导航</h3>
                <div class="subject-items">
                    <ul>


                        <li>
                            <div class="itemsbox">
                                <i class="iconb-yuwen"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>高中</span>语文                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=2&amp;xd=3">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=2&amp;xd=3">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-shuxue"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>高中</span>数学                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=3&amp;xd=3">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=3&amp;xd=3">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-yingyu"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>高中</span>英语                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=4&amp;xd=3">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=4&amp;xd=3">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-wuli"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>高中</span>物理                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=6&amp;xd=3">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=6&amp;xd=3">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-huaxue"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>高中</span>化学                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=7&amp;xd=3">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=7&amp;xd=3">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-lishi"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>高中</span>历史                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=8&amp;xd=3">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=8&amp;xd=3">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-zhengzi"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>高中</span>政治思品                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=9&amp;xd=3">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=9&amp;xd=3">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-dili"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>高中</span>地理                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=10&amp;xd=3">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=10&amp;xd=3">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-shengwu"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>高中</span>生物                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=11&amp;xd=3">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=11&amp;xd=3">试卷</a></p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="itemsbox">
                                <i class="iconb-yuwen"></i>
                                <div class="subject-list">
                                    <p class="list-txt1"><a href="javascript:;"><span>高中</span>信息技术                                                </a></p>
                                    <p class="list-txt2"><a href="https://zujuan.21cnjy.com/question/index?chid=14&amp;xd=3">试题</a><span></span><a href="https://zujuan.21cnjy.com/paper?chid=14&amp;xd=3">试卷</a></p>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <!--主体部分学科分类结束-->
            <!--主体部分左半部分结束-->
        </div>
    </div>


    <div class="g-sd2">
        <!--主体部分右半部分开始-->
        <div class="con-right">
            <div class="section-zt">
                <h3><i class="iconb-ts"></i>专题推荐<a href="https://zujuan.21cnjy.com/subject" target="_blank">更多&gt;</a></h3>

                <div class="sidebar-zt">
                    <table>
                        <tbody><tr class="zt-tbgz1">
                            <td><div class="zt-pic"><i></i></div></td>
                            <td>
                                <p class="sub-list-txt1"><a href="https://zujuan.21cnjy.com/subject/detail?id=790">同步跟踪训练</a></p>
                                <p class="sub-list-txt2"><a href="https://zujuan.21cnjy.com/subject/detail?id=790" title="2017-2018学年部编版初中道德与法治八年级下册同步跟踪训练">2017-2018学年部编版初中道德与法治八年级下册同步跟踪训练</a></p>
                            </td>
                        </tr>
                        <tr class="zt-tbgz1">
                            <td><div class="zt-pic"><i></i></div></td>
                            <td>
                                <p class="sub-list-txt1"><a href="https://zujuan.21cnjy.com/subject/detail?id=786">同步跟踪训练</a></p>
                                <p class="sub-list-txt2"><a href="https://zujuan.21cnjy.com/subject/detail?id=786" title="2017-2018学年部编版初中历史八年级下册同步跟踪训练">2017-2018学年部编版初中历史八年级下册同步跟踪训练</a></p>
                            </td>
                        </tr>
                        <tr class="zt-tbgz1">
                            <td><div class="zt-pic"><i></i></div></td>
                            <td>
                                <p class="sub-list-txt1"><a href="https://zujuan.21cnjy.com/subject/detail?id=776">同步跟踪训练</a></p>
                                <p class="sub-list-txt2"><a href="https://zujuan.21cnjy.com/subject/detail?id=776" title="2017-2018学年部编版初中道德与法治七年级下册同步跟踪训练">2017-2018学年部编版初中道德与法治七年级下册同步跟踪训练</a></p>
                            </td>
                        </tr>
                        <tr class="zt-tbgz2">
                            <td><div class="zt-pic"><i></i></div></td>
                            <td>
                                <p class="sub-list-txt1"><a href="https://zujuan.21cnjy.com/subject/detail?id=664">中考复习</a></p>
                                <p class="sub-list-txt2"><a href="https://zujuan.21cnjy.com/subject/detail?id=664" title="2018年初中英语中考备战一轮复习（语法专题）">2018年初中英语中考备战一轮复习（语法专题）</a></p>
                            </td>
                        </tr>
                        </tbody></table>
                    <!--<div class="zt-list">
                        <a href=""><img src="/images/merge/home_subject1.png"></a>
                    </div>
                    <div class="zt-list">
                        <a href=""><img src="/images/merge/home_subject2.png"></a>
                    </div>
                    <div class="zt-list">
                        <a href=""><img src="/images/merge/home_subject3.png"></a>
                    </div>-->
                </div>
                <div class="section-gg">
                    <h3><i class="iconb-gg"></i>公告</h3>
                    <ul>

                        <li><i class="icona-ellipse"></i><a href="http://zujuan.21cnjy.com/help/notice?id=42" title="组卷编辑页面，全新改版" target="_blank">组卷编辑页面，全新改版</a>
                            <span class="gg-time">2017-4-11</span>
                        </li>
                        <li><i class="icona-ellipse"></i><a href="http://zujuan.21cnjy.com/help/vip" title="组卷VIP震撼上线！包月低至16元" target="_blank">组卷VIP震撼上线！包月低至1...</a>
                            <span class="gg-time">2016-9-12</span>
                        </li>
                        <li><i class="icona-ellipse"></i><a href="http://zujuan.21cnjy.com/help/notice?id=41" title="双向细目表组卷上线公告" target="_blank">双向细目表组卷上线公告</a>
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
                            <a href="https://zujuan.21cnjy.com/question"><i class="iconb-book1"></i></a>
                            <a href="https://zujuan.21cnjy.com/question"><h2>试题库</h2></a>
                            <p class="p-cl1">试题总量</p>
                            <h4>3344179</h4>
                            <p class="p-cl2">今日更新试题：2894道</p>
                        </div>
                    </li>
                    <li>
                        <div class="sj-list">
                            <a href="https://zujuan.21cnjy.com/paper"><i class="iconb-book2"></i></a>
                            <a href="https://zujuan.21cnjy.com/paper"><h2>试卷库</h2></a>
                            <p class="p-cl1">试卷总量</p>
                            <h4>496272</h4>
                            <p class="p-cl2">今日更新试卷：221份</p>
                        </div>
                    </li>
                    <li>
                        <div class="sj-list">
                            <a href="https://zujuan.21cnjy.com/smarter"><i class="iconb-computer"></i></a>
                            <a href="https://zujuan.21cnjy.com/smarter"><h2>智能组卷</h2></a>
                            <p class="p-cl1">组卷总量</p>
                            <h4>406986</h4>
                            <p class="p-cl2">今日组卷数量：4301份</p>
                        </div>
                    </li>
                    <li>
                        <div class="sj-list">
                            <a href="https://zujuan.21cnjy.com/paper"><i class="iconb-data1"></i></a>
                            <a href="https://zujuan.21cnjy.com/paper"><h2>在线测试</h2></a>
                            <p class="p-cl1">测试总量</p>
                            <h4>225818</h4>
                            <p class="p-cl2">今日测试次数：424次</p>
                        </div>
                    </li>
                    <li>
                        <div class="sj-list sj-list-last">
                            <a href="https://zujuan.21cnjy.com/help/request"><i class="iconb-hezuoschool"></i></a>
                            <a href="https://zujuan.21cnjy.com/help/request"><h2>合作学校</h2></a>
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
                                <a href="https://zujuan.21cnjy.com/help/teacher" target="_blank">优质试题</a>
                                <a href="https://zujuan.21cnjy.com/help/teacher" target="_blank">海量试卷</a>
                                <a href="https://zujuan.21cnjy.com/help/teacher" target="_blank">精品专题</a>
                                <a href="https://zujuan.21cnjy.com/help/teacher" target="_blank">在线组卷</a>
                            </p>
                        </div>
                    </li>
                    <li>
                        <div class="ts-list">
                            <div><i class="iconb-tese2"></i></div>
                            <p class="ts-txt">为学生用户提供</p>
                            <p class="ts-nav">
                                <a href="https://zujuan.21cnjy.com/help/student" target="_blank">自我测试</a>
                                <a href="https://zujuan.21cnjy.com/help/student" target="_blank">测试报告</a>
                                <a href="https://zujuan.21cnjy.com/help/student" target="_blank">好题本</a>
                                <a href="https://zujuan.21cnjy.com/help/student" target="_blank">错题本</a>
                            </p>
                        </div>
                    </li>
                    <li>
                        <div class="ts-list">
                            <div><i class="iconb-tese3"></i></div>
                            <p class="ts-txt">为学校用户提供</p>
                            <p class="ts-nav">
                                <a href="https://zujuan.21cnjy.com/help/school" target="_blank">优质资源</a>
                                <a href="https://zujuan.21cnjy.com/help/school" target="_blank">智能组卷</a>
                                <a href="https://zujuan.21cnjy.com/help/school" target="_blank">定制化服务</a>
                            </p>
                        </div>
                    </li>
                </ul>
            </div>


            <!-- 合作院校<div class="section-hz">
                <h3><i class="iconb-school"></i>合作院校</h3>
                <div class="lunbo" id="J_LunboList">
                    <div class="lun-left prev"><i class="icona-hezuoleft"></i></div>
                    <div class="lun-right next"><i class="icona-hezuoright"></i></div>
                    <div class="lunbo-list">
                        <div class="tempWrap" style="overflow:hidden; position:relative; width:1224px"><ul class="J_LunboItems" style="width: 3264px; position: relative; overflow: hidden; padding: 0px; margin: 0px; left: -204px;"><li class="clone" style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=37593" target="_blank"><img src="../images/488160b6d4572766488201b3739b006e_" alt="奉化市实验中学" style="width:180px;height:126px;"></a>
                                    <p>奉化市实验中学</p>
                                </li>

                                                        <li style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.php?scid=39203" target="_blank"><img src="../images/cba98ccab0bbd8e4c32daaf3dbed1105_" alt="北仑松花江中学" style="width:180px;height:126px;"></a>
                                    <p>北仑松花江中学</p>
                                </li>
                                                        <li style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=36750" target="_blank"><img src="../images/1971b9a0c5aceac309cfab80ce5c87d2_" alt="余杭区径山镇初级中学" style="width:180px;height:126px;"></a>
                                    <p>余杭区径山镇初级中学</p>
                                </li>
                                                        <li style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=36834" target="_blank"><img src="../images/36af612ee5ecc63cc0b86fc0a9ccc889_" alt="深圳市龙岗区平冈中学" style="width:180px;height:126px;"></a>
                                    <p>深圳市龙岗区平冈中学</p>
                                </li>
                                                        <li style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=37048" target="_blank"><img src="../images/b156b1d1c153bf0e2befcc024f5308c6_" alt="绍兴市柯桥区实验中学" style="width:180px;height:126px;"></a>
                                    <p>绍兴市柯桥区实验中学</p>
                                </li>
                                                        <li style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=37532" target="_blank"><img src="../images/ceca4078a4e29c819c7b69225d1a741b_" alt="瓯海区仙岩第一中学" style="width:180px;height:126px;"></a>
                                    <p>瓯海区仙岩第一中学</p>
                                </li>
                                                        <li style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=37104" target="_blank"><img src="../images/9159ad82723ef610b65b1b1aa431a2c4_" alt="诸暨市圆梦教育" style="width:180px;height:126px;"></a>
                                    <p>诸暨市圆梦教育</p>
                                </li>
                                                        <li style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=38289" target="_blank"><img src="../images/d334b2afc0acec6df252a36633550764_" alt="温州市第十四中学（十一中）" style="width:180px;height:126px;"></a>
                                    <p>温州市第十四中学（十一中）</p>
                                </li>
                                                        <li style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=2495" target="_blank"><img src="../images/59a75c5c3b1e0b6a2e0acb428b36a190_" alt="南山区第二外国语学校" style="width:180px;height:126px;"></a>
                                    <p>南山区第二外国语学校</p>
                                </li>
                                                        <li style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=37593" target="_blank"><img src="../images/488160b6d4572766488201b3739b006e_" alt="奉化市实验中学" style="width:180px;height:126px;"></a>
                                    <p>奉化市实验中学</p>
                                </li>
                                                <li class="clone" style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.php?scid=39203" target="_blank"><img src="../images/cba98ccab0bbd8e4c32daaf3dbed1105_" alt="北仑松花江中学" style="width:180px;height:126px;"></a>
                                    <p>北仑松花江中学</p>
                                </li><li class="clone" style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=36750" target="_blank"><img src="../images/1971b9a0c5aceac309cfab80ce5c87d2_" alt="余杭区径山镇初级中学" style="width:180px;height:126px;"></a>
                                    <p>余杭区径山镇初级中学</p>
                                </li><li class="clone" style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=36834" target="_blank"><img src="../images/36af612ee5ecc63cc0b86fc0a9ccc889_" alt="深圳市龙岗区平冈中学" style="width:180px;height:126px;"></a>
                                    <p>深圳市龙岗区平冈中学</p>
                                </li><li class="clone" style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=37048" target="_blank"><img src="../images/b156b1d1c153bf0e2befcc024f5308c6_" alt="绍兴市柯桥区实验中学" style="width:180px;height:126px;"></a>
                                    <p>绍兴市柯桥区实验中学</p>
                                </li><li class="clone" style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=37532" target="_blank"><img src="../images/ceca4078a4e29c819c7b69225d1a741b_" alt="瓯海区仙岩第一中学" style="width:180px;height:126px;"></a>
                                    <p>瓯海区仙岩第一中学</p>
                                </li><li class="clone" style="float: left; width: 180px;">
                                    <a href="http://www.21cnjy.com/zhitongche/schoolinfo.html?scid=37104" target="_blank"><img src="../images/9159ad82723ef610b65b1b1aa431a2c4_" alt="诸暨市圆梦教育" style="width:180px;height:126px;"></a>
                                    <p>诸暨市圆梦教育</p>
                                </li></ul></div>
                    </div>
                </div>
            </div> -->


        </div>
        <!--主体部分底部数据结束-->
    </div>
    <!--主体部分结束-->
</div>




<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/extends/kefu-utf8.min.js"></script>
<!--
咨询
<style type="text/css">
    /*main css -- dongjing */
    .main-im{ position:fixed; right: 2px; top:300px; z-index: 100; width: 110px; height: 272px; }    .main-im a{ cursor: pointer;}    .main-im .qq-a { display: block; width: 106px; height: 116px; font-size: 14px; color: #0484cd; text-align: center; position: relative; }    .main-im .qq-a span { bottom: 5px; position: absolute; width: 90px; left: 10px; }    .main-im .qq-hover-c { width: 70px; height: 70px; border-radius: 35px; position: absolute; left: 18px; top: 10px; overflow: hidden; z-index: 9; }    .main-im .qq-container { z-index: 99; position: absolute; width: 109px; height: 118px; border-top-left-radius: 10px; border-top-right-radius: 10px; border-bottom: 1px solid #dddddd; background: url(http://www.21cnjy.com/side_kefu/images/qq-icon-bg.png) no-repeat center 8px; }    .main-im .img-qq {max-width: 60px; display: block; position: absolute; left: 6px; top: 3px; -moz-transition: all 0.5s; -webkit-transition: all 0.5s; -o-transition: all 0.5s; transition: all 0.5s; }    .main-im .im-qq:hover .img-qq{ max-width: 70px; left: 1px; top: 8px; position: absolute; }    .main-im .im_main {background: #F9FAFB; border: 1px solid #dddddd; border-radius: 10px; background: #F9FAFB;display:none;}    .main-im .im_main .im-tel { color: #000000; text-align: center; width: 109px; height: 80px; border-bottom: 1px solid #dddddd; }    .main-im .im_main .im-tel div{font-weight:bold;font-size: 12px;margin-top:11px;}    .main-im .im_main .im-tel .tel-num { font-family: Arial; font-weight: bold; color: #e66d15;}    .main-im .im_main .im-tel:hover { background: #fafafa; }    .main-im .im_main .weixing-container {width: 55px; height: 47px; border-right: 1px solid #dddddd; background: #f5f5f5; border-bottom-left-radius: 10px; background: url(http://www.21cnjy.com/side_kefu/images/weixing-icon.png) no-repeat center center;float:left;}    .main-im .im_main .weixing-show {width: 112px; height: 172px; background: #ffffff; border-radius: 10px; border: 1px solid #dddddd; position: absolute; left: -125px; top: -126px; }    .main-im .im_main .weixing-show .weixing-sanjiao {width:0; height: 0; border-style: solid; border-color: transparent transparent transparent #ffffff; border-width: 6px; left: 112px; top: 134px; position: absolute; z-index: 2;}    .main-im .im_main .weixing-show .weixing-sanjiao-big { width: 0; height: 0; border-style: solid; border-color: transparent transparent transparent #dddddd; border-width: 8px; left: 112px; top: 132px; position: absolute; }    .main-im .im_main .weixing-show .weixing-ma { width: 104px; height: 103px; padding-left: 5px; padding-top: 5px; }    .main-im .im_main .weixing-show .weixing-txt{position:absolute;top:110px;left:7px;width:100px;margin:0 auto; text-align:center; line-height:1.5; font-size:12px;}    .main-im .im_main .go-top { width: 50px; height: 47px; background: #f5f5f5; border-bottom-right-radius: 10px; background: url(http://www.21cnjy.com/side_kefu/images/toTop-icon.png) no-repeat center center;float:right;}    .main-im .im_main .go-top a { display: block; width: 52px; height: 47px; }    .main-im .close-im { position: absolute; right: 10px; top: -12px; z-index: 100; width: 24px; height: 24px; }    .main-im .close-im a { display: block; width: 24px; height: 24px; background: url(http://www.21cnjy.com/side_kefu/images/close_im.png) no-repeat left top; }    .main-im .close-im a:hover { text-decoration: none; }    .main-im .open-im { cursor: pointer; margin:20px 0 0 68px; width: 40px; height: 133px; background: url(http://www.21cnjy.com/side_kefu/images/open_im.png) no-repeat left top; }
</style>


<div class="main-im">
    <div id="open_im" class="open-im">&nbsp;</div>
    <div class="im_main" id="im_main">
        <div id="close_im" class="close-im"><a href="javascript:void(0);" title="点击关闭">&nbsp;</a></div>
        <a id="BizQQWPA" class="im-qq qq-a" title="在线QQ客服">
            <div class="qq-container"></div>
            <div class="qq-hover-c"><img class="img-qq" src="./Ridup组卷-在线组卷-智能组卷,中小学在线题库_files/qq1.png"></div>
            <span> QQ在线咨询</span>
        </a>
        <div class="im-tel">
            <div style="margin-top:20px;">客服咨询热线</div>
            <div class="tel-num">400-637-9991</div>
        </div>
        <div class="im-footer" style="position:relative">
            <div class="weixing-container">
                <div class="weixing-show">
                    <div class="weixing-txt">微信扫一扫<br>关注Ridup世纪教育<br>获取更多学习资料</div>
                    <img class="weixing-ma" src="./Ridup组卷-在线组卷-智能组卷,中小学在线题库_files/weixing-ma.jpg">
                    <div class="weixing-sanjiao"></div>
                    <div class="weixing-sanjiao-big"></div>
                </div>
            </div>
            <div class="go-top"><a href="javascript:;" title="返回顶部"></a> </div>
            <div style="clear:both"></div>
        </div>  </div></div> -->


<script src="<%=request.getContextPath()%>/static/js/lib/jquery.superslide.2.1.1.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/home.min.js"></script>
<script>
    $(function(){
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
            <p class="copyright">2017-2018 版权所有©Ridup <a href="https://github.com/Ridup" rel="nofollow" target="_blank">GitHub</a></p>
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
        .reg-form { z-index: 1110; left: 50%; margin-left: -180px; top: 0;}
        .reg-mask { position: fixed; left:0; top:0; bottom:0; right:0; background: #000; opacity: 0.5; filter: alpha(opacity=50); z-index: 1000; }
        .reg-form .btn-close { position: absolute; right:16px; top: 16px; display: block; text-indent: -9999px; width: 24px; height: 24px; background: url("<%=request.getContextPath()%>/images/close_24.png") no-repeat center center; }
        .reg-form .btn-close:hover { opacity: 0.8;}
    </style>
    <div class="reg-mask"></div>
    <div class="reg-form">
        <ul>
            <li>
                <a href="javascript:;" class="reg-active">登录</a>
            </li>
        </ul>
        <a class="btn-close J_CloseForm">x</a>
        <form id="J_LoginForm" class="reg-form-detail" action="<%=request.getContextPath()%>/user/loginIn.do" method="post">
            <input type="hidden" name="_csrf" value="r7FZtSK7tjkAAsfu7xmhU2vUGReAkvI9Nl2yNJh_LqjV0G34Wt_UXmhMk7arUMZiWOxxXfrLsFYBP9BV-QZH-g==">        <div class="reg-form-input">
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
                    <span class="checkbox checked f-usn" onselectstart="return false"><i class="icona-check"></i><input type="checkbox" checked="" value="1" class="f-dn" name="LoginForm[rememberMe]">自动登录</span>
                </div>
                <div class="login-pwd">
                    <a href="http://passport.21cnjy.com/site/password-find?jump_url=http://zujuan.21cnjy.com/?1=1" target="_blank">忘记密码</a>
                </div>
            </div>
            <div class="reg-btn"><button type="submit">登录</button></div>
        </form>
        <div class="login-others">
            <div class="login-others-method">其它登录方式：
                <a href="http://passport.21cnjy.com/site/show-qr-code?jump_url=http://zujuan.21cnjy.com/?1=1"><i class="icona-wxloginbtn"> </i></a>
                <a href="http://21cnjy.com/qqconnect?jump_url=http://zujuan.21cnjy.com/?1=1"><i class="icona-qqloginbtn"> </i></a>
            </div>
            <div class="login-reg">
                <a target="_blank" href="<%=request.getContextPath()%>/user/register.do">免费注册<i class="icona-right-arrow"></i></a>
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
            //var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1668216'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s95.cnzz.com/stat.php%3Fid%3D1668216%26show%3Dpic1' type='text/javascript'%3E%3C/script%3E"));
        </script>
    </div>
</div>
<script src="<%=request.getContextPath()%>/static/js/extends/yii.js"></script>
<script src="<%=request.getContextPath()%>/static/js/lib/layer.js"></script>
</body>
</html>