ability.
3. System assigns the book to the student's account.
4. System updates book status to "Checked Out".
5. System confirms the checkout.
- **Alternative Flow**:
    - If the book is unavailable, display an error message.

## 3. **Use Case: Return Book**
- **Actor**: Student
- **Description**: Allows students to return borrowed books.
- **Preconditions**: Student must be logged in.
- **Postconditions**: The book is marked as "Available".
- **Basic Flow**:
    1. Student selects the "Return Book" option.
    2. System verifies the student’s borrowing history.
    3. System updates book status to "Available".
    4. System confirms the return.
- **Alternative Flow**:
    - If the book is not recognized, display an error message.

## 4. **Use Case: Reserve Book**
- **Actor**: Student
- **Description**: Allows students to reserve books.
- **Preconditions**: Student must be logged in.
- **Postconditions**: Book is marked as "Reserved".
- **Basic Flow**:
    1. Student selects a book.
    2. System verifies book availability.
    3. System marks the book as "Reserved".
    4. System confirms the reservation.
- **Alternative Flow**:
    - If the book is unavailable, display an error message.

## 5. **Use Case: Manage Inventory**
- **Actor**: Librarian
- **Description**: Allows librarians to add, edit, or remove books.
- **Preconditions**: Librarian must be logged in.
- **Postconditions**: The inventory is updated.
- **Basic Flow**:
    1. Librarian selects "Manage Inventory".
    2. Librarian adds/edits/removes a book.
    3. System updates the database.
    4. System confirms the action.

## 6. **Use Case: Track Overdue Books**
- **Actor**: Librarian
- **Description**: Allows librarians to view overdue books.
- **Preconditions**: Librarian must be logged in.
- **Postconditions**: Overdue books are displayed.
- **Basic Flow**:
    1. Librarian selects "Track Overdue Books".
    2. System retrieves overdue books.
    3. System displays overdue books.
- **Alternative Flow**:
    - If no overdue books exist, display an empty list.