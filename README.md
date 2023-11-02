
# Company application

This repository contains a small application I designed and implemented for a company to manage the following user architecture:

- **Director**: Has a list of managers and employees.
- **Manager**: Has a list of employees.
- **Employee**: Represents individual employees.

## Software Design Principles

In developing this application, I adhered to several key software design principles to ensure a robust and maintainable codebase:

- **Encapsulation and Polymorphism**: I defined the private attribute to preserve the principle of encapsulation and polymorphism, making the code maintainable and extensible.

- **Loose Coupling and High Cohesion**: The code is designed to have loose coupling and high cohesion to ensure the principle of reusability, flexibility, and testability.

- **Inheritance and Abstraction**: All users in the system share common attributes, and I maintained relationships using inheritance and abstraction. I defined an abstract class called `Employee` extended by other subclasses to achieve the Liskov Substitution Principle (LSP).

- **Dependency Inversion Principle (DIP)**, **Open-Closed Principle (OCP)**, and **Interface Segregation Principle (ISP)**: I used abstract classes and interfaces to implement these principles. For instance, I created an interface `ManagerReportable` and an implementing class `ManagerReport` to handle manager-related functionalities. This promotes code flexibility and extensibility.

## Code Organization

To ensure clean and maintainable code, I placed each method in a separate class, and when necessary, I called one class within another. For instance, I organized methods for listing staff and calculating budgets in a separate `ManagerReport` class.

## Database Management

I incorporated a data storage mechanism using a fake database and ensured data integrity. To guarantee that only one connection is open for each employee, I used synchronized blocks in the `getInstance()` method. This approach ensures that only one thread can access the database field at a time.

## Connecting to the Database

I implemented a `connect()` method to connect to the database and execute queries.

Feel free to explore the code and documentation to understand the design and implementation of this user architecture application.
