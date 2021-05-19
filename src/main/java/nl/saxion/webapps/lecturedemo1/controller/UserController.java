package nl.saxion.webapps.lecturedemo1.controller;

import nl.saxion.webapps.lecturedemo1.moduls.User;
import nl.saxion.webapps.lecturedemo1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;
    public static User userLogin;


    @RequestMapping("/register/add")
    public Object addUser( @RequestParam(value="email") String email , @RequestParam(value="password") String password) {
       User user = new User(email,password);
        if (userService.add(user)){
            return "index";
        }else {
            return "Register";
        }
    }

    @RequestMapping("/index/confirm")
    public Object getUser(@RequestParam(value="email") String email , @RequestParam(value="password") String password) {
        User user = new User(email,password);
        if (userService.confirm(user)) {
            userLogin =user;
            BookShopController.showUserShop.clear();
            return "redirect:/bookShops";
        }else {
            return "redirect:/index";
        }
    }

    @GetMapping(path = "/index")
    public String login(){
        return "index";
    }

    @GetMapping(path = "/register")
    public String register(){
        return "Register";
    }


}
