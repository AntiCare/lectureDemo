
/**
 Update book .
 */
//Define the form, ready to use fetch.
const myForm =document.getElementById('updateBook');
myForm.addEventListener('submit',function (m) {
    m.preventDefault();
    const fromData =new FormData(this);
//use fetch send the data to backend.
    fetch('/updateBook/update',{
        method:'PUT',
        body:fromData
    }).then(res=>res.json())
        .then(data=>{
            //get the res from backend, if res != null, jump to bookShop page(home page).
            // console.log(data);
            if (data.toString()==="406"){
                alert("update bookshop failed!")
            }else {
                window.location.href = document.referrer;
            }
        })
        .catch(function (error) {
            console.error(error);
        })
});