/**
 * Get book shop.
 */
fetch('/api/getBooksShops',{
        method:'get'
    }).then(res=>res.json())
        .then(data=>{
            if(data!=null){
                for (var i = 0; i < data.length; i++){

                    if (data[i].shopName!= null){
                        //create value in table.
                        var main = document.getElementById("main");
                        var button = document.getElementById("addButton");
                        var table = document.createElement("li");
                        var shopName = document.createElement("h2");
                        var employeeNum = document.createElement("p");
                        var address = document.createElement("p");
                        var phoneNumber = document.createElement("p");
                        var deleteButton = document.createElement("button");
                        var updateButton = document.createElement("button");
                        var bookButton = document.createElement("button");

                        //set class name/id.
                        table.className = "pricingTable-firstTable_table";
                        deleteButton.className="buttons";
                        deleteButton.id=data[i].id.toString();
                        updateButton.className="buttons";
                        updateButton.id="update"+data[i].id.toString();
                        bookButton.className="buttons";
                        bookButton.id ="book"+data[i].id.toString();

                        //Assignment.
                        shopName.innerHTML=data[i].shopName;
                        employeeNum.innerHTML = data[i].employeeNum;
                        address.innerHTML=data[i].address;
                        phoneNumber.innerHTML=data[i].phoneNumber;
                        deleteButton.innerHTML="Delete";
                        updateButton.innerHTML="Update";
                        bookButton.innerHTML="book detail";

                        /**
                            Delete book shop.
                         */
                        //when click "delete" button , the element will be deleted.
                        //use fetch to send id to backend. but this id start from 0, so it need to add 1 later at backend because mySQL start from 1.
                        deleteButton.addEventListener('click',function (event) {
                            var id = this.id;
                            fetch('/api/deleteBookshop/'+id,{
                                method:'DELETE',
                            })
                                .then(res => res.json())
                                .then(data => {
                                    if (data.toString()==="406"){
                                        alert("delete book shop failed!")
                                    }
                                })
                                .then(()=>location.reload())
                                .catch(err => console.log(err));
                        })

                        /**
                         * Update book shop.
                         */
                        updateButton.addEventListener('click',function (event) {
                            var id = this.id.replace("update","");
                           window.location.href='/bookShops/update/'+id;

                        });




                        /**
                         * jump to book page
                         */
                        bookButton.addEventListener('click',function (m){
                            var id = this.id.replace("book","");
                            window.location.href= id+'/books';
                        })

                        //Insert value.
                        main.insertBefore(table,button);
                        table.appendChild(shopName);
                        table.appendChild(employeeNum);
                        table.appendChild(address);
                        table.appendChild(phoneNumber);
                        table.appendChild(deleteButton);
                        table.appendChild(updateButton);
                        table.appendChild(bookButton);
                    }

                }
            }

        })
        .catch(function (error) {
            console.error(error);
        });


















