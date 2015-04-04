<%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 23.03.15
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>CaxapOK</title>
</head>
<body>
<form:form modelAttribute="loginDto" action="/login" method="post">
Логін: <form:input path="login" type="text"/>
Пароль:  <form:input path="pass" type="password"/>
<input type="submit" value="Вхід"/>
</form:form>
</body>
</html>
