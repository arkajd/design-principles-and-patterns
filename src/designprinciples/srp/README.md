### Single Responsibility Principle (SRP)

Notice the `OrderProcessor` class in the `designprinciples.srp.violation` package:
This is a **God Class** that is doing everything inside a single method.

---

Notice the `OrderProcessor` in the `srp.solution` package:
1. **Calculation:** We delegate calculation of the final price to `OrderPricingCalculator`.
2. **Persistence:** `OrderRepository` handles SQL, connections and transactions. Nothing else.
3. **Notification:** `EmailNotificationService` handles formatting and sending messages, whether via SMTP, SendGrid or AWS SES.