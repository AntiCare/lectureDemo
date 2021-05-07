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




    @GetMapping(path = "/addBookShop")
    public Object AddBookShop(){
        return "AddBookShop";
    }




    @GetMapping(path = "/expansion")
    public String Expansion(){
        return "Expansion";
    }



}
