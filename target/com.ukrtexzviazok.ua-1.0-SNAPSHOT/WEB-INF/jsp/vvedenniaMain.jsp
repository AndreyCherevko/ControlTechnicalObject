<%@ page import="java.awt.*" %>
<%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 03.04.15
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
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
    </style>
</head>
<body>
<h1>Основні технічні характеристики установки катодного захисту</h1>
<table>
    <thead>
    <tr>
        <th>Дата монтажу</th>
        <th>Тип перетворювача</th>
        <th>Виробник</th>
        <th>Дата випуску</th>
        <th>Заводський номер</th>
        <th>Тип захисного покриття</th>
        <th>Потужність,кВт</th>
        <th>Вих.напруга,В</th>
        <th>Вих.стур,А</th>
        <th>Наявність телеконтролю</th>
        <th>Наявність пристроїв спільного захисту</th>
        <th>Тип електроліч</th>
        <th>Номер електроліч</th>
        <th>Опір захисного електрозаз,Ом</th>
        <th>Примітки</th>
    </tr>
    </thead>
    <tfoot>
    <tr>
        <form:form modelAttribute="KatodZahDto" action="/vvedenniaKat" method="post" acceptCharset="UTF-8">
        <td> <form:input path="dateMontazhu" type="text" size="5"/></td>
        <td> <form:input path="typePeretvoriuvacha" type="text" size="5" /></td>
        <td> <form:input path="vurobnuk" type="text" size="5"/></td>
        <td> <form:input path="dataVupysky" type="text" size="5"/></td>
        <td> <form:input path="numberZavodskii" type="text" size="3"/></td>
        <td> <form:select path="typePokruttia" type="text" size="5">
                <form:option value="Залізний блок-бокс">Залізний блок-бокс</form:option>
                <form:option value="Залізобетонний блок-бокс">Залізобетонний блок-бокс</form:option>
                <form:option value="Труба сталева">Труба сталева</form:option>
            </form:select>
        </td>
        <td> <form:input path="P" type="text" size="3"/></td>
        <td> <form:input path="U" type="text" size="3"/></td>
        <td> <form:input path="A" type="text" size="3"/></td>
        <td> <form:checkboxes path="telecontrol"  items="${telecontdolCheck}"/></td>
        <td> <form:input path="sposibZahusty" type="text" size="3"/></td>
        <td> <form:input path="typeLichilnuka" type="text" size="3"/></td>
        <td><form:input path="kilkLichilnika" type="text" size="5"/></td>
        <td> <form:input path="R" type="text" size="5"/></td>
        <td> <form:textarea path="prumitka" rows="2" cols="10"/></td>
    </tr>
    </tfoot>
    <tbody>
    <c:forEach var="katodnuiZah" items="${listKatodnuiZah}">
        <tr>
            <td>${katodnuiZah.dateMontazhu}</td>
            <td>${katodnuiZah.typePeretvoriuvacha}</td>
            <td>${katodnuiZah.vurobnuk}</td>
            <td>${katodnuiZah.dataVupysky}</td>
            <td>${katodnuiZah.numberZavodskii}</td>
            <td>${katodnuiZah.typePokruttia}</td>
            <td>${katodnuiZah.p}</td>
            <td>${katodnuiZah.u}</td>
            <td>${katodnuiZah.a}</td>
            <td>${katodnuiZah.telecontrol}</td>
            <td>${katodnuiZah.sposibZahusty}</td>
            <td>${katodnuiZah.typeLichilnuka}</td>
            <td>${katodnuiZah.kilkLichilnika}</td>
            <td>${katodnuiZah.r}</td>
            <td>${katodnuiZah.prumitka}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<input type="submit" value="Додати"/>
</form:form>

<h1>Анодне заземлення</h1>
<table>
    <thead>
    <tr>
        <th>Дата монтажу</th>
        <th>Тип електродів АЗ</th>
        <th>Виробник</th>
        <th>Конструкція АЗ</th>
        <th>Кількість електродів,шт</th>
        <th>Глибина залягання,м</th>
        <th>Відстань до газопроводу,м</th>
        <th>Відстань до УКЗ,м</th>
        <th>Довжина анодного поля,м</th>
        <th>Опір розтіканню АЗ, Ом</th>
        <th>Питомий опір, грунту, Ом м</th>
        <th>Будівельна організація</th>
        <th>Примітки</th>
    </tr>
    </thead>
    <tfoot>
    <tr>
    <form:form modelAttribute="anodneZazemlenniaDto" action="/vvedenniaAnod" method="post" acceptCharset="UTF-8">
        <td> <form:input path="dataMontazhu" type="text" size="5"/></td>
        <td> <form:input path="typeElectrodiv" type="text" size="5" /></td>
        <td> <form:input path="vurobnuk" type="text" size="5"/></td>
        <td> <form:input path="kostrnAzs" type="text" size="5"/></td>
        <td> <form:input path="ktiElectrodiv" type="text" size="3"/></td>
        <td> <form:input path="glibinaZaliaginnia" type="text" size="3"/></td>
        <td> <form:input path="vidstanDoGazoprovody" type="text" size="3"/></td>
        <td> <form:input path="vidstanDoUkz" type="text" size="3"/></td>
        <td> <form:input path="dovzhunaAnodnogoPolia" type="text" size="3"/></td>
        <td> <form:input path="opirRoztikannia" type="text" size="3"/></td>
        <td> <form:input path="putomuiOpir" type="text" size="3"/></td>
        <td> <form:input path="budivelnaOrganizazhia" type="text" size="5"/></td>
        <td> <form:textarea path="prumitku" rows="2" cols="10"/></td>
    </tr>
    </tfoot>
    <tbody>
    <c:forEach var="anodneZazemlennia" items="${listAnodneZazemlennia}">
    <tr>
        <td>${anodneZazemlennia.dataMontazhu}</td>
        <td>${anodneZazemlennia.typeElectrodiv}</td>
        <td>${anodneZazemlennia.vurobnuk}</td>
        <td>${anodneZazemlennia.kostrnAzs}</td>
        <td>${anodneZazemlennia.ktiElectrodiv}</td>
        <td>${anodneZazemlennia.glibinaZaliaginnia}</td>
        <td>${anodneZazemlennia.vidstanDoGazoprovody}</td>
        <td>${anodneZazemlennia.vidstanDoUkz}</td>
        <td>${anodneZazemlennia.dovzhunaAnodnogoPolia}</td>
        <td>${anodneZazemlennia.opirRoztikannia}</td>
        <td>${anodneZazemlennia.putomuiOpir}</td>
        <td>${anodneZazemlennia.budivelnaOrganizazhia}</td>
        <td>${anodneZazemlennia.prumitku}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<input type="submit" value="Додати"/>
</form:form>
</body>
</html>
