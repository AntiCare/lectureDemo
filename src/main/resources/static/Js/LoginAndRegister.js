
//For login and registration, I use form to transfer data directly. I use fetch for bookShop & book.
//check the format of email & password input.
function checkLoginFormat(){
    var emailInput = document.forms["mForm"]["email"].value;
    var a = emailInput.indexOf("@");
    var b = emailInput.lastIndexOf(".");
    if (a<1 || b<a+2 || b+2 >= emailInput.length){
        alert("Email format error! Please enter the correct email.");
        return false;
    }
    var passwordInput = document.forms["mForm"]["password"].value;
    if (passwordInput === "" || passwordInput==null){
        alert("Please enter password!");
        return false;
    }
}

//check the format of email , password confirm .
function checkRegisterFormat(){
    var emailInput = document.forms["mForm"]["email"].value;
    var a = emailInput.indexOf("@");
    var b = emailInput.lastIndexOf(".");
    if (a<1 || b<a+2 || b+2 >= emailInput.length){
        alert("Email format error! Please enter the correct email.");
        return false;
    }
    var passwordInput = document.forms["mForm"]["password"].value;
    var confirmPassword = document.forms["mForm"]["cPassword"].value;
    if (passwordInput !==confirmPassword){
        alert("password and confirm password are inconsistent!");
        return false;
    }
}







