<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" type="image/x-icon" href="<%=request.getContextPath()%>/static/images/favicon.ico">
    <title>自动组卷系统后台</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">自动组卷系统后台</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
          <%--  <li class="layui-nav-item"><a href="">控制台</a></li>--%>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    ${user.userName}
                </a>
               <%-- <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>--%>
            </li>
            <li class="layui-nav-item"><a href="<%=request.getContextPath()%>/admin/login.do">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <%--<li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">评论管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">试题评论审核</a></dd>
                        <dd><a href="javascript:;">试卷评论审核</a></dd>
                    </dl>
                </li>--%>
                <li class="layui-nav-item">
                    <a href="javascript:;">试题管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">试题审核</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;font-size: 22px;text-align: center">试题审核</div>


        <div class="layui-btn-group demoTable">
            <button class="layui-btn" data-type="passAll">批量通过</button>
            <button class="layui-btn" data-type="noPassAll">批量不通过</button>
        </div>


        <table class="layui-table" lay-data="{width: 1100, height:480, url:'<%=request.getContextPath()%>/admin/question/record.do', page:false, id:'idTest'}" lay-filter="demo">
            <thead>
            <tr>
                <th lay-data="{type:'checkbox', fixed: 'left'}"></th>
                <th lay-data="{field:'gradeName', width:66, sort: true, fixed: true}">年级</th>
                <th lay-data="{field:'courseName', width:66,sort: true, fixed: true}">学科</th>
                <th lay-data="{field:'questionType1', width:73, sort: true}">题型</th>
                <th lay-data="{field:'questionClass1', width:80, sort: true}">题类</th>
                <th lay-data="{field:'questionContent', width:250, sort: true}">题干</th>
                <th lay-data="{field:'questionStatus1', width:111, sort: true}">状态</th>
                <th lay-data="{field:'questionDifficulty1', width:74, sort: true}">难度</th>
                <th lay-data="{field:'ownner', width:100, sort: true}">创建人ID</th>
                <th lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}"></th>
            </tr>
            </thead>
        </table>
        <script type="text/html" id="barDemo">
            <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="pass">通过</a>
            <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="nopass">不通过</a>
            <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
        </script>








    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © NCU - 后台
    </div>
</div>
<script src="<%=request.getContextPath()%>/static/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });






    var localObj = window.location;
    var server_context = localObj.protocol + "//" + localObj.host + "/" + localObj.pathname.split("/")[1];


    layui.use('table', function () {
        var table = layui.table;
        //监听表格复选框选择
        table.on('checkbox(demo)', function (obj) {
            console.log(obj)
        });
        //监听工具条
        table.on('tool(demo)', function (obj) {
            var data = obj.data;
            if (obj.event === 'pass') {
                layer.confirm('真的不通过行么', function (index) {
                    obj.del();
                    layer.close(index);
                    //删除记录========================================================
                    $.ajax({
                        url: server_context + '/admin/question/pass.do',
                        type: 'POST', //GET
                        async: true,    //或false,是否异步
                        data: {
                            questionId: data.questionId
                        },
                        timeout: 5000,    //超时时间
                        dataType: 'text',    //返回的数据格式：json/xml/html/script/jsonp/text
                        success: function (data, textStatus, jqXHR) {
                            if (data == "success") {
                                layui.layer.msg('删除成功');
                                setTimeout(window.location.reload(), 19500);
                            }
                            if (data == "fail") {
                                layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                            }
                        },
                        error: function (xhr, textStatus) {
                            layer.closeAll('loading');
                            layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                        }
                    });
                });
            }
            else if(obj.event ==='nopass'){
                layer.confirm('真的不通过行么', function (index) {
                    obj.del();
                    layer.close(index);
                    //删除记录========================================================
                    $.ajax({
                        url: server_context + '/admin/question/nopass.do',
                        type: 'POST', //GET
                        async: true,    //或false,是否异步
                        data: {
                            questionId: data.questionId
                        },
                        timeout: 5000,    //超时时间
                        dataType: 'text',    //返回的数据格式：json/xml/html/script/jsonp/text
                        success: function (data, textStatus, jqXHR) {
                            if (data == "success") {
                                layui.layer.msg('删除成功');
                                setTimeout(window.location.reload(), 19500);
                            }
                            if (data == "fail") {
                                layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                            }
                        },
                        error: function (xhr, textStatus) {
                            layer.closeAll('loading');
                            layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                        }
                    });
                });
            }
            else if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    obj.del();
                    layer.close(index);
                    //删除记录========================================================
                    $.ajax({
                        url: server_context + '/admin/question/delete.do',
                        type: 'POST', //GET
                        async: true,    //或false,是否异步
                        data: {
                            questionId: data.questionId
                        },
                        timeout: 5000,    //超时时间
                        dataType: 'text',    //返回的数据格式：json/xml/html/script/jsonp/text
                        success: function (data, textStatus, jqXHR) {
                            if (data == "success") {
                                layui.layer.msg('删除成功');
                                setTimeout(window.location.reload(), 19500);
                            }
                            if (data == "fail") {
                                layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                            }
                        },
                        error: function (xhr, textStatus) {
                            layer.closeAll('loading');
                            layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                        }
                    });
                });
            }
        });

        var $ = layui.$, active = {
            passAll: function () { //获取选中数据
                //批量删除记录========================================================
                var checkStatus = table.checkStatus('idTest')
                    , data = checkStatus.data;
                console.log("data=" + data);
                layer.confirm('真的通过这' + data.length + '道试题么', function (index) {
                    layer.close(index);
                    ids = [];
                    for (var i = 0; i < data.length; i++) {
                        ids[i] = data[i].questionId;
                    }
                    $.ajax({
                        url: server_context + '/admin/question/pass.do',
                        type: 'POST', //GET
                        async: true,    //或false,是否异步
                        data: {
                            questionId: 0, questionIds: ids.toString()
                        },
                        timeout: 5000,    //超时时间
                        dataType: 'text',    //返回的数据格式：json/xml/html/script/jsonp/text
                        success: function (data, textStatus, jqXHR) {

                            layui.layer.msg('删除成功');
                            setTimeout(window.location.reload(), 19500);

                        },
                        error: function (xhr, textStatus) {
                            layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                        }
                    });
                });

            }
            , noPassAll: function () { //获取选中数据
                //批量删除记录========================================================
                var checkStatus = table.checkStatus('idTest')
                    , data = checkStatus.data;
                console.log("data=" + data);
                layer.confirm('真的通过这' + data.length + '道试题么', function (index) {
                    layer.close(index);
                    ids = [];
                    for (var i = 0; i < data.length; i++) {
                        ids[i] = data[i].questionId;
                    }
                    $.ajax({
                        url: server_context + '/admin/question/nopass.do',
                        type: 'POST', //GET
                        async: true,    //或false,是否异步
                        data: {
                            questionId: 0, questionIds: ids.toString()
                        },
                        timeout: 5000,    //超时时间
                        dataType: 'text',    //返回的数据格式：json/xml/html/script/jsonp/text
                        success: function (data, textStatus, jqXHR) {

                            layui.layer.msg('删除成功');
                            setTimeout(window.location.reload(), 19500);

                        },
                        error: function (xhr, textStatus) {
                            layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                        }
                    });
                });

            }
        };

        $('.demoTable .layui-btn').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });

</script>
</body>
</html>