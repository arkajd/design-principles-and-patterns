package designprinciples.lsp.solution;

import java.util.List;

public class BankingService {

    // Expects ONLY accounts that can legally be withdrawn from
    public void processMonthlyMaintenanceFee(List<WithdrawableAccount> accounts, double fee) {
        for (WithdrawableAccount account : accounts) {
            account.withdraw(fee); // Guaranteed safe: no surprises, no crashes, no instanceof checks!
        }
    }

    // Expects ANY account that can receive deposits
    // compiler itself prevents you from passing a FixedDepositAccount into processMonthlyMaintenanceFee. You no longer need instanceof checks or UnsupportedOperationException
    public void applyAnnualInterest(List<Account> accounts, double interestRate) {
        for (Account account : accounts) {
            double interest = account.getBalance() * interestRate;
            account.deposit(interest); // Completely safe for Checking, Savings, and Fixed Deposit
        }
    }
}
