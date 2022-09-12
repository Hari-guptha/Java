import java.util.*;

public class arithmatic {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(b-a);
    }
    void multi(int a,int b){
        System.out.println(a*b);
    }
    void div(int a,int b){
        System.out.println(a/b);
    }
    public static void main(String[] args){
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("a");
            a=sc.nextInt();
            System.out.println("b");
            b=sc.nextInt();
        }
        arithmatic t =new arithmatic();
        t.add(a,b);
        t.sub(a,b);
        t.multi(a,b);
        t.div(a,b);
    }
}
