var boardList = {
    pageNo : 1,
    init : function() {
        boardList.bind();
        boardList.selectBoardList();
    },
    bind : function() {
    },
    selectBoardList(pageNo) {
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
    drawBoardList(dat) {
        var html = '';
        $.each(dat.boardList, function(i, v){
            html += '<tr>';
            html += '<td>'+v.boardNo+'</td>';
            html += '   <td onclick="boardList.goBoardDetail(\''+v.boardNo+'\')">'+v.boardType+'</td>';
            html += '   <td>'+v.title+'</td>';
            html += '   <td>'+v.contents+'</td>';
            html += '   <td>'+v.userId+'</td>';
            html += '</tr>';
        });
        $("#tbody_boardList").html(html);
        paging.drawPage($("#nav_page"), 'boardList.selectBoardList', boardList.pageNo, dat.boardCnt);

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