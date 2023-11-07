package entities;

public class Account {
    private String name;
    private int number;
    private double balance;
    public double deposit;

    public Account() {
    }

    public Account(String name, int number, double initialDeposit){
        this.name = name;
        this.number = number;
        deposit(initialDeposit);
    }
    public Account(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double deposit){
        this.deposit += deposit;
    }
    public void withdraw (double deposit){
        balance -= deposit + 5;
    }
    public String toString  (){
        return number
                + ", Holder: "
                + String.format(name)
                + ", Balance: $"
                + String.format("%.2f", balance);
    }
}
