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
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Is there an initial deposit? [Y/N] ");
        char answer = sc.next().charAt(0);

        Account account;
        if (answer == 'Y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(numberAccount, name, initialDeposit);
        }else {
            account = new Account(numberAccount, name);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.printf("Account "+ account);
        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.printf("Account "+account);
        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.printf("Account "+account);


        sc.close();
    }
}
