<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search - MtG Tech Finder</title>
    <link rel="stylesheet" href="css/header.css">
    <link rel="stylesheet" href="css/search.css">
    
</head>
<body>
    <div class="top-header">
        <div class="header-item">
            <img src="images/IMG_3176.PNG" id="chibinez">
            <h1>MtG Tech Finder</h1>
        </div>
        <div class="header-item">
            <nav>
                <ul>
                    <li>
                        <a href="./main">Home</a>
                    </li>
                    <li>
                        <a href="./Search">Search</a>
                    </li>
                    <li>
                        <a href="./about">About</a>
                    </li>
                    <li>
                        <a href="#">Account</a>
                    </li>
                    <li>
                        <a href="./login.html">Login</a>
                    </li>
                    <li>
                        <a href="./rat" id="rat">Rat?</a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
    <div style="height: 120px"></div>
    <form class="searchparameters" id="parameters" name ="parameters" onsubmit="return(searchDB())" method="post">
        <div>
            <p>Choose Format: </p>
            <select name="format" value="format" id="format">
                <option value="legacy">Legacy</option>
                <option value="modern">Modern</option>
                <option value="pioneer">Pioneer</option>
            </select>
            <p>Search by: </p>
            <select name="deckorcard" value="deckorcard" id="archetype">
                <option value="archetype">Deck Archetype</option>
                <option value="card">Card in List</option>
            </select>
            <p>How many results?</p>
            <input type="number" id="amount" value="15">
            <input type="text" placeholder="Enter what you want to find">
            <button id="pressme">Find Tech!</button>
        </div>
    </form>
    <div class="searchresults">
        <p>Results will appear here</p>
    </div>
    
</body>
</html>