package nl.saxion.webapps.lecturedemo1.dataProvider;

import nl.saxion.webapps.lecturedemo1.moduls.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventsDataProvider {
    public static ArrayList<Event> eventss;
    static  {
        eventss = new ArrayList<Event>();
//        events.add(new Event("aa","aaa",-3.8,"2000/1/1"));
    }

    public static ArrayList<Event> getEvents() {
        return eventss;
    }


    public static Event getEventByIndex(Integer id) {
        for (Event e: eventss) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public static void addEvent(Event event) {
        eventss.add(event);
    }




}
