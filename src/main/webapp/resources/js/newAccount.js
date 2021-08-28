/*
 * This script checks the account parameters to make sure they are correct before saving it to the Database as a new user
 */
function checkPassword() {  
    var pass1 = document.getElementById("pass").value; 
    var pass2 = document.getElementById("electricBoogaloo").value; 

    if(pass1.length < 5) {
	   console.log("Username requirment not met!");
       document.getElementById("passError").innerHTML = "Password can't be less than 5 characters!";  
       return false;  
    }  
    
    if(pass1.length > 50) {  
	   console.log("Password requirment not met!");
       document.getElementById("passError").innerHTML = "Password can't be more than 50 characters!";  
       return false;  
    } 

    if(pass1 != pass2){
		console.log("Password mismatch!!");
        document.getElementById("passErrorBoogaloo").innerHTML = "Passwords didn't match!";
        return false;
    } else {
        return true;
    }
} 