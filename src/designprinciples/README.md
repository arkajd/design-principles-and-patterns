# What are **SOLID** principles?
SOLID is an acronym for five core software design guidelines introduced by Robert C. Martin (Uncle Bob).
It makes the code easier to understand, maintain, test and extend over time without breaking existing functionality.
We would dive deeper into the principles but below are the principles in short.

# What are different types of SOLID principles?
**Single Responsibility Principle**: The name is self-explanatory here. A class should have a single responsibility. Or, a class should have only one reason to change. It should do one job and do it well.
**Open/Closed Principle**: A class should be open to extension but closed for modification. You should be able to add new features by adding new code and not by constantly editing old, working code.
**Liskov Substitution Principle**: Subtypes must be substitutable for their base types without altering the correctness of the program. If code expects a parent interface, any child implementation should work without crashing or unexpected behaviour.
**Interface Segregation Principle**: A class should not be forced to depend on interfaces or methods they do not use. Prefer small, specific interfaces over a bloated interface.
**Dependency Inversion Principle**: High-level business logic should not depend on low-level implementation details (like specific database of third party API), both should depend on abstractions (interfaces).

# Why should we learn SOLID principles before design patterns?
1. SOLID teaches you to look at code and know that the code is dangerous. Once you recognize the problem, a design pattern provides the structured blueprint to fix it.
2. Design patterns are direct implementation of SOLID. Without understanding SOLID, you would end up memorizing the patterns.
3. It prevents over-engineering. Understanding SOLID keeps you grounded, you only reach for a pattern when there is an actual principle being violated.