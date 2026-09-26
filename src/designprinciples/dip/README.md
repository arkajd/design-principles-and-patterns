# Dependency Inversion Principle (DIP)

### The Official Rule
1. High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces).
2. Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.

### In Everyday Terms
* **High-level logic:** Core business rules (e.g., creating a user account, charging a customer).
* **Low-level logic:** Infrastructure plumbing (e.g., MySQL, MongoDB, AWS S3, SendGrid SDK).

> Core business rules should never directly instantiate or tightly couple to specific third-party tools or database drivers.

---

### Code Smell & Key Questions (`dip.violation.UserService`)

1. **How do you write fast unit tests for `register()` without hitting a live MySQL DB or SendGrid API?**
    * **Answer:** You cannot easily do so. Because the dependencies are hard-coded with `new`, you cannot pass mock objects. You are forced to configure live database connections and network credentials, resulting in slow, fragile tests that risk side effects like emailing real users.

2. **What happens if the team switches from MySQL to MongoDB, or SendGrid to AWS SES?**
    * **Answer:** The core business service (`UserService`) must be directly modified, introducing tight coupling and violating the Open/Closed Principle (OCP).

3. **How do you invert the dependencies so `UserService` controls the contract?**
    * **Answer:** Instead of instantiating dependencies internally, pass them in through constructor injection. Define domain interfaces (`UserRepository`, `EmailService`) so `UserService` depends solely on stable abstractions, keeping it agnostic of the underlying technology.

---

### Why It Is Called Dependency *Inversion*

* **Traditional (Direct Flow):**  
  `High-Level (UserService)` ──► `Low-Level (MySqlDatabase)`

* **Inverted (Decoupled Flow):**  
  `High-Level (UserService)` ──► `Interface (UserRepository)` ◄── `Low-Level (MySqlUserRepository)`

Both high-level business policy and low-level technical infrastructure now point inward toward the shared abstraction.

---

### The Anti-Pattern: Tight Coupling (`dip.violation`)
Notice the `UserService` class in the `dip.violation` package:
- It directly calls `new MySqlDatabase()` and `new SendGridEmailer()` inside its constructor.
- **The Problems:**
    1. **Untestable:** Prevents passing mock implementations during testing; requires active databases and third-party network access.
    2. **Rigid:** Any infrastructure migration forces changes to business logic files.

---

### The Solution: Abstractions & Injection (`dip.solution`)
Notice the design in the `dip.solution` package:
1. **Domain Abstractions:** Defined `UserRepository` and `EmailService` interfaces to represent what the business process requires.
2. **Implementations Depend on Abstractions:** Concrete classes like `MySqlUserRepository` and `SendGridEmailService` implement the interfaces.
3. **Constructor Injection:** `UserService` receives its dependencies from the caller via constructor parameters, making it fully decoupled and straightforward to test with mocks.