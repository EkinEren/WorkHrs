<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html lang="en">
<head>
    <script src="webjars/jquery/3.4.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
    <meta charset="utf-8">
    <title>Start page</title>
</head>
<body>
<div class="container">
    <div class="jumbotron">
        <p>Oy mate, you made it!</p>
        <div class="row">
            <div>
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                ${ad}
                    ${soyad}
                    ${durum}
                </c:if>
            </div>
        </div>
    </div>
</div>
</body>
</html>