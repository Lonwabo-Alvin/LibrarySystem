````mermaid
stateDiagram-v2
    [*] --> Catalogued
    Catalogued --> InShelf : Shelved
    InShelf --> CheckedOut : Borrowed
    CheckedOut --> InShelf : Returned
    InShelf --> Lost : NotFound
````