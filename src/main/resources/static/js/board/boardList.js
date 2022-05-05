var boardList = {
    init : function() {
        boardList.bind();
        boardList.selectBoardList();
    },
    bind : function() {
    },
    selectBoardList() {
        $.ajax({
            url : "/board/selectBoardList",
            type: "post",
            dataType: 'json',
            data : {},
            success : function(res) {
                console.log('boardTest');
                console.log(res);
                boardList.drawBoardList(res.boardList);
            }
        });
    },
    drawBoardList(dat) {
        var html = '';
        $.each(dat, function(i, v){
            html += '<tr>';
            html += '   <td>'+v.BOARD_TYPE+'</td>';
            html += '   <td>'+v.TITLE+'</td>';
            html += '   <td>'+v.CONTENTS+'</td>';
            html += '   <td>'+v.USER_ID+'</td>';
            html += '</tr>';
        });
        $("#tbody_boardList").html(html);
    }
}

$(function() {
    boardList.init();
});