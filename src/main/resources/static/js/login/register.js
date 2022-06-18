var register = {
    init: function() {
        register.bind();
    },
    bind: function() {
        $("#btn_signUp").on('click', function(){
            register.signUp();
        });
    },
    signUp: function(){
        var param = $("#frm_register").serializeObject();
        $.ajax({
            url: "/login/signUp",
            type: 'post',
            dataType: 'json',
            data: param,
            success: function(res) {
                alert("등록되었습니다.")
                common.goPage("/login/loginForm");
            }
        });
    }
}

$(function(){
   register.init();
});