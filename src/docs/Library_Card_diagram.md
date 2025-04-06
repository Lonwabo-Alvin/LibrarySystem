```mermaid
stateDiagram-v2
    [*] --> Unissued
    Unissued --> Active : IssuedToUser
    Active --> Expired : DatePassed
    Active --> Blocked : PolicyViolation
    Blocked --> Active : Reinstated
```