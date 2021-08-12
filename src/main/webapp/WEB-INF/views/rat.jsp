<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>RAT - Tech Finder</title>
    <link rel="stylesheet" href="css/header.css">
    <link rel="stylesheet" href="css/rat.css">
</head>
<body>
    <%@ include file="header.html" %>
    <div style="margin-top: 130px"></div>
    <script type="text/javascript" src="js/rat.js"></script>
    <div class="buttonbox">
        <button onclick="playVideo()">Play</button>
        <button onclick="stopVideo()">Pause</button>
    </div>
    <div class="videoplayer">
        <div>
            <video src="images/rat.webm" type="video/webm" id="ratmovie"></video>
        </div>
    </div>
    <script src="js/ratvideo.js"></script>
</body>
</html>