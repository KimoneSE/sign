$("#logInButton").click(function () {
    var username = $.trim($("#logInName").val());
    var password = $.trim($("#logInPsw").val());
    if (username=='' || password=='' ){
        return ;
    }
    $.ajax({
        type:'POST',
        url:'/user/login',
        data:{"username":username,"password":password},
        dataType:'json',
        timeout:1000,
        error:function () {
            $("#logFormTip").css("color","red");
            $("#logInName").val('');
            $("#logInPsw").val('');
            $("#logFormTip").html("登录失败，请重试！");
        },
        success:function(result){
            if(result.code === 200){
                $("#logFormTip").html('');
                window.location.href='http://localhost:8080/logInSuccess';
            }else {
                // alert('失败');
                $("#logFormTip").css("color","red");
                $("#logFormTip").html(result.message);
            }
        }
    });
});