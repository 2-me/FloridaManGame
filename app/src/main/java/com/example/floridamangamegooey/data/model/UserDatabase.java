package com.example.floridamangamegooey.data.model;

import java.util.HashMap;

public class UserDatabase {
    private static HashMap<String, String> userDatabase;
    private static HashMap<String, String> userLoginDatabase;  //username password


    public static void loadUsers() {
        //Person objects

        userDatabase.put("Joey","saint123");
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
