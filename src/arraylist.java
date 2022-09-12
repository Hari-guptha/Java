import java.util.*;
public class arraylist{
public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("hari");
    list.add("khari");
    list.add("dhari");
    list.add("shari");

    Iterator itr =list.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
}
}