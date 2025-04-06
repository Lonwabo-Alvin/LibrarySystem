````mermaid
flowchart TD
    A[Start] --> B[User requests new book]
    B --> C[System logs request]
    C --> D[Notify librarian]
    D --> E[Librarian reviews request]
    E --> F{Approve request?}
    F -- No --> G[Notify user of rejection]
    F -- Yes --> H[Initiate purchase process]
    H --> I[Notify user of approval]
    I --> J[End]
````