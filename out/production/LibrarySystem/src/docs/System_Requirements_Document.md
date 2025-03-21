# System Requirements Document (SRD)

## Functional Requirements
1. **The system shall allow students to search for books by title, author.**
    - **Acceptance Criteria**: Search results must display book availability status in real-time.
2. **The system shall enable students to reserve books online for pickup.**
    - **Acceptance Criteria**: Reserved books must be marked as unavailable for other users and displayed in the student’s account.
3. **The system shall allow librarians to check out books to students.**
    - **Acceptance Criteria**: The checkout process must confirm the student’s membership and book availability.
4. **The system shall allow librarians to track overdue books.**
    - **Acceptance Criteria**: The system must generate alerts for overdue books in real-time.
5. **The system shall enable library admins to generate reports on book usage and fines.**
    - **Acceptance Criteria**: Reports must be generated within 2 minutes of request and must include detailed information on overdue books, fines, and user activity.
6. **The system shall provide an interface for staff to update book information (title, author, location).**
    - **Acceptance Criteria**: Updates must be reflected immediately in the system’s database.
7. **The system shall allow library users to view book details, including availability and location in the library.**
    - **Acceptance Criteria**: Book location and availability must be updated every 30 minutes.
8. **The system shall send email notifications to students when books are due for return or when they are overdue.**
    - **Acceptance Criteria**: Notifications must be sent 24 hours before the due date and after a book is overdue by 2 days.
9. **The system shall allow library staff to process book returns efficiently.**
    - **Acceptance Criteria**: Returned books must immediately be marked as available and the checkout history must be updated.
10. **The system shall allow IT support to monitor system health and uptime.**
- **Acceptance Criteria**: IT support must receive an automated alert if the system experiences downtime or errors.

## Non-Functional Requirements

### Usability
1. **The system shall have a user-friendly interface compliant with WCAG 2.1 accessibility standards.**
    - **Rationale**: Ensures users with disabilities can easily use the system.

### Deployability
2. **The system shall be deployable on both Windows and Linux servers.**
    - **Rationale**: Provides flexibility in deployment environments.

### Maintainability
3. **The system shall include detailed API documentation for future integrations.**
    - **Rationale**: Ensures that future enhancements and integrations can be made easily.

### Scalability
4. **The system shall support 1,000 concurrent users during peak hours.**
    - **Rationale**: Ensures the system can handle increased load during busy times, such as exam periods.

### Security
5. **The system shall encrypt all sensitive user data (e.g., user names, emails) using AES-256 encryption.**
    - **Rationale**: Protects user data from unauthorized access.
6. **The system shall have role-based access control to restrict access to certain features based on user roles.**
    - **Rationale**: Ensures that only authorized users (like librarians and admins) can modify data.

### Performance
7. **Search results shall load within 2 seconds.**
    - **Rationale**: Ensures users don’t experience delays when searching for books.

### Availability
8. **The system shall be available 99.9% of the time, with scheduled maintenance occurring during off-peak hours.**
    - **Rationale**: Ensures minimal downtime and reliable access for users.
