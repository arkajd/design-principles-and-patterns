package designprinciples.lsp.violation;

public class FixedDepositAccount extends BankAccount {

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawals are not allowed on a Fixed Deposit account.");
    }
}
