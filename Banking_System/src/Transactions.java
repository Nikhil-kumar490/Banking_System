import java.util.Scanner;

public class Transactions {

    static void deposit(int index) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter amount to deposit: Rs.");
        int amount = s.nextInt();

        if (amount > 0) {
            Main.Balance.set(index, Main.Balance.get(index) + amount);
            System.out.println("Deposit successful! New Balance: Rs." + Main.Balance.get(index));
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    static void withdraw(int index) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: Rs.");
        int amount = s.nextInt();

        if (amount > 0 && amount <= Main.Balance.get(index)) {
            Main.Balance.set(index, Main.Balance.get(index) - amount);
            System.out.println("Withdrawal successful! New Balance: Rs." + Main.Balance.get(index));
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

