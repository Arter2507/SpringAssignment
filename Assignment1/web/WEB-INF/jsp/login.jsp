<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Employee</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <form:form action="loginProcess.htm" method="POST" modelAttribute="loginEmployeeForm">
            <h1 class="text-center">Login</h1>
            <h2><form:errors path="*" cssClass="text-danger"/></h2>
            <div class="row mb-3">
                <form:label path="username" class="col-sm-2 col-form-label">Username</form:label>
                    <div class="col-sm-10">
                    <form:input path="username" autofocus="true"/>
                    <form:errors path="username" cssClass="text-danger"/>
                </div>
            </div>
            <div class="row mb-3">
                <form:label path="password" class="col-sm-2 col-form-label">Password</form:label>
                    <div class="col-sm-10">
                    <form:input type="password" path="password"/>
                    <form:errors path="password" cssClass="text-danger"/>
                </div>
            </div>
                <button type="submit" class="btn btn-primary">Sign in</button>
        </form:form>
    </body>
</html>
