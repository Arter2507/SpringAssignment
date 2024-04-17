<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Gift Search Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evシンQhVpFNsCJFtRWx7TAuU1nTroIqWyfNWPmBpAhogs5sCxC+zHuC/IcXKfHwP" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>This is your product with id = ${gift.giftID}</h1>
        <c:if test="${gift.price >= 5000}">
            <p class="alert alert-success" role="alert">This product has a 10% discount.</p>
        </c:if>

        <table class="table table-striped">
            <tbody>
                <tr>
                    <th>Gift ID</th>
                    <td>${gift.giftID}</td>
                </tr>
                <tr>
                    <th>Gift Name</th>
                    <td>${gift.giftName}</td>
                </tr>
                <tr>
                    <th>Price</th>
                    <td>${gift.price}</td>
                </tr>
                <tr>
                    <th>Category</th>
                    <td>${gift.category}</td>
                </tr>
                <tr>
                    <th>Color</th>
                    <td>${gift.colors}</td>
                </tr>
            </tbody>
        </table>

        <a href="<c:url value="/index.htm"/>" class="btn btn-primary">Back to View Gifts</a>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-OgwbZS7/BXzYhFOTujIkA5Mh82kX83vgmAMFuqLDCJcYsZ2Qyxnrk556hWymAh2L" crossorigin="anonymous"></script>
</body>
</html>
