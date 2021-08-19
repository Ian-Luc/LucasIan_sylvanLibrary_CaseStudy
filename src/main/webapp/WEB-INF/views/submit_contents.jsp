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
	<div class="item">
    <form:form action="./registerCard" method="post" modelAttribute="deckContent" accept-charset="utf-8">
	    <div>
	    	<label>Deck ID:</label>
	    	<form:input type="number" path="deck" name="deck" required="true"/>
	    	<form:errors path="deck" cssClass="error" />
    	</div>
    	<div>
    		<label>Card:</label>
    		<form:input type="text" path="card" name="card" required="true"/>
    		<form:errors path="card" cssClass="error" />
    	</div>
    	<div>
    		<label>Amount:</label>
    		<form:input type="number" path="quantity" name="quantity" required="true" />
    		<form:errors path="quantity" cssClass="error" />
    	</div>
    	<div>
    		<form:button>Add Card!!</form:button>
    	</div>
    </form:form>
    </div>
</body>
</html>