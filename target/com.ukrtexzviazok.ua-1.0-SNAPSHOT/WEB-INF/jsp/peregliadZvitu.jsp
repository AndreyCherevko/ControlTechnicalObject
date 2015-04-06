<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 05.04.15
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Паспорт № <c:out value="${passport.id} установки катодного захисту"/></title>
    <style>
        table, td, th {
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <h1>Паспорт № <c:out value="${passport.id} установки катодного захисту"/></h1>
    <h1>Газопровід <c:out value="${passport.gazoprovidName.name}"/> <c:out value="${passport.gazoprovidName.diametrGazoprovody}" /></h1>
    <h1>Місце розташуваня <c:out value="${passport.kmGazoprovid}"/> км</h1>


    <h2>Загальні дані</h2>
    <ol>
        <li>Найменування газопроводу: <c:out value="${passport.gazoprovidName.name}"/> <c:out value="${passport.gazoprovidName.diametrGazoprovody}"/> км</li>
        <li>Спосіб захисту: <c:out value="${zagalniDani.protectType}"/> </li>
        <li>Географічна прив’язка: <c:out value="${zagalniDani.geografichnaPriviazhka}"/></li>
        <li>Дата введення в експлуатацію: <c:out value="${zagalniDani.startEcspl}"/></li>
        <li>Проектна організація:<c:out value="${zagalniDani.projectOrganization}"/></li>
        <li>Будівельно-монтажна організація:<c:out value="${zagalniDani.bmOrganization}"/></li>
        <li>Землекористувач:<c:out value="${zagalniDani.zemlekorustyvach}"/></li>
    </ol>

    <h2>Основні технічні характеристики установки катодного захисту</h2>
    <h2>Катодний перетворювач</h2>
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

        <tbody>
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
        </tbody>
    </table>
    <h2>Анодне заземлення</h2>
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
        <tbody>
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
        </tbody>
    </table>
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
            <td><c:out value="${ekspKontrol.dataKontrol}"/> </td>
            <td><c:out value="${ekspKontrol.pochankovaRobotaStrymy}"/> </td>
            <td><c:out value="${ekspKontrol.pochankovaRobotaNaprygu}"/> </td>
            <td><c:out value="${ekspKontrol.pochankoviiPotenzhvklvkl}"/> </td>
            <td><c:out value="${ekspKontrol.pochankoviiPotenzhvklvukl}"/> </td>
            <td><c:out value="${ekspKontrol.vstanovlenuiStrymRobotu}"/> </td>
            <td><c:out value="${ekspKontrol.vstanobleniiRobotaNuprygu}"/> </td>
            <td><c:out value="${ekspKontrol.vstanovlenuiiPotenzhvkl}"/> </td>
            <td><c:out value="${ekspKontrol.vstanovlenuiiPotenzhvukl}"/> </td>
            <td><c:out value="${ekspKontrol.p}"/> </td>
            <td><c:out value="${ekspKontrol.pokazhLIchilnukaChasy}"/> </td>
            <td><c:out value="${ekspKontrol.chasProst}"/> </td>
            <td><c:out value="${ekspKontrol.prumitku}"/> </td>
        </tr>
        </tbody>
    </table>
    <h2>Планово-запобіжні ремонти</h2>
    <table>
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
            <td><c:out value="${planZapRob.pochatkovaDataRemonty}" /></td>
            <td><c:out value="${planZapRob.pochatkovaDataRemonty}" /></td>
            <td><c:out value="${planZapRob.kinzhevaDataRemonty}" /></td>
            <td><c:out value="${planZapRob.type}" /></td>
            <td><c:out value="${planZapRob.opusRobit}" /></td>
            <td><c:out value="${planZapRob.vstanRezhimUkz}" /></td>
            <td><c:out value="${planZapRob.vstanRezhimUkzU}" /></td>
            <td><c:out value="${planZapRob.vvimknP}" /></td>
            <td><c:out value="${planZapRob.vvumkP}" /></td>
            <td><c:out value="${planZapRob.anodR}" /></td>
            <td><c:out value="${planZapRob.zahR}" /></td>
        </tr>
        </tbody>
    </table>
    <c:if test="${save}">
    <form:form method="post" action="/save">
        <input type="submit" value="Зберегти" />
    </form:form>
    </c:if>
    <c:if test="${save==false}">
        <c:if test="${vvedennia}">
            <input type=button onClick="location.href='/indexVved'" value='Введення технічних об`єктів'>
        </c:if>
        <c:if test="${zvitnist}">
            <input type=button onClick="location.href='/indexZvit'" value='Звітність'>
        </c:if>
        <input type=button onClick="location.href='/indexPeregliad'" value='Перегляд паспортів'>
    </c:if>
</body>
</html>
