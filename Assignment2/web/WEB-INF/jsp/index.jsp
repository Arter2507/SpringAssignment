<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Of Shipper</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
    </head>

    <body>
        <div class="container mt-3">
            <h1 class="display-4 mb-4 text-center">MANAGE SHIPPER</h1>
            <a href="addForm.htm" class="btn btn-primary mb-3">Add Shipper</a>
            <form action="findShipper.htm" class="mb-4">
                <div class="row">
                    <div class="col-md-4">
                        <label for="keyword" class="form-label">Search:</label>
                        <input type="text" class="form-control" id="keyword" name="keyword" value="">
                    </div>
                    <div class="col-md-2">
                        <button type="submit" class="btn btn-primary mt-4">Search</button>
                    </div>
                </div>
            </form>

            <table class="table table-striped table-bordered text-center">
                <thead>
                    <tr>
                        <th scope="col">Shipper ID</th>
                        <th scope="col">Company Name</th>
                        <th scope="col">Phone</th>
                        <th scope="col">Edit</th>
                        <th scope="col">Delete</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="shipper" items="${listShipper}" varStatus="status">
                        <tr>
                            <td><c:out value="${shipper.shipperID}"/></td>
                            <td><c:out value="${shipper.companyName}"/></td>
                            <td><c:out value="${shipper.phone}"/></td>
                            <td><a href="showUpdateForm.htm?id=<c:out
                                       value="${shipper.shipperID}"/>" class="btn btn-sm btn-info">Edit</a></td>
                            <td><a href="deleteShipper.htm?id=<c:out
                                       value="${shipper.shipperID}"/>" class="btn btn-sm btn-danger">Delete</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>  
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"/>
    </body>
</html>
