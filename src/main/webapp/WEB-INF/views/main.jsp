<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tech Finder</title>
    <link rel="stylesheet" type="text/css" href="css/header.css">
    <link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>
    <%@ include file="header.html" %>
    <div class="main-container">
        <div id="topspace"></div>
        <div class="archetypeheader">
            <h2>Popular Legacy Archetypes to try out</h2>
        </div>
        <span class="archetypespan">
            <div class="archetypelogo">
                <img src="images/delverimage.jpeg">
            </div>
            <div class="archetypetext">
                <p><b>Blue/Red Delver</b></p>
                <p>Popular tempo deck centered around playing and protecting cheap threats such as the titular 
                    <a href="https://scryfall.com/card/isd/51/delver-of-secrets-insectile-aberration" target="_blank">Delver of Secrets</a> 
                    and disrupting the opponent's plays.
            </div>
        </span>
        <span class="archetypespan">
            <div class="archetypelogo">
                <img src="images/dnt.jpeg">
            </div>
            <div class="archetypetext">
                <p><b>Death and Taxes</b></p>
                <p>A monowhite deck that focuses on denying the opponent mana effecieny to slow down or completely halt their ability to play the game. Uses cards like 
                    <a href="https://scryfall.com/card/a25/36/thalia-guardian-of-thraben" target="_blank">Thalia, Guardian of Thrabren</a>, 
                    <a href="https://scryfall.com/card/a25/246/rishadan-port" target="_blank">Rishadan Port</a>, and
                    <a href="https://scryfall.com/card/ema/248/wasteland" target="_blank">Wasteland</a> to really pinch someone's resources.
                </p>
            </div>
        </span>
        <span class="archetypespan">
            <div class="archetypelogo">
                <img src="images/bantcontrol.png" style="zoom: 150%;">
            </div>
            <div class="archetypetext">
                <p><b>Bant Control</b></p>
                <p>A three color control deck using Blue, White, and Green to counter the opponent's cards and strategy to stall the game until the control player can play a more costly card that the opponent cannot stop.</p>
            </div>
        </span>
        <span class="archetypespan">
            <div class="archetypelogo">
                <img src="images/land.png.jpg">
            </div>
            <div class="archetypetext">
                <p><b>Lands</b></p>
                <p>Green red deck that controls the game with land cards that do 
                    <a href="https://scryfall.com/card/me3/212/the-tabernacle-at-pendrell-vale" target="_blank">more </a>
                    <a href="https://scryfall.com/card/2xm/322/maze-of-ith" target="_blank">than </a>
                    <a href="https://scryfall.com/card/me2/229/glacial-chasm" target="_blank">create </a>
                    <a href="https://scryfall.com/card/2xm/314/dark-depths" target="_blank">resources </a>
                    and ways to return those lands if destroyed.</p>
            </div>
        </span>
        <span class="archetypespan">
            <div class="archetypelogo">
                <img src="images/darkdepths.jpg">
            </div>
            <div class="archetypetext">
                <p><b>Dark Depths</b></p>
                <p>Where Lands will try to control the board, these decks try to make 
                    <a href="https://scryfall.com/card/2xm/314/dark-depths" target="_blank">one really big creature</a> 
                    to win as fast as possible.
                </p>
            </div>
        </span>
        <span class="archetypespan">
            <div class="archetypelogo">
                <img src="images/showandtell.jpeg">
            </div>
            <div class="archetypetext">
                <p><b>Sneak and Show</b></p>
                <p>A blue and red deck with cards that get around paying for truly 
                    <a href="https://scryfall.com/card/mm3/72/griselbrand" target="_blank">big</a> 
                    <a href="https://scryfall.com/card/uma/4/emrakul-the-aeons-torn" target="_blank">creatures</a>, usually by letting their opponent 
                    <a href="https://scryfall.com/card/cn2/121/show-and-tell" target="_blank">put something into play as well</a> or 
                    <a href="https://scryfall.com/card/2xm/145/sneak-attack" target="_blank"> only having the creature for a turn</a>.</p>
            </div>
        </span>
    </div>
</body>
</html>