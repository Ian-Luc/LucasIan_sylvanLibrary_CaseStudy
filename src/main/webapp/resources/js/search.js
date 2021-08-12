function searchDB(){
    var FORMAT = document.getElementById("format").value;
    var TYPE = document.getElementById("archetype").value;
    var NUMBER = document.getElementById("amount").value;
    if (NUMBER == "" || NUMBER <= 0) {
        console.log("NO NUMBER FOUND FOR AMOUNT");
        alert("A number greater than 0 must be entered");
        return false;
    }
    var BODY;
    var ITEM = document.getElementById("itemname");
    const FORM = document.getElementById("parameteres");
    for(let i = 0; i < NUMBER; i++) {
        var returningItem = document.createElement("div");
        returningItem.className = "searchresults";
        var newItem = document.createTextNode(`This is where I would put my ${ITEM.value}... IF I HAD ANY`);
        returningItem.appendChild(newItem);
        document.body.insertBefore(returningItem, FORM);
    }
    return false;
}