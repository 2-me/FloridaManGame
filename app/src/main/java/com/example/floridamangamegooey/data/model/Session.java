package com.example.floridamangamegooey.data.model;

public class Session {

    private static int correct = 0;
    private static int wrong = 0;
    private static String name;
    private static String username;
    private static String password;

    public static void setSessionUsername(String username) {
        Session.username = username;
    }

    public static void setSessionPassword(String password) {
        Session.password = password;
    }

    public static void increaseCorrect() {
        correct++;
    }

    public static void increaseWrong() {
        wrong++;
    }

    private static String getName() {
        return name;
    }
}
