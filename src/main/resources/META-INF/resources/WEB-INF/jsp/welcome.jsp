
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Start page</title>
</head>
<body>
  <div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">

        <h2>Welcome ${pageContext.request.userPrincipal.name} | </h2>
    </c:if>
  </div>
</body>
</html>