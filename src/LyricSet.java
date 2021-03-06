import java.util.HashSet;
import java.util.Set;

public class LyricSet {
    private static final String[] lyric = {"you", "say", "it", "best", "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args) {
        //Create a set from HashSet thats implemented Set
        Set words = new HashSet();
        //Add all words to set
        for (String w : lyric)
            words.add(w);
        //Traverse the list
        //NOTICE: set doesn't allow duplicate items
        for (Object o : words)
            System.out.println(o + " ");
        System.out.println("\n---------------");
        System.out.println("Contain [you]?: " + words.contains("you"));
        System.out.println("Contain [me]?: " + words.contains("me"));
    }
}
