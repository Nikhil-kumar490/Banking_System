import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> Name = new ArrayList<>();
    static ArrayList<Integer> Phone = new ArrayList<>();
    static ArrayList<Integer> Acc_Number = new ArrayList<>();
    static ArrayList<Integer> Balance = new ArrayList<>();
    static ArrayList<String> Password = new ArrayList<>();
    static int Acc_no = 220490;

    public static void main(String[] args) {
        boolean check = true;
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the Bank");

        while (check) {
            System.out.println("Choose the service you want:");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int inp = s.nextInt();
            s.nextLine();

            switch (inp) {
                case 1:
                    Create_Account.Account_Creation();
                    break;
                case 2:
                    Login_System.login();
                    break;
                case 3:
                    check = false;
                    System.out.println("Thank you for using My banking system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
