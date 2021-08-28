<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Submit Card Details - Tech Finder</title>
    <link rel="stylesheet" href="css/submit.css">
</head>
<body>
	<%@ include file="header.html" %>
	<div class="item">
    	<h3>Add Card Details</h3>
    </div>
    <form:form action="./registerCardDetails" method="post" accept-charset="utf-8">
    	<div class="item">
    		<label>Card Name: </label>
    		<input type="text" name="name" path="name" required />
    	</div>
    	<div class="item">
    		<label>Card Type: </label>
    		<input type="text" name="type" path="type" required />
    	</div>
    	<div class="item">
    		<label>Card Color: </label>
    		<input type="text" name="color" required />
    	</div>
    	<div class="item">
    		<label>Card Cost: </label>
    		<input type="text" name="cost" path="cost" required />
    	</div>
    	<div class="item">
    		<input type="submit" name="gimmedadeets" value="Add Details!!" />
    	</div>
    </form:form>
</body>
</html>