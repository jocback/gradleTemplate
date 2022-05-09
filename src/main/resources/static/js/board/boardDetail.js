var boardDetail = {
    boardNo : jsonParam.boardNo,
    init : function() {
        boardDetail.bind();
        if(!common.isEmpty(boardDetail.boardNo)){
            boardDetail.selectBoardDetail(boardDetail.boardNo);
        }
    },
    bind : function() {
    },
    selectBoardDetail : function(boardNo) {
        var param = {
            boardNo : boardNo
        }
        $.ajax({
            url : "/board/selectBoardDetail",
            type: "post",
            dataType: 'json',
            data : param,
            success : function(res) {
                console.log('boardTest');
                console.log(res);
                boardDetail.drawBoardDetail(res.boardMap);
            }
        });
    },
    drawBoardDetail : function(boardMap){
        $("#boardType").val(boardMap.BOARD_TYPE);
        $("#title").val(boardMap.TITLE);
        $("#contents").val(boardMap.CONTENTS);

    }
}

$(function() {
    boardDetail.init();
});