<%--
  Created by IntelliJ IDEA.
  User: jaehoonyoun
  Date: 2022/04/30
  Time: 0:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <tiles:insertAttribute name="include"/>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js<tiles:getAsString name="includeJs" />.js"></script>
</head>
<body>
<input type="text" id="layout_username" value="<sec:authentication property="principal"/>">

    <tiles:insertAttribute name="header"/>
    <div class="container-fluid">
        <div class="row">
            <tiles:insertAttribute name="side"/>
            <tiles:insertAttribute name="body"/>
        </div>
    </div>
<%--    <tiles:insertAttribute name="footer"/>--%>
</body>
</html>
