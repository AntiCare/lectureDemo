/**
 * add book.
 */

//Define the form, ready to use fetch.
const myForm =document.getElementById('addBook');
myForm.addEventListener('submit',function (m) {
    m.preventDefault();
    const fromData2 =new FormData(this);
//use fetch send the data to backend.
    fetch('/api/addBook',{
        method:'post',
        body:fromData2
    }).then(res=>res.json())
        .then(data=>{
            //get the res from backend, if res != null, jump to bookShop page(home page).
            // console.log(data);
            if (data.toString()==="500"){
                alert("add book failed!");
            }else {
                window.location.href=data+"/books";
            }
        })
        .catch(function (error) {
            console.error(error);
        })
});