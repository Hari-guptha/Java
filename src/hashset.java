// print the array randomly
import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet <String> set= new HashSet();
        set.add("one");
        set.add("2");
        set.add("3");
        set.add("4");
        Iterator <String> iter= set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
    }
}
}
