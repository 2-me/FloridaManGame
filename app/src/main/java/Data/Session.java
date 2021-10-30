package Data;

public class Session {

    private static int correct = 0;
    private static int wrong = 0;
    private static String name;
    private static String username;
    private static String password;

    public static void setCurrentPlayer(Object currentPlayer) { CurrentPlayer = currentPlayer; }

    private static Object CurrentPlayer;

    public static void setSessionUsername(String username) {
        Session.username = username;
    }

    public static void setSessionPassword(String password) {
        Session.password = password;
    }

    public static void addCorrect() {
        correct++;
    }

    public static int getCorrect() {
        return correct;
    }

    public static void addWrong() {
        wrong++;
    }

    public static int getWrong() {
        return wrong;
    }

    public static void resetCorrect() { correct = 0; }

    public static void resetWrong() { wrong = 0; }

    private static String getName() {
        return name;
    }

    public static void resetSessionData(){
        Session.resetCorrect();
        Session.resetWrong();
    }
}
