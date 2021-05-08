// var main = document.getElementById("main");
// var button = document.getElementById("addButton");
// var table = document.createElement("li");
// var title = document.createElement("h2");
// var description = document.createElement("p");
// var amount = document.createElement("p");
// var date = document.createElement("p");
// table.className = "pricingTable-firstTable_table";
// title.innerHTML="11111";
// description.innerHTML = "2222";
// amount.innerHTML="333";
// date.innerHTML="444";
// main.insertBefore(table,button);
// table.appendChild(title);
// table.appendChild(description);
// table.appendChild(amount);
// table.appendChild(date);



fetch('/bookShops/get',{
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

                        //set class name/id.
                        table.className = "pricingTable-firstTable_table";
                        deleteButton.className="deleteButton";
                        deleteButton.id=i.toString();

                        //Assignment.
                        shopName.innerHTML=data[i].shopName;
                        employeeNum.innerHTML = data[i].employeeNum;
                        address.innerHTML=data[i].address;
                        phoneNumber.innerHTML=data[i].phoneNumber;
                        deleteButton.innerHTML="Delete";

                        //when click "delete" button , the element will be deleted.
                        //use fetch to send id to backend. but this id start from 0, so it need to add 1 later at backend.
                        deleteButton.addEventListener('click',function (event) {
                            var id = this.id;
                            fetch('/bookShops/delete/'+id,{
                                method:'DELETE',
                            })
                                .then(res => res.json())
                                .then(data => {
                                })
                                .then(()=>location.reload())
                                .catch(err => console.log(err));
                        })

                        //Insert value.
                        main.insertBefore(table,button);
                        table.appendChild(shopName);
                        table.appendChild(employeeNum);
                        table.appendChild(address);
                        table.appendChild(phoneNumber);
                        table.appendChild(deleteButton);
                    }

                }
            }

        })
        .catch(function (error) {
            console.error(error);
        });


















