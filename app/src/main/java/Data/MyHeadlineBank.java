package Data;

import java.util.HashMap;

public class MyHeadlineBank {
    private static HashMap<Integer, Headline> gameHeadlines = new HashMap<>();


    public static void loadHeadlines() {
        Headline tree = new Headline("Naked Florida Man Humps Tree, Punches ______ ", "Deputy", "Wife", "Child", "Cashier");
        gameHeadlines.put(tree.getHeadlineNumber(),tree);
        Headline tattoo = new Headline("Florida Man With ______ Tattooed on Head Calls 911 for a Ride Home", "State", "Donut", "Swastika", "Fork");
        gameHeadlines.put(tattoo.getHeadlineNumber(),tattoo);
        Headline toes = new Headline("Florida Man Breaks Into Home, Sucks on Sleeping Man’s ______ ", "Toes", "Ear", "Fingers", "Dog");
        gameHeadlines.put(toes.getHeadlineNumber(),toes);
        Headline finger = new Headline("Florida Man Robs 7 Eleven by Pointing ______ Like a Gun at Clerk", "Finger", "Banana", "Stick", "Pencil");
        gameHeadlines.put(finger.getHeadlineNumber(),finger);
        Headline butt = new Headline("Florida Man Threatens to Cut off ______ with Machete over Potato Chips", "Buttocks", "Leg", "Arm", "Hair");
        gameHeadlines.put(butt.getHeadlineNumber(),butt);
        Headline spiderman = new Headline("Florida Man Dressed as ______ Spotted Power Washing Roof", "SpiderMan", "Cop", "Astronaut", "Prisoner");
        gameHeadlines.put(spiderman.getHeadlineNumber(),spiderman);
        Headline coke = new Headline("Florida Man with Cocaine on His ______ Tells Cops It’s Not His", "Nose", "Shirt", "Dog", "Mask");
        gameHeadlines.put(coke.getHeadlineNumber(),coke);
        Headline trump = new Headline("Florida Man Smashes 20 Car Windows, Says ______ Owes Him 1 Trillion Dollars", "Trump", "Obama", "Bill Gates", "Neighbor");
        gameHeadlines.put(trump.getHeadlineNumber(),trump);
        Headline gator = new Headline("Florida man videotaped catching ______ with bare hands faces felony charges", "Gator", "Neighbor's dog", "Bald Eagle", "Wife");
        gameHeadlines.put(gator.getHeadlineNumber(),gator);
        Headline tutu = new Headline("______ Wearing Florida Man Breaks into Farmers Market", "Tutu", "Balaclava", "Dog", "Cat");
        gameHeadlines.put(tutu.getHeadlineNumber(),tutu);
    }

    public static Headline getNextHeadline(int headlineNumber) {
        return gameHeadlines.get(headlineNumber);
    }

    public static boolean outOfHeadlines(int headlineNumber) {
        return headlineNumber <= gameHeadlines.size();
    }

    public static int numOfHeadlines(){
        return gameHeadlines.size();
    }



}
