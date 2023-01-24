<%--
  Created by IntelliJ IDEA.
  User: jaehoonyoun
  Date: 2022/05/05
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-md-10 col-md-offset-2 main">
    <h1 class="page-header">게시판</h1>

    <div class="table-responsive col-md-6" style="overflow: auto;">
        <table class="table table-striped table-bordered dataTable" style="margin-top:37.5px;">
            <thead>
            <tr>
                <th>1레벨</th>
                <th>2레벨</th>
                <th>설명</th>
                <th>시작일</th>
                <th>종료일</th>
                <th>진척율</th>
            </tr>
            </thead>
            <tbody id="tbody_pmsList">
            </tbody>
        </table>
		<nav id="nav_page">
		</nav>

		<div class="pull-right">
			<button type="button" class="btn btn-sm btn-primary" id="btn_reg">등록</button>
		</div>
	</div>

	<div class="table-responsive col-md-6" style="overflow: auto;">
		<table class="table table-striped table-bordered dataTable" id="table_rate">
			<thead>
				<tr>
					<th  colspan="25">12월</th>
				</tr>
				<tr>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
					<th>31</th>
				</tr>
			</thead>
			<tbody >
				<td style="background-color:gray;">&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tbody>
		</table>
		<nav id="nav_page">
		</nav>
	</div>

    <form id="frm_test" action="/board/boardList">
        <input type="hidden" name="test1" value="t1"/>
        <input type="hidden" name="test2" value="t2"/>
        <input type="hidden" name="test3" value="t3"/>
        <input type="hidden" name="test3" value="t4"/>
    </form>

</div>