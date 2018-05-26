<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>组卷系统后台登录</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" type="image/x-icon" href="<%=request.getContextPath()%>/static/images/favicon.ico">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <!-- load css -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/layui/css/layui.css">

    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/login1.css" media="all">
</head>
<body style="background-image: url("<%=request.getContextPath()%>/static/images/bg1.jpg")">
<div class="layui-canvs"></div>
<div class="layui-layout layui-layout-login">
    <h1>
        <strong>组卷系统后台</strong>
    </h1>
    <form action="<%=request.getContextPath()%>/admin/login_in.do">
    <div class="layui-user-icon larry-login">
        <input type="text" placeholder="账号" name="name" class="login_txtbx"/>
    </div>
    <div class="layui-pwd-icon larry-login">
        <input type="password" placeholder="密码" name="password" class="login_txtbx"/>
    </div>

    <div class="layui-submit larry-login">
        <input type="submit" value="立即登陆" class="submit_btn"/>
    </div>
    </form>
    <div class="layui-login-text">
        <p>© NCU </p>

    </div>
</div>
<script src="<%=request.getContextPath()%>/static/js/lib/jquery.js"></script>
<script src="<%=request.getContextPath()%>/static/layui/layui.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/module/login1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/module/jparticle.jquery.js"></script>
<script type="text/javascript">
    $(function(){
        $(".layui-canvs").jParticle({
            background: "#141414",
            color: "#E6E6E6"
        });
        //登录链接测试，使用时可删除
        $(".submit_btn").click(function(){
            location.href="index.html";
        });
    });
</script>
</body>
</html>