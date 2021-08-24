function searchDB(){
    var NUMBER = 3;
    if (NUMBER == "" || NUMBER <= 0) {
        console.log("NO NUMBER FOUND FOR AMOUNT");
        alert("A number greater than 0 must be entered");
        return false;
    }
    var ITEM = document.getElementById("itemname");
    const FORM = document.getElementById("parameteres");
    for(let i = 0; i < NUMBER; i++) {
        var returningItem = document.createElement("div");
		returningItem.id = "results";
        returningItem.className = "searchresults";
        var newItem = document.createTextNode("${dto_"+i+".name}");
        returningItem.appendChild(newItem);
        document.body.insertBefore(returningItem, FORM);
    }
    return false;
}