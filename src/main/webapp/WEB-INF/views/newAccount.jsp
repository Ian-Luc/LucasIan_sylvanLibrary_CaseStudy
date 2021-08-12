<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Account - Tech Finder</title>
    <link rel="stylesheet" href="./../styles/header.css">
    <link rel="stylesheet" href="css/newaccount.css">
</head>
<body>
    <%@ include file="header.html" %>
    <div style="margin-top: 120px"></div>
    <span class="account-container">
        <div class="pageopener">
            <h1>Create New Account</h1>
        </div>
        <nav class="pagebody">
            <script src="js/accountValidate.js"></script>
            <form action="./login" name="newaccount" id="newaccount" onsubmit="return(addAccount())">
                <div>
                    <input type="text" name="username" id="name" placeholder="Username" required>
                </div>
                <div>
                    <input type="text" name="password" id="pass" placeholder="Password" required>
                </div>
                <div>
                    <input type="submit" name="enter" id="pressme" value="Create Account">
                </div>
            </form>
        </nav>
    </span>
</body>
</html>