```mermaid
stateDiagram-v2
    [*] --> Requested
    Requested --> Approved : BookAvailable
    Requested --> Declined : BookNotAvailable
    Approved --> Fulfilled : BookCheckedOut
    Approved --> Cancelled : UserCancels
    Approved --> Expired : NoPickup
```