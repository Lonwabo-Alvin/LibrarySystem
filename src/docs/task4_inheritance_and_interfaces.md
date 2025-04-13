# Assignment 9 – Task 4: Inheritance and Interfaces

## Abstract Classes and Interfaces

### 1. `Borrowable` Interface

```mermaid
classDiagram
    class Borrowable {
        <<interface>>
        +checkOut()
        +returnItem()
    }

    class Book {
        +checkOut()
        +returnItem()
    }

    Borrowable <|.. Book

    class Reservable {
        <<interface>>
        +reserve()
        +cancelReservation()
    }

    Reservable <|.. Book

    class Person {
        <<abstract>>
        +name
        +email
        +register()
    }

    class User {
        +borrowBook()
        +returnBook()
        +payFine()
    }

    Person <|-- User

    class Item {
        <<abstract>>
        +itemId
        +condition
        +markAsRemoved()
    }

    class InventoryItem {
        +updateCondition()
    }

    Item <|-- InventoryItem
````