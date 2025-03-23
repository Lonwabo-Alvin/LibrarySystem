# User Stories - Library Management System

| Story ID | User Story                                                                                              | Acceptance Criteria                                                          | Priority (High/Medium/Low) |
|----------|---------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------|----------------------------|
| US-001   | As a student, I want to search for books by title so I can find materials quickly.                      | Results load in ≤2 seconds; display availability status.                     | High                       |
| US-002   | As a student, I want to borrow a book so I can access it for studying.                                  | System verifies availability and updates the book status to "Checked Out".   | High                       |
| US-003   | As a student, I want to return a book so others can borrow it.                                          | System updates book status to "Available" upon return.                       | High                       |
| US-004   | As a student, I want to reserve a book so I can borrow it later when it is available.                   | Reserved books are marked as "Reserved" and cannot be checked out by others. | Medium                     |
| US-005   | As a librarian, I want to add new books so students can borrow them.                                    | System saves new books to the database.                                      | High                       |
| US-006   | As an admin, I want to generate reports on book borrowing and availability to monitor library activity. | Reports generate in under 3 minutes and contain complete data.               | Low                        |
| US-007   | As a librarian, I want to track overdue books so I can notify students.                                 | System sends overdue notifications automatically.                            | Medium                     |
| US-008   | As an IT staff, I want the system to encrypt user data so security compliance is met.                   | All sensitive user data is encrypted using AES-256.                          | High                       |
