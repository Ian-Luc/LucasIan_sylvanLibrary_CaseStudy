<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Tech Finder</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
    <%@ include file="header.html" %>
    <div class="center">
        <div style="padding-top: 30%;">
            <div class="usericon">
            </div>
            <nav class="accountinfo">
                <div class="topitem">
                    User Login
                </div>
                <script src="js/accountValidate.js"></script>
                <form onsubmit="return(checkLogin())" name="accountvalidate" id="accountvalidate" class="accountvalidate">
                    <div>
                        <input type="text" id="username" placeholder="Username" style="background-color: rgb(190, 190, 190); height: 25px">
                    </div>
                    <div>
                        <input type="text" id="password" placeholder="Password" style="background-color: rgb(190, 190, 190); height: 25px">
                    </div>
                    <div>
                        <input type="submit" value="LOGIN" style="height: 30px; width: 150px; background-color: rgb(160, 50, 50);">
                    </div>
                    <div class="passwordlink">
                        <a href="./login.jsp">Forgot Password?</a>
                    </div>
                    <div class="newaccount">
                        <a href="./new_account.jsp">New? Create Account</a>
                    </div>
                </form>
            </nav>
        </div>
    </div>
</body>
</html>