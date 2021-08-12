<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - MtG Tech Finder</title>
    <link rel="stylesheet" type="text/css" href="css/header.css">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Lexend:wght@300&family=Roboto:wght@300&display=swap');
        .usericon{
            height: 125px;
            width: 130px;
            margin-left: -20%;
            margin-right: auto;
            margin-top: -150px;
            border-radius: 100%;
            background-color: rgb(47, 47, 241);
            background-image: url("./../images/loginicon.png");
            background-size: 90%;
            background-repeat: no-repeat;
        }
        .innerscan{
            padding-top: 0%;
        }
        .center{
            height: 240px;
            width: 300px;
            background-color: rgba(190, 190, 190, 65%);
            margin-left: auto;
            margin-right: auto;
            margin-top: 15%;
            border-radius: 15px;
            font-family: "Lexend";
        }
        .topitem{
            font-size: 28px;
            margin-top: -50px;
        }
        .passwordlink{
            font-size: 18px;
        }
        nav.accountinfo{
            margin-left: 50px;
        }
        .center div{
            text-align: center;
            padding-bottom: 5px;
        }
        input{
            text-align: center;
            border-radius: 10px;
        }
        body{
            background-image: url("./../images/lightnoughts.png");
            background-size: 100%;
        }
    </style>
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
                        <a href="./main.html">Home</a>
                    </li>
                    <li>
                        <a href="./Search.html">Search</a>
                    </li>
                    <li>
                        <a href="./about.html">About</a>
                    </li>
                    <li>
                        <a href="#">Account</a>
                    </li>
                    <li>
                        <a href="./login.html">Login</a>
                    </li>
                    <li>
                        <a href="./rat.html" id="rat">Rat?</a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
    <div style="margin-top: 120px"></div>
    <div class="center">
        <div style="padding-top: 30%;">
            <div class="usericon">
            </div>
            <nav class="accountinfo">
                <div class="topitem">
                    User Login
                </div>
                <script src="js/accountValidate.js"></script>
                <form onsubmit="return(checkLogin())" name="accountvalidate" id="accountvalidate" class="accountvalidate">
                    <div>
                        <input type="text" id="username" placeholder="Username" style="background-color: rgb(190, 190, 190); height: 25px">
                    </div>
                    <div>
                        <input type="text" id="password" placeholder="Password" style="background-color: rgb(190, 190, 190); height: 25px">
                    </div>
                    <div>
                        <input type="submit" value="LOGIN" style="height: 30px; width: 150px; background-color: rgb(160, 50, 50);">
                    </div>
                    <div class="passwordlink">
                        <a href="./login.html">Forgot Password?</a>
                    </div>
                    <div class="newaccount">
                        <a href="./newaccount.html">New? Create Account</a>
                    </div>
                </form>
            </nav>
        </div>
    </div>
</body>
</html>