var loginForm = {
    init: function() {
        loginForm.bind();
    },
    bind: function() {
        $("#btn_signin").on('click', function(){
           loginForm.signin();
        });
    },
    signin: function() {

        // common.goPage("/login", "frm_login");
        $.ajax({
           url: '/login',
            type: 'POST',
            dataType: 'json',
            data: {
               userId: $("#userId").val(),
                userPw: $("#userPw").val()
            },
            success: function(res){
               console.log(res);
            }
        });

        // var param = {
        //     userId: $("#userId").val(),
        //     userPw: $("#userPw").val()
        // }
        // common.goPage('/login/loginProcess', param);
    }
}

$(function(){
   loginForm.init();
});