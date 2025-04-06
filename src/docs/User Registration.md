````mermaid

flowchart TD
A[Start] --> B[User fills registration form]
B --> C[System validates form data]
C --> D{All fields valid?}
D -- No --> E[Show error message]
D -- Yes --> F[Create user account]
F --> G[Send confirmation email]
G --> H[End]
````