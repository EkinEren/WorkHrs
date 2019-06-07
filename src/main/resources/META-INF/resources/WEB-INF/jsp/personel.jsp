<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <script src="webjars/jquery/3.4.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
    <style>
        .inline-div {
            display: block;
            text-align: center;
        }

        b
        {
            display: inline-block;
            text-align: center;
        }
    </style>
    <meta charset="utf-8">
    <title>Start page</title>
</head>
<body>

<fmt:setLocale value="tr_TR" />
<fmt:parseDate var="testdate" value="08:00" pattern="HH:mm" />

<div class="container">
    <div class="inline-div">
        <h2 class="display-4">Personel Aylık Giriş/Çıkış Raporu</h2>
        <br>
        <h5>
            <b>Personel</b>
            ${ad}
            ${soyad}
        </h5>
        <h5>
            <b>Id</b> ${id}
            </h5>
        <h5>
        <b>Ay/Yıl </b> ${tarih}
        </h5>
    </div>
    <br>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">Tarih</th>
            <th scope="col">İlk Giriş</th>
            <th scope="col">Son Çıkış</th>
            <th scope="col">Toplam Süre</th>
            <th scope="col">Dışarıda Geçirilen Süre</th>
            <th scope="col">Net Süre</th>
            <th scope="col">Eksik/Fazla Çalışma</th>
            <th scope="col">Günlük Mesai Süresi</th>
            <th scope="col">Düzenle</th>
            <th scope="col">Sil</th>
        </tr>
        </thead>
        <tbody>

        <c:if test="${!empty hafta1}">
        <tr>
            <td class="table-info" colspan="10">1.Hafta</td>
        </tr>
        <c:forEach items="${hafta1}" var="item">
            <fmt:parseDate  value="${item.netSure}"  type="date" pattern="HH:mm" var="parsedDate" />
        <tr>
            <td>${item.tarih}</td>
            <td>${item.ilkGiris}</td>
            <td>${item.sonCikis}</td>
            <td>${item.toplamSure}</td>
            <td>${item.disariSure}</td>
            <td>${item.netSure}</td>
            <c:choose>
                <c:when test= "${parsedDate.time gt testdate.time}">
                    <td>${item.eksikFazlaCalisma}</td>
                </c:when>
                <c:otherwise>
                    <td style="background-color: orange">${item.eksikFazlaCalisma}</td>
                </c:otherwise>
            </c:choose>
            <td>${item.gunlukMesaiSuresi}</td>
            <td><button type="button" class="btn btn-link">Düzenle</button></td>
            <td><button type="button" class="btn btn-link">Sil</button></td>
        </tr>
        </c:forEach>
        </c:if>

        <c:if test="${!empty hafta2}">
        <tr>
            <td class="table-info" colspan="10">2.Hafta</td>
        </tr>
        <c:forEach items="${hafta2}" var="item">
            <fmt:parseDate  value="${item.netSure}"  type="date" pattern="HH:mm" var="parsedDate" />
            <tr>
                <td>${item.tarih}</td>
                <td>${item.ilkGiris}</td>
                <td>${item.sonCikis}</td>
                <td>${item.toplamSure}</td>
                <td>${item.disariSure}</td>
                <td>${item.netSure}</td>
                <c:choose>
                    <c:when test= "${parsedDate.time gt testdate.time}">
                        <td>${item.eksikFazlaCalisma}</td>
                    </c:when>
                    <c:otherwise>
                        <td style="background-color: orange">${item.eksikFazlaCalisma}</td>
                    </c:otherwise>
                </c:choose>
                <td>${item.gunlukMesaiSuresi}</td>
                <td><button type="button" class="btn btn-link">Düzenle</button></td>
                <td><button type="button" class="btn btn-link">Sil</button></td>
            </tr>
        </c:forEach>
        </c:if>

        <c:if test="${!empty hafta3}">
        <tr>
            <td class="table-info" colspan="10">3.Hafta</td>
        </tr>
        <c:forEach items="${hafta3}" var="item">
            <fmt:parseDate  value="${item.netSure}"  type="date" pattern="HH:mm" var="parsedDate" />
            <tr>
                <td>${item.tarih}</td>
                <td>${item.ilkGiris}</td>
                <td>${item.sonCikis}</td>
                <td>${item.toplamSure}</td>
                <td>${item.disariSure}</td>
                <td>${item.netSure}</td>
                <c:choose>
                    <c:when test= "${parsedDate.time gt testdate.time}">
                        <td>${item.eksikFazlaCalisma}</td>
                    </c:when>
                    <c:otherwise>
                        <td style="background-color: orange">${item.eksikFazlaCalisma}</td>
                    </c:otherwise>
                </c:choose>
                <td>${item.gunlukMesaiSuresi}</td>
                <td><button type="button" class="btn btn-link">Düzenle</button></td>
                <td><button type="button" class="btn btn-link">Sil</button></td>
            </tr>
        </c:forEach>
        </c:if>

        <c:if test="${!empty hafta4}">
        <tr>
            <td class="table-info" colspan="10">4.Hafta</td>
        </tr>
        <c:forEach items="${hafta4}" var="item">
            <fmt:parseDate  value="${item.netSure}"  type="date" pattern="HH:mm" var="parsedDate" />
            <tr>
                <td>${item.tarih}</td>
                <td>${item.ilkGiris}</td>
                <td>${item.sonCikis}</td>
                <td>${item.toplamSure}</td>
                <td>${item.disariSure}</td>
                <td>${item.netSure}</td>
                <c:choose>
                    <c:when test= "${parsedDate.time gt testdate.time}">
                        <td>${item.eksikFazlaCalisma}</td>
                    </c:when>
                    <c:otherwise>
                        <td style="background-color: orange">${item.eksikFazlaCalisma}</td>
                    </c:otherwise>
                </c:choose>
                <td>${item.gunlukMesaiSuresi}</td>
                <td><button type="button" class="btn btn-link">Düzenle</button></td>
                <td><button type="button" class="btn btn-link">Sil</button></td>
            </tr>
        </c:forEach>
        </c:if>

        <c:if test="${!empty hafta5}">
        <tr>
            <td class="table-info" colspan="10">5.Hafta</td>
        </tr>
        <c:forEach items="${hafta5}" var="item">
            <fmt:parseDate  value="${item.netSure}"  type="date" pattern="HH:mm" var="parsedDate" />
            <tr>
                <td>${item.tarih}</td>
                <td>${item.ilkGiris}</td>
                <td>${item.sonCikis}</td>
                <td>${item.toplamSure}</td>
                <td>${item.disariSure}</td>
                <td>${item.netSure}</td>
                <c:choose>
                    <c:when test= "${parsedDate.time gt testdate.time}">
                        <td>${item.eksikFazlaCalisma}</td>
                    </c:when>
                    <c:otherwise>
                        <td style="background-color: orange">${item.eksikFazlaCalisma}</td>
                    </c:otherwise>
                </c:choose>
                <td>${item.gunlukMesaiSuresi}</td>
                <td><button type="button" class="btn btn-link">Düzenle</button></td>
                <td><button type="button" class="btn btn-link">Sil</button></td>
            </tr>
        </c:forEach>
        </c:if>

        </tbody>
    </table>
</div>
</body>
</html>