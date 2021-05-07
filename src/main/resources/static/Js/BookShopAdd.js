




//use fetch send the data to backend.
    const myForm2 =document.getElementById('addBookShop');
    myForm2.addEventListener('submit',function (m) {
        m.preventDefault();
        const fromData2 =new FormData(this);

        fetch('/addBookShop/add',{
            method:'post',
            body:fromData2
        }).then(res=>res.json())
        .then(data=>{
            // console.log(data);
            if (data!=null){
                window.location.href="/bookShops";
            }
        })
        .catch(function (error) {
            console.error(error);
        })
    });




