$("#registerButton").click(function () {
    var username = $.trim($("#registerName").val());
    var password = $.trim($("#registerPsw").val());
    if (username=='' || password=='' ){
        return ;
    }
    $.ajax({
        type:'POST',
        url:'/user/register',
        data:{"username":username,"password":password},
        dataType:'json',
        timeout:1000,
        error:function () {
            $("#formTip").css("color","red");
            $("#registerName").val('');
            $("#registerPsw").val('');
            $("#formTip").html("注册失败，请重试！");
        },
        success:function(result){
            if(result.code === 200){
                $("#formTip").html('');
                window.location.href='http://localhost:8080/registerSuccess';
            }else {
                $("#formTip").css("color","red");
                $("#formTip").html(result.message);
            }
        }
    });
});