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
                    var main = document.getElementById("main");
                    var button = document.getElementById("addButton");
                    var table = document.createElement("li");
                    var title = document.createElement("h2");
                    var description = document.createElement("p");
                    var amount = document.createElement("p");
                    var date = document.createElement("p");
                    table.className = "pricingTable-firstTable_table";
                    title.innerHTML=data[i].shopName;
                    description.innerHTML = data[i].employeeNum;
                    amount.innerHTML=data[i].address;
                    date.innerHTML=data[i].phoneNumber;
                    main.insertBefore(table,button);
                    table.appendChild(title);
                    table.appendChild(description);
                    table.appendChild(amount);
                    table.appendChild(date);
                }



            }

        })
        .catch(function (error) {
            console.error(error);
        });

















