package nl.saxion.webapps.lecturedemo1.controller;

import nl.saxion.webapps.lecturedemo1.moduls.BookShop;
import nl.saxion.webapps.lecturedemo1.service.BookShopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class BookShopController {
    @Resource
    private BookShopService bookShopService;

    @RequestMapping("/bookShops")
    public String bookShop() {
        return "BookShop";
    }

    @RequestMapping(path = "/addBookShop/add")
    public Object AddBookShopAdd(BookShop bookShop){
        bookShopService.add(bookShop);
        System.out.println(bookShop);
        return "BookShop";
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
