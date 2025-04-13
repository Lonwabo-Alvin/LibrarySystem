# Assignment 9 – Task 3: Class Diagram Explanation

## Explanation of Relationships and Responsibilities

This class diagram models the behavior and structure of a library system.

### Book
Manages borrowing, returning, and reservation. One book can be part of a loan, reservation, and inventory item.

### User
Interacts with the system. One user can have multiple loans, reservations, fines, and one library card.

### Loan
Tracks the borrowing of a book. Linked to the user, book, and possibly a fine.

### Reservation
Represents a user reserving a book. Connected to both a user and a book.

### Fine
Tracks penalties from late returns. Paid by the user and related to a loan.

### LibraryCard
Grants borrowing permissions. Each user has exactly one card.

### InventoryItem
Tracks the physical location and condition of a book.

## Design Benefits
- Promotes modularity through entity separation.
- Clear responsibility delegation to respective classes.
- Supports validation of real-world library operations.