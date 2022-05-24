<%--
  Created by IntelliJ IDEA.
  User: jaehoonyoun
  Date: 2022/05/05
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/signin.css"/>
</head>
<div class="container">
    <div class="input-form-backgroud row">
        <div class="input-form col-md-12 mx-auto">
            <h4 class="mb-3">회원가입</h4>
            <form id="frm_register" class="validation-form" novalidate>
<%--                <div class="row">--%>
<%--                    <div class="col-md-6 mb-3">--%>
<%--                        <label for="name">이름</label>--%>
<%--                        <input type="text" class="form-control" id="name" name="userName" placeholder="" value="" required>--%>
<%--                    </div>--%>
<%--                </div>--%>
                <div class="mb-3">
                    <label for="userId">아이디</label>
                    <input type="text" class="form-control" id="userId" name="userId">
                </div>
                <div class="mb-3">
                    <label for="userPw">비밀번호</label>
                    <input type="text" class="form-control" id="userPw" name="userPw">
                </div>
                <div class="mb-3">
                    <label for="userName">이름</label>
                    <input type="text" class="form-control" id="userName" name="userName">
                </div>
                <div class="mb-3">
                    <label for="phone">연락처</label>
                    <input type="text" class="form-control" id="phone" name="phone">
                </div>
                <div class="mb-3">
                    <label for="email">이메일</label>
                    <input type="text" class="form-control" id="email" name="email">
                </div>

<%--                <div class="row">--%>
<%--                    <div class="col-md-4 mb-3">--%>
<%--                        <label for="root">가입 경로</label>--%>
<%--                        <select class="form-control d-block w-100" id="root">--%>
<%--                            <option value=""></option>--%>
<%--                            <option>검색</option>--%>
<%--                            <option>카페</option>--%>
<%--                        </select>--%>
<%--                    </div>--%>
<%--                    <div class="col-md-4 mb-3">--%>
<%--                        <label for="code">추천인 코드</label>--%>
<%--                        <input type="text" class="form-control" id="code" placeholder="" required>--%>
<%--                    </div>--%>
<%--                </div>--%>
                <hr class="mb-4">
<%--                <div class="custom-control custom-checkbox">--%>
<%--                    <input type="checkbox" class="custom-control-input" id="aggrement" required>--%>
<%--                    <label class="custom-control-label" for="aggrement">개인정보 수집 및 이용에 동의합니다.</label>--%>
<%--                </div>--%>
                <button class="btn btn-primary btn-lg btn-block" type="button" id="btn_signUp">가입 완료</button>
            </form>
        </div>
    </div>
<%--    <footer class="my-3 text-center text-small">--%>
<%--        <p class="mb-1">&copy; 2021 YD</p>--%>
<%--    </footer>--%>
</div>
</html>
