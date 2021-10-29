package Data;

import java.util.HashMap;
import java.util.Objects;

public class UserDatabase {
    private static HashMap<String, Integer> playerIDList = new HashMap<>();  //username playerID
    private static HashMap<Integer, Player> playerList = new HashMap<>(); // playerID player

    public static Player getPlayer(String username) {
        Integer playerID = playerIDList.get(username);
        return playerList.get(playerID);
    }

    public static void loadPlayers() {
        Player p1 = new Player("Tommy","caragolt", "saint123");
        playerIDList.put(p1.getUsername(),p1.getPlayerID());
        playerList.put(p1.getPlayerID(),p1);
        Player p2 = new Player("Joey","bestteacher", "giveMeAnA");
        playerIDList.put(p2.getUsername(),p2.getPlayerID());
        playerList.put(p2.getPlayerID(),p2);
        Player p3 = new Player("Default","username","password");
        playerIDList.put(p3.getUsername(),p3.getPlayerID());
        playerList.put(p3.getPlayerID(),p3);
        Player p4 = new Player("UserA","a","a");
        playerIDList.put(p4.getUsername(),p4.getPlayerID());
        playerList.put(p4.getPlayerID(),p4);
    }

    public static boolean validateUser(String username, String password) {
        if(playerIDList.containsKey(username)) {
            int playerID = playerIDList.get(username);
            return (Objects.equals(password,(playerList.get(playerID)).getPassword()));
        }
        else
            return false;
    }


}
