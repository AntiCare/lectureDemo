package nl.saxion.webapps.lecturedemo1;

import nl.saxion.webapps.lecturedemo1.moduls.Friends;
import nl.saxion.webapps.lecturedemo1.moduls.FriendsDataProvider;
import nl.saxion.webapps.lecturedemo1.moduls.Schedule;
import nl.saxion.webapps.lecturedemo1.moduls.ScheduleDataProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class GameController {

    @GetMapping(path = "/login")
    public String login(){
        return "Login";
    }

    @GetMapping(path = "/register")
    public String register(){
        return "Register";
    }


    @GetMapping(path = "/game")
    public String Game(){
        return "Game";
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
