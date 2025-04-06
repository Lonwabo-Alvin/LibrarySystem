```mermaid
stateDiagram-v2
    [*] --> NotIssued
    NotIssued --> Issued : OverdueDetected
    Issued --> Paid : PaymentMade
    Paid --> Archived : ReceiptGenerated
```