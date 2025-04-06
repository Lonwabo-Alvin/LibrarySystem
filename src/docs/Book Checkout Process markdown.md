Explanation
This activity diagram outlines the process for checking out a book in the library system:

Start: Triggered when the user scans their library card.
Validation: The system verifies the validity of the user's library card.

Decision Point:

If the card is invalid, the process is terminated and the user is notified.
If the card is valid, the user proceeds to scan the book's barcode.

Availability Check:

If the book is not available, the system notifies the user.
If the book is available, a loan record is created.

Post-Processing:

Inventory status is updated.
A receipt is printed and handed to the user.
End: The checkout process is successfully completed.

Mapped Requirements:

FR-001: Users must be able to borrow books through the system.
FR-002: The system must validate user eligibility before allowing book checkout.
FR-004: The system must update inventory records when a book is checked out.