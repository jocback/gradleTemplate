var boardList = {
    pageNo : 1,
    init : function() {
        boardList.bind();
        boardList.selectBoardList();
    },
    bind : function() {
        $("#btn_reg").on('click', function(){
           common.goPage("/board/boardDetail");
        });
    },
    selectBoardList: function(pageNo) {
        boardList.pageNo = pageNo;
        var param = {
            pageNo : boardList.pageNo
        }
        $.ajax({
            url : "/board/selectBoardList",
            type: "post",
            dataType: 'json',
            data : param,
            success : function(res) {
                console.log('boardTest');
                console.log(res);
                boardList.drawBoardList(res.boardMap);
            }
        });
    },
    drawBoardList: function(dat) {
        var html = '';
        $.each(dat.boardList, function(i, v){
            html += '<tr onclick="boardList.goBoardDetail(\''+v.boardNo+'\')">';
            html += '<td>'+v.boardNo+'</td>';
            html += '   <td>'+v.boardType+'</td>';
            html += '   <td>'+v.title+'</td>';
            html += '   <td>'+v.contents+'</td>';
            html += '   <td>'+v.userId+'</td>';
            html += '</tr>';
        });
        $("#tbody_boardList").html(html);
        paging.drawPage($("#nav_page"), 'boardList.selectBoardList', boardList.pageNo, dat.boardCnt);

    },
    // 게시판 상세보기
    goBoardDetail: function(boardNo) {
        var param = {
            boardNo : boardNo
        }
        common.goPage('/board/boardDetail', param);
    }
}

$(function() {
    boardList.init();
});