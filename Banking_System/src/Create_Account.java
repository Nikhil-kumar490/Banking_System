import java.util.Scanner;

public class Create_Account {

    static void Account_Creation() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = s.nextLine();
        Main.Name.add(name);

        System.out.print("Enter your Phone: ");
        int phone = s.nextInt();
        s.nextLine(); // Consume newline
        Main.Phone.add(phone);

        System.out.print("Enter your Password: ");
        String password = s.nextLine();
        Main.Password.add(password);

        Main.Acc_Number.add(Main.Acc_no);
        Main.Balance.add(0);

        System.out.println("Account created successfully!");
        System.out.println("Your Account Number: " + Main.Acc_no);
        Main.Acc_no++;
    }
}
