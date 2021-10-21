package Data;

import java.util.HashMap;

public class UserDatabase {
    private static HashMap<Integer, Player> playerList; // playerID player
    private static HashMap<String, Integer> playerIDList;  //username playerID


    public static void loadPlayers() {
        //Person objects
        Player player1 = new Player("Tommy","caragolt");

        playerIDList.put("Joey","saint123");
    }

    public static boolean validateUser(String username, String password) {

        boolean validUsername = userLoginDatabase.containsKey(username);
        if(validUsername) {
            return (password.equals(userDatabase.get(username)));
        }
        else
            return false;
    }


}
