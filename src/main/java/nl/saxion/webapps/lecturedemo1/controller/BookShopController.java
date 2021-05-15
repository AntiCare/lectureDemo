package nl.saxion.webapps.lecturedemo1.controller;

import nl.saxion.webapps.lecturedemo1.moduls.Book;
import nl.saxion.webapps.lecturedemo1.moduls.BookShop;
import nl.saxion.webapps.lecturedemo1.service.BookShopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
public class BookShopController {

     public static ArrayList<BookShop> bookShops = new ArrayList<>();
     public static int shop_id;

    @Resource
    private BookShopService bookShopService;

    @RequestMapping("/bookShops/get")
    @ResponseBody
    public Object bookShop() {
//        System.out.println(bookShops);
        return bookShops;
    }

    @RequestMapping(path = "/bookShops")
    public Object bookShops(){
        return "BookShop";
    }


    @RequestMapping(path = "/addBookShop/add")
    @ResponseBody
    public Object AddBookShopAdd(BookShop bookShop){

        bookShopService.add(bookShop);
        System.out.println(bookShop);
          bookShops.add(bookShop);
        return bookShop;
    }


    @RequestMapping(path = "/bookShops/delete/{id}")
    @ResponseBody
    public Object deleteBookShop(@PathVariable("id") String id){
         int e = Integer.parseInt(id);
         System.out.println(e);
         bookShops.get(e).setShopName(null);
        bookShopService.delete(e+1);
        return e;
    }


    @GetMapping(path = "/addBookShop")
    public Object AddBookShop(){
        return "AddBookShop";
    }

    @GetMapping(path = "{id}/books")
    public Object AddBookShop(@PathVariable("id") String id) {
        shop_id = Integer.parseInt(id) + 1;
        System.out.println(shop_id);
        return "Book";
    }

    @RequestMapping(path = "/books/getShopName")
    @ResponseBody
    public Object getShopName(){
        return bookShops.get(shop_id-1).getShopName();
    }










}
