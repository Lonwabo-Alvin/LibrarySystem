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

## Assignment 11 – Task 1: Repository Design (30 Marks)

To implement a scalable and testable persistence layer, we created a **generic CRUD repository interface** using Java generics. This avoids duplication and ensures consistency across entity-specific repositories.

### Design Highlights:

- `Repository<T, ID>` is a reusable interface that supports Create, Read, Update, and Delete operations for any domain entity.
- `BookRepository` extends this interface to handle `Book` objects specifically using `String` as the ID.
- This design promotes code reuse, modularity, and abstraction, and supports the Dependency Inversion Principle from SOLID.

This interface design allows us to easily switch between in-memory, file-based, or database storage** by plugging in different implementations.

Code can be found in: [`src/repositories`](./src/repositories)

##  Task 2: In-Memory Repository 

Implemented `InMemoryBookRepository` to provide a fully functional persistence layer using Java’s built-in `HashMap`.
This class implements the `BookRepository` interface and provides all CRUD operations in memory.

### Design Highlights:
- Uses `Map<String, Book>` to simulate persistent storage.
- Validates inputs (e.g., null `Book` or missing ID).
- Follows the `Repository` interface, so we can easily swap the backend later (e.g., FileRepository, SQLBookRepository).
- Prepares the system for dependency injection or factory-based selection in future tasks.

Code: [`src/repositories/impl/InMemoryBookRepository.java`](./src/repositories/impl/InMemoryBookRepository.java)

## Task 3: Switching Repositories with Factory

 Implemented a `RepositoryFactory` to dynamically provide the appropriate repository backend. 
 The Library class was refactored to use the repository layer via the `RepositoryFactory`.
 This decouples storage from logic, enabling backends to be swapped easily.

### Why Factory?
- It follows the Open/Closed Principle (we can add `FileBookRepository` later without changing `Library.java`)
- Makes the system extensible and ready for config-based swapping
- Keeps business logic separate from infrastructure

Code: [`src/factories/RepositoryFactory.java`](./src/factories/RepositoryFactory.java)


## Task 4: Future Storage Planning

I created stub classes `FileBookRepository` and `SQLBookRepository` to prepare the system for backend changes.
The `RepositoryFactory` was updated to support "memory", "file", and "db" types.

### Design Highlights:
- Open/Closed Principle: We can add new storage types without modifying core business logic.
- Separation of Concerns: Storage and business logic are fully separated.
- Architecture Diagram: Visualizes how repository swapping works via the Factory Pattern.

 Stub Classes:
- [`src/repositories/impl/FileBookRepository.java`](./src/repositories/impl/FileBookRepository.java)
- [`src/repositories/impl/SQLBookRepository.java`](./src/repositories/impl/SQLBookRepository.java)




## CI/CD Pipeline – GitHub Actions

This project uses **GitHub Actions** to automate testing, builds, and artifact creation.

###  CI (Continuous Integration)
- Every push or pull request to any branch triggers:
    - `./gradlew build` (or `mvn clean install`)
    - `./gradlew test` (or `mvn test`)
- Status checks block merging if tests fail.

###  CD (Continuous Deployment)
- If code is merged into the `main` branch:
    - A `.jar` file is built using Gradle or Maven.
    - The `.jar` is uploaded automatically to the **GitHub Actions artifacts tab**.

###  Protected Branch: `main`
 Requires at least 1 reviewer to approve PRs.
- Requires status checks to pass before merging.
-  Direct pushes are blocked.
-  PRs must be up to date with `main`.

---

###  GitHub Screenshots

You can find screenshots in the `/docs` folder showing:
- Branch protection rule enabled
- CI build passing in GitHub Actions
- Uploaded artifact from the build
- PR blocked when tests fail

---

###  Artifact Details

- Artifact name: `library-app-jar`
- Location: `build/libs/` (or `target/`)
- Triggered by: successful merge into `main`

---

##  Developer Workflow

1. Developer creates a feature branch.
2. Developer commits code and pushes branch.
3. GitHub Actions runs tests automatically.
4. Team member reviews the PR.
5. If tests pass and review is approved, PR can be merged.
6. Merge triggers artifact creation in CD.
