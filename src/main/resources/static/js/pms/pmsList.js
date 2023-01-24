var pmsList = {
    pageNo : 1,
    init : function() {
        pmsList.bind();
        pmsList.selectPmsList();
    },
    bind : function() {
        $("#btn_reg").on('click', function(){
           common.goPage("/board/boardDetail");
        });
    },
    selectPmsList: function(pageNo) {
        pmsList.pageNo = pageNo;
        var param = {
            pageNo : pmsList.pageNo
        }
        $.ajax({
            url : "/pms/selectPmsList",
            type: "post",
            dataType: 'json',
            data : param,
            success : function(res) {
                console.log(res);
                pmsList.drawPmsList(res.pmsMap);
            }
        });
    },
    drawPmsList: function(dat) {
		var html = '';
		$.each(dat.pmsList, function (i, v) {
			html += '<tr onclick="pmsList.goBoardDetail(\'' + v.boardNo + '\')">';
			html += '<td>' + v.depth1 + '</td>';
			html += '<td>' + v.depth2 + '</td>';
			html += '<td>' + v.pmsDesc + '</td>';
			html += '<td>' + v.strtDate + '</td>';
			html += '<td>' + v.endDate + '</td>';
			html += '<td>' + v.procRate + '</td>';
			html += '</tr>';
		});
		$("#tbody_pmsList").html(html);
		paging.drawPage($("#nav_page"), 'pmsList.selectPmsList', pmsList.pageNo, dat.boardCnt);

		// 일정 표시하기
		var rateHtml = '';
		var rateTh1 = '';
		var rateTh2 = '';
		var rateTbody = '';
		var colSize = {};

		var minDate = dat.periodMap.minDate;
		var maxDate = dat.periodMap.maxDate;
		var dayCnt = dateUtil.getDayBetween(minDate, maxDate);

		// rateTh1 = '<thead>';
		rateTh1 += '<tr>';
		for (var i = 0; i <= dayCnt; i++) {
			var dt = dateUtil.addDate(minDate, 'dd', i);
			if (colSize[dt.substring(0, 6)] == undefined) {
				colSize[dt.substring(0, 6)] = 1;
			} else {
				colSize[dt.substring(0, 6)] = colSize[dt.substring(0, 6)] + 1;
			}
			rateTh1 += '<th>' + dt.substring(6, 8) + '</th>';
		}
		rateTh1 += '</tr>';
		// rateTh1 += '</thead>';

		rateTh2 += '<tr>';
		$.each(colSize, function (i, v) {
			rateTh2 += '<th colspan="'+v+'" style="text-align: center;">'+i.substring(4,6)+'월</th>';
		});
		rateTh2 += '</tr>';

		rateTbody = '<tbody>';
		$.each(dat.pmsList, function(i, v){
			rateTbody += '<tr>';
			for(var i=0; i<=dayCnt; i++) {
				var dt = dateUtil.addDate(minDate, 'dd', i);
				if(v.strtDate<=dt && v.endDate>=dt) {
					rateTbody += '<td style="background-color:gray;">&nbsp;</td>';
				} else {
					rateTbody += '<td>&nbsp;</td>';
				}

			}
			rateTbody += '</tr>';
		});
		rateTbody += '</tbody>';

		$("#table_rate").html('<thead>'+rateTh2+rateTh1+'</thead>');
		$("#table_rate").append(rateTbody);



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
    pmsList.init();
});