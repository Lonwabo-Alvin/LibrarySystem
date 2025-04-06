````mermaid
flowchart TD
    A[Start] --> B[User returns book]
    B --> C[System scans book]
    C --> D[Find Loan Record]
    D --> E{Loan found?}
    E -- No --> F[Notify Error]
    E -- Yes --> G[Mark as returned]
    G --> H[Update inventory]
    H --> I[Generate return receipt]
    I --> J[End]
````