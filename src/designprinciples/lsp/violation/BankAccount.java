package designprinciples.lsp.violation;

public class BankAccount {

    protected double balance;

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + this.balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        this.balance -= amount;
        System.out.println("Withdrew $" + amount + ". Remaining balance: $" + this.balance);
    }

    public double getBalance() {
        return balance;
    }
}
