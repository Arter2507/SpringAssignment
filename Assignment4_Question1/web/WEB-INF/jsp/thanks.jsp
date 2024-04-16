<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thank you</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-鷓jJgCDzmrqQzT9jisk/ert4x1pfSyvNTT4WOp1vNStStA2KH+yo9vK1qQzwtT9u0vA5tlnxZOUax|/css/bootstrap.min.css" crossorigin="anonymous">
    </head>
    <body>
        <div class="container d-flex justify-content-center align-items-center vh-100">
            <div class="card">
                <div class="card-header">
                    <h1>Thanks for Signing Up</h1>
                    <h6 class="text-center">Confirm your information in below</h6>
                </div>
                <div class="card-body">
                    <table class="table table-bordered">
                        <tbody>
                            <tr>
                                <td>User Name:</td>
                                <td>${setDataForm.username}</td>
                            </tr>
                            <tr>
                                <td>Mobile Number:</td>
                                <td>${setDataForm.mobileNumber}</td>
                            </tr>
                            <tr>
                                <td>Tourist Destination:</td>
                                <td>${setDataForm.destination}</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
