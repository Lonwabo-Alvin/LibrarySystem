package src;

public class Book {

    private String bookId;
    private String title;
    private String author;
    private String isbn;
    private String status;


    public Book(String title) {
        this.bookId = "AUTO_" + System.currentTimeMillis();
        this.title = title;
        this.author = "Unknown";
        this.isbn = "N/A";
        this.status = "Available";
    }

    public Book(String bookId, String title, String author, String isbn) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = "Available";
    }

    public void checkOut() {
        if ("Available".equals(this.status)) {
            this.status = "CheckedOut";
        }
    }

    public void returnBook() {
        this.status = "Available";
    }

    public void reserve() {
        if ("Available".equals(this.status)) {
            this.status = "Reserved";
        }
    }


    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }
}
