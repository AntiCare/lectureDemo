package nl.saxion.webapps.lecturedemo1;

import nl.saxion.webapps.lecturedemo1.moduls.Friends;
import nl.saxion.webapps.lecturedemo1.moduls.FriendsDataProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class FriendsController {

    @GetMapping(path = "/friends")
    public String Friends(Model model){
        model.addAttribute("friends", FriendsDataProvider.getFriends());
        return "Friends";
    }

    @PostMapping("/addFriend")
    @ResponseBody
    public ResponseEntity<Friends> addFriend(Friends friends) {
        FriendsDataProvider.addFriend(friends);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/hello/Friends");
        return new ResponseEntity<>(headers, HttpStatus.SEE_OTHER);
    }

}
