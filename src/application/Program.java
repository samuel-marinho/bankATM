package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter account number: ");
        int numberAccount = sc.nextInt();
        System.out.println("Enter account holder: ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Is there an initial deposit? [Y/N] ");
        char answer = sc.next().charAt(0);

        Account account;
        if (answer == 'Y'){
            System.out.println("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            account = new Account(name, numberAccount, deposit);
        }else {
            account = new Account (name, numberAccount);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.printf("Account "+ account);

        sc.close();
    }
}
