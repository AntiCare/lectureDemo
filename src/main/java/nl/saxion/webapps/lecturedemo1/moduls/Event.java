package nl.saxion.webapps.lecturedemo1.moduls;

public class Event {
     int id;
    private static int idCounter = 0;
    private String eventName;
    private String description;
    private int amount;
    private String date;

    public Event(String eventName,String description,int amount,String date) {
        this.id = idCounter++;
        this.eventName=eventName;
        this.description=description;
        this.amount=amount;
        this.date=date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}
