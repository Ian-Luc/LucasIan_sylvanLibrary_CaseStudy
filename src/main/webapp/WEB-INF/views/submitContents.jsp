<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit Deck Contents - Tech Finder</title>
</head>
<body>
	<%@ include file="header.html" %>
    <div style="height: 120px"></div>
    <form:form action="" method="post" modelAttribute="DeckContent">
	    <div>
	    	<label>Deck ID:</label>
	    	<form:input type="text" path="deck" name="deck" required="true"/>
	    	<form:errors path="deck" cssClass="error" />
    	</div>
    	<div>
    		<label>Card:</label>
    		<form:input type="text" path="card" name="card" required="true"/>
    		<form:errors path="card" cssClass="error" />
    	</div>
    </form:form>
</body>
</html>