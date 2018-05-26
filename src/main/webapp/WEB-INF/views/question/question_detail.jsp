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
    <title>试题详情</title>
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
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/ui-dialog.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/artDialog-skin-ot2.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/main.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/popup.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/test-preview.min.css">


    <%--<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/global.css">--%>
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
    <style>html, * {
        -webkit-user-select: text !important;
        -moz-user-select: text !important;
    }</style>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/layer.css" id="layuicss-skinlayercss">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/layui/css/layui.css" id="layuicss-skinlayercss">

    <script src="<%=request.getContextPath()%>/static/js/lib/layer.js"></script>
    <script src="<%=request.getContextPath()%>/static/layui/layui.js"></script>
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
            .jieda {
                margin-bottom: 30px;
            }
            .jieda li:last-child {
                border-bottom: none;
            }
            .fly-edit {
                position: relative;
                display: block;
                top: 1px;
                left: 0;
                padding: 0 10px;
                border: 1px solid #e6e6e6;
                border-radius: 2px 2px 0 0;
                background-color: #FBFBFB;
            }
            .detail-about-reply {
                padding: 0 0 0 55px;
                background: none;
            }
            .detail-about {
                position: relative;
                line-height: 20px;
                padding: 15px 15px 15px 75px;
                font-size: 13px;
                background-color: #f8f8f8;
                color: #999;
            }
            .detail-about-reply .fly-avatar {
                left: 0;
                top: 11px;
            }

            .fly-avatar {
                position: absolute;
                left: 15px;
                top: 15px;
            }
            .fly-avatar img {
                display: block;
                width: 45px;
                height: 45px;
                margin: 0;
                border-radius: 2px;
            }
            .fly-detail-user {
                white-space: nowrap;
                overflow: hidden;
            }
            .fly-detail-user a {
                padding-right: 10px;
                font-size: 14px;
            }

            .fly-link {
                color: #01AAED;
            }
            .detail-about-reply .detail-hits {
                left: 0;
                bottom: 0;
            }
            .detail-about .detail-hits {
                position: relative;
                top: 5px;
                line-height: 20px;
            }
            .detail-hits span {
                height: 20px;
                line-height: 20px;
            }

            .detail-about .detail-hits {
                position: relative;
                top: 5px;
                line-height: 20px;
            }
            .jieda-body {
                margin: 25px 0 20px;
                min-height: 0;
                line-height: 24px;
                font-size: 14px;
            }

            .detail-body {
                margin: 20px 0 0;
                min-height: 15px;
                line-height: 26px;
                font-size: 16px;
                color: #333;
                word-wrap: break-word;
            }
            .jieda-body p {
                margin-bottom: 10px;
            }

            .detail-body p {
                margin-bottom: 15px;
            }
                .fly-edit span {
                    padding: 0 6px;
                }

                .fly-edit span {
                    cursor: pointer;
                    padding: 0 10px;
                    line-height: 38px;
                    color: #009E94;
                }
                .fly-edit span i {
                    position: relative;
                    padding-right: 6px;
                    font-size: 18px;
                }

                .iconfont {
                    font-family: "layui-icon-fly" !important;
                    font-size: 16px;
                    font-style: normal;
                    -webkit-font-smoothing: antialiased;
                    -webkit-text-stroke-width: 0.2px;
                    -moz-osx-font-smoothing: grayscale;
                }
                i {
                    font-style: normal;
                }
                user agent stylesheet
                i, cite, em, var, address, dfn {
                    font-style: italic;
                }
                .fly-edit span {
                    cursor: pointer;
                    padding: 0 10px;
                    line-height: 38px;
                    color: #009E94;
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
<script>
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
    });
</script>

<input type="hidden" value="${ucenter_position}" id="ucenter_position"/>
<!--顶部导航结束（公用）-->
<div class="breadcrumb g-container">
    <i class="icona-dingwei"></i>当前位置：
    <a href="/">首页</a></div>
<%--中部内容开始--%>


