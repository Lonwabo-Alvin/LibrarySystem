```mermaid
stateDiagram-v2
[*] --> Inactive
Inactive --> Active : Register
Active --> Suspended : PolicyViolation
Suspended --> Active : AdminReinstatement
Active --> Deactivated : UserRequest
```