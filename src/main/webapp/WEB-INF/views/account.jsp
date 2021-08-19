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
    	<h2>Username to be implemented</h2>
    </div>
    <div class="item">
    	<form:form action="./changeUsername" method="post" modelAttribute="UserAccount">
    		<label>Change Username:</label>
    		<form:input type="text" path="username" required="true" />
    		<form:errors cssClass="error" />
    		<form:button>Submit</form:button>
    	</form:form>
    </div>
    <div class="item">
    	<form:form action="changePassword" method="post" modelAttribute="UserAccount">
    		<label>Change Password:</label>
    		<form:input type="text" path="password" required="true" />
    		<form:errors cssClass="error" />
    		<form:button>Submit</form:button>
    	</form:form>
    </div>
    <div class="item">
    	<form:form action="changePicture" method="post" modelAttribute="UserAccount">
    		<label>Change Profile Picture:</label>
    		<form:input type="text" required="true" placeholder="Enter a Url" path="picUrl" />
    		<form:errors cssClass="error" />
    		<form:button>Submit</form:button>
    	</form:form>
    </div>
</body>
</html>