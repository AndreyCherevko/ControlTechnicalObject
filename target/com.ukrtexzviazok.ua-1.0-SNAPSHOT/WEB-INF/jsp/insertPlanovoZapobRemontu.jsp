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
    <title>Планово-запобіжні ремонти</title>
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
<form:form commandName="PlanovoZapobizhniRemontuDto" action="/insertPlanovoZapobizhniRemontu" method="post" acceptCharset="UTF-8">
    <table>
        <h1>Планово-запобіжні ремонти</h1>

        <thead>
        <tr>
            <th colspan="2">Дата ремонту</th>
            <th rowspan="2">Вид ремонту</th>
            <th rowspan="2">Опис проведених робіт</th>
            <th colspan="2">Установлений режим УКЗ після ремонту</th>
            <th colspan="2">Потенціал труби у точці дренажу</th>
            <th colspan="2">Електроопір заземлення, Ом</th>
        </tr>
        <tr>
           <th>Початок</th>
           <th>Кінець</th>
           <th>струм, А</th>
           <th>напруга, В</th>
           <th>при увімкнутій УКЗ, В</th>
           <th>при вимкнутій УКЗ, В</th>
           <th>анодного</th>
           <th>захисного</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><form:input path="pochatkovaDataRemonty" type="text" size="5"/></td>
            <td><form:input path="kinzhevaDataRemonty" type="text" size="5"/></td>
            <td>
            <form:select path="type" type="text" size="5">
                <form:option value="поточний"/>
                <form:option value="капітальний"/>
            </form:select>
            </td>
            <td><form:input path="opusRobit" type="text" size="5"/></td>
            <td><form:input path="vstanRezhimUkz" type="text" size="5"/></td>
            <td><form:input path="vstanRezhimUkzU" type="text" size="5"/></td>
            <td><form:input path="vvimknP" type="text" size="5"/></td>
            <td><form:input path="vvumkP" type="text" size="5"/></td>
            <td><form:input path="anodR" type="text" size="5"/></td>
            <td><form:input path="zahR" type="text" size="5"/></td>
        </tr>
        </tbody>
    </table>
    <input type="submit" value="Додати"/>
</form:form>
</body>
</html>
