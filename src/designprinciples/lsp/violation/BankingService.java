package designprinciples.lsp.violation;

import java.util.List;

public class BankingService {

    public void processMonthlyMaintenanceFee(List<BankAccount> accounts, double fee) {
        for (BankAccount account : accounts) {

            // caller trusts that every bank account can be withdrawn from. When it finds FixedDepositAccount, the loop crashes at runtime.
            account.withdraw(fee);
        }
    }
}
