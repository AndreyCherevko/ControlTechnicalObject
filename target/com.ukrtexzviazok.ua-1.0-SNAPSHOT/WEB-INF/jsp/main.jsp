<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 04.04.15
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Формування звітності експлуатації обладнання</title>
</head>

<body>
    <c:if test="${vvedennia}">
        <input type=button onClick="location.href='/indexVved'" value='Введення технічних об`єктів'>
    </c:if>
    <c:if test="${zvitnist}">
        <input type=button onClick="location.href='/indexZvit'" value='Звітність'>
    </c:if>
</body>
</html>
