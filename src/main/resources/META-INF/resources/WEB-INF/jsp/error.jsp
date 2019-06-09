<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <script src="webjars/jquery/3.4.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
    <style>
        table td{
            vertical-align:top;
            border:solid 1px #888;
            padding:10px;
        }
    </style>
</head>
<body>

<h1>Hata Sayfası</h1>
<table>
    <tr>
        <td>Tarih</td>
        <td>${timestamp}</td>
    </tr>
    <tr>
        <td>Hata</td>
        <td>${error}</td>
    </tr>
    <tr>
        <td>Status</td>
        <td>${status}</td>
    </tr>
    <tr>
        <td>Mesaj</td>
        <td>${message}</td>
    </tr>
    <tr>
        <td>Exception</td>
        <td>${exception}</td>
    </tr>
    <tr>
        <td>Geri Dön</td>
        <td><a class="btn btn-link" href="${pageContext.request.contextPath}/test" role="button">Sorgu sayfasına geri dönmek için tıklayınız</a></td>
    </tr>
    <tr>
        <td>Trace</td>
        <td>
            <pre>${trace}</pre>
        </td>
    </tr>
</table>

    </body>
</html>