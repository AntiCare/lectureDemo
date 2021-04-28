package nl.saxion.webapps.lecturedemo1.service;

import nl.saxion.webapps.lecturedemo1.moduls.Schedule;

import java.util.ArrayList;

public class ScheduleDataProvider {
    private static ArrayList<Schedule> schedules;
    static  {
        schedules = new ArrayList<Schedule>();
        schedules.add(new Schedule("Yang", "aaaaa", "100/100","sea","asaasa"));
    }

    public static ArrayList<Schedule> getSchedules() {
        return schedules;
    }



    public static Schedule getScheduleByIndex(Integer id) {
        for (Schedule e: schedules) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public static void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }
}
