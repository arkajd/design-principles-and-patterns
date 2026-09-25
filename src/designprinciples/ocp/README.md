### Open/Closed Principle (OCP)

Notice the `PaymentService` class in the `ocp.violation` package:
- It uses a growing `if/else` ladder checking a raw `String paymentType`.
- **The Problem:** Every time a new payment provider is supported (e.g., Apple Pay), we must modify `PaymentService`, risking breaking existing tested payment paths.

---

Notice the design in the `ocp.solution` package:
1. **Interface Contract:** We defined a `PaymentMethod` interface with a `pay(double amount)` method.
2. **Open for Extension:** Adding a new payment option (like `ApplePayPayment` or `CryptoPayment`) is achieved purely by creating a new class implementing `PaymentMethod`.
3. **Closed for Modification:** `PaymentService` simply delegates to `paymentMethod.pay(amount)`. It never needs to be edited when new payment types are introduced.