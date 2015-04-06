<%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 05.04.15
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title> Перегляд паспортів</title>
    <style>
        table {
            white-space: normal border-collapse : collapse;
            font: 14px verdana;
        }

        table, td, th {
            border: 1px solid black;
        }

        th {
            height: 80px;
            width: 75px;
            text-align: center;
            background-color: green;
            color: white;
        }

        td {
            width: 75px;
            text-align: left;
        }

        .error {
            color: red;
        }
    </style>
</head>
<body>
<h1>Анодне заземлення</h1>
<form:form method="post" action="/showPassport" commandName="peregliadDto" >
<table>
    <thead>
    <tr>
        <th>Обрати паспорт</th>
        <th>Назва підрозділу</th>
        <th>Тип, назва установки</th>
        <th>км підключення</th>
        <th>№ паспорту</th>
        <th>Дата створення</th>
        <th>Автор</th>
    </thead>
    <tbody>
    <c:forEach var="passport" items="${passports}">
        <tr>
            <td><form:radiobutton  path="id" value="${passport.id}"/></td>
            <td><c:out value="${passport.pidrozdilName}"/></td>
            <td><c:out value="${passport.gazoprovidName.name}"/></td>
            <td><c:out value="${passport.kmGazoprovid}"/></td>
            <td><c:out value="${passport.id}"/></td>
            <td><c:out value="${passport.dataStvorennia}"/></td>
            <td><c:out value="${passport.author.pib}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
    <input type="submit" value="Відкрити звіт"/>
</form:form>
<c:if test="${vvedennia}">
    <input type=button onClick="location.href='/indexVved'" value='Введення технічних об`єктів'>
</c:if>
<c:if test="${zvitnist}">
    <input type=button onClick="location.href='/indexZvit'" value='Звітність'>
</c:if>
<input type=button onClick="location.href='/indexPeregliad'" value='Перегляд паспортів'>
</body>
</html>
