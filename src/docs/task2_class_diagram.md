# Assignment 9 – Task 2: Class Diagram

### UML Class Diagram

```mermaid
classDiagram

class Book {
  +String bookId
  +String title
  +String author
  +String ISBN
  +String status
  +checkOut()
  +returnBook()
  +reserve()
}

class User {
  +String userId
  +String name
  +String email
  +String userType
  +String cardStatus
  +register()
  +borrowBook()
  +returnBook()
  +payFine()
}

class Loan {
  +String loanId
  +Date dueDate
  +Date returnDate
  +String status
  +createLoan()
  +closeLoan()
  +isOverdue()
}

class Reservation {
  +String reservationId
  +Date reservationDate
  +Date expiryDate
  +String status
  +createReservation()
  +cancelReservation()
}

class Fine {
  +String fineId
  +double amount
  +String reason
  +boolean isPaid
  +calculateFine()
  +pay()
}

class LibraryCard {
  +String cardId
  +Date issuedDate
  +Date expiryDate
  +String status
  +renewCard()
  +suspendCard()
  +activateCard()
}

class InventoryItem {
  +String inventoryId
  +String location
  +String condition
  +String shelfNumber
  +markAsRemoved()
  +updateCondition()
}

Book --> Loan : "1"
Book --> Reservation : "1..*"
User --> Loan : "1..*"
User --> Reservation : "1..*"
User --> Fine : "0..*"
User --> LibraryCard : "1"
Book --> InventoryItem : "1"
Loan --> Fine : "0..1"
````