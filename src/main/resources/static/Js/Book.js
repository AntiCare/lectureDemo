/**
 * change title to bookshop name.
 */

fetch('/books/getShopName',{
    method:'get',
}).then(res=>res.text())
    .then(data=>{
        if (data!=null){
            document.getElementById("title").innerHTML=data;
           console.log(data);
        }
    })
    .catch(function (error) {
        console.error(error);
    })


/**
 * get books
 */


