var boardList = {
    init : function() {
        boardList.bind();
        boardList.selectBoardList();
    },
    bind : function() {
    },
    selectBoardList(pageNo) {
        var param = {
            pageNo : pageNo
        }
        $.ajax({
            url : "/board/selectBoardList",
            type: "post",
            dataType: 'json',
            data : {},
            success : function(res) {
                console.log('boardTest');
                console.log(res);
                boardList.drawBoardList(res.boardMap);
            }
        });
    },
    drawBoardList(dat) {
        var html = '';
        $.each(dat.boardList, function(i, v){
            html += '<tr>';
            html += '   <td onclick="boardList.goBoardDetail(\''+v.boardNo+'\')">'+v.boardType+'</td>';
            html += '   <td>'+v.title+'</td>';
            html += '   <td>'+v.contents+'</td>';
            html += '   <td>'+v.userId+'</td>';
            html += '</tr>';
        });
        $("#tbody_boardList").html(html);
        paging.drawPage($("#nav_page"), 'boardList.selectBoardList', 1, dat.boardCnt);

    },
    // 게시판 상세보기
    goBoardDetail(boardNo) {
        var param = {
            boardNo : boardNo
        }
        common.goPage('/board/boardDetail', param);
    }
}

$(function() {
    boardList.init();
});