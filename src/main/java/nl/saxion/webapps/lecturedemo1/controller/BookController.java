package nl.saxion.webapps.lecturedemo1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BookController {

    @GetMapping(path = "{id}/books")
    public Object AddBookShop(@PathVariable("id") String id) {
     BookShopController.shop_id = Integer.parseInt(id);
        System.out.println(BookShopController.shop_id);
        return "Book";
    }

    @RequestMapping(path = "/books/getShopName")
    @ResponseBody
    public Object getShopName(){
        return BookShopController.bookShops.get(BookShopController.shop_id-BookShopController.value).getShopName();
    }


}
