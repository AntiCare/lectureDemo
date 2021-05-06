package nl.saxion.webapps.lecturedemo1.controller;

import nl.saxion.webapps.lecturedemo1.moduls.User;
import nl.saxion.webapps.lecturedemo1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/register/add")
    public Object addUser(User user) {
        if (userService.add(user)){
            return "Login";
        }else {
            return "Register";
        }

    }

    @RequestMapping("/login/confirm")
    public Object getUser(User user) {
        if (userService.confirm(user)) {
            return "redirect:/bookShops";
        }else {
            return "redirect:/login";
        }
    }

    @GetMapping(path = "/login")
    public String login(){
        return "Login";
    }

    @GetMapping(path = "/register")
    public String register(){
        return "Register";
    }


}
