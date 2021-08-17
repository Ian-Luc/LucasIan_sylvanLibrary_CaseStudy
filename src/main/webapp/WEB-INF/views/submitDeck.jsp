<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Submit Deck Info - Tech Finder</title>
</head>
<body>
	<%@ include file="header.html" %>
    <div style="height: 120px"></div>
    <form:form action="" method="post" modelAttribute="DeckCatalog">
    <div>
    	<label>Deck Name:</label>
    	<form:input type="text" path="deckName" name="deckName"/>
    	<form:errors path="deckName" cssClass="error" />
    </div>
    <div>
    	<label>Player Name:</label>
    	<form:input type="text" path="playerName" name="playerName" />
    	<form:errors path="playerName" cssClass="error" />
    </div>
    <div>
    	<label>Format:</label>
    	<form:input type="select" path="format" />
    	<form:errors path="format" cssClass="error" />
    </div>
    <div>
    	<label>Archetype:</label>
    	<form:input type="text" path="archetype" name="archetype" />
    	<form:errors path="archetype" cssClass="error" />
    </div>
    </form:form>
    <a href="submitContents">Already put in your deck?</a>
</body>
</html>