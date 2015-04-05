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
    <title>Експлуатаційний контроль</title>
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
<form:form commandName="EksKontrolDto" action="/insertEksKontrol" method="post" acceptCharset="UTF-8">
    <table>
        <h1>Експлуатаційний контроль</h1>

        <thead>
        <tr>
            <th rowspan="3">Дата контролю</th>
            <th colspan="4">На початку контролю</th>
            <th colspan="4">Наприкінці контролю</th>
            <th rowspan="3">Покази електролічильника, кВт/год</th>
            <th rowspan="3">Покази лічильника напрацьованого часу, год</th>
            <th rowspan="3">Час простою УКЗ від попереднього контролю, год</th>
            <th rowspan="3">Примітки</th>
        </tr>
        <tr>
            <th colspan="2">Режим роботи</th>
            <th colspan="2">Потенціал труби в точці дренажу</th>
            <th colspan="2">Встановлено режим роботи</th>
            <th colspan="2">Потенціал труби в точці дренажу</th>
        </tr>
        <tr>

            <th>струм, А</th>
            <th>напруга, В</th>
            <th>при увімкнутій УКЗ, В</th>
            <th>при вимкнутій УКЗ, В</th>
            <th>струм, А</th>
            <th>напруга, В</th>
            <th>при увімкнутій УКЗ, В</th>
            <th>при вимкнутій УКЗ, В</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><form:input path="dataKontrol" type="text" size="5"/></td>
            <td><form:input path="vremiaKontrol" type="text" size="5"/></td>
            <td><form:input path="pochankovaRobotaStrymy" type="text" size="5"/></td>
            <td><form:input path="pochankovaRobotaNaprygu" type="text" size="5"/></td>
            <td><form:input path="pochankoviiPotenzhvklvkl" type="text" size="5"/></td>
            <td><form:input path="pochankoviiPotenzhvklvukl" type="text" size="5"/></td>
            <td><form:input path="vstanovlenuiStrymRobotu" type="text" size="5"/></td>
            <td><form:input path="vstanobleniiRobotaNuprygu" type="text" size="5"/></td>
            <td><form:input path="vstanovlenuiiPotenzhvkl" type="text" size="5"/></td>
            <td><form:input path="vstanovlenuiiPotenzhvukl" type="text" size="5"/></td>
            <td><form:input path="p" type="text" size="5"/></td>
            <td><form:input path="pokazhLIchilnukaChasy" type="text" size="5"/></td>
            <td><form:input path="chasProst" type="text" size="5"/></td>
            <td><form:input path="prumitku" type="text" size="5"/></td>
        </tr>
        </tbody>
    </table>
    <input type="submit" value="Додати"/>
</form:form>
</body>
</html>
