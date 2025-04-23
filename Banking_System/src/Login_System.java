import java.util.Scanner;

public class Login_System {

    static void login() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Account Number: ");
        int accNum = s.nextInt();
        s.nextLine();

        System.out.print("Enter your Password: ");
        String password = s.nextLine();

        boolean found = false;
        int index = -1;
        for (int i = 0; i < Main.Acc_Number.size(); i++) {
            if (Main.Acc_Number.get(i) == accNum && Main.Password.get(i).equals(password)) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Login Successful! Welcome, " + Main.Name.get(index));
            boolean loggedIn = true;

            while (loggedIn) {
                System.out.println("Choose an option:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Logout");

                int choice = s.nextInt();
                s.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Your Balance: Rs." + Main.Balance.get(index));
                        break;
                    case 2:
                        Transactions.deposit(index);
                        break;
                    case 3:
                        Transactions.withdraw(index);
                        break;
                    case 4:
                        loggedIn = false;
                        System.out.println("Logged out successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } else {
            System.out.println("Invalid Account Number or Password. Try again.");
        }
    }
}
