var common = {
    /***************************************************************************
     * @ description : submit 호출.
     * @ param : str : 호출url
     * @ param : str : form 아이디
     * @ usage : common.goPage(url : "requestURL"  , form_id  : "Parameter");
     **************************************************************************/
    goPage: function (url, frmData) {
        // url += '?backurl='+location.pathname;
        if (common.isEmpty(frmData)) {
            var frmHtml = '';
            frmHtml += '<form action="' + url + '" id="tempForm" method="post">';
            frmHtml += '</form>';
            $('body').append(frmHtml);
            $("#tempForm").submit();
        } else {
            if (typeof (frmData) == 'string') {
                $("#" + frmData).attr("action", url);
                $("#" + frmData).submit();
            } else {
                var frmHtml = '';
                frmHtml += '<form action="' + url + '" id="tempForm" method="post">';
                $.each(frmData, function (i, v) {
                    frmHtml += '<input type="hidden" name="' + i + '" value="' + v + '" >';
                });
                frmHtml += '</form>';
                $('body').append(frmHtml);
                $("#tempForm").submit();
            }
        }
    },
    /***************************************************************************
     * @ description : 공백 객체 체크
     * @ param : obj : 체크할 대상
     * @ usage : common.isEmpty({});
     **************************************************************************/

    isEmpty: function (obj) {
        if (obj === null || obj === undefined || obj.trim == '') {
            return true
        } else if (obj instanceof Array) {
            return obj.length === 0
        } else {
            return false
        }
    },
    comfirmFun: function (obj) {
        $("#comfirmFun").attr("onclick", obj);
    }
}