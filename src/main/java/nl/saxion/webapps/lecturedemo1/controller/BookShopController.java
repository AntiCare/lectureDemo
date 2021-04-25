package nl.saxion.webapps.lecturedemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class BookShopController {

    @GetMapping(path = "/login")
    public String login(){
        return "Login";
    }

    @GetMapping(path = "/register")
    public String register(){
        return "Register";
    }


    @RequestMapping("/bookShops")
    public String addUser1(String email,String password) {
        if(email!=null && password!=null) {
            System.out.println(email);
            System.out.println(password);
        }
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
