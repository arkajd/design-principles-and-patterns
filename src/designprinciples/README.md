# What are SOLID Principles?

**SOLID** is an acronym for five core software design guidelines introduced by Robert C. Martin ("Uncle Bob"). Following them makes code easier to understand, maintain, test, and extend over time without breaking existing functionality.

We will dive deeper into each principle in this repository, but here is a brief overview:

---

## The 5 SOLID Principles

* **Single Responsibility Principle (SRP):** A class should have one, and only one, reason to change. It should do one job and do it well.
* **Open/Closed Principle (OCP):** Software entities should be open for extension, but closed for modification. You should be able to add new features by writing new code rather than editing existing, working code.
* **Liskov Substitution Principle (LSP):** Subtypes must be substitutable for their base types without altering program correctness. If code expects a parent type, any child implementation should work without crashing or unexpected behavior.
* **Interface Segregation Principle (ISP):** Clients should not be forced to depend on interfaces or methods they do not use. Prefer small, specific interfaces over one bloated interface.
* **Dependency Inversion Principle (DIP):** High-level business logic should not depend on low-level implementation details (like a specific database or third-party API); both should depend on abstractions (interfaces).

---

## Why Learn SOLID Before Design Patterns?

1. **SOLID is the diagnostic; design patterns are the cure:** SOLID teaches you to inspect code and recognize structural smells. Once you diagnose the issue, design patterns provide battle-tested blueprints to fix it.
2. **Patterns are practical expressions of SOLID:** Most classic design patterns exist specifically to satisfy one or more SOLID principles. Without SOLID, you end up memorizing templates like rigid recipes rather than understanding *why* they work.
3. **It prevents over-engineering:** Understanding SOLID keeps you grounded. You only reach for a pattern when there is an actual principle being violated, avoiding unnecessary complexity.