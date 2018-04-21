<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta name="renderer" content="webkit"><!--用在360中-->
    <meta name="force-rendering" content="webkit"><!--用在其它-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
    <title>自动组卷系统注册</title>
    <meta name="keyword" content="">
    <meta name="description" content="">
    <link rel="dns-prefetch" href="https://www.21cnjy.com/">
    <link rel="dns-prefetch" href="https://www.jbzyk.com/">
    <link rel="dns-prefetch" href="https://news.jbzyk.com/">
    <link rel="dns-prefetch" href="https://tikupic.21cnjy.com/">
    <link rel="dns-prefetch" href="https://www.kt5u.com/">
    <link rel="icon" href="<%=request.getContextPath()%>/static/images/favicon.ico" mce_href="../images/favicon.ico" type="image/x-icon">
    <script>
        // 全局空间
        var ns = {};
        ns.CSRF = { "_csrf": "LmNGQkQxNDJ3BBZvLHBCfllTB3AhaAZ9GFUzCDRwBHV6EzUnMHR7fw==" };
        ns.setting = {
            gender: {
                1: { value: 1, label: '男' },
                2: { value: 2, label: '女' }
            },
            identity: {
                1: { value: 1, label: '老师' },
                2: { value: 2, label: '学生' },
                3: { value: 3, label: '家长' }
            },
            xd: {
                1: { value: 1, label: '小学'},
                2: { value: 2, label: '初中'},
                3: { value: 3, label: '高中'}
            }
        };
    </script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/login.min.css">
    <style>html, * {-webkit-user-select:text!important; -moz-user-select:text!important;}</style><link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/layer.css" id="layuicss-skinlayercss"></head>

<body>


<div class="c-head">
    <div class="g-cwd cfx">
        <div class="logo">
            <a href="<%=request.getContextPath()%>"><img src="<%=request.getContextPath()%>/static/images/logo1.png" alt="logo"></a>
            <span>注册新账号</span>
        </div>
        <!-- <div class="menu">
            <span><i class="cu-arrow-down"></i></span>
            <ul class="menu-list">
                <li><a href="https://www.21cnjy.com/zhitongche/" target="_blank">校网通</a></li>
                <li><a href="https://zujuan.21cnjy.com/" target="_blank">在线组卷</a></li>
                <li><a href="https://www.jbzyk.com/" target="_blank">校本资源库</a></li>
                <li><a href="https://kt5u.21cnjy.com/" target="_blank">课堂无忧</a></li>
                <li><a href="https://tiku.21cnjy.com/" target="_blank">在线题库</a></li>
                <li><a href="https://www.21cnjy.com/video.php" target="_blank">名师讲堂</a></li>
                <li><a href="https://www.21cnjy.com/productshow/index.php?prod=school" target="_blank">数字化校园</a></li>
                <li><a href="https://www.21cnjy.com/productshow/index.php?prod=yun" target="_blank">区域云平台</a></li>
                <li><a href="https://www.21cnjy.com/productshow/app/" target="_blank">二一教育APP</a></li>
            </ul>
        </div> -->
    </div>
</div><div class="g-cw1 reg-wrap">
    <h2>注册新账号</h2>
    <div class="reg-bd">
        <ul class="flow-tag"><li class="active">第一步：选择身份<i></i></li>
            <li class="">第二步：填写信息<i></i></li>
            <li class="">第三步：完成注册<i></i></li></ul>
        <div class="main-view">
            <!-- <div style="display: block;"><ul class="sel-reg cfx">
                <li>
                    <div class="reg-item">
                        <div><img src="../images/teacher.png" alt=""></div>
                        <a href="javascript:;" data-identity="teacher">老师注册</a>
                    </div>
                </li>
                <li>
                    <div class="reg-item">
                        <div><img src="../images/student.png" alt=""></div>
                        <a href="javascript:;" data-identity="student">学生注册</a>
                    </div>
                </li>
                <li>
                    <div class="reg-item">
                        <div><img src="../images/parent.png" alt=""></div>
                        <a href="javascript:;" data-identity="parents">家长注册</a>
                    </div>
                </li>
            </ul>
            <div class="login">
                <span>已拥有二一账号，</span><a href="https://passport.21cnjy.com/login?jump_url=http%3A%2F%2Fwww.21cnjy.com%2F">登录&gt;&gt;</a>
            </div></div> --></div>
    </div>
    <div class="address">
        <p><span> 江西省南昌市南昌大学</span> <span>邮编：330031</span> <span>电话：18214990000</span></p>
        <p>2017-2018 版权所有©Ridup <a href="https://github.com/Ridup" rel="nofollow" target="_blank">GitHub</a></p>
    </div>