<div class="preview-con g-container">
    <div class=" f-fl f-w">

        <%--        试卷内容左--%>
        <div class="dj-preview">



            <div class="preview-body" id="J_PaperBody">


                    <div class="search-exam">
                        <div class="exam-head">
                            <p class="exam-head-left">
                                <span>题型：${question.questionType1}</span><i class="line"></i>
                                <span>题类：${question.questionClass1}</span><i class="line"></i>
                                <span>难易度：${question.questionDifficulty1}</span><%--TODO 难易度评分星星--%>
                            </p>
                            <p class="exam-head-right">



                                <c:if test="${question.source!=null&&question.source!=''}">
                                    <span>试题来源：<a href="javascript:void(0)" target="_blank">${question.source}</a></span>
                                </c:if>



                            </p>
                        </div>
                        <div class="exam-con">
                            <div class="exam-q">
                                1. ${question.questionContent}
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

                            <div class="exam-q">
                                <em style="color: #2bbb61">【试题答案】：</em>${question.answer}
                            </div>
                            <div class="exam-q">
                                <em style="color: #2bbb61">【试题解析】：</em>${question.analysis}
                            </div>


                        </div>
                        <div class="exam-foot">
                            <p class="exam-foot-left">
                                <c:choose>
                                    <c:when test="${question.questionFav!=null}">
                                        <a href="javascript:;" onclick="questionFav(this, ${question.questionId} )"><i class="icona-quxiaosc"></i>取消收藏</a>
                                    </c:when>
                                    <c:otherwise><a href="javascript:;" onclick="questionFav(this, ${question.questionId} )"><i class="icona-shoucang"></i>收藏</a></c:otherwise>
                                </c:choose>

<%--
                                <a href="javascript:;" onclick="questionErrorReport( ${question.questionId} )"><i class="icona-jiucuo"></i>纠错</a>
--%>
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
                </div>












            <%--评论-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------%>

            <div class="fly-panel detail-box" id="flyReply">
                <fieldset class="layui-elem-field layui-field-title" style="text-align: center;">
                    <legend>评论</legend>
                </fieldset>

                <ul class="jieda" id="jieda">

                    <c:forEach items="${comments}" var="comment" varStatus="vs">
                        <li data-id="${comment.questionCommentId}" class="jieda-daan">
                            <a name="item-1111111111"></a>
                            <div class="detail-about detail-about-reply">
                                <a class="fly-avatar" href="">
                                    <c:if test="${comment.userIcon!=null}">

                                    </c:if>
                                    <c:choose>
                                        <c:when test="${comment.userIcon!=null}">
                                            <img src="${comment.userIcon}" alt="${comment.userName}">
                                        </c:when>
                                        <c:otherwise>
                                            <img src="<%=request.getContextPath()%>/static/images/10.png" alt="该用户未设置头像">
                                        </c:otherwise>
                                    </c:choose>

                                </a>
                                <div class="fly-detail-user">
                                    <a href="" class="fly-link">
                                        <cite>${comment.userName}</cite>
                                        <i class="layui-badge fly-badge-vip">${comment.getUserTypeStr}</i>
                                    </a>
                                    <c:if test="${vs.first}">
                                        <span>(沙发)</span>
                                    </c:if>

                                </div>
                                <div class="detail-hits">
                                    <span>${comment.questionCommentTimeStr}</span>
                                </div>

                                <i class="iconfont icon-caina" title="最佳答案"></i>
                            </div>
                            <div class="detail-body jieda-body photos">
                                <p>${comment.questionComment}</p>
                            </div>
                        </li>
                    </c:forEach>


                </ul>


                <div class="layui-form layui-form-pane">
                    <form class="layui-form" action="<%=request.getContextPath()%>/question_comment/submit.do" method="post">
                        <div class="layui-form-item layui-form-text">
                            <a name="comment"></a>
                            <div class="layui-input-block">
                                <div class="layui-unselect fly-edit">
                                    <span type="face" title="插入表情"><i
                                            class="iconfont icon-yxj-expression" style="top: 1px;"></i></span><span
                                        type="picture" title="插入图片：img[src]"><i class="iconfont icon-tupian"></i></span><span
                                        type="href" title="超链接格式：a(href)[text]"><i
                                        class="iconfont icon-lianjie"></i></span><span type="code" title="插入代码或引用"><i
                                        class="iconfont icon-emwdaima" style="top: 1px;"></i></span><span type="hr"
                                                                                                          title="插入水平线"></span><span
                                        type="yulan" title="预览"><i class="iconfont icon-yulan1"></i></span>
                                </div>
                                <textarea id="L_content" name="content" required="" lay-verify="required"
                                          placeholder="请输入内容" class="layui-textarea fly-editor"
                                          style="height: 150px;"></textarea>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <input type="hidden" name="questionId" value="${question.questionId}">
                            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                        </div>
                    </form>
                </div>
            </div>

