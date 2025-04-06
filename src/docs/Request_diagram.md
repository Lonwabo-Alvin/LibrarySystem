````mermaid
stateDiagram-v2
    [*] --> Submitted
    Submitted --> InProgress : StaffAssigned
    InProgress --> Completed : Resolved
    InProgress --> Cancelled : UserCancelled
````
