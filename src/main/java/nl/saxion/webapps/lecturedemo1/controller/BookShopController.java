package nl.saxion.webapps.lecturedemo1.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import nl.saxion.webapps.lecturedemo1.moduls.User;
import nl.saxion.webapps.lecturedemo1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class BookShopController {

    @RequestMapping("/bookShops")
    public String bookShop() {
        return "BookShop";
    }

    @GetMapping(path = "/expansion")
    public String Expansion(){
        return "Expansion";
    }

    @GetMapping(path = "/addGame")
    public String AddGame(){
        return "AddGame";
    }








}
