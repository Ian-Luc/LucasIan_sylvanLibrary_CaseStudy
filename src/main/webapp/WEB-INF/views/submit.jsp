<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Choose What to Submit - Tech Finder</title>
    <link rel="stylesheet" href="css/submit.css">
</head>
<body>
	<%@ include file="header.html" %>
	<div class="item">
		<a href="./submitDeck">Add a Deck</a>
	</div>
	<div class="item">
		<a href="./submitContents">Add Cards to a Deck</a>
	</div>
</body>
</html>