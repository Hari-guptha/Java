import java.util.*;

public class treeset {
    public static void main(String[] args) {
        TreeSet <String> set = new TreeSet<String>();
        set.add("ravi");
        set.add("hari");
        set.add("gokul");
        set.add("vasan");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
    }
}
}