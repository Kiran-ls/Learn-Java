package OOPs.Encapsulation;

import java.util.Scanner;

public class BankCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        System.out.print("Enter password: ");
        int userPass = sc.nextInt();
        System.out.println("Balance: " + b.getBalance(userPass));
        System.out.println("Enter Amount to deposit: ");
        int new_balance = sc.nextInt();
        b.setBalance(new_balance, userPass);
        System.out.println("New Balance: " + b.getBalance(userPass));
    }
}

class Bank {
    private int balance = 5000;
    private int bankPass = 434;

    public void setBalance(int newBalance, int userPass) {
        if (bankPass == userPass) {
            balance = newBalance;
        }
        else {
            System.out.println("Wrong password");
        }
    }
    public int getBalance(int userPass) {
        if (bankPass == userPass) {
            return balance;
        } else {
            System.out.println("Wrong password");
            return 0;
        }
    }
}
