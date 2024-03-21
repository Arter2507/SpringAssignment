<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Information</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <h1 class="text-center">Hello, <span class="text-info">${username}</span>. Welcome To Employee Information</h1>
        <form:form action="add.htm" method="POST" modelAttribute="addEmployee" class="row g-3">
            <h2><form:errors path="*" cssClass="text-danger"/></h2>
            <div class="col-md-6">
                <form:label path="empId" class="form-label">Employee ID</form:label>
                <form:input path="empId" class="form-control" autofocus="true"/>
                <form:errors path="empId" cssClass="text-danger"/>
            </div>
            <div class="col-md-6">
                <form:label path="empName" class="form-label">Employee Name</form:label>
                <form:input path="empName" class="form-control"/>
                <form:errors path="empName" cssClass="text-danger"/>
            </div>
            <div class="col-md-6">
                <form:label path="empBirthday" class="form-label">Employee Birthday</form:label>
                <form:input type="date" path="empBirthday" class="form-control"/>
                <form:errors path="empBirthday" cssClass="text-danger"/>
            </div>
            <div class="col-md-6">
                <form:label path="empSalary" class="form-label">Employee Salary</form:label>
                <form:input path="empSalary" class="form-control" placeholder="ex: 500 USD"/>
                <form:errors path="empSalary" cssClass="text-danger"/>
            </div>
            <div class="col-12">
                <button type="submit" class="btn btn-primary">Add</button>
            </div>
        </form:form>
    </body>
</html>
