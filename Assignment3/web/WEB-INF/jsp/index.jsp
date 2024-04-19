<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome to Gift Shop</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evシンQhVpFNsCJFtRWx7TAuU1nTroIqWyfNWPmBpAhogs5sCxC+zHuC/IcXKfHwP" crossorigin="anonymous">
</head>

<body>
    <div class="container">
        <h1>Enter your name: </h1>
        <form:form action="greeting.htm" method="POST" modelAttribute="userName" class="mb-3">
            <div class="form-group">
                <form:input path="name" type="text" name="name" id="name" placeholder="Enter Your Name" class="form-control"/>
            </div>
            <div class="col-12 mt-4">
                <button type="submit" class="btn btn-info">Greet Me</button>
            </div>
            <table>
                <tbody>
                    <tr>
                        <td>
                            <form:input path="name" type="text" name="name" id="name" placeholder="Enter Your Name"/>
                        </td>
                        <td>
                            <input type="submit" value="Submit"/>
                        </td>
                    </tr>
                </tbody>
            </table>

        </form:form>

        <h2>Available Gifts</h2>
        <c:if test="${checkGiftIdEmpty}">
            <div class="alert alert-danger" role="alert">
                Please choose at least one product to continue order <3
            </div>
        </c:if>

        <form:form action="orders.htm" method="POST" modelAttribute="orders">
            <table class="table table-striped text-center">
                <thead>
                    <tr>
                        <th></th>
                        <th>Name</th>
                        <th>Category</th>
                        <th>Price</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${gifts}" var="gift">
                        <tr>
                            <td><input type="checkbox" name="giftIds" value="${gift.giftID}" class="form-check-input"></td>
                            <td>${gift.giftName}</td>
                            <td>${gift.category}</td>
                            <td>${gift.price}</td>
                            <td><a href="gift/${gift.giftID}.htm" class="btn btn-sm btn-link">Detail</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <button type="submit" class="btn btn-primary">Order Gifts</button>
        </form:form>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-OgwbZS7/BXzYhFOTujIkA5Mh82kX83vgmAMFuqLDCJcYsZ2Qyxnrk556hWymAh2L" crossorigin="anonymous"></script>
</body>
</html>
