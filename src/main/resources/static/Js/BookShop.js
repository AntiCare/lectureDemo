

var main = document.getElementById("main");
var button = document.getElementById("addButton");
var table = document.createElement("li");
var title = document.createElement("h2");
var description = document.createElement("p");
var amount = document.createElement("p");
var date = document.createElement("p");
table.className = "pricingTable-firstTable_table";
title.innerHTML="11111";
description.innerHTML = "2222";
amount.innerHTML="333";
date.innerHTML="444";
main.insertBefore(table,button);
table.appendChild(title);
table.appendChild(description);
table.appendChild(amount);
table.appendChild(date);




// document.getElementById("add").addEventListener("click",function() {
//     var main = document.getElementById("main");
//     var button = document.getElementById("addButton");
//     var table = document.createElement("li");
//     var title = document.createElement("h2");
//     var description = document.createElement("p");
//     var amount = document.createElement("p");
//     var date = document.createElement("p");
//     table.className = "pricingTable-firstTable_table";
//     title.innerHTML="11111";
//     description.innerHTML = "2222";
//     amount.innerHTML="333";
//     date.innerHTML="444";
//     main.insertBefore(table,button);
//     table.appendChild(title);
//     table.appendChild(description);
//     table.appendChild(amount);
//     table.appendChild(date);
//
// });








