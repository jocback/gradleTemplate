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
        $.ajax({
           url: '/login',
            type: 'POST',
            dataType: 'json',
            data: {
               userId: $("#userId").val(),
                userPw: $("#userPw").val()
            },
            success: function(res){
               if(res.code=='200'){
                   alert("로그인 되었습니다.");
                   common.goPage("/board/boardList");
               } else {
                   alert(res.message);
               }
               console.log(res);
            }
        });
    }
}

$(function(){
   loginForm.init();
});