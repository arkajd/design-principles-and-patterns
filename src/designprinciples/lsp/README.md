### Liskov Substitution Principle (LSP)

Notice the classes in the `lsp.violation` package:
- `FixedDepositAccount` extends `BankAccount`, but overrides `withdraw()` to throw an `UnsupportedOperationException`.
- **The Problem:** The parent class promises withdrawal functionality. When code iterates through a `List<BankAccount>`, passing a `FixedDepositAccount` causes runtime crashes or forces defensive `instanceof` hacks.

---

Notice the design in the `lsp.solution` package:
1. **Separation of Contracts:** We separated the base contract `Account` (deposit and get balance) from `WithdrawableAccount` (adds withdraw).
2. **True Substitutability:** `CheckingAccount` implements `WithdrawableAccount`, while `FixedDepositAccount` implements only `Account`.
3. **Type Safety:** Methods requiring withdrawal operations accept `List<WithdrawableAccount>`, ensuring at compile time that unsupported operations can never be called.