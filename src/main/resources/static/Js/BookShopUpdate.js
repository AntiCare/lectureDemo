

/*
    Update book shop.
 */
//Define the form, ready to use fetch.
const myForm3 =document.getElementById('updateBookShop');
myForm3.addEventListener('submit',function (m) {
    m.preventDefault();
    const fromData3 =new FormData(this);
//use fetch send the data to backend.
    fetch('/updateBookShop/update',{
        method:'PUT',
        body:fromData3
    }).then(res=>res.json())
        .then(data=>{
            //get the res from backend, if res != null, jump to bookShop page(home page).
            // console.log(data);
            if (data.toString()==="200"){
                window.location.href="/bookShops";
            }else {
                alert("update bookshop failed!")
            }
        })
        .catch(function (error) {
            console.error(error);
        })
});
