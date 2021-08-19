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
    <!-- Use a RADIO option with JS to choose what to search for -->
    <form class="searchparameters" id="parameters" name ="parameters" 
    onsubmit="return(searchDB())" method="post">
        <div>
            <p>Choose Format: </p>
            <select name="format" id="format">
                <option value="legacy">Legacy</option>
                <option value="modern">Modern</option>
                <option value="pioneer">Pioneer</option>
            </select>
            <p>Search by: </p>
            <select name="type" id="archetype">
                <option value="archetype">Deck Archetype</option>
                <option value="card">Card in List</option>
            </select>
            <p>How many results?</p>
            <input type="number" name="number" id="amount" value="15" />
            <input type="text" name="itemname" id="itemname" 
            	placeholder="Enter what you want to find" required />
            <input type="submit" id="pressme" value="Find Tech!" />
        </div>
    </form>
    
</body>
</html>