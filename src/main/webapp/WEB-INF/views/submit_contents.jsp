<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Submit Deck Contents - Tech Finder</title>
    <link rel="stylesheet" href="css/submit.css">
</head>
<body>
	<%@ include file="header.html" %>
	<div>
	<div class="item">
   		<h3>Add Card to Deck</h3>
   	</div>
    <form action="./registerCard" method="post" accept-charset="utf-8">
	    <div class="item">
	    	<label>Deck ID: </label>
	    	<input type="number" name="deck" required />
    	</div>
    	<div class="item">
    		<label>Card: </label>
    		<input type="text" name="card" />
    	</div>
    	<div class="item">
    		<label>Amount: </label>
    		<input type="number" name="quantity" required />
    	</div>
    	<div class="item">
    		<input type="submit" name="pressme" value="Add Card!!" />
    	</div>
    </form>
    </div>
</body>
</html>