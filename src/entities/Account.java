package entities;

public class Account {
    private String name;
    private int numberAccount;
    private double balance;

    public Account() {
    }

    public Account(int numberAccount, String name, double initialDeposit){
        this.name = name;
        this.numberAccount = numberAccount;
        deposit(initialDeposit);
    }
    public Account(int numberAccount, String name){
        this.numberAccount = numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount){
        balance += amount;
    }
    public void withdraw (double amount){
        balance -= amount + 5;
    }
    public String toString  (){
        return numberAccount
                + ", Holder: "
                + String.format(name)
                + ", Balance: $"
                + String.format("%.2f", balance);
    }
}
