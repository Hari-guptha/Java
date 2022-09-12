import java.util.*;

class banka {
    public int i = 0;
    public String[][] user = new String[90][90];
    public int[][] password = new int[90][90];
    public int[][] balance = new int[90][90];
    public int index;
    public String name;
    public int pass;

    public void login(Scanner sc) {
        int loginflag = 1, j;
        System.out.println("Enter your user name");
        String lname = sc.next();
        System.out.println("Enter your user password");
        int lpassword = sc.nextInt();
        while (loginflag != 0) {
            for (j = 0; j < i; j++) {
                if (user[j][1].equals(lname)) {
                    if (password[j][1] == (lpassword)) {
                        System.out.println("welcome " + lname);
                        index = j;
                        loginflag = 0;

                    } else {
                        loginflag = 0;
                        System.out.println("Your password is wrong");
                    }
                } else {
                    if (loginflag == 1) { 
                        loginflag = 0;
                        System.out.println("Username not found");
                    }
                }
            }
            loginflag = 0;

        }
    }

    public void signup(Scanner sc) {

        System.out.println("Enter your user name");
        name = sc.next();
        user[i][1] = name;
        System.out.println("Enter your user password");
        pass = sc.nextInt();
        password[i][1] = pass;
        i++;
    }

    public void deposit(Scanner sc) {
        System.out.println("Enter the amount to deposit ");
        int bal = sc.nextInt();
        balance[index][1]= bal;
    }
    public void balance(Scanner sc) {
        System.out.println("Your balance is "+ balance[index][1]);
    }
    public void showuser(Scanner sc) {
        int k;
        int l = user.length;
        for(k=0;k<l;k++){
            System.out.println(user[k][1]+"\n");
        }
    }
}

public class bank {
    static String sc;

    public static void main(String[] args) {
        int flag = 1;
        Scanner sc = new Scanner(System.in);
        banka a = new banka();
        while (flag != 0) {
            System.out.println("Welcome to Gopal bank");
            System.out.println("1.Signup 2.Login 3.Deposit 4. Check Balance 5.showuser 6.Exit ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    a.signup(sc);
                    flag = 1;
                    break;
                }
                case 2: {
                    a.login(sc);
                    flag = 1;
                    break;
                }
                case 3: {
                    a.deposit(sc);
                    flag = 1;
                    break;
                }
                case 4: {
                    a.balance(sc);
                    flag = 1;
                    break;
                }
                case 5: {
                    a.showuser(sc);
                    flag = 1;
                    break;
                }
                case 6: {
                    System.out.println("exiting....varata mame drue");
                    flag = 0;
                    break;
                }
                default:
                    System.out.println("Invalid optinon");
            }
        }
    }
}
