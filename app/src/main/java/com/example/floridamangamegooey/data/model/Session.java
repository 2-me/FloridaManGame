package com.example.floridamangamegooey.data.model;

public class Session {

    private static int correct = 0;
    private static int wrong = 0;
    private static String name;


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
