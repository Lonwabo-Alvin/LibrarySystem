A basic Java-based library management system that allows users to:
- Add books to the library
- List all available books
- Check out books 
## Project Files
- [SPECIFICATION.md](SPECIFICATION.md) - System Specification
- [ARCHITECTURE.md](ARCHITECTURE.md) - C4 Architecture Model


### Traceability Mapping

| **Workflow**            | **Mapped Functional Requirements (FRs)** | **User Stories / Sprint Tasks**                                |
|-------------------------|------------------------------------------|----------------------------------------------------------------|
| Book Checkout           | FR-001, FR-002, FR-004                   | US-001: As a user, I want to borrow books...                   |
| User Registration       | FR-005, FR-006, FR-007                   | US-002: As a new user, I want to register...                   |
| Book Reservation        | FR-010, FR-011                           | US-003: As a user, I want to reserve a book...                 |
| Loan Return             | FR-008, FR-004, FR-012                   | US-004: As a user, I want to return a book...                  |
| Fine Payment            | FR-015, FR-016, FR-017                   | US-005: As a user, I want to pay overdue fines...              |
| Library Card Renewal    | FR-018, FR-019                           | US-006: As a user, I want to renew my library card...          |
| Inventory Management    | FR-020, FR-021                           | ST-001: Admin adds/removes book from inventory                 |
| Book Request            | FR-022, FR-023, FR-024                   | US-007: As a user, I want to request a book...                 |

----------


---

##  Assignment 10 Breakdown

| Task    | Description                                               | Link/Folder                    |
|---------|-----------------------------------------------------------|--------------------------------|
|  Task 1 | Class Implementation from UML (Assignment 9)              | [src/](./src)                  |
|  Task 2 | 6 Creational Patterns (Factory, Builder, Singleton, etc.) | [patterns/](./patterns)        |
|  Task 3 | JUnit 5 Unit Tests for All Patterns                       | [tests/](./tests)              |
|  Task 4 | GitHub Agile Integration + Project Board + CHANGELOG      | [CHANGELOG.md](./ChangeLog.md) |

---

## Task 1: Language Choice

This project is implemented in Java for its strong OOP support and popularity in academic and enterprise environments.

Each class from the Assignment 9 UML diagram is implemented in `/src`, using private fields and public methods to reflect encapsulation and behavior.

##  Creational Design Patterns Implemented

-  Factory Pattern – `BookFactory.java`
-  Abstract Factory Pattern – `UserFactory`, `Student`, `Librarian`
-  Builder Pattern – `BookBuilder.java`
-  Prototype Pattern – `BookPrototype.java`
-  Singleton Pattern – `LibrarySystem.java`
-  Lazy Initialization – `Configuration.java`

Each pattern includes a corresponding unit test in `/tests/`.

---

##  Unit Testing

- Framework: JUnit 5
- Location: [tests/](./tests)
- Each creational pattern is tested for:
    - Correct object creation
    - Proper field initialization
    - Edge cases (e.g., invalid input or singleton uniqueness)

---

##  How to Run the CLI

1. Open project in IntelliJ IDEA
2. Open and run `Main.java` inside the `src/` folder
3. Use the command-line menu to:
    - Add a book
    - List available books
    - Check out a book

---

##  Agile Project Management (Task 4)

-  GitHub Project Board used to track tasks (Kanban-style)
-  All issues linked to user stories (US-001, US-002, etc.)
-  A milestone named Sprint 1 groups all sprint work
-  Commits reference issues (e.g., `closes #3`) for traceability

View the full sprint log in [CHANGELOG.md](./ChangeLog.md)

---

##  Learning Outcomes

- Used UML to model static and dynamic object behavior
- Translated diagrams to real code using OOP principles
- Applied 6 creational design patterns
- Practiced unit testing, Agile workflows, and documentation

---

