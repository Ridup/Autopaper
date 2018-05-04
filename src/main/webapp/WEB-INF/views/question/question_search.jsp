<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <title></title>
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
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/layer.css" id="layuicss-skinlayercss">
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
                <form class="f-cb" action="https://zujuan.21cnjy.com/question/search" id="global-search-form">
                    <input type="hidden" name="chid" value="">
                    <input type="hidden" name="xd" value="">
                    <div class="search-text" id="J_SearchMenu">
                        <span class="text-select"><em class="J_tit">试题</em><i class="icona-tri"></i></span>
                        <p class="select-items">
                            <a href="javascript:;"><input type="radio" name="" value="/question/search" class="f-dn"
                                                          checked=""><span>试题</span></a>
                            <a href="javascript:;"><input type="radio" name="" value="/paper/search" class="f-dn"><span>试卷</span></a>
                        </p>
                    </div>
                    <div class="search-inputbox">
                        <input type="text" name="content" value="" class="search-input" placeholder="请输入关键词搜索">
                    </div>
                    <div class="search-btn">
                        <button class="btn" type="submit"><i class="icona-search1"></i></button>
                    </div>
                </form>
            </div>
        </div>
        <div class="left">
            <a href="https://zujuan.21cnjy.com/"><img src="<%=request.getContextPath()%>/static/images/search-logo.png" alt="logo"></a>
        </div>
        <div class="right">
            <a href="javascript:;" class="login" onclick="OT2.Global.initLogin(); return false;">登录</a>
            <a href="https://zujuan.21cnjy.com/regist" class="register">注册</a>
        </div>
    </div>
</div>
<div class="g-content">
    <div class="breadcrumb">
        <i class="icona-dingwei"></i>当前位置：<a href="https://zujuan.21cnjy.com/">首页</a><b>&gt;</b><a
            href="https://zujuan.21cnjy.com/question/search?content=">初中数学</a>
    </div>
    <div class="search-type">






        <%--多条件搜索开始--%>
        <div class="type-items">
            <div class="type-tit">学科：</div>
            <div class="type-conbox">
                <div class="type-con expand-mode">
                    <div class="con-items">
                        <div>
                            <a class="type-active" href="javascript:void(0)">不限</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=1&amp;chid=2">小学语文</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=1&amp;chid=3">小学数学</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=1&amp;chid=4">小学英语</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=1&amp;chid=5">小学科学</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=1&amp;chid=9">小学政治思品</a>
                        </div>
                        <div>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=2&amp;chid=2">初中语文</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=2&amp;chid=3">初中数学</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=2&amp;chid=4">初中英语</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=2&amp;chid=5">初中科学</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=2&amp;chid=6">初中物理</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=2&amp;chid=7">初中化学</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=2&amp;chid=8">初中历史</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=2&amp;chid=9">初中政治思品</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=2&amp;chid=10">初中地理</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=2&amp;chid=20">初中历史与社会</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=2&amp;chid=21">初中社会思品</a>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=2&amp;chid=11">初中生物</a>
                        </div>
                        <div>
                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=3&amp;chid=2">高中语文</a>


                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=3&amp;chid=3">高中数学</a>


                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=3&amp;chid=4">高中英语</a>


                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=3&amp;chid=6">高中物理</a>


                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=3&amp;chid=7">高中化学</a>


                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=3&amp;chid=8">高中历史</a>


                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=3&amp;chid=9">高中政治思品</a>


                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=3&amp;chid=10">高中地理</a>


                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=3&amp;chid=11">高中生物</a>


                            <a class="" href="https://zujuan.21cnjy.com/question/search?content=&amp;xd=3&amp;chid=14">高中信息技术</a>


                        </div>
                    </div>
                    <span class="show-more">更多<i></i></span></div>
            </div>
        </div>
























