//use fetch send the data to backend.
const myForm2 =document.getElementById('addBookShop');
myForm2.addEventListener('submit',function (m) {
    m.preventDefault();
    const fromData2 =new FormData(this);

    fetch('/addBookShop/add',{
        method:'post',
        body:fromData2
    }).then(function (response) {
        if(response.ok){
            window.location.href ="/bookShops";
        }
    }).then(function (text) {
        console.log(text);
    }).catch(function (error) {
        console.error(error);
    })
});