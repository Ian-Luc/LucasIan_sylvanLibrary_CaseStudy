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
    <span class="account-container">
        <div class="pageopener">
            <h1>Create New Account </h1>
        </div>
        <nav class="pagebody">
            <form:form action="./login" name="newaccount" id="newaccount" modelAttribute="UserAccount">
                <div>
                    <form:input type="text" name="username" path="username" id="name" placeholder="Username" required="true" />
                </div>
                <div>
                    <form:input type="text" name="password" path="password" id="pass" placeholder="Password" required="true" />
                </div>
                <div>
                    <form:button type="submit" name="enter" id="pressme" value="Create Account" />
                </div>
            </form:form>
        </nav>
    </span>
</body>
</html>