<%--多条件搜索结束--%>


    </div>
    <div class="all-search f-cb">
        <div class="relevant-search">
            相关试题共<strong>1928408</strong>道
        </div>
    </div>
    <div class="search-list">
        <ul id="J_QuestionList">
            <%--            列表开始*******************************************************************************************************************************  --%>

            <li data-qid="4311466">
                <div class="search-exam">
                    <div class="exam-head">
                        <p class="exam-head-left">
                            <span>题型：单选题</span><i class="line"></i>
                            <span>题类：真题</span><i class="line"></i>
                            <span>难易度：普通</span>
                        </p>
                        <p class="exam-head-right">
                            <span>试题来源：<a href="https://zujuan.21cnjy.com/paper/view/227448" target="_blank">2017年贵州省安顺市中考化学试卷    </a></span>
                        </p>
                    </div>
                    <div class="exam-con">

                        <div class="exam-q">
                            5. （2017•安顺）在溶液中能大量共存且呈无色的离子组是（&nbsp;&nbsp; ）
                        </div>

                        <div class="exam-s">

                            <span class="op-item"
                                  style="width: 289px; margin-right: 0px; height: 32px; clear: none;"><span
                                    class="op-item-nut" style="margin-top: 4px;">A . </span><span class="op-item-meat"
                                                                                                  style="margin-top: 0px;">Na<sup>+</sup>、Fe<sup>3+</sup>、NO<sub>3</sub><sup>﹣</sup>、Cl<sup>﹣</sup></span></span>

                            <span class="op-item"
                                  style="width: 289px; margin-right: 0px; height: 32px; clear: none;"><span
                                    class="op-item-nut" style="margin-top: 4px;">B . </span><span class="op-item-meat"
                                                                                                  style="margin-top: 0px;">Ba<sup>2+</sup>、NH<sub>4</sub><sup>+</sup>、SO<sub>4</sub><sup>2</sup><sup>﹣</sup>、OH<sup>﹣</sup></span></span>

                            <span class="op-item"
                                  style="width: 289px; margin-right: 0px; height: 32px; clear: none;"><span
                                    class="op-item-nut" style="margin-top: 4px;">C . </span><span class="op-item-meat"
                                                                                                  style="margin-top: 0px;">Ag<sup>+</sup>、H<sup>+</sup>、Cl<sup>﹣</sup>、NO<sub>3</sub><sup>﹣</sup></span></span>

                            <span class="op-item"
                                  style="width: 289px; margin-right: 0px; height: 32px; clear: none;"><span
                                    class="op-item-nut" style="margin-top: 4px;">D . </span><span class="op-item-meat"
                                                                                                  style="margin-top: 0px;">H<sup>+</sup>、Na<sup>+</sup>、NO<sub>3</sub><sup>﹣</sup>、SO<sub>4</sub><sup>2</sup><sup>﹣</sup></span></span>

                        </div>


                    </div>
                    <div class="exam-foot">
                        <p class="exam-foot-left">
                            <a target="_blank" href="https://zujuan.21cnjy.com/question/detail/4311466"><i
                                    class="icona-jiexi"></i>查看解析</a>
                            <a href="javascript:;" onclick="OT2.QCollect(this, 4311466 )"><i class="icona-shoucang"></i>收藏</a>
                            <a href="javascript:;" onclick="new OT2.ErrorReport( 4311466 )"><i class="icona-jiucuo"></i>纠错</a>
                        </p>
                        <p class="exam-foot-right">

                            <span>组卷次数：73次</span>

                            <a class="addbtn J_AddQuestion" href="javascript:;"><b>+</b>选题</a>

                        </p>
                        <div class="choice-tips" style="display: none;"><i class="icona-triangle"></i>选题功能需确定学科，请确定学科后再选题组卷。
                        </div>
                    </div>
                </div>
            </li>
















<%--            列表结束*******************************************************************************************************************************  --%>

        </ul>
    </div>
    <div class="page">

        <div class="pagenum">

            <a data-page="1" href="javascript:;" class="current">1</a>
            <a data-page="2" href="https://zujuan.21cnjy.com/question/search?content=&amp;page=2&amp;per-page=10">2</a>
            <a data-page="3" href="https://zujuan.21cnjy.com/question/search?content=&amp;page=3&amp;per-page=10">3</a>
            <a data-page="4" href="https://zujuan.21cnjy.com/question/search?content=&amp;page=4&amp;per-page=10">4</a>
            <a data-page="5" href="https://zujuan.21cnjy.com/question/search?content=&amp;page=5&amp;per-page=10">5</a>

            <a data-page="2"
               href="https://zujuan.21cnjy.com/question/search?content=&amp;page=2&amp;per-page=10">下一页</a>

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
        </div>
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