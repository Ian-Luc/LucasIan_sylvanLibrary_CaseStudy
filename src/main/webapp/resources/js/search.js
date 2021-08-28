function searchDB(){
	var NUMBER = 1;
    const FORM = document.getElementById("parameteres");
    for(let i = 0; i < NUMBER; i++) {
        var returningItem = document.createElement("div");
		returningItem.id = "results";
        returningItem.className = "searchresults";
        var newItem = document.createTextNode(`${dto_`+i+`.name}`);
        returningItem.appendChild(newItem);
        document.body.insertBefore(returningItem, FORM);
    }
    return false;
}

function searchAndDestroy(item) {
	document.removeChild(document.getElementByid("parameters"));
	createSearch(item);
	return true;
}

function createSearch(item){
	var searchParameters = document.createElement("form");
	searchParameters.setAttribute("class", "searchparameters");
	searchParameters.setAttribute("action", "./searchBy"+item);
	searchParameters.setAttribute("id", "parameters");
	searchParameters.setAttribute("name", "parameters");
	searchParameters.setAttribute("method", "post");
	searchParameters.innerHTML('<div> '
            +'<p>Choose Format: </p>'
            +'<select name="format" id="format">'
            +'<option value="legacy">Legacy</option>'
            +'<option value="modern">Modern</option>'
            +'<option value="pioneer">Pioneer</option>'
            +'</select>'
            +'<input type="text" name="item" id="itemname" '
            +'placeholder="Enter what you want to find" required />'
            +'<input type="submit" id="pressme" value="Find Tech!" />'
        +'</div>');
	searchParameters.append(document.getElementById("searchbuddy"));
	return true;
}

document.addEventListener("DOMConentLoaded", createSearch("Deck"));
document.getElementById("chooseDeck").addEventListener("click", searchAndDestroy("Deck"));
document.getElementById("chooseCard").addEventListener("click", searchAndDestroy("Card"));