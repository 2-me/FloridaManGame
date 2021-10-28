package Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Headline {
    String story;
    public static String keyword;

    public static String getKeyword() {
        return keyword;
    }

    public static String getAlternate1() {
        return alternate1;
    }

    public static String getAlternate2() {
        return alternate2;
    }

    public static String getAlternate3() {
        return alternate3;
    }

    public static String alternate1;
    public static String alternate2;
    public static String alternate3;
    public static ArrayList<String> options;
    private final int headlineNumber;
    public static int headlineCount = 1;

    public String getStory() { return story; }

    public int getHeadlineNumber() {
        return headlineNumber;
    }

    public Headline(String story, String keyword, String alternate1, String alternate2, String alternate3) {
        this.story = story;
        Headline.keyword = keyword;
        Headline.alternate1 = alternate1;
        Headline.alternate2 = alternate2;
        Headline.alternate3 = alternate3;
        headlineNumber = headlineCount;
        headlineCount++;
    }

    public static ArrayList<String> optionsShuffle(){
        options.add(keyword);
        options.add(alternate1);
        options.add(alternate1);
        options.add(alternate3);
        Collections.shuffle(options);
        return options;
    }

    public static void emptyOptions() {
        options = new ArrayList<>();
    }



}
