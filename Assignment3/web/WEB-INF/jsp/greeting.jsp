<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Greeting</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evシンQhVpFNsCJFtRWx7TAuU1nTroIqWyfNWPmBpAhogs5sCxC+zHuC/IcXKfHwP" crossorigin="anonymous">
</head>
<body>
    <div class="d-flex justify-content-center align-items-center min-vh-100">
        <div class="text-center">
            <h1>Hello, ${userName.name} !</h1>
            <p>Welcome to our gift shop.</p>
            <a href="index.htm" class="btn btn-primary">View Available Gifts</a>
        </div>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-OgwbZS7/BXzYhFOTujIkA5Mh82kX83vgmAMFuqLDCJcYsZ2Qyxnrk556hWymAh2L" crossorigin="anonymous"></script>
</body>
</html>
