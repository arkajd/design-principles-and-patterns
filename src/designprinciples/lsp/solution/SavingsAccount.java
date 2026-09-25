package designprinciples.lsp.solution;

public class SavingsAccount implements WithdrawableAccount {

    private double balance;

    @Override
    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrew amount from savings bank account.");
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited amount into savings bank account.");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
