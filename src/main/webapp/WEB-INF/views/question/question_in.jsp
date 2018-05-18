<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <meta name="csrf-token" content="CuLu_5_b5pKzlDz2vF0s8oF0235xNpoeksCnr1yLttF6kZu71aqP2ur7bb3oDnq4yRajGAJwxUHc8sTBZO3Ygg==">
    <title>试题录入</title>
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
        USER = {"uid":8955808,"username":"21jy_094440934","email":"","mobile":18214997310,"regip":"115.236.91.18","regdate":1521439694,"regsource":1,"lastloginip":2147483647,"lastlogintime":1521699020,"auth_key":"cTk4F8DBknO8uFrExMwujryVJ5CSs_QA","avatar":{"small_avatar":"http:\/\/uc.21cnjy.com\/avatar.php?uid=8955808&size=small","big_avatar":"http:\/\/uc.21cnjy.com\/avatar.php?uid=8955808&size=big"},"realname":"21jy_094440934","gender":null,"identity":null,"xd":null,"chid":null,"district":null,"school":null,"school_permit_id":null,"parent":"","signature":null,"memberProfile":null,"school_inf":null,"baseSchool":null,"tokenA":null,"tikuAdmin":false,"testLimit":null,"basketLimit":30,"isVip":false} ;
        OT2.CSRF = {"_csrf": "CuLu_5_b5pKzlDz2vF0s8oF0235xNpoeksCnr1yLttF6kZu71aqP2ur7bb3oDnq4yRajGAJwxUHc8sTBZO3Ygg=="} ;
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
    <style>html, * {-webkit-user-select:text!important; -moz-user-select:text!important;}</style>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/layer.css" id="layuicss-skinlayercss">
    <%--layui--%>
    <script src="<%=request.getContextPath()%>/static/layui/layui.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/layui/css/layui.css">

    <script type="text/javascript">
        $(function () {
            function Init(node) {
                return node.html("<option>---请选择---</option>");
            }
            var db = ${coursesJson};
            console.log(db);
            //初始化select节点
            $.each(db, function (changShang) {
                $("#gradeName").append("<option value='"+changShang+"'>" + changShang + "</option>");
            })
            //一级变动
            $("#gradeName").change(function () {
                //清空二三级
                Init($("#courseName"));
                Init($("#versionName"));
                $.each(db,function (cs,pps) {
                    if ($("#gradeName option:selected").text() == cs) {
                        $.each(pps, function (pp, xhs) {
                            $("#courseName").append("<option value='"+pp+"'>"  + pp + "</option>");
                        });
                        $("#courseName").change(function () {
                            Init($("#versionName"));
                            $.each(pps, function (pp,xhs) {
                                if ($("#courseName option:selected").text()==pp) {
                                    $.each(xhs, function () {
                                        $("#versionName").append("<option value='"+this+"'>"  + this + "</option>");
                                    })
                                }
                            })
                        })
                    }
                })
            })

        })
    </script>

    <style>
        #qdstar  li {
            margin-right: 0px;
        }
    </style>

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
                <a href="<%=request.getContextPath()%>/ucenter/" target="_blank">${loginUser.nickName}<i class="icona-tri ml"></i></a>
                <div class="drop-bd" style="display: none;">
                    <ul>
                        <li><a href="<%=request.getContextPath()%>/ucenter/download_record.do" target="_blank">下载记录</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/generate_record.do" target="_blank">组卷记录</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/test_record.do" target="_blank">测试记录</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/error_record.do" target="_blank">纠错记录</a></li>
                        <c:if test="${loginUser.userType=='1'}"><li><a href="<%=request.getContextPath()%>/ucenter/question_in_record.do" target="_blank">试题录入记录</a></li></c:if>
                        <li><a href="<%=request.getContextPath()%>/ucenter/error_question.do" target="_blank">错题本</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/u_question.do" target="_blank">我的收藏</a></li>
                        <li><a href="<%=request.getContextPath()%>/ucenter/index.do" target="_blank">个人信息</a></li>
                        <li class="split-line"></li>
                        <li><a data-method="post" href="<%=request.getContextPath()%>/user/logout.do">退出</a></li>
                    </ul>
                    <span class="icona-dia-tri"></span>
                </div>
            </div>
            <div class="user f-fr"><a href="<%=request.getContextPath()%>/ucenter/u-msg.do"><i class="icona-xinxi"></i>消息<span>(0)</span></a></div>
            <div class="header-nav">
                <a href="<%=request.getContextPath()%>" class="help"><i class="icona-home"></i>网站首页</a>
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

<script>
    //一般直接写在一个js文件中
    layui.use(['layer', 'form'], function(){
        var layer = layui.layer
            ,form = layui.form;
    });

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
                $("#questionDifficulty").val(value);
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

