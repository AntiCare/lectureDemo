/**
    Add book shop.
 */
//Define the form, ready to use fetch.
    const myForm2 =document.getElementById('addBookShop');
    myForm2.addEventListener('submit',function (m) {
        m.preventDefault();
        const fromData2 =new FormData(this);
//use fetch send the data to backend.
        fetch('/addBookShop/add',{
            method:'post',
            body:fromData2
        }).then(res=>res.json())
        .then(data=>{
            //get the res from backend, if res != null, jump to bookShop page(home page).
            // console.log(data);
            if (data.toString()==="200"){
                window.location.href="/bookShops";
            }else {
                alert("add bookshop failed!")
            }
        })
        .catch(function (error) {
            console.error(error);
        })
    });




