<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"

    <html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome to Preferred Travel Plan</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
    <h1 class="text-center">Welcome to Preferred Travel Plan</h1>
    <form:form action="acceptDataForm.htm" method="POST" modelAttribute="setDataForm" class="row g-3">
        <div class="col-md-6">
            <label for="username" class="form-label">User Name:</label>
            <form:input type="text" class="form-control" id="username" path="username" autofocus="true"/>
            <form:errors path="username" cssClass="text-danger" />
        </div>
        <div class="col-md-6">
            <label for="mobileNumber" class="form-label">Mobile Number:</label>
            <form:input type="tel" class="form-control" id="mobileNumber" path="mobileNumber" />
            <form:errors path="mobileNumber" cssClass="text-danger" />
        </div>
        <div class="col-md-12">
            <label for="destination" class="form-label">Tourist Destination:</label>
            <form:input type="text" class="form-control" id="destination" path="destination" />
            <form:errors path="destination" cssClass="text-danger" />
        </div>
        <div class="col-12 text-center"> <input type="submit" value="Sign up" class="btn btn-primary" />
        </div>
    </form:form>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
