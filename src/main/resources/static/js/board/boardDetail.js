var boardDetail = {
    boardNo : jsonParam.boardNo,
    init : function() {
        boardDetail.bind();
        if(!common.isEmpty(boardDetail.boardNo)){
            boardDetail.selectBoardDetail(boardDetail.boardNo);
            $("#btn_mod").show();
            $("#boardNo").val(boardDetail.boardNo);
        }else {
            $("#btn_reg").show();
        }
    },
    bind : function() {
        // 등록
        $("#btn_reg").on('click', function(){
            boardDetail.regBoard();
        });
        // 수정
        $("#btn_mod").on('click', function(){
            boardDetail.modBoard();
        });
        // 삭제
        $("#btn_del").on('click', function(){
            boardDetail.delBoard();
        });
        // 목록
        $("#btn_boardList").on('click', function(){
        });
    },
    // 게시판 등록
    regBoard : function(){
        var param = $("#frm_board").serializeObject();
        $.ajax({
            url: "/board/insertBoard",
            type: 'post',
            dataType: 'json',
            data: param,
            success: function(res) {
                alert("등록되었습니다.")
                common.goPage("/board/boardList");
            }
        });
    },
    // 게시판 수정
    modBoard : function(){
        var param = $("#frm_board").serializeObject();
        $.ajax({
            url: "/board/updateBoard",
            type: 'post',
            dataType: 'json',
            data: param,
            success: function(res) {
                alert("수정되었습니다.")
                common.goPage("/board/boardList");
            }
        });
    },
    // 게시판 삭제
    delBoard : function(){
        var param = $("#frm_board").serializeObject();
        $.ajax({
            url: "/board/deleteBoard",
            type: 'post',
            dataType: 'json',
            data: param,
            success: function(res) {
                alert("삭제되었습니다.")
                common.goPage("/board/boardList");
            }
        });
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