<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <script src="webjars/jquery/3.4.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script src="webjars/momentjs/2.24.0/min/moment-with-locales.min.js"></script>
    <script src="webjars/tempusdominus-bootstrap-4/5.1.2/js/tempusdominus-bootstrap-4.min.js"></script>

    <script type="text/javascript">
        $(function () {
            $('#datetimepicker11').datetimepicker({
                viewMode: 'years',
                format: 'MM/YYYY'
            });
        });
    </script>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/font-awesome/5.8.1/css/all.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/tempusdominus-bootstrap-4/5.1.2/css/tempusdominus-bootstrap-4.min.css" />
    <meta charset="utf-8">
    <title>Start page</title>
</head>


<body>
<div class="container">
    <div class="row justify-content-center p-3">
    <form:form method="POST" action="/test/personel">

        <div class="form-group">
            <h2 class="display-4">Çalışan Giriş/Çıkış Raporu Sorgulama</h2>
            <form:input path="kartno" name="kartno" type="text" class="form-control m-2" placeholder="Kartno"
                        autofocus="true"/>
        </div>

            <button class="btn btn-lg btn-primary btn-block m-2" type="submit">Get Employee</button>
        </div>
    </form:form>

</div>
</body>
</html>