</script>

<input type="hidden" value="${ucenter_position}" id="ucenter_position"/>

<!--顶部导航结束（公用）-->

<%--中部内容开始--%>
<div class="g-bd1 f-cb g-container">
    <script>
        $(function(){
            var localObj = window.location;
            var server_context = localObj.protocol+"//"+localObj.host+"/"+localObj.pathname.split("/")[1];
            if("${tips}"!=null&&"${tips}"!=""){
                //第三方扩展皮肤

                layer.alert('${tips}', {
                    icon: ${insertStatus},
                    skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
                },function () {
                    window.location.replace(server_context+"/question/question_in.do");
                });

     /*           setTimeout(function () {

                },2000)*/

                /*layer.msg('Hello World');*/


            }

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

    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/main.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/base.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/ucenter.css">

    <div class="user-con">
        <%--  内容开始！！！--%>

        <script>

            var localObj = window.location;
            var server_context = localObj.protocol+"//"+localObj.host+"/"+localObj.pathname.split("/")[1];


            function questionTypeChoose(val){
                var questionType = $("#questionType").val();
                if (questionType!=null&&questionType!=""){
                    $("."+questionType).removeClass("type-active");
                }
                if(val=='101'){
                    $("#answerSelection").show();
                    $("#commonAnswer").hide();
                    $("#judgmentAnswer").hide();
                    $("#commonAnswer textarea").removeAttr("lay-verify");
                    $("#judgmentAnswer input[radio]").removeAttr("lay-verify");
                    $("#singleAnswer").show();
                    $("#answerSelection input[text]").attr("lay-verify","required");
                    $("#singleAnswer input[radio]").attr("lay-verify","required");
                }else if (val=='102'){
                    $("#judgmentAnswer").show();
                    $("#commonAnswer").hide();
                    $("#answerSelection").hide();
                    $("#singleAnswer").hide();
                    $("#commonAnswer textarea").removeAttr("lay-verify");
                    $("#singleAnswer input[radio]").removeAttr("lay-verify");
                    $("#answerSelection input[text]").removeAttr("lay-verify");
                    $("#judgmentAnswer input[radio]").attr("lay-verify","required");
                }else{
                    $("#answerSelection").hide();
                    $("#singleAnswer").hide();
                    $("#judgmentAnswer").hide();
                    $("#commonAnswer").show();
                    $("#commonAnswer textarea").attr("lay-verify","required");
                    $("#answerSelection input[text]").removeAttr("lay-verify");
                    $("#singleAnswer input[radio]").removeAttr("lay-verify");
                    $("#judgmentAnswer input[radio]").removeAttr("lay-verify");
                }
                $("."+val).addClass("type-active");
                $("#questionType").val(val);
            }

            function questionClassChoose(val){
                var questionClass = $("#questionClass").val();
                if (questionClass!=null&&questionClass!=""){
                    $("."+questionClass).removeClass("type-active");
                }
                $("."+val).addClass("type-active");
                $("#questionClass").val(val);
            }


            function  queryPoints() {

                console.log($('#gradeName').val());
                var gradeName = $('#gradeName').val();
                var courseName = $('#courseName').val();
                var versionName = $('#versionName').val();

                $("#chapterList").empty();

                //查询知识点
                $.ajax({
                    url: server_context + '/question/question_point.do',
                    type: 'POST', //GET
                    async: true,    //或false,是否异步
                    data: {
                        gradeName: gradeName, courseName: courseName, versionName: versionName
                    },
                    timeout: 5000,    //超时时间
                    dataType: 'json',    //返回的数据格式：json/xml/html/script/jsonp/text

                    success: function (data, textStatus, jqXHR) {
                        console.log("data:" + data);
                        console.log(data[0].chapter);
                        console.log(data[0].pointPojoList);
                        if (data != null) {
                            layui.use(['form', 'layer'], function () {
                                $ = layui.jquery;
                                var form = layui.form;
                                for (var i = 0; i < data.length; i++) {

                                    var points = "";
                                    for (var n = 0; n < data[i].pointPojoList.length; n++) {
                                        points = points + "<input type=\"checkbox\" class=\"point\" name=\"point\"  lay-verify=\"required\"  title=\"" + data[i].pointPojoList[n].pointName + "\" value=\"" + data[i].pointPojoList[n].courseId + "\" lay-skin=\"primary\">";
                                    }
                                    var pointHtml = "<div class=\"layui-colla-item\"><h2 class=\"layui-colla-title\">" +"<input type=\"checkbox\"  lay-verify=\"required\" class=\"chapterName\" name=\"chapterName\" value=\""+ data[i].chapter+"\" lay-skin=\"primary\">"+ data[i].chapter + "<i class=\"layui-icon layui-colla-icon\"></i></h2><div class=\"layui-colla-content layui-show\" >" + points + "</div></div>";
                                    $('#chapterList').append(pointHtml);
                                }
                                form.render();

                                //监听提交
                                /*form.on('submit(formDemo)', function(data){
                                    layer.msg(JSON.stringify(data.field));
                                    var pointList = new Array();
                                    var len = document.querySelectorAll(".point").length;
                                    for(var i = 0;i<len;i++){
                                        var v =document.querySelectorAll(".point")[i].value();
                                        pointList.push(v);
                                    }
                                    var chapterNameList = new Array();
                                    var len = document.querySelectorAll(".chapterName").length;
                                    for(var i = 0;i<len;i++){
                                        var v =document.querySelectorAll(".chapterName")[i].value();
                                        chapterNameList.push(v);
                                    }
                                    if(pointList!=null&&chapterNameList!=null){
                                        return true;
                                    }
                                    return false;
                                });*/

                            });
                        }else{
                            layer.alert("<span style='margin-left: 70px;text-align: center;'>未查到数据！</span>");
                        }
                    },




                    error: function (xhr, textStatus) {
                        layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                    }
                });

            }

        </script>

        <h1>试题录入</h1>
        <div class="ucenter_border" style="padding: 0px;">
            <form id="w0" class="layui-form layui-form-pane" action="<%=request.getContextPath()%>/question/question_insert.do" method="post" style="margin: 0px;padding: 0px;">

                <%--  <fieldset></fieldset>--%>
                <div class="search-type d-search-type g-container" style="width: 1175px">
                    <div class="type-items">
                        <div class="type-tit">题型：</div>
                        <div class="type-conbox">
                            <div class="type-con">
                                <div class="con-items">
                                    <input type="hidden" name="questionType" id="questionType" lay-verify="required">
                                    <a href="javascript:void(0)" onclick="questionTypeChoose('101');" class="101">单选题</a>
                                    <a href="javascript:void(0)" onclick="questionTypeChoose(102);" class="102">判断题</a>
                                    <a href="javascript:void(0)" onclick="questionTypeChoose(103);" class="103">填空题</a>
                                    <a href="javascript:void(0)" onclick="questionTypeChoose(104);" class="104">简答题</a>
                                    <a href="javascript:void(0)" onclick="questionTypeChoose(105);" class="105">作文</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="type-items">
                        <div class="type-tit">题类：</div>
                        <div class="type-conbox">
                            <div class="type-con">
                                <div class="con-items">
                                    <input type="hidden" name="questionClass" id="questionClass" lay-verify="required">
                                    <a href="javascript:void(0)" onclick="questionClassChoose(201);" class="201">常考题</a>
                                    <a href="javascript:void(0)" onclick="questionClassChoose(202);" class="202">模拟题</a>
                                    <a href="javascript:void(0)" onclick="questionClassChoose(203);" class="203">升学题</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <%--class="layui-inline"：定义外层行内
                class="layui-input-inline"：定义内层行内--%>

                <div class="layui-form-item" >
                    <div class="layui-inline">
                        <label class="layui-form-label">试题难度</label>
                        <div id="qdstar" class="layui-input-inline" style="display: inline-block;height: 40px;width: 200px;"></div>
                        <input id="questionDifficulty" type="hidden" name="questionDifficulty"   lay-verify="required|number" autocomplete="off" class="layui-input" value="">
                        <%--<div class="layui-input-inline" style="width: 150px">
                            <select name="questionDifficulty" lay-verify="required">
                                <option value=""></option>
                                <option value="1">难度1</option>
                                <option value="2">难度2</option>
                                <option value="3">难度3</option>
                                <option value="4">难度4</option>
                                <option value="5">难度5</option>
                            </select>
                        </div>--%>


                        <label class="layui-form-label">答题时间</label>
                        <div class="layui-input-inline" style="width: 150px">
                            <input type="text" name="questionTime"   lay-verify="required|number" placeholder="请答题时间分钟数" autocomplete="off" class="layui-input">
                        </div>
                        <label class="layui-form-label">题目分数</label>
                        <div class="layui-input-inline" style="width: 150px">
                            <input type="text" name="questionScore"   lay-verify="required|number" placeholder="请题目分数" autocomplete="off" class="layui-input">
                        </div>
                        <label class="layui-form-label">类型</label>
                        <div class="layui-input-inline" style="width: 150px">
                            <select name="type" lay-verify="required">
                                <option value=""></option>
                                <option value="0">客观题</option>
                                <option value="1">主观题</option>
                            </select>
                        </div>
                    </div>
                </div>

                <div class="layui-form-item" >
                    <div class="layui-inline">
                        <label class="layui-form-label">年级名称</label>
                        <div class="layui-input-inline" style="width: 150px">
                            <select name="gradeName" lay-verify="required" id="gradeName" lay-ignore style="width: 150px;height: 38px;">
                                <option>---请选择---</option>
                            </select>
                        </div>
                        <label class="layui-form-label">学科名称</label>
                        <div class="layui-input-inline" style="width: 150px">
                            <select name="courseName" lay-verify="required" id="courseName" lay-ignore style="width: 150px;height: 38px;">
                                <option>---请选择---</option>
                            </select>
                        </div>
                        <label class="layui-form-label">教材名称</label>
                        <div class="layui-input-inline" style="width: 150px">
                            <select name="versionName" lay-verify="required" id="versionName" lay-ignore style="width: 150px;height: 38px;">
                                <option>---请选择---</option>
                            </select>
                        </div>
                        <a href="javascript:void (0)" class="layui-btn" onclick="queryPoints()">添加知识点</a>
                    </div>
                </div>

                    <div class="layui-form-item" >
                <div class="layui-collapse" id="chapterList">

                    <%--<div class="layui-colla-item">
                        <h2 class="layui-colla-title"><input type="checkbox" name="chapterName" value="章节名称" lay-skin="primary">章节名称</h2>
                        <div class="layui-colla-content layui-show" >
                            <input type="checkbox" name="point" title="知识点名称" value="知识点id" lay-skin="primary" checked>
                            <input type="checkbox" name="point" title="知识点名称" value="知识点id" lay-skin="primary">
                        </div>
                    </div>--%>

                    <%--<div class="layui-colla-item">
                        <h2 class="layui-colla-title">章节名称</h2>
                        <div class="layui-colla-content ">
                            <input type="checkbox" name="point" title="知识点名称" value="知识点id" lay-skin="primary" checked>
                            <input type="checkbox" name="point" title="知识点名称"  value="知识点id" lay-skin="primary">
                        </div>
                    </div>

                    <div class="layui-colla-item">
                        <h2 class="layui-colla-title">章节名称</h2>
                        <div class="layui-colla-content">
                            <input type="checkbox" name="point" title="知识点名称"  value="知识点id" lay-skin="primary" checked>
                            <input type="checkbox" name="point" title="知识点名称"  value="知识点id" lay-skin="primary">
                        </div>
                    </div>--%>

                </div>
                    </div>

                <script>
                    //注意：折叠面板 依赖 element 模块，否则无法进行功能性操作
                    layui.use('element', function(){
                        var element = layui.element;

                        //…
                    });


                </script>


                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">题干</label>
                    <div class="layui-input-block">
                        <textarea name="questionContent"  lay-verify="required" placeholder="请输入题干" class="layui-textarea"></textarea>
                    </div>
                </div>
                <%-- 单选选项集合--%>
                <div id="answerSelection" style="margin-top: 10px;display: none">
                    <div class="layui-form-item">
                        <label class="layui-form-label">选项A：</label>
                        <div class="layui-input-block">
                            <input type="text" name="selectionA"   placeholder="请输入选项A" autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">选项B：</label>
                        <div class="layui-input-block">
                            <input type="text" name="selectionB"    placeholder="请输入选项B" autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">选项C：</label>
                        <div class="layui-input-block">
                            <input type="text" name="selectionC"    placeholder="请输入选项C" autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">选项D：</label>
                        <div class="layui-input-block">
                            <input type="text" name="selectionD"    placeholder="请输入选项D" autocomplete="off" class="layui-input">
                        </div>
                    </div>
                </div>


                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">试题答案</label>
                    <div class="layui-input-block" id="commonAnswer">
                        <textarea name="answer"  lay-verify="required" placeholder="请输入试题答案" class="layui-textarea"></textarea>
                    </div>
                    <div class="layui-input-block" style="display: none" id="singleAnswer">
                        <input type="radio" name="answer" value="A" title="选项A">
                        <input type="radio" name="answer" value="B" title="选项B">
                        <input type="radio" name="answer" value="C" title="选项C">
                        <input type="radio" name="answer" value="D" title="选项D">
                    </div>
                    <div class="layui-input-block" style="display: none" id="judgmentAnswer">
                        <input type="radio" name="answer" value="Y" title="对">
                        <input type="radio" name="answer" value="N" title="错">
                    </div>
                </div>

                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">试题解析</label>
                    <div class="layui-input-block">
                        <textarea name="analysis"  lay-verify="required" placeholder="请输入试题解析" class="layui-textarea"></textarea>
                    </div>
                </div>



                <div class="layui-form-item" style="text-align: center">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>










        <%--  内容结束！！！--%>
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