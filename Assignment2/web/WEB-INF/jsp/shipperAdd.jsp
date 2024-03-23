<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Add New Shipper</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-5">
            <form:form action="addShipper.htm" modelAttribute="shipper" class="needs-validation">
                <div class="row align-items-center">
                    <div class="col-md-6">
                        <div class="card mb-3">
                            <div class="card-header">Shipper Information</div>
                            <div class="card-body">
                                <div class="mb-3">
                                    <label for="companyName" class="form-label">Company Name:</label>
                                    <form:input path="companyName" value="${companyName}" class="form-control"/>
                                    <form:errors path="companyName" cssClass="invalid-feedback mt-2"/>
                                </div>
                                <div class="mb-3">
                                    <label for="phone" class="form-label">Phone:</label>
                                    <form:input path="phone" value="${phone}" class="form-control"/>
                                    <form:errors path="phone" cssClass="invalid-feedback mt-2"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <button type="submit" class="btn btn-primary">Add Shipper</button>
                        <button type="reset" class="btn btn-outline-secondary">Reset</button>
                    </div>
                </div>
            </form:form>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVFQWjxhNqjvETGKZrwYrYOGOzJDzUj8yMlWvTJP1LJuTp6Me++" crossorigin="anonymous"></script>
    </body>
</html>
