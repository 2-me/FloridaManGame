package Data;

import java.util.HashMap;

public class MyHeadlineBank {
    public static HashMap<Integer, Headline> gameHeadlines = new HashMap<>();


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
        Headline manatee = new Headline("Florida Man Saves Drowning _______ After it Ate ‘Toxic Red Tide Seagrass’", "Manatee", "Gator", "Iguana", "Lionfish");
        gameHeadlines.put(manatee.getHeadlineNumber(),manatee);
        Headline grenade = new Headline("________ Found During Florida Man Traffic Stop", "Grenade", "Bazooka", "Cocaine", "Fentanyl");
        gameHeadlines.put(grenade.getHeadlineNumber(),grenade);
        Headline cat = new Headline("Florida Man Shoots, Kills Neighbor in Fight Over _______", "Cat", "Chess Match", "Property Line", "Weather");
        gameHeadlines.put(cat.getHeadlineNumber(),cat);
        Headline child = new Headline("Florida Man Arrested in Apparent Plot to Kidnap ________", "Child", "Succulent", "Car", "Left Arm");
        gameHeadlines.put(child.getHeadlineNumber(),child);
        Headline lawnMower = new Headline("Florida Man Seen Riding _______ to a 7-Eleven", "Lawn Mower", "Gator", "Tractor", "Panther");
        gameHeadlines.put(lawnMower.getHeadlineNumber(),lawnMower);
        Headline drone = new Headline("Florida Man Indicted for _______ Law Enforcement Drone", "Shooting", "Licking", "Stealing", "Mating With");
        gameHeadlines.put(drone.getHeadlineNumber(),drone);
        Headline fiance = new Headline("Florida Man Accused of Killing ________ and ‘Staging’ Body in Walmart Parking Lot", "Fiance", "Dog", "Daughter", "Employee");
        gameHeadlines.put(fiance.getHeadlineNumber(),fiance);
        Headline disney = new Headline("Florida Man Arrested for Threatening _______ on Twitter", "Disney", "Ex", "Boss", "Himself");
        gameHeadlines.put(disney.getHeadlineNumber(),disney);
        Headline newYork = new Headline("Florida Man Attempts Floating to _______ in Home-made Contraption", "New York", "France", "Mexico", "China");
        gameHeadlines.put(newYork.getHeadlineNumber(),newYork);
        Headline stomp = new Headline("Florida Man _____ Stolen Gator to “Teach It a Lesson”", "Stomps", "Scolds", "Beats", "Lectures");
        gameHeadlines.put(stomp.getHeadlineNumber(),stomp);
    }

    public static Headline getNextHeadline(int headlineNumber) {
        return gameHeadlines.get(headlineNumber);
    }

    public static boolean outOfHeadlines(int headlineNumber) {
        return headlineNumber < gameHeadlines.size();
    }

    public static int numOfHeadlines(){
        return gameHeadlines.size();
    }

    public static void emptyGameHeadlines() {
        gameHeadlines.clear();
    }

}
