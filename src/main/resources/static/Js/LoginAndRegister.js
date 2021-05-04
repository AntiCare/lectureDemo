

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

function sendData() {
    //use fetch send the data to backend.
    const myForm =document.getElementById('myForm');
    myForm.addEventListener('submit',function (e) {
        e.preventDefault();
        const fromData =new FormData(this);

        fetch('/register/add',{
            method:'post',
            body:fromData
        }).then(function (response) {
            if(response.ok){
                //返回上一页。
                return window.history.back();
            }
        }).then(function (text) {
            console.log(text);
        }).catch(function (error) {
            console.error(error);
        })
    });
}





