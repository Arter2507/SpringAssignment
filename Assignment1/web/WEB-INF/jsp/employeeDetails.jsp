
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Details</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <h1 class="text-center">Welcome To <span class="text-info">${employeeDetails.empName}'s</span> Information</h1>
        <form class="row g-3">           
            <div class="col-md-6">
                <label for="empId" class="form-label">Employee ID</label>
                <input value="${employeeDetails.empId}" class="form-control" id="empId" readonly="true"/>
            </div>
            <div class="col-md-6">
                <label for="empName" class="form-label">Employee Name</label>
                <input value="${employeeDetails.empName}" id="empName" class="form-control" readonly="true"/>
            </div>
            <div class="col-md-6">
                <label for="empBirthday" class="form-label">Employee Birthday</label>
                <input value="${formattedBirthday}" id="empBirthday" class="form-control" readonly="true"/>
            </div>
            <div class="col-md-6">
                <label for="empSalary" class="form-label">Employee Salary</label>
                <input value="$${employeeDetails.empSalary}" class="form-control" id="empSalary" readonly="true"/>
            </div>
        </form>
    </body>
</html>
