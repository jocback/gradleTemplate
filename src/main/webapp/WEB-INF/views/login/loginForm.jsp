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
    <h2 class="form-signin-heading">Gradle Sign in</h2>
    <form id="frm_login" method="post">
    <label for="userId" class="sr-only">Email address</label>
        <input type="email" id="userId" name="userId" class="form-control" placeholder="Email address">
        <label for="userPw" class="sr-only">Password</label>
        <input type="password" id="userPw" name="userPw" class="form-control" placeholder="Password">
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> ID 저장${test}
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="button" id="btn_signin">Sign in</button>
    </form>
</div>
</html>
