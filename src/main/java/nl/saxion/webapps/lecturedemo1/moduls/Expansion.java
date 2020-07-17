package nl.saxion.webapps.lecturedemo1.moduls;

public class Expansion {
    String gamename;
    String expansionName;
    String expansionDescription;
    public Expansion (String gamename, String  expansionName, String expansionDescription) {
        this.gamename=gamename;
        this.expansionDescription=expansionDescription;
        this.expansionName=expansionName;
    }

    public String getGamename() {
        return gamename;
    }

    public void setGamename(String gamename) {
        this.gamename = gamename;
    }

    public String getExpansionName() {
        return expansionName;
    }

    public void setExpansionName(String expansionName) {
        this.expansionName = expansionName;
    }

    public String getExpansionDescription() {
        return expansionDescription;
    }

    public void setExpansionDescription(String expansionDescription) {
        this.expansionDescription = expansionDescription;
    }
}
