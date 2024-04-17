<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order Place</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evシンQhVpFNsCJFtRWx7TAuU1nTroIqWyfNWPmBpAhogs5sCxC+zHuC/IcXKfHwP" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>Order Summary</h1>
        <c:if test="${discountApplied}">
            <div class="alert alert-success" role="alert">
                Congratulations! You received a 10% discount for your order exceeding 5000 Ruby.
            </div>
        </c:if>

        <table class="table table-bordered table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Color</th>
                    <th>Category</th>
                    <th>Price (Ruby)</th>
                    <th>Discount (%)</th>
                    <th>Discounted Price (Ruby)</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="gift" items="${orderedGifts}">
                    <tr>
                        <td>${gift.giftOrderID}</td>
                        <td>${gift.giftOrderName}</td>
                        <td>${gift.giftOrderColors}</td>
                        <td>${gift.giftOrderCategory}</td>
                        <td>${gift.giftOrderPrice}</td>
                        <td>${gift.giftOrderDiscount}</td>
                        <td>${discountedPrice}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <p class="text-end fw-semibold">Total Price: ${totalPrice} Ruby</p>
         <div class="d-flex justify-content-between">
            <a href="<c:url value="/index.htm"/>" class="btn btn-secondary">Back to Gift List</a>
        </div>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-OgwbZS7/BXzYhFOTujIkA5Mh82kX83vgmAMFuqLDCJcYsZ2Qyxnrk556hWymAh2L" crossorigin="anonymous"></script>
</body>
</html>
