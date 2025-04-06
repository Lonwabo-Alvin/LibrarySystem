````mermaid
flowchart TD
    A[Start] --> B[User views fines]
    B --> C[Select fine to pay]
    C --> D[Enter payment details]
    D --> E[System validates payment]
    E --> F{Payment successful?}
    F -- No --> G[Notify failure]
    F -- Yes --> H[Mark fine as paid]
    H --> I[Send payment receipt]
    I --> J[End]
````