<%--评论-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------%>


            </div>











        </div>


        <div class="dj-about" style="position: fixed; margin-left: 950px; z-index: 9; top: 110px;">
            <%--<div class="view-toolbars f-cb">
                <a href="javascript:;" onclick="paper_download(${paperPojo.paperId})" class="download-btn"><i class="icona-download1"></i>下载试卷</a>
                &lt;%&ndash;<a target="_blank" style="display:none" data-method="post"
                   href="/paper/admin-edit?pid=849277&amp;xd=1&amp;chid=3"><i class="icona-bianji"></i>编辑</a>
                <a href="javascript:;" onclick="paper.setAnswerSheet(849277)"><i class="icona-dtk2"></i>答题卡下载</a>&ndash;%&gt;
                <a href="<%=request.getContextPath()%>/paper/test.do?paperId=${paperPojo.paperId}"><i class="icona-ceshi"></i>在线测试</a>
                <span id="paper_fav" style="float: right">
            <c:choose>
                <c:when test="${isPaperFav}">
                    <a href="javascript:;" onclick="cancel_collect(${user.userId},${paperPojo.paperId},this)"><i class="icona-quxiaosc"></i><span>
                    取消收藏</span></a>
                </c:when>
                <c:otherwise><a href="javascript:;" onclick="collect(${user.userId},${paperPojo.paperId},this)"><i class="icona-shoucang"></i><span>
                    收藏试卷</span></a></c:otherwise>
            </c:choose>
            </span>
            </div>--%>
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


                    $('.spread').click(function () {
                        if ($(".dj-detail ul").css('display') == 'none') {
                            $(this).html("收起∨");
                            $(".dj-detail ul").slideDown(300);
                        } else {
                            $(this).html("展开∧");
                            $(".dj-detail ul").slideUp(300);
                        }
                    });
                });


                function paper_download(paperId){
                    var iframeUrl = server_context+"/paper/download_paper_doc.do?paperId="+paperId;
                    var ss = "<a href='"+iframeUrl+"' target='_blank'>Doc</a>";
                    var a = $(""+ss).get(0);
                    var e = document.createEvent('MouseEvents');
                    e.initEvent( 'click', true, true );
                    a.dispatchEvent(e);

                }



                //试题篮动态出入
                function visibleBugget(){
                    if($("#J_Basket").hasClass("active")){
                        $("#J_Basket").removeClass("active");
                    }else{
                        $("#J_Basket").addClass("active");
                    }
                }

                function questionFav(obj,questionId){
                    //ajax，返回结果进行提示，注册事件
                    layer.load();
                    console.log("obj===="+obj);
                    var favChange = obj.firstChild;
                    console.log("questionId===="+questionId);
                    $.ajax({
                        url: server_context + '/questionfav/fav.do',
                        type: 'POST', //GET
                        async: true,    //或false,是否异步
                        data: {
                            questionId: questionId
                        },
                        timeout: 5000,    //超时时间
                        dataType: 'json',    //返回的数据格式：json/xml/html/script/jsonp/text
                        success: function (data, textStatus, jqXHR) {
                            var jsonResult = data;
                            var das = jsonResult.code;
                            layer.closeAll('loading');
                            if("X01"==jsonResult.code){
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
                                layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                            }

                        },
                        error: function (xhr, textStatus) {
                            layer.closeAll('loading');
                            layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                        }
                    });

                }

                function questionAdd(obj,questionId,questionType) {
                    layer.load();
                    //ajax，返回结果进行提示，注册事件
                    console.log("obj===="+obj);
                    console.log("questionId===="+questionId);
                    var span_parent = obj.parentElement;

                    $.ajax({
                        url: server_context + '/question_basket/add.do',
                        type: 'POST', //GET
                        async: false,    //或false,是否异步
                        data: {
                            questionId: questionId,questionType:questionType
                        },
                        timeout: 5000,    //超时时间
                        dataType: 'json',    //返回的数据格式：json/xml/html/script/jsonp/text
                        success: function (data, textStatus, jqXHR) {
                            var jsonResult = data;
                            var das = jsonResult.code;
                            layer.closeAll('loading');
                            if("X01"==jsonResult.code){
                                $(span_parent).html("<a class=\"J_AddQuestion removebtn\" href=\"javascript:;\" onclick=\"questionDelete(this, "+questionId+","+questionType+")\"><b>-</b>移除</a>");
                                //试题篮变化
                                var questionBasketTypeCountPojos = jsonResult.result.questionBasketTypeCountPojos;
                                var questionBasketTotal = jsonResult.result.questionBasketTotal;
                                $(".basket-head").html("共计：（<span>"+questionBasketTotal+"</span>）道题");
                                $(".baskrt-list").html("");
                                $.each(questionBasketTypeCountPojos,function(index,item){
                                    var questionType =item.questionType;
                                    var questionTypeName = item.questionTypeName;
                                    var questionCount =item.questionCount;
                                    console.log("========"+questionType+questionTypeName+questionCount);
                                    $(".baskrt-list").append("<p title=\""+item.questionTypeName+"\">"+item.questionTypeName+"：<span>"+item.questionCount+"</span>道<i class=\"icona-del1 f-fr\" onclick=\"basket.removeAll('"+item.questionType+"', 7163341)\"></i></p>");
                                });


                            }
                            else if("X03"==jsonResult.code){
                                window.localObj.href = server_context+ "/index.do?tips=e01";
                            }
                            else{
                                layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                            }

                        },
                        error: function (xhr, textStatus) {
                            layer.closeAll('loading');
                            layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                        }
                    });
                }

                function questionDelete(obj,questionId,questionType) {
                    layer.load();
                    //ajax，返回结果进行提示，注册事件
                    console.log("obj===="+obj);
                    console.log("questionId===="+questionId);
                    var span_parent = obj.parentElement;
                    $.ajax({
                        url: server_context + '/question_basket/delete.do',
                        type: 'POST', //GET
                        async: false,    //或false,是否异步
                        data: {
                            questionId: questionId,questionType:questionType
                        },
                        timeout: 5000,    //超时时间
                        dataType: 'json',    //返回的数据格式：json/xml/html/script/jsonp/text
                        success: function (data, textStatus, jqXHR) {
                            var jsonResult = data;
                            var das = jsonResult.code;
                            layer.closeAll('loading');
                            if("X01"==jsonResult.code){
                                $(span_parent).html(" <a class=\"addbtn J_AddQuestion\" href=\"javascript:;\" onclick=\"questionAdd(this, "+questionId+","+questionType+")\"><b>+</b>选题</a>");

                                //试题篮变化
                                var questionBasketTypeCountPojos = jsonResult.result.questionBasketTypeCountPojos;
                                var questionBasketTotal = jsonResult.result.questionBasketTotal;
                                if(null!=questionBasketTotal&&0!=questionBasketTotal){
                                    $(".basket-head").html("共计：（<span>"+questionBasketTotal+"</span>）道题");
                                    if(null!=questionBasketTypeCountPojos&&""!=questionBasketTypeCountPojos){
                                        $(".baskrt-list").html("");
                                        $.each(questionBasketTypeCountPojos,function(index,item){
                                            var questionType =item.questionType;
                                            var questionTypeName = item.questionTypeName;
                                            var questionCount =item.questionCount;
                                            console.log("========"+questionType+questionTypeName+questionCount);
                                            $(".baskrt-list").append("<p title=\""+item.questionTypeName+"\">"+item.questionTypeName+"：<span>"+item.questionCount+"</span>道<i class=\"icona-del1 f-fr\" onclick=\"basket.removeAll('"+item.questionType+"', 7163341)\"></i></p>");
                                        });
                                    }else{
                                        $(".basket-head").html("共计：（<span>0</span>）道题");
                                        $(".baskrt-list").html("");
                                    }
                                }else{
                                    $(".basket-head").html("共计：（<span>0</span>）道题");
                                    $(".baskrt-list").html("");
                                }



                            }
                            else if("X03"==jsonResult.code){
                                window.localObj.href = server_context+ "/index.do?tips=e01";
                            }
                            else{
                                layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                            }

                        },
                        error: function (xhr, textStatus) {
                            layer.closeAll('loading');
                            layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                        }
                    });
                }


                //手动生成试卷
                function edit_paper() {
                    //询问框
                    var questions= $(".baskrt-list").html();
                    if(questions!=null&&questions!=""){
                        layer.confirm('确认手动生成试卷吗？', {
                            btn: ['确认生成','取消'] //按钮
                        }, function(){
                            window.location.href = "<%=request.getContextPath()%>/paper/edit.do";
                        }, function(){
                        });
                    }else{
                        contentTips = "试题篮为空，请重新添加试题！";
                        layer.alert("<span style='margin-left: 70px;text-align: center;color:#e65439'>" + contentTips + "</span>");
                    }

                }





                //试卷收藏
                function cancel_collect(userId,paperId,obj){
                    layer.load();
                    if(0!=userId&&""!=userId&&null!=userId){
                        $.ajax({
                            url: server_context + '/paperfav/cancel_fav.do',
                            type: 'POST', //GET
                            async: true,    //或false,是否异步
                            data: {
                                userId: userId,paperId:paperId
                            },
                            timeout: 5000,    //超时时间
                            dataType: 'json',    //返回的数据格式：json/xml/html/script/jsonp/text
                            success: function (data, textStatus, jqXHR) {
                                var jsonResult = data;
                                var das = jsonResult.code;
                                layer.closeAll('loading');
                                console.log("codecodecodecode+++++++++++"+das);
                                if("X01"==jsonResult.code){
                                    $("#paper_fav").html("<a href=\"javascript:;\" onclick=\"collect("+userId+","+paperId+",this)\"><i class=\"icona-shoucang\"></i><span>\n" +
                                        "                    收藏试卷</span></a>");
                                }
                                else if("X03"==jsonResult.code){
                                    window.localObj.href = server_context+ "/index.do?tips=e01";
                                }
                                else{
                                    layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                                }

                            },
                            error: function (xhr, textStatus) {
                                layer.closeAll('loading');
                                layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                            }
                        });
                    }else{
                        window.localObj.href = server_context+ "/index.do?tips=e01";
                    }
                }


                function collect(userId,paperId,obj){
                    layer.load();
                    if(0!=userId&&""!=userId&&null!=userId){
                        $.ajax({
                            url: server_context + '/paperfav/fav.do',
                            type: 'POST', //GET
                            async: true,    //或false,是否异步
                            data: {
                                userId: userId,paperId:paperId
                            },
                            timeout: 5000,    //超时时间
                            dataType: 'json',    //返回的数据格式：json/xml/html/script/jsonp/text
                            success: function (data, textStatus, jqXHR) {
                                var jsonResult = data;
                                var das = jsonResult.code;
                                console.log("codecodecodecode+++++++++++"+das);
                                layer.closeAll('loading');
                                if("X01"==jsonResult.code){
                                    $("#paper_fav").html("<a href=\"javascript:;\" onclick=\"cancel_collect("+userId+","+paperId+",this)\"><i class=\"icona-quxiaosc\"></i><span>\n" +
                                        "                    取消收藏</span></a>");
                                }
                                else if("X03"==jsonResult.code){
                                    window.localObj.href = server_context+ "/index.do?tips=e01";
                                }
                                else{
                                    layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                                }

                            },
                            error: function (xhr, textStatus) {
                                layer.closeAll('loading');
                                layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                            }
                        });
                    }else{
                        window.localObj.href = server_context+ "/index.do?tips=e01";
                    }
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








<%--试题篮开始--%>
<c:if test="${isLogin}">
    <div class="basket " id="J_Basket">
        <div class="basket-tit" onclick="visibleBugget();">
            <p><i class="icona-gouwulan"></i><em>试题篮</em></p>
            <span><i class="icona-gouwuleft"></i></span>
        </div>
        <div class="basket-con">
            <div class="basket-count"><div class="basket-head">
                <c:choose>
                    <c:when test="${questionBasketTotal!=null&&questionBasketTotal!=0}">
                        共计：（<span>${questionBasketTotal}</span>）道题
                    </c:when>
                    <c:otherwise>共计：（<span>0</span>）道题</c:otherwise>
                </c:choose>
            </div>
                <div class="baskrt-list" style="line-height: 12px">
                    <c:choose><c:when test="${questionBasketTotal!=null&&questionBasketTotal!=0}"><c:forEach items="${questionBasketTypeCountPojos}" var="typeCount"><p title="${typeCount.questionTypeName}">${typeCount.questionTypeName}：<span>${typeCount.questionCount}</span>道<i class="icona-del1 f-fr" onclick="basket.removeAll('${typeCount.questionType}', 7163341)"></i></p></c:forEach></c:when><c:otherwise></c:otherwise></c:choose></div>
            </div>
            <div class="basket-foot">
                <a id="to-paper-admin-edit" data-method="post" class="basket-btn" href="/paper/admin-edit" style="display: none">编辑</a>
                <a id="to-paper-edit" data-method="post" class="basket-btn" href="javascript:void(0);" onclick="edit_paper();" style="">生成试卷</a>
                <a id="to-paper-admin-cancel" class="basket-btn" shref="/question" style="display: none">取消</a>
            </div>
        </div>
    </div>
</c:if>
<%--试题篮结束--%>




<script src="<%=request.getContextPath()%>/static/js/extends/global.min.js"></script>
<a class="return" href="javascript:;" style="right: 9px; display: none;"><i class="icona-top"></i></a>




<script src="<%=request.getContextPath()%>/static/js/lib/jquery.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/yii.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/yii.activeForm.js"></script>

<script type="text/javascript">

    //Demo
    layui.use('form', function(){
        var form = layui.form;

        //监听提交
        form.on('submit(formDemo)', function(data1){

/*            layer.msg(JSON.stringify(data1.field));
            console.log(data1.field.content);*/
            layer.load();
            $.ajax({
                url: server_context + '/question_comment/submit.do',
                type: 'POST', //GET
                async: false,    //或false,是否异步
                data: {
                    questionId: data1.field.questionId,content:data1.field.content
                },
                timeout: 5000,    //超时时间
                dataType: 'text',    //返回的数据格式：json/xml/html/script/jsonp/text
                success: function (data, textStatus, jqXHR) {
                    if(data=="success"){
                        var a= "<li data-id=\"\" class=\"jieda-daan\">\n" +
                            "                            <a name=\"item-1111111111\"></a>\n" +
                            "                            <div class=\"detail-about detail-about-reply\">\n" +
                            "                                <a class=\"fly-avatar\" href=\"\">\n" +
                            "                                    <img src=\"${user.userIcon}\" alt=\"${user.userName}\">\n" +
                            "                                        \n" +
                            "\n" +
                            "                                </a>\n" +
                            "                                <div class=\"fly-detail-user\">\n" +
                            "                                    <a href=\"\" class=\"fly-link\">\n" +
                            "                                        <cite>${user.userName}</cite>\n" +
                            "                                        <i class=\"layui-badge fly-badge-vip\">我</i>\n" +
                            "                                    </a>\n" +
                            "                                    \n" +
                            "\n" +
                            "                                </div>\n" +
                            "                                <div class=\"detail-hits\">\n" +
                            "                                    <span>刚刚</span>\n" +
                            "                                </div>\n" +
                            "\n" +
                            "                                <i class=\"iconfont icon-caina\" title=\"最佳答案\"></i>\n" +
                            "                            </div>\n" +
                            "                            <div class=\"detail-body jieda-body photos\">\n" +
                            "                                <p>"+data1.field.content+"</p>\n" +
                            "                            </div>\n" +
                            "                        </li>";
                            $("#jieda").append(a);
                        layer.closeAll('loading');
                    }else {
                        layer.closeAll('loading');
                        layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                    }
                },
                error: function (xhr, textStatus) {
                    layer.closeAll('loading');
                    layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                }
            });

        });
    });




</script>

</body>
</html>