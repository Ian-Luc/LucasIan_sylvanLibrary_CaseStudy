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
				<th>Deck Name</th>
				<th>Player Name</th>
				<th>Format</th>
				<th>Archetype</th>
			</tr>
			<tr>
				<td>1</td>
				<td>${dto_0.name}</td>
				<td>${dto_0.playerName}</td>
				<td>${dto_0.format}</td>
				<td>${dto_0.archetype}</td>
			</tr>
			<tr>
				<td>2</td>
				<td>${dto_1.name}</td>
				<td>${dto_1.playerName}</td>
				<td>${dto_1.format}</td>
				<td>${dto_1.archetype}</td>
			</tr>
			<tr>
				<td>3</td>
				<td>${dto_2.name}</td>
				<td>${dto_2.playerName}</td>
				<td>${dto_2.format}</td>
				<td>${dto_2.archetype}</td>
			</tr>
			<tr>
				<td>4</td>
				<td>${dto_3.name}</td>
				<td>${dto_3.playerName}</td>
				<td>${dto_3.format}</td>
				<td>${dto_3.archetype}</td>
			</tr>
			<tr>
				<td>5</td>
				<td>${dto_4.name}</td>
				<td>${dto_4.playerName}</td>
				<td>${dto_4.format}</td>
				<td>${dto_4.archetype}</td>
			</tr>
		</table>
	</div>
</body>
</html>