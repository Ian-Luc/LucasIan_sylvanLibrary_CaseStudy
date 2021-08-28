<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="ISO-8859-1">
	<title>Your results, friendo - Tech Finder</title>
	<link rel="stylesheet" href="css/search.css">
    <link rel="stylesheet" href="css/results.css">
</head>
<body>
    <%@ include file="header.html" %>
	<div class="resultcontainer">
		<table class="results">
			<tr>
				<th>Rank</th>
				<th>Card Name</th>
				<th># In Decks</th>
				<th>Type</th>
				<th>Color</th>
				<th>Mana Cost</th>
			</tr>
			<tr>
				<td>1</td>
				<td>${dto_0.card}</td>
				<td>${dto_0.quantity}</td>
				<td>${card_0.type}</td>
				<td>${card_0.color}</td>
				<td>${card_0.cost}</td>
			</tr>
			<tr>
				<td>2</td>
				<td>${dto_1.card}</td>
				<td>${dto_1.quantity}</td>
				<td>${card_1.type}</td>
				<td>${card_1.color}</td>
				<td>${card_1.cost}</td>
			</tr>
			<tr>
				<td>3</td>
				<td>${dto_2.card}</td>
				<td>${dto_2.quantity}</td>
				<td>${card_2.type}</td>
				<td>${card_2.color}</td>
				<td>${card_2.cost}</td>
			</tr>
			<tr>
				<td>4</td>
				<td>${dto_3.card}</td>
				<td>${dto_3.quantity}</td>
				<td>${card_3.type}</td>
				<td>${card_3.color}</td>
				<td>${card_3.cost}</td>
			</tr>
			<tr>
				<td>5</td>
				<td>${dto_4.card}</td>
				<td>${dto_4.quantity}</td>
				<td>${card_4.type}</td>
				<td>${card_4.color}</td>
				<td>${card_4.cost}</td>
			</tr>
		</table>
	</div>