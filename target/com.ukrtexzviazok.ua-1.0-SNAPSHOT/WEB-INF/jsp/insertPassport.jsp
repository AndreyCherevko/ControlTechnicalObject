<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 04.04.15
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Паспорт установки катодного захисту</title>
</head>
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
<body>
<h1>Основні технічні характеристики установки катодного захисту</h1>
<form:form commandName="passportDto" action="/insertPassport" method="post" acceptCharset="UTF-8">
<table>
    <thead>
        <tr>
            <th>Обрати ОО</th>
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
        <tbody>
        <c:forEach var="katodnuiZah" items="${listKatodnuiZah}">
            <tr>
                <td><form:radiobutton  path="katod" value="${katodnuiZah.id}" /></td>
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
    <h1>Анодне заземлення</h1>
    <table>
        <thead>
        <tr>
            <th>Обрати ОО</th>
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
        <tbody>
        <c:forEach var="anodneZazemlennia" items="${listAnodneZazemlennia}">
            <tr>
                <td><form:radiobutton  path="anod" value="${anodneZazemlennia.id}"/></td>
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
    <h1>Створення паспорту установки катодного захисту</h1>
    <table>
    <thead>
    <tr>
        <th>Назва компанії</th>
        <th>Назва філії</th>
        <th>Назва підрозділу</th>
        <th>Назва газопроводу</th>
        <th>Місце розташування</th>
        <th>Місто</th>
    </tr>
    </thead>
    <tbody>
    <tr>
            <td> <form:select path="companyName" type="text" size="5">
                    <form:options items="${listCompany}"/>
                </form:select>
            </td>
            <td> <form:select path="filialName" type="text" size="5">
                <form:options items="${listFilii}"/>
                    </form:select>
            </td>
            <td> <form:input path="pidrozdilName" type="text" size="5"/></td>

            <td> <form:select path="gazoprovidName" type="text" size="5">
                    <c:forEach var="gazName" items="${listGazName}">
                        <form:option value="${gazName.name}"/>
                    </c:forEach>
                    </form:select>
            </td>

            <td> <form:input path="kmGazoprovid" type="text" size="3"/></td>
            <td> <form:input path="misto" type="text" size="3"/></td>
    </tr>
    </tbody>
    <tbody>
</table>
<input type="submit" value="Додати"/>
</form:form>
</body>
</html>
