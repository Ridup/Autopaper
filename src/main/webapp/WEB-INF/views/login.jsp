<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="UTF-8">
<meta name="renderer" content="webkit"><!--用在360中-->
<meta name="force-rendering" content="webkit"><!--用在其它-->
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
<title>自动组卷系统登录</title>
<meta name="keyword" content="">
<meta name="description" content="">
<link rel="dns-prefetch" href="#">
<link rel="icon" href="<%=request.getContextPath()%>/static/images/favicon.ico" mce_href="../images/favicon.ico" type="image/x-icon">
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/login.min.css?v=1c04eaf3b6">
<style>html, body { height: 100%; }</style>
<style type="text/css">
    .my-form-bind { width: 360px; margin: 0 auto; }

    .my-form-bind .btn{
        width: 100%;
        height: 50px;
        line-height: 50px;
        font-size: 16px;
        color: #fff;
        text-align: center;
        background: #52c684;
        border-radius: 5px;
        margin-top: 30px;
        margin-bottom: 35px;
    }
    #j-co-bind {
        width: 460px;
        height: 490px;
        background: #fff;
        border-radius: 10px;
        position: absolute;
        top: 50%;
        left: 50%;
        margin-top: -245px;
        margin-left: -230px;
        box-shadow: 0 5px 10px#cadad5;
    }
    #j-co-bind .login-sel {
        margin: 0 auto 15px;
    }
    #j-co-bind .my-form-bind .btn,
    #j-co-bind .msg-code a {
        /* background: #288ff3;*/
    }
    #j-co-bind .msg-code a:hover {
        /*background: #52c684;*/
    }
    .title-hd {
        margin-bottom: 10px;
        padding: 20px 50px 10px;
        text-align: center;
        font-size: 18px;
        font-weight: 800;
        color: #333;
        border-bottom: 1px solid #ddd;
    }
    .user-input .code-input {
        width: 205px;
    }
    #mobile-captcha{
        vertical-align:middle;
    }
    .my-form-bind .btn1{
        display: block;
        width: 46%;
        height: 36px;
        line-height: 36px;
        font-size: 16px;
        color: #fff;
        text-align: center;
        background: #52c684;
        margin: 0px  auto;
    }
    .my-form-bind .btn1:hover { background: #4daf77; text-decoration: none; }
    .hwrap {
        width: 400px;
        height: 260px;
        background: #fff;
        border-radius: 10px;
        position: absolute;
        top: 50%;
        left: 50%;
        margin-top: -130px;
        margin-left: -200px;
        box-shadow: 0 5px 10px #cadad5;
    }

    .login-method--weixin { text-align: center; height: 500px; }
    .login-method--weixin .title { font-size: 20px; padding: 16px; }
    .login-method--weixin .wrp_code { width: 282px; height: 282px; margin: 0 auto; position: relative; }
    .login-method--weixin .qrcode { width: 280px;  border: 1px solid #ddd; display: none; }
    .login-method--weixin .info { font-size: 14px; color: #999; line-break: auto; padding-top: 16px; }
    .login-method--weixin .wxcode-loading {position: absolute; width: 100%; line-height: 24px; top: 130px; text-align: center; }
    .login-method__tab { position: absolute; right: 16px; top: 16px; }
    .login-method__tab li {position: relative}
    .login-method__tab .tip { background: #404040; color: #fff; font-size: 14px; width: 140px; height: 34px; line-height: 34px; border-radius: 4px;  position: absolute; right: 86px; top: 0; }
    .login-method__tab li .img { width: 66px; height: 66px; text-indent: -999px; overflow: hidden; cursor: pointer; }
    .login-method__tab--wx .img { background: url(<%=request.getContextPath()%>/static/images/tab-weixin.png) no-repeat left top; }
    .login-method__tab--ac .img { background: url(<%=request.getContextPath()%>/static/images/tab-account.png) no-repeat left top; }
    .login-method__tab li .tip i { float: left; width: 14px; height: 14px; margin: 10px; }
    .login-method__tab li .tip b { position: absolute; right: -12px; top: 12px; width:0; height: 0; display: block; border: 6px solid #404040; border-color: transparent transparent transparent #404040; }
    .login-method__tab--wx .tip i { background: url(<%=request.getContextPath()%>/static/images/ico-qrcode.png) no-repeat left top; }
    .login-method__tab--ac .tip i { background: url(<%=request.getContextPath()%>/static/images/ico-pass.png) no-repeat left top; }

</style>
    <style>html, * {-webkit-user-select:text!important; -moz-user-select:text!important;}</style><link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/layer.css?v=3.0.11110" id="layuicss-skinlayercss">
</head>


<body>
<div class="bg-global" id="loginForm" style="display:block">
    <div class="bg-login">
        <div class="img-wrap">
            <a href="<%=request.getContextPath()%>/index.do"><img src="<%=request.getContextPath()%>/static/images/login-logo1.png" alt="教育" ></a>
        </div>
        <form class="my-form J_LoginTabContent" action="<%=request.getContextPath()%>/user/loginIn.do" method="post">
            <input type="hidden" name="_csrf" value="ckxDRWxPQTRAHQcrHCEEXTsAHDA1KBN5Fx45IFUZAn4AIBMOOTcmDA==">
            <div class="login-tips" id="login-tips">&nbsp;<span>${msg}</span></div>
            <div class="user-input user-input1">
                <label class="ie-placeholder" for="user-name">请输入手机号</label>
                <input type="text" name="username" placeholder="手机/邮箱/用户名" id="user-name" value="${name}">
            </div>
            <div class="user-input">
                <label class="ie-placeholder" for="user-pwd">请输入密码</label>
                <input type="password" name="password" placeholder="请输入密码" id="user-pwd" value="${password}">
            </div>

            <div class="user-captcha"></div>

            <p class="pwd f-usn" onselectstart="return false">
          <%--      <span class="remember-me">
                    <i class="cu-checkbox4"></i> 记住密码
                    <input type="hidden" name="LoginForm[rememberMe]" value="0" id="remember-me-input">
                </span>--%>
<%--                <a href="/site/password-find">忘记密码</a>--%>
            </p>
            <button class="btn" type="submit">登录</button>
<%--            <div class="oth-login"><p>选择其他方式登录</p></div>--%>

            <%--<div class="oth-qq">
                <a href="/site/show-qr-code" target="_blank" ;="" style="text-decoration:none;" class="weixin-btn"> </a>
                <a href="https://graph.qq.com/oauth2.0/authorize?response_type=code&amp;client_id=310510134&amp;redirect_uri=https://21cnjy.com/connect.php&amp;state=&amp;scope=get_user_info" class="qq-btn"> </a>
            </div>--%>
            <div class="register">还没有账号？注册一个吧！<a href="<%=request.getContextPath()%>/user/register.do">立即注册</a></div>
        </form>

        <div class="login-method--weixin J_LoginTabContent" style="display: none"><%--
            <div class="title">微信登录</div>
            <div class="waiting panelContent">
                <div class="wrp_code">
                    <div class="wxcode-loading">二维码加载中...</div>
                    <img class="qrcode lightBorder normal J_QrCode">
                </div>
                <div class="info">
                    <div class="status status_browser">
                        <p>请使用微信扫描二维码登录</p>
                        <p>“用户中心”</p>
                    </div>
                </div>
            </div>

        --%></div>

        <div class="address">
            <p><span> 江西省南昌市南昌大学</span> <span>邮编：330031</span> <span>电话：18200000000</span></p>
            <p>2017-2018 版权所有©Ridup <a href="https://github.com/Ridup" rel="nofollow" target="_blank">GitHub</a></p>
        </div>
        <div class="login-method__tab J_LoginTab"><%--
            <ul>
                <li class="login-method__tab--wx tab" data-type="1">
                    <div class="img">微信扫码</div>
                    <p class="tip"><i></i>扫码登录在这里<b></b></p>
                </li>
                <li class="login-method__tab--ac tab" data-type="0" style="display:none">
                    <div class="img">输入账号</div>
                    <p class="tip"><i></i>密码登录在这里<b></b></p>
                </li>
            </ul>
        --%></div>
    </div>
</div>


<div class="bg-global" id="bindForm" style="display:none">
    <div class="bg-login" id="j-co-bind">
        <h1 class="title-hd">验证手机号，提升账户安全等级</h1>
        <div class="login-sel f-usn" style="line-height: 20px;text-indent: 25px;">
            <div>
                应国家相关法律要求，自<u style="color:#52c684">2017年6月1日</u>起使用信息发布，即时通讯等互联网服务需要进行身份信息验证，为保障您对
                相关服务功能的正常使用，建议您尽快完成手机号验证，感谢您的理解和支持！
            </div>
            <span style="color:red;" id="errorcode"></span>
        </div>

        <div class="login-form" id="j-yes">
            <form class="my-form-bind" action="/login?jump_url=" method="post">
                <input type="hidden" name="_csrf" value="ckxDRWxPQTRAHQcrHCEEXTsAHDA1KBN5Fx45IFUZAn4AIBMOOTcmDA==">                    <div class="user-input user-input1">
                <label class="ie-placeholder" >请输入手机</label>
                <input type="text" name="mobile" class="require-input" placeholder="请输入绑定的手机">
                <input type="hidden" name="jump_url" value="">
            </div>

                <div class="user-input user-input1">
                    <label class="ie-placeholder" >请输入图形验证码</label>
                    <input type="text" name="verifyCode" class="require-input code-input" placeholder="请输入图形验证码">
                    <img id="mobile-captcha" src="/site/captcha?v=5aab6b7ae4a54" alt="换一个" title="换一个" style="cursor:pointer;">
                </div>
                <div class="code-box">
                    <div class="user-input">
                        <label class="ie-placeholder" for="user-vcode">请输入验证码</label>
                        <input type="text" name="code" class="require-input" placeholder="请输入验证码" id="user-vcode">
                    </div>
                    <div class="code msg-code"><a href="/site/send-code" class="send-code" data-type="">获取验证码</a></div>
                </div>
                <button type="submit" class="btn" id="bind">完成验证</button>

            </form>            </div>

    </div>
</div>
<!--实名认证成功跳转-->
<div class="bg-global" id="show" style="display:none">
    <div class="bg-login hwrap">

        <h1 class="title-hd">账号实名认证成功</h1>
        <div class="login-sel f-usn">
            <div style="margin-top:20px; line-height: 20px; text-align: left; font-size: 14px;">
                恭喜您已完成账号实名验证，您可以正常登录并使用功能，如需使用该手机号码进行账号登录，请到<a href="/" style="color: #52c684;">个人中心</a>绑定手机号码。
            </div>

        </div>



    </div>
</div>





<script type="text/template" id="user-captcha-template">
    <input type="input" name="LoginForm[verifyCode]" placeholder="请输入验证码" id="user-captcha">
    <span class="captcha-img"><img id="captchaimg" src="{{url}}" alt="换一个" title="换一个" style="cursor:pointer;"></span>
</script>
<script src="<%=request.getContextPath()%>/static/js/lib/jquery-1.9.1.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/lib/layer.js"></script>
<script src="<%=request.getContextPath()%>/static/js/common.min.js?v=468d072cee"></script>
<script src="<%=request.getContextPath()%>/static/js/module/login.min.js?v=f23e5b2608"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/mobile-bind.min.js?v=8f2ee21cc3"></script>
<script>
    var opt = { }
    var login_form = new LoginForm('form.my-form').init(opt);
</script>
<script>
    document.domain = 'autopaper';
    var enable = false;
    var t = null;
    $('.J_LoginTab').on('click', '.tab', function(evt) {
        var _i = $(this).data('type');
        $(this).hide();
        $(this).siblings().show();
        var $tabs = $('.J_LoginTabContent');
        $tabs.hide();
        $tabs.eq(_i).show();

        if (_i == 1) {
            // 微信方式
            enable = true;
            $.get('/site/show-qr-code', {jump_url: ''}).then(function(res) {
                $('.J_QrCode').attr('src', res.qrcodeurl); // 更新地址
                $('.J_QrCode').show();
                $('.wxcode-loading').remove();
                fetch2(res.ticket);
            });
        }
        else {
            if (t) {
                enable = false;
                clearTimeout(t);
                t = null;
            }
        }

    });

    function fetch(ticket) {
        t = setTimeout(function() {
            fetch2(ticket);
        }, 1000);
    }

    function fetch2(ticket) {
        if (!enable) return false;
        var check_url = "/site/issubscribe"+'?ticket='+ticket+"&jump_url=&r="+Math.random();
        $.getJSON(check_url).done(function(data) {
            if(data.code == 1) {
                window.location.href = 'https://passport.21cnjy.com/wxlogin?ticket='+ticket+"&jump_url=";
            }
            else {
                fetch(ticket);
            }
        }).fail(function() {
            fetch(ticket);
        });
    }
</script>

</body>
</html>