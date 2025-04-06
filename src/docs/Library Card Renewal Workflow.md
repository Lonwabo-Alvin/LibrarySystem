````mermaid
flowchart TD
    A[Start] --> B[User requests card renewal]
    B --> C[System checks expiry date]
    C --> D{Card expired?}
    D -- No --> E[Show 'Card Still Valid']
    D -- Yes --> F[Process renewal]
    F --> G[Update expiry date]
    G --> H[Print new card]
    H --> I[End]
````