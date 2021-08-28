<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Account - Tech Finder</title>
    <link rel="stylesheet" href="css/account.css">
</head>
<body>
    <%@ include file="header.html" %>
    <div class="account-container">
        <div class="center">
            <h1>Create New Account </h1>
        </div>
        <nav class="pagebody">
        <script type="text/javascript" src="js/newAccount.js"></script>
            <form:form onsubmit="return checkPassword()" action="./createAccount" name="newaccount" id="newaccount" modelAttribute="Account" method="post">
                <div class="center">
                	<label>Username: </label>
                    <form:input type="text" name="username" path="username" id="name" placeholder="Username" required="true" />
                	<small id="error"></small>
                </div>
                <div class="center">
                	<label>Password: </label>
                    <form:input type="password" name="password" path="password" id="pass" placeholder="Password" required="true" />
                    <small id="passError"></small>
                </div>
                <div class="center">
                	<label>Confirm Password: </label>
                    <input type="password" name="password2" id="electricBoogaloo" placeholder="Confirm Password" required />
                    <small id="passErrorBoogaloo"></small>
                </div>
                <div class="center">
                    <form:button type="submit" name="enter" id="pressme" value="Create Account">Create Account!!</form:button>
                </div>
            </form:form>
        </nav>
    </div>
</body>
</html>