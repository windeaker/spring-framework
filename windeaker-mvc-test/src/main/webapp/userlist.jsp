<%--
  Created by IntelliJ IDEA.
  User: windeaker
  Date: 2022/7/3
  Time: 1:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>userlist</title>
</head>
<body>
<c:forEach items="${users}" var="user">
    <c:out value="${user.username}"/>
    <c:out value="${user.age}"/>
    <br/>
</c:forEach>
</body>
</html>
