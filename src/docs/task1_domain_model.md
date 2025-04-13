# Assignment 9 – Task 1: Domain Model
## Domain Entities

| Entity        | Attributes                                                         | Methods Responsibilities                          | Relationships                        | Business Rules                                               |
|---------------|--------------------------------------------------------------------|---------------------------------------------------|--------------------------------------|--------------------------------------------------------------|
| Book          | bookId, title, author, ISBN, status (Available/CheckedOut)         | checkOut(), returnBook(), reserve()               | Associated with Loan and Reservation | A book can only be checked out if its status is “Available”. |
| User          | userId, name, email, userType (Student, Librarian), cardStatus     | register(), borrowBook(), returnBook(), payFine() | Can create Loan, Reservation, Fine   | A user may borrow up to 5 books at once.                     |
| Loan          | loanId, dueDate, returnDate, status                                | createLoan(), closeLoan(), isOverdue()            | Linked to Book and User              | A book loan must have a due date not exceeding 14 days.      |
| Reservation   | reservationId, reservationDate, expiryDate, status                 | createReservation(), cancelReservation()          | Linked to Book and User              | Reservations expire after 48 hours if not picked up.         |
| Fine          | fineId, amount, reason, isPaid                                     | calculateFine(), pay()                            | Belongs to Loan and User             | Overdue fines are calculated at R5 per day late.             |
| LibraryCard   | cardId, issuedDate, expiryDate, status (Active/Suspended)          | renewCard(), suspendCard(), activateCard()        | Linked to User                       | A user cannot borrow if the card is expired or suspended.    |
| InventoryItem | inventoryId, location, condition (New, Good, Damaged), shelfNumber | markAsRemoved(), updateCondition()                | One-to-one with Book                 | Removed/damaged books cannot be loaned or reserved.          |
