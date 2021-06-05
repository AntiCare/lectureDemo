
var bookShop_name;
var bookShop_id

/**
 * change title to bookshop name.
 */

fetch('/books/getShopName',{
    method:'get',
}).then(res=>res.text())
    .then(data=>{
        if (data!=null){
            bookShop_name=data.toString().substring(0, data.toString().indexOf(";"));
            bookShop_id=data.toString().substring(data.toString().indexOf(";")+1, data.toString().length);
            document.getElementById("title").innerHTML=bookShop_name;
           console.log(data);
        }
    })
    .catch(function (error) {
        console.error(error);
    })


/**
 * get books
 */

fetch('/api/getBooks',{
    method:'get'
}).then(res=>res.json())
    .then(data=>{

        console.log(data[0]);
        //Prevent the response of get shop name request slower than this request.
        if(bookShop_name===null){
            console.log("wait");
            sleepFor(1000);
        }
        if(data!=null){
            for (var i = 0; i < data.length; i++){
                if (data[i].bookName!= null){
                    if(data[i].shop_id.toString()===bookShop_id){
                    //create value in table.
                    var main = document.getElementById("main");
                    var button = document.getElementById("addButton");
                    var table = document.createElement("li");


                    var bookName = document.createElement("h2");
                    var stock = document.createElement("p");
                    var price = document.createElement("p");
                    var category = document.createElement("p");
                    var description = document.createElement("p");

                    var deleteButton = document.createElement("button");
                    var updateButton = document.createElement("button");


                    //set class name/id.
                    table.className = "pricingTable-firstTable_table";
                    deleteButton.className="buttons";
                    deleteButton.id=data[i].id.toString();
                    updateButton.className="buttons";
                    updateButton.id="update"+data[i].id.toString();

                    //Assignment.
                    bookName.innerHTML=data[i].bookName;
                    stock.innerHTML = data[i].stock;
                    price.innerHTML=data[i].price;
                    category.innerHTML=data[i].category;
                    description.innerHTML=data[i].description;
                    deleteButton.innerHTML="Delete";
                    updateButton.innerHTML="Update";

                    /**
                     Delete book .
                     */
                    //when click "delete" button , the element will be deleted.
                    //use fetch to send id to backend. but this id start from 0, so it need to add 1 later at backend because mySQL start from 1.
                    deleteButton.addEventListener('click',function (event) {
                        var id = this.id;
                        fetch('/api/deleteBook/'+id,{
                            method:'DELETE',
                        })
                            .then(res => res.json())
                            .then(data => {
                                if (data.toString()==="406"){
                                    alert("delete book failed!")
                                }
                            })
                            .then(()=>location.reload())
                            .catch(err => console.log(err));
                    })

                    /**
                     * Update book .
                     */
                    updateButton.addEventListener('click',function (event) {
                            var id = this.id.replace("update","");
                            window.location.href='/update/'+id+'/updateBooks';
                    })





                    //Insert value.
                    main.insertBefore(table,button);
                    table.appendChild(bookName);
                    table.appendChild(stock);
                    table.appendChild(price);
                    table.appendChild(category);
                    table.appendChild(description);
                    table.appendChild(deleteButton);
                    table.appendChild(updateButton);
                    }
                }
            }
        }

    })
    .catch(function (error) {
        console.error(error);
    });

function sleepFor( sleepDuration ){
    var now = new Date().getTime();
    while(new Date().getTime() < now + sleepDuration){ /* do nothing */ }
}





