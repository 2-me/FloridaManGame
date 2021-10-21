package Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Headline {
    String story;
    String keyword;
    String alternate1;
    String alternate2;
    String alternate3;
    ArrayList<String> options;
    private int headlineNumber;
    private static int headlineCount = 1;

    public Headline(String story, String keyword, String alternate1, String alternate2, String alternate3) {
        this.story = story;
        this.keyword = keyword;
        this.alternate1 = alternate1;
        this.alternate2 = alternate2;
        this.alternate3 = alternate3;
        headlineNumber = headlineCount;
        headlineCount++;
        options.add(alternate1);
        options.add(alternate1);
        options.add(alternate1);
        Collections.shuffle(options);
    }
}
