package src;

import java.time.LocalDate;

public class Loan {
    private String loanId;
    private Book book;
    private User user;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private String status;

    public Loan(String loanId, Book book, User user, LocalDate dueDate) {
        this.loanId = loanId;
        this.book = book;
        this.user = user;
        this.dueDate = dueDate;
        this.status = "Active";
    }

    public void closeLoan() {
        this.returnDate = LocalDate.now();
        this.status = "Returned";
        book.returnBook();
    }

    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }

    public String getStatus() { return status; }
}
