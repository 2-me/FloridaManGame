package Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Headline {
    String story;
    public static String keyword;
    public static String alternate1;
    public static String alternate2;
    public static String alternate3;
    public static ArrayList<String> options;
    private int headlineNumber;
    public static int headlineCount = 1;

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

    public static void optionsShuffle(){
        options.add(alternate1);
        options.add(alternate1);
        options.add(alternate1);
        options.add(keyword);
        Collections.shuffle(options);
    }


}
