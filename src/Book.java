package src;

/**
 * Represents a book in a library management system.
 *
 * Each book has a unique ID, title, author, ISBN, and status
 * indicating whether it's available, checked out, or reserved.
 */
public class Book {

    private String bookId;
    private String title;
    private String author;
    private String isbn;
    private String status;

    /**
     * Constructs a book with a given title.
     * Other fields are initialized with default values.
     *
     * @param title the title of the book
     */
    public Book(String title) {
        this.bookId = "AUTO_" + System.currentTimeMillis();
        this.title = title;
        this.author = "Unknown";
        this.isbn = "N/A";
        this.status = "Available";
    }

    /**
     * Constructs a book with all specified attributes except status,
     * which defaults to "Available".
     *
     * @param bookId the unique identifier for the book
     * @param title the title of the book
     * @param author the author of the book
     * @param isbn the ISBN of the book
     */
    public Book(String bookId, String title, String author, String isbn) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = "Available";
    }

    /**
     * Checks out the book if it's currently available.
     * Sets the status to "CheckedOut".
     */
    public void checkOut() {
        if ("Available".equals(this.status)) {
            this.status = "CheckedOut";
        }
    }

    /**
     * Returns the book to the library.
     * Sets the status back to "Available".
     */
    public void returnBook() {
        this.status = "Available";
    }

    /**
     * Reserves the book if it's currently available.
     * Sets the status to "Reserved".
     */
    public void reserve() {
        if ("Available".equals(this.status)) {
            this.status = "Reserved";
        }
    }

    /** @return the unique ID of the book */
    public String getBookId() { return bookId; }

    /** @return the title of the book */
    public String getTitle() { return title; }

    /** @return the current status of the book */
    public String getStatus() { return status; }

    /** @param author sets the author of the book */
    public void setAuthor(String author) { this.author = author; }

    /** @param isbn sets the ISBN of the book */
    public void setIsbn(String isbn) { this.isbn = isbn; }

    /** @param status sets the current status of the book */
    public void setStatus(String status) { this.status = status; }
}