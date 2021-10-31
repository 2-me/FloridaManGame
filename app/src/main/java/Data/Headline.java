package Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Headline {
    String story;
    public  String keyword;

    public  String getKeyword() {
        return keyword;
    }

    public  String getAlternate1() {
        return alternate1;
    }

    public  String getAlternate2() {
        return alternate2;
    }

    public  String getAlternate3() {
        return alternate3;
    }

    public  String alternate1;
    public  String alternate2;
    public  String alternate3;
    public  ArrayList<String> options = new ArrayList<>();
    private final int headlineNumber;
    public static int headlineCount = 1;

    public String getStory() { return story; }

    public int getHeadlineNumber() {
        return headlineNumber;
    }

    public Headline(String story, String keyword, String alternate1, String alternate2, String alternate3) {
        this.story = story;
        this.keyword = keyword;
        this.alternate1 = alternate1;
        this.alternate2 = alternate2;
        this.alternate3 = alternate3;
        headlineNumber = headlineCount;
        headlineCount++;
    }

    public void optionsShuffle(){
        emptyOptions();
        options.add(keyword);
        options.add(alternate1);
        options.add(alternate2);
        options.add(alternate3);
        Collections.shuffle(options);
    }

    public  void emptyOptions() {
        options.clear();
    }

    public static void resetHeadlineCount() {
        headlineCount = 1;
    }

}
