
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
    <c:if test="${pageContext.request.userPrincipal.name != null}">

        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h1 class="display-4">Welcome ${pageContext.request.userPrincipal.name} ! </h1>
        <hr class="my-4">
        <p class="lead">
            <a class="btn btn-primary btn-lg" onclick="document.forms['logoutForm'].submit()" role="button">Logout</a>
        </p>
    </c:if>
      </div>
  </div>
</body>
</html>