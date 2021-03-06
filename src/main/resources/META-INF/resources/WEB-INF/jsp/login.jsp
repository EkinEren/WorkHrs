<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html lang="en">
<head>
    <script src="webjars/jquery/3.4.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
    <meta charset="utf-8">
    <title>Log in with your account</title>
</head>

<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-lg-6">
        <form method="POST" action="${contextPath}/login">
            <h2 class="display-4">Administration Login</h2>

            <div class="form-group ${error != null ? 'has-error' : ''}">
                <span>${message}</span>
                <input name="username" type="text" class="form-control m-2" placeholder="Username"
                       autofocus="true"/>
                <input name="password" type="password" class="form-control m-2" placeholder="Password"/>
                <span>${error}</span>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                <button class="btn btn-lg btn-primary btn-block m-2" type="submit">Log In</button>
            </div>
        </form>
    </div>
    </div>
</div>
</body>
</html>