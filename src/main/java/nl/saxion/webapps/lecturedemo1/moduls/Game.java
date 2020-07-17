package nl.saxion.webapps.lecturedemo1.moduls;

public class Game {
    String gameName;
    String type;
    String gameDescription;
    String addDate;
    int numberOfExpansion;

    public Game (String gameName,String type,String gameDescription,String addDate,int numberOfExpansion) {
        this.gameName=gameName;
        this.type=type;
        this.gameDescription=gameDescription;
        this.addDate=addDate;
        this.numberOfExpansion=numberOfExpansion;

    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public int getNumberOfExpansion() {
        return numberOfExpansion;
    }

    public void setNumberOfExpansion(int numberOfExpansion) {
        this.numberOfExpansion = numberOfExpansion;
    }
}
