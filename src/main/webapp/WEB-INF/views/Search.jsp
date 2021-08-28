<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search - Tech Finder</title>
    <link rel="stylesheet" href="css/search.css">
</head>
<body>
    <%@ include file="header.html" %>
    <script type="text/javascript" src="js/search.js"></script>
	<br id="searchbuddy">
    <form class="searchparameters" action="./searchByDeck" id="parameters" name ="parameters" method="post" >
        <div>
            <p>Search by Archetype: </p>
            <select name="format" id="format">
                <option value="legacy">Legacy</option>
                <option value="modern">Modern</option>
                <option value="pioneer">Pioneer</option>
            </select>
            <input type="text" name="item" id="itemname" 
            	placeholder="Enter an Archetype for cards!" required />
            <input type="submit" id="pressme" value="Find Tech!" />
        </div>
    </form>
    <br>
    <form class="searchparameters" action="./searchByCard" id="parameters" name ="parameters" method="post" >
        <div>
            <p>Search by Cards: </p>
            <select name="format" id="format">
                <option value="legacy">Legacy</option>
                <option value="modern">Modern</option>
                <option value="pioneer">Pioneer</option>
            </select>
            <input type="text" name="item" id="itemname" 
            	placeholder="Enter a Card name for decks!" required />
            <input type="submit" id="pressme" value="Find Tech!" />
        </div>
    </form>
</body>
</html>