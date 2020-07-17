package nl.saxion.webapps.lecturedemo1.moduls;

public class Friends {
    String friendName;
    int gameLevel;
    int age;
    private int id;
    private static int idCounter = 0;

    public Friends (String friendName,int age,int gameLevel) {
        this.friendName=friendName;
        this.age=age;
        this.gameLevel=gameLevel;
        this.id = idCounter++;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public int getGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(int gameLevel) {
        this.gameLevel = gameLevel;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "friendName='" + friendName + '\'' +
                ", gameLevel=" + gameLevel +
                ", age=" + age +
                '}';
    }
}
