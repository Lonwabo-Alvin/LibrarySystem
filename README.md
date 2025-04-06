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
