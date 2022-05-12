<%--
  Created by IntelliJ IDEA.
  User: jaehoonyoun
  Date: 2022/05/05
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-sm-offset-3 col-sm-9 col-md-10 col-md-offset-2 main">
    <h1 class="page-header">Dashboard</h1>

    <div class="table-responsive">
        <table class="table table-bordered dataTable">
            <thead>
            <tr>
                <th>No</th>
                <th>타입</th>
                <th>제목</th>
                <th>내용</th>
                <th>작성자</th>
            </tr>
            </thead>
            <tbody id="tbody_boardList">
            </tbody>
        </table>
    </div>

    <nav id="nav_page">
    </nav>

    <div class="pull-right">
        <button type="button" class="btn btn-sm btn-primary">등록</button>
    </div>

    <form id="frm_test" action="/board/boardList">
        <input type="hidden" name="test1" value="t1"/>
        <input type="hidden" name="test2" value="t2"/>
        <input type="hidden" name="test3" value="t3"/>
        <input type="hidden" name="test3" value="t4"/>
    </form>

</div>