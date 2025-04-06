```mermaid
stateDiagram-v2
    [*] --> Initiated
    Initiated --> Active : BookCheckedOut
    Active --> Returned : BookReturned
    Active --> Overdue : PastDueDate
    Overdue --> Returned : BookReturned
    Returned --> Closed : Finalized
```