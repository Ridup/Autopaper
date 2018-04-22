$(document).ready(function(){





//TODO 抽出相同部分，独立出来
    //用户性别选择
    $(".userSex").click(function () {
        //alert($(this).attr('class')[17]);
        var check = $(this).attr('class')[17];
        var sexvalue = $(this).find("input").val();
        //alert("sex"+sexvalue);
        if(check=="c"){
            $("#userSex").val(sexvalue);
        }else{
            $(".userSex.radiobox.checked").removeClass("checked");
            $(this).addClass("checked");
            $("#userSex").val(sexvalue);
        }
    });
    //用户类型选择
    $(".userTyp").click(function () {
        //alert($(this).attr('class')[17]);
        var check = $(this).attr('class')[17];
        var sexvalue = $(this).find("input").val();
        //alert("sex"+sexvalue);
        if(check=="c"){
            $("#userTyp").val(sexvalue);
        }else{
            $(".userTyp.radiobox.checked").removeClass("checked");
            $(this).addClass("checked");
            $("#userTyp").val(sexvalue);
        }
    });


    //基本信息切换
    $("#viewinfo").click(function () {
        $("#viewinfodiv").hide();
        $("#editinfodiv").show();
    });
    $("#editinfo").click(function () {
        var nickName = $("#nickName").val();
        var userSex = $("#userSex").val();
        var userAge = $("#userAge").val();
        var userName = $("#userName").val();

//todo Ajax
        var localObj = window.location;
        var server_context = localObj.protocol+"//"+localObj.host+"/"+localObj.pathname.split("/")[1];
        if(nickName!=null&&userSex!=null&&userAge!=null&&userName!=null&&nickName!=""&&userSex!=""&&userAge!=""&&userName!="") {
            $.ajax({
                url: server_context + '/ucenter/userbaseinfo.do',
                type: 'POST', //GET
                async: true,    //或false,是否异步
                data: {
                    nickName: nickName, userSex: userSex, userAge: userAge, userName: userName
                },
                timeout: 5000,    //超时时间
                dataType: 'json',    //返回的数据格式：json/xml/html/script/jsonp/text

                success: function (data, textStatus, jqXHR) {

                    if (data.success) {
                        window.location.reload();

                    } else {
                        layer.alert("<span style='margin-left: 70px;text-align: center;'>" + data.msg + "</span>");
                    }
                    console.log("data:" + data);
                    console.log(textStatus);
                    console.log(jqXHR);
                    /*   $("#editinfodiv").hide();
                       $("#viewinfodiv").show();*/
                },
                error: function (xhr, textStatus) {
                    layer.alert("<span style='margin-left: 70px;text-align: center;'>系统异常，请重试</span>");
                }
            });
        }else{
            layer.alert("<span style='margin-left: 70px;text-align: center;'>请完善信息！</span>");
        }

    });


    // 用户密码
    $("#editpassword").click(function () {
        $(this).hide();
        $("#userPassword").attr("disabled",false);
        $("#savepassword").show();
    });
    $("#savepassword").click(function () {
        //TODO 密码加密！！！
        var userPassword = $("#userPassword").val();
        if(userPassword!=null&&userPassword!=""){
            //更改密码
            //todo Ajax
            $("#userPassword").attr("disabled",true);
            $("#savepassword").hide();
            $("#editpassword").show();
        }else {
            layer.tips("密码不能为空！","#userPassword");
        }
    });


    // 用户手机
    $("#edituserPhone").click(function () {
        $(this).hide();
        $("#userPhone").attr("disabled",false);
        $("#saveuserPhone").show();
    });
    $("#saveuserPhone").click(function () {
        var userPhone = $("#userPassword").val();
        if(userPhone!=null&&userPhone!=""){
            //更改密码
//todo Ajax
            $("#userPhone").attr("disabled",true);
            $("#saveuserPhone").hide();
            $("#edituserPhone").show();
        }else {
            layer.tips("密码不能为空！","#userPhone");
        }
    });
    // 用户邮箱
    $("#createEmail").click(function () {
        $("#createEmails").hide();
        $("#edituserEmail").hide();
        $(".userEmail").attr("disabled",false);
        $("#userEmailinput").show();
        $("#saveuserEmail").show();
    });
    $("#edituserEmail").click(function () {
        $(this).hide();
        $(".userEmail").attr("disabled",false);
        $("#saveuserEmail").show();
    });
    $("#saveuserEmail").click(function () {
        var userEmail = $(".userEmail").val();
        if(userEmail!=null&&userEmail!=""){
            //更改邮箱
//todo Ajax
            $(".userEmail").attr("disabled",true);
            $("#saveuserEmail").hide();
            $("#edituserEmail").show();
        }else {
            layer.tips("邮箱不能为空！",".userEmail");
        }
    });

});


