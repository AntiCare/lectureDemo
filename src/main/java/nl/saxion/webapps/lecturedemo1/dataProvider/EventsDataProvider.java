package nl.saxion.webapps.lecturedemo1.dataProvider;

import nl.saxion.webapps.lecturedemo1.moduls.Event;

import java.util.ArrayList;

public class EventsDataProvider {
    private static ArrayList<Event> events;
    static  {
        events = new ArrayList<Event>();
//        events.add(new Event("aa","aaa",-3.8,"2000/1/1"));
    }

    public static ArrayList<Event> getEvents() {
        return events;
    }


    public static Event getEventByIndex(Integer id) {
        for (Event e: events) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public static void addEvent(Event event) {
        events.add(event);
    }
}
