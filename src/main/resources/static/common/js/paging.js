var paging = {
    drawPage: function(obj, funcName, currentPage, totalCnt, perPage ) {
        // var totalCnt;		// 총데이터수
        // var perPage;	// 한페이지 글수
        var pageCount = 10;		// 페이징에 노출되는 페이지 수
        // var currentPage;	// 현재 페이지
        var totalPage;
        let pageGroup;
        let last;
        let first;
        let next;
        let prev;

        if(common.isEmpty(perPage)) {
            perPage = 10;
        }
        // if(common.isEmpty(pageCount)) {
        //     pageCount = 10;
        // }
        if(common.isEmpty(currentPage)) {
            currentPage = 1;
        }


        totalPage = Math.ceil(totalCnt / perPage);		// 11/10 = 2

        if (totalPage < pageCount) {
            pageCount = totalPage;
        }

        pageGroup = Math.ceil(currentPage / pageCount);		// 11/10 = 2
        last = pageGroup * pageCount;						// 2*10 = 20


        if (last > totalPage) {
            last = totalPage;
        }

        first = last - (pageCount - 1);						// 20-(10-1) = 11
        next = last + 1;										// 21
        prev = first - 1;										// 10

        pageHtml = '';

        pageHtml += '<ul class="pagination">';
        pageHtml += '';
        pageHtml += '';


        if (prev > 0) {
            // pageHtml += "<li><a href='#' id='prev'> 이전 </a></li>";
            pageHtml += "prev | ";
            pageHtml += '<li>                                           ';
            pageHtml += '    <a href="javascript:'+funcName+'('+i+')" aria-label="Previous">         ';
            pageHtml += '        <span aria-hidden="true">&laquo;</span>';
            pageHtml += '    </a>                                       ';
            pageHtml += '</li>                                          ';
            pageHtml += '';
        }

        for (var i = first; i <= last; i++) {
            if (currentPage == i) {
                // pageHtml += "<li class='on'><a href='#' id='" + i + "'>" + i + "</a></li>";
                pageHtml += '<li class="active"><a href="javascript:'+funcName+'('+i+')">'+i+'</a></li>';
            } else {
                pageHtml += '<li><a href="javascript:'+funcName+'('+i+')">'+i+'</a></li>';
            }
        }

        if (last < totalPage) {
            pageHtml += '<li><a href="javascript:'+funcName+'('+i+')"> 다음 </a></li>';
        }

        pageHtml += '</ul>';

        if(typeof(obj)=='string'){
            $("#"+obj).html(pageHtml);
        }else{
            $(obj).html(pageHtml);
        }
    }
}