</div>
<script src="<%=request.getContextPath()%>/static/js/lib/jquery-1.9.1.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/underscore-1.8.3.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/extends/backbone-1.3.3.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/lib/layer.js"></script>
<script>
    ns.layer_defaults = function ($el, option) {
        var defaults = {
            content: '',
            area: '500px',
            fixed: false,
            offset: "140px",
            title: ($el ? $el.data('title') : false),
            type: 1,
            success: function (layero, index) {
                if ($el) {
                    $el.trigger('before-render');
                    layero.find('.layui-layer-content').append($el);
                    $el.trigger('render');
                    $el.on('close', function () {
                        layer.close(index);
                    });
                }
            }
        };

        return $.extend({}, defaults, option);

    };

</script>

<script type="text/template" id="tpl-stepbar">
    <li class="<%--<%= step > 0 ? 'active' : '' %>--%>">第一步：选择身份<i></i></li>
    <li class="<%--<%= step > 1 ? 'active' : '' %>--%>">第二步：填写信息<i></i></li>
    <li class="<%--<%= step > 2 ? 'active' : '' %>--%>">第三步：完成注册<i></i></li>
</script>
<script type="text/template" id="step1">
    <ul class="sel-reg cfx">
        <li>
            <div class="reg-item">
                <div><img src="<%=request.getContextPath()%>/static/images/teacher.png" alt=""></div>
                <a href="javascript:;" data-identity="teacher">老师注册</a>
            </div>
        </li>
        <li>
            <div class="reg-item">
                <div><img src="<%=request.getContextPath()%>/static/images/student.png" alt=""></div>
                <a href="javascript:;" data-identity="student">学生注册</a>
            </div>
        </li>
        <li>
            <div class="reg-item">
                <div><img src="<%=request.getContextPath()%>/static/images/parent.png" alt=""></div>
                <a href="<%=request.getContextPath()%>" data-identity="tourists">游客进入</a>
            </div>
        </li>
    </ul>
    <div class="login">
        <span>已拥有账号，</span><a href="<%=request.getContextPath()%>/user/login.do">登录&gt&gt</a>
    </div>
