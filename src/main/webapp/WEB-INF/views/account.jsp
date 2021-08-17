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
    <link rel="stylesheet" type="text/css" href="css/header.css">
</head>
<body>
    <%@ include file="header.html" %>
    <div style="margin-top: 120px"></div>
    <div>
    	<img src="" id="profile_pic">
    	<h2>Username</h2>
    </div>
    <div>
    	<form:form action="changeUsername" method="post" modelAttribute="UserAccount">
    		<label>Change Username:</label>
    		<form:input type="text" required="true" />
    		<form:errors cssClass="error" />
    	</form:form>
    </div>
    <div>
    	<form:form action="changePassword" method="post" modelAttribute="UserAccount">
    		<label>Change Password:</label>
    		<form:input type="text" required="true" />
    		<form:errors cssClass="error" />
    	</form:form>
    </div>
    <div>
    	<form:form action="changePicture" method="post" modelAttribute="UserAccount">
    		<label>Change Profile Picture:</label>
    		<form:input type="text" required="true" placeholder="Enter a Url" />
    		<form:errors cssClass="error" />
    	</form:form>
    </div>
    <div id="delete_this_account_dan_backslide">
    	<form:button action="removeAccount" value="DELETE ACCOUNT" />
    </div>
</body>
</html>