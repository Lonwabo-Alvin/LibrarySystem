
```mermaid
stateDiagram-v2
    [*] --> Available
    Available --> CheckedOut : User borrows
    CheckedOut --> Returned : User returns
    Returned --> Available : Book verified
    Available --> Reserved : User reserves
    Reserved --> CheckedOut : Reserved user borrows
    CheckedOut --> Lost : Not returned in time
    Lost --> Available : Replaced or found
    Available --> Removed : Damaged/Obsolete
```