</script>
<script type="text/template" id="step2-mobile">
    <div class="form-wrap cfx">
        <!-- 弹窗开始 -->
        <!-- <div class="reg-pop">
            <div class="hd" >
                <img src="../images/success1.png" alt="">
                <h2>恭喜您,注册成功!</h2>
                <i></i>
            </div>
            <div class="bd" >
                <img src="../images/bang-code.png" alt="">
                <div class="des" >
                    <h3>微信扫码关注中小学教师帮</h3>
                    <ul class="items">
                        <li>1、中小学教师群体最有影响力的公众号</li>
                        <li>2、21世纪教育网活动、优惠信息抢先知</li>
                        <li>课堂经验、教学分享、零距离名师分享互动</li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="bg-model"></div> -->
        <!-- 弹窗结束 -->
        <form class="reg-form" action="<%=request.getContextPath()%>/user/registerIn.do" method="post">
            <input type="hidden" name="_csrf" value="LmNGQkQxNDJ3BBZvLHBCfllTB3AhaAZ9GFUzCDRwBHV6EzUnMHR7fw==">
            <div class="form-line hint-line">
                <p class="ttips">提示：您当前选择的是<span><%--<%- name %>--%></span>身份，注册成功后无法更改，<a href="javascript:;" class="return-step1">重选&gt&gt</a></p>
            </div>
            <div class="form-line">
                <label><span>*</span>手机号码：</label>
                <div class="set-input">
                    <label class="ie-placeholder" for="mobile">请输入手机号码</label>
                    <input type="text" name="mobile" id="mobile" placeholder="请输入手机号码"  >

                </div>
            </div>

            <div class="form-line">
                <label><span>*</span>登录密码：</label>
                <div class="set-input">
                    <label class="ie-placeholder" for="password1">请输入密码</label>
                    <input type="password" name="password" id="password1" placeholder="请输入密码">
                </div>
            </div>
            <div class="form-line">
                <label><span>*</span>确认密码：</label>
                <div class="set-input">
                    <label class="ie-placeholder" for="password12">请输入密码</label>
                    <input type="password" name="password2" id="password12" placeholder="请输入密码">
                </div>
            </div>
            <%--<div class="form-line" >
                <label><span>*</span>图形验证码：</label>
                <div class="set-input" id="mobile-captcha-template">
                    <label class="ie-placeholder" for="scode2">图形验证码</label>
                    <div class="input-b"><input type="text" name="verifyCode" id="verifyCode" class="code-txt" placeholder="请输入图形验证码"></div>
                    <img id="mobile-captcha" src="" alt="换一个" title="换一个" style="cursor:pointer;" />
                </div>
            </div>--%>
            <%--<div class="form-line" style="margin-top:-25px;">
                <label><span>*</span>手机验证码：</label>
                <div class="set-input">
                    <label class="ie-placeholder" for="scode2">请输入验证码</label>
                    <div class="input-b"><input type="text" name="scode" id="scode2" class="code-txt" placeholder="请输入验证码"></div>
                    <a href="/site/send-code?type=mobile&do=1" class="get-code" data-type="mobile">获取验证码</a>
                </div>
            </div>--%>
            <div class="agree-line">
                <span class="custom-checkbox checked">
                <i class="cu-checkbox4"></i>
                <input type="checkbox" name="agree" value="1" checked>
                </span>我同意<a href="/html/protocol.html" target="_blank">《注册协议》</a></div>
            <div class=" " style="text-align: center">
                <input type="hidden" name="identity" value="<%--<%= identity %>--%>">
                <input type="hidden" name="type" value="mobile">
                <!--<a href="javascript:;" class="return-step1">上一步</a>-->
                <button class="reg-btn" type="submit">注册</button>
            </div>
        </form>
        <div class="login">
            <span>已拥有账号，</span><a href="<%=request.getContextPath()%>/user/login.do">登录&gt&gt</a>
        </div>
    </div>
</script>













<!-- 注册成功 -->
<script type="text/template" id="step3">
    <div>
        <div class=" cfx">
            <!-- 弹窗开始 -->
            <div class="reg-pop">
                <div class="hd" >
                    <img src="<%=request.getContextPath()%>/static/images/success1.png" alt="">
                    <h2>恭喜您,注册成功!</h2>
                    <i></i>
                </div>
                <div class="bd" >
                    <%--<img src="<%=request.getContextPath()%>/static/images/bang-code.png" alt="">--%>
                    <div class="des" >
                        <h3>欢迎使用</h3>
                        <ul class="items">
                            <li>1、欢迎使用欢迎使用</li>
                            <li>2、欢迎使用欢迎使用</li>
                            <li>3、欢迎使用欢迎使用</li>
                            <li>
                                <div class="dong sel-reg">
                                    <a href="<%=request.getContextPath()%>/user/login.do" >确定</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class=""></div>
            <!-- 弹窗结束 -->
        </div>
        <div>
            <div class="gate">
                <span>传送门：</span>
                <ul class="gate-list">
                    <li><a href="//www.21cnjy.com/">aaaa</a></li>
                    <li><a href="//zujuan.21cnjy.com/">bbbbb</a></li>
                    <li><a href="//www.kt5u.com/">aaaaa</a></li>
                    <li><a href="//tiku.21cnjy.com/">aaaaaaaaa</a></li>
                    <li><a href="//www.21cnjy.com/video.php">aaaaaaaa</a></li>
                </ul>
            </div>
        </div>
    </div>
</script>








<script src="<%=request.getContextPath()%>/static/js/module/common-form.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/module/register1.min.js"></script>
<script>
    (function() {
        // 初始化
        // 注册状态初始数据
        var model = new Backbone.Model({
            step: 0,
            identity: '',
            name: '',
            type: 'mobile',
            completed: 0 // 0 注册填写中, 1 注册成功, 2 注册失败
        });

        new LayoutView({ el: '.reg-bd', model: model });
    })();
</script>





</body></html>