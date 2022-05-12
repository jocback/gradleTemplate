<%--
  Created by IntelliJ IDEA.
  User: jaehoonyoun
  Date: 2022/04/30
  Time: 0:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/dashboard.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/form-validation.css"/>

<script type="text/javascript" src="${pageContext.request.contextPath}/jquery/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery/js/jquery.serializeObject.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/propper.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/holder.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/common/js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/common/js/paging.js"></script>

<script type="text/javascript">
    var jsonParam = JSON.parse('${jsonStr}');
</script>