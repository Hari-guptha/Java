import java.util.*;

public class calculator{
    public static void main(String [] args){
        int a,b,choice;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value:");
            a = sc.nextInt();
            System.out.println("Enter the value:");
            b = sc.nextInt();
            System.out.println("1.Add \n 2.Subract \n 3.Multiplication \n 4.Divideion  \n Enter the choice");
            choice = sc.nextInt();
        }
        switch(choice){
            case 1:
            {
                System.out.println(a+b);
                break;
            }
            case 2:
            {
                System.out.println(a-b);
                break;
            }
            case 3:
            {
                System.out.println(a*b);
                break;
            }
            case 4:
            {
                System.out.println(a/b);
                break;
            }
        }

    }
}