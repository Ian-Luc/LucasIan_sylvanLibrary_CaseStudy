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
    <link rel="stylesheet" href="css/login.css">
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
                <form action="./loginToUser" name="accountvalidate" id="accountvalidate" class="accountvalidate" method="post">
                    <div>
                        <input type="text" id="username" name="username" placeholder="Username" style="background-color: rgb(190, 190, 190); height: 25px">
                    </div>
                    <div>
                        <input type="password" id="password" name="password" placeholder="Password" style="background-color: rgb(190, 190, 190); height: 25px">
                    </div>
                    <div>
                        <input type="submit" value="LOGIN" style="height: 30px; width: 150px; background-color: rgb(160, 50, 50);">
                    </div>
                </form>
                    <div class="passwordlink">
                        <a href="./login">Forgot Password?</a>
                    </div>
                    <div class="newaccount">
                        <a href="./newAccount">New? Create an Account!</a>
                    </div>
            </nav>
        </div>
    </div>
</body>
</html>