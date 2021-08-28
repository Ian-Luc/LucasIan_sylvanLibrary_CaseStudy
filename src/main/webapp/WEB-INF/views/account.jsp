<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Account - Tech Finder</title>
    <link rel="stylesheet" href="css/account.css">
</head>
<body>
    <%@ include file="header.html" %>
    <div class="userpic">
    </div>
    <div class="item">
    	<h2>Welcome, ${currentAccount.username}!</h2>
    </div>
    <div class="item">
    	<form action="./changeUsername" method="post">
    		<label>Change Username:</label>
    		<input type="text" required/>
    		<input type="submit" value="Change"/>
    	</form>
    </div>
    <div class="item">
    	<form action="./changePassword" method="post">
    		<label>Change Password:</label>
    		<input type="text"  required/>
    		<input type="submit" value="Change"/>
    	</form>
    </div>
    <div class="item">
    	<form action="./removeAccount" method="post">
    		<input type="submit" value="DELETE ACCOUNT"/>
    	</form>
    </div>
</body>
</html>