package Data;

import java.util.HashMap;

public class UserDatabase {
    private static HashMap<Integer, Player> playerList; // playerID player
    private static HashMap<String, Integer> playerIDList;  //username playerID


    public static void loadPlayers() {
        //Person objects
        Player p1 = new Player("Tommy","caragolt");
        Player p2 = new Player("Joey","bestteacher");
        Player p3 = new Player("Default","username");
    }

    public static boolean validateUser(String username, String password) {
        int playerID = playerIDList.get(username);
        boolean validUsername = playerList.containsKey(username);
        if(validUsername) {
            return (password.equals(playerList.get(playerID).getPassword()));
        }
        else
            return false;
    }


}
