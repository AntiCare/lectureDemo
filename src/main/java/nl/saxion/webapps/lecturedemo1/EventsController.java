package nl.saxion.webapps.lecturedemo1;

import nl.saxion.webapps.lecturedemo1.moduls.Event;
import nl.saxion.webapps.lecturedemo1.moduls.EventsDataProvider;
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
public class EventsController {

    @GetMapping(path = "/events")
    public String Events(Model model){
        model.addAttribute("events", EventsDataProvider.getEvents());
        return "Events";
    }

    @PostMapping("/addEvent")
    @ResponseBody
    public ResponseEntity<Event> addEvent(Event events) {
        EventsDataProvider.addEvent(events);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/hello/events");
        return new ResponseEntity<>(headers, HttpStatus.SEE_OTHER);
    }

}
