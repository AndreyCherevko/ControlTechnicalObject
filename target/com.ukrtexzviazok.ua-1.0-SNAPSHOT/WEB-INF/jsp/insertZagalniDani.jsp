<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 05.04.15
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Загальні дані</title>
    <style>
        table {
            white-space: normal
        border-collapse: collapse;
            font:14px verdana;
        }
        table, td, th {
            border: 1px solid black;
        }

        th {
            height: 80px;
            width:75px;
            text-align: center;
            background-color: green;
            color: white;
        }
        td {
            width:75px;
            text-align: left;
        }
        .error {
            color: red;
        }
    </style>
</head>
<body>
<form:form commandName="zagalniDaniDto" action="/insertZagalniDani" method="post" acceptCharset="UTF-8">
<h1>Загальні дані</h1>
<table>
       <thead>
        <tr>
            <th>Спосіб захисту</th>
            <th>Географічна прив’язка</th>
            <th>Дата введення в експлуатацію</th>
            <th>Проектна організація</th>
            <th>Будівельно-монтажна організація</th>
            <th>Землекористувач</th>
        </tr>
        </thead>
        <tbody>
    <tr>
    <td><form:select path="protectType" type="text" size="5">
    <form:option value="спільний нерегульований">спільний нерегульований</form:option>
    <form:option value="спільний через ПКЛ (БЗК)">спільний через ПКЛ (БЗК)</form:option>
    <form:option value="нарізний">нарізний</form:option>
        </form:select>
    </td>
    <td><form:input path="geografichnaPriviazhka" type="text" size="5"/></td>
    <td><form:input path="startEcspl" type="text" size="5"/></td>
    <td><form:input path="projectOrganization" type="text" size="5"/></td>
    <td><form:input path="bmOrganization" type="text" size="5"/></td>
    <td><form:input path="zemlekorustyvach" type="text" size="7"/></td>
    </tr>
        </tbody>
    </table>
    <input type="submit" value="Додати"/>
</form:form>
</body>
</html>