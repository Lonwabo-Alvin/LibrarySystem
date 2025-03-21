# 📌 Test Cases - Library Management System

| Test Case ID | Requirement ID | Test Scenario                          | Steps to Execute                              | Expected Outcome                               | Actual Outcome | Status |
|-------------|---------------|----------------------------------------|----------------------------------------------|------------------------------------------------|--------------|--------|
| TC-001      | FR-001        | Search for a book by title            | 1. Input book title 2. Click "Search"       | The system retrieves and displays book details |              |        |
| TC-002      | FR-002        | Borrow a book                         | 1. Select a book 2. Click "Borrow"         | The book status updates to "Checked Out"      |              |        |
| TC-003      | FR-003        | Return a borrowed book                | 1. Navigate to "Return Book" 2. Confirm    | The book status updates to "Available"        |              |        |
| TC-004      | FR-004        | Add a new book to inventory           | 1. Fill in book details 2. Click "Add"     | The book is successfully stored in the database |              |        |
| TC-005      | FR-005        | Generate a library report             | 1. Select "Generate Reports" 2. Choose type | A report is created and made available        |              |        |
| TC-006      | FR-006        | Send overdue book notification        | 1. Book exceeds due date 2. System triggers alert | Student receives an overdue book notification |              |        |
| TC-007      | NFR-001       | Performance validation                | Simulate 1,000 book searches simultaneously | Search results appear within 2 seconds       |              |        |
| TC-008      | NFR-002       | Security validation                   | Attempt unauthorized modifications          | Access is denied with an appropriate error message |              |        |
