package designprinciples.lsp.solution;

public class FixedDepositAccount implements Account {

    private double balance;

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited amount into fixed deposit account.");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
