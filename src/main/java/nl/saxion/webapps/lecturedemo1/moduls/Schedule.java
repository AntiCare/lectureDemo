package nl.saxion.webapps.lecturedemo1.moduls;

public class Schedule {
    String name;
    String gameName;
    String friends;
    String scheduleDescription;
    String date;
    private int id;
    private static int idCounter = 0;
    public Schedule (String name,String scheduleDescription,String date,String gameName,String friends) {
        this.name=name;
        this.gameName=gameName;
        this.friends=friends;
        this.scheduleDescription=scheduleDescription;
        this.date=date;
        this.id = idCounter++;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getFriends() {
        return friends;
    }

    public void setFriends(String friends) {
        this.friends = friends;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScheduleDescription() {
        return scheduleDescription;
    }

    public void setScheduleDescription(String scheduleDescription) {
        this.scheduleDescription = scheduleDescription;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "name='" + name + '\'' +
                ", gameName='" + gameName + '\'' +
                ", friends='" + friends + '\'' +
                ", scheduleDescription='" + scheduleDescription + '\'' +
                ", date='" + date + '\'' +
                ", id=" + id +
                '}';
    }
}
