<%--
  Created by IntelliJ IDEA.
  User: jaehoonyoun
  Date: 2022/05/05
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-sm-offset-3 col-md-8 order-md-1">
    <h4 class="mb-3">게시판 상세 보기</h4>
    <form id="frm_board">
        <input type="hidden" id="boardNo" name="boardNo" />
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="boardType">타입</label>
                <input type="text" class="form-control" id="boardType" name="boardType">
            </div>
            <div class="col-md-6 mb-3">
                <label for="title">제목</label>
                <input type="text" class="form-control" id="title" name="title">
            </div>
        </div>
        <hr class="mb-4">
        <div class="row">
            <div class="col-md-12 mb-3">
                <label for="contents">내용</label>
                <textarea class="form-control" id="contents" name="contents" rows="3"></textarea>
            </div>
        </div>
    </form>

    <hr class="mb-4">
    <div class="pull-right" style="display: block;">
        <button id="btn_reg" type="button" class="btn btn-sm btn-primary" style="display: none;">등록</button>
        <button id="btn_mod" type="button" class="btn btn-sm btn-success" style="display: none;">저장</button>
        <button id="btn_del" type="button" class="btn btn-sm btn-danger" >삭제</button>
        <button id="btn_boardList" type="button" class="btn btn-sm btn-info" >목록</button>
    </div>
</div>
