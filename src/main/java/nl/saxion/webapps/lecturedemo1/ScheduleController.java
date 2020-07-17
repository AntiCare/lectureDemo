package nl.saxion.webapps.lecturedemo1;

import nl.saxion.webapps.lecturedemo1.moduls.Schedule;
import nl.saxion.webapps.lecturedemo1.moduls.ScheduleDataProvider;
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
public class ScheduleController {
    @GetMapping(path = "/Schedule")
    public String Schedule(Model model){
        model.addAttribute("schedules", ScheduleDataProvider.getSchedules());
        return "Schedule";
    }

    @PostMapping("/addSchedule")
    @ResponseBody
    public ResponseEntity<Schedule> addSchedule(Schedule schedule) {
        ScheduleDataProvider.addSchedule(schedule);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/hello/Schedule");
        return new ResponseEntity<>(headers, HttpStatus.SEE_OTHER);
    }
}
