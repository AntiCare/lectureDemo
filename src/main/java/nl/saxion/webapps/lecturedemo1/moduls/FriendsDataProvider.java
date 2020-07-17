package nl.saxion.webapps.lecturedemo1.moduls;

import java.util.ArrayList;

public class FriendsDataProvider {
    private static ArrayList<Friends> friends;
    static  {
        friends = new ArrayList<Friends>();
        friends.add(new Friends("ChengYang", 20, 10));
    }

    public static ArrayList<Friends> getFriends() {
        return friends;
    }


    public static Friends getFriendByIndex(Integer id) {
        for (Friends e: friends) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public static void addFriend(Friends friend) {
        friends.add(friend);
    }
}
