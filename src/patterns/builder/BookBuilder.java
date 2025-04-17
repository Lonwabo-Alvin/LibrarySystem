package src.patterns.builder;

import src.Book;

public class BookBuilder {
    private String bookId = "AUTO_" + System.currentTimeMillis();
    private String title;
    private String author;
    private String isbn;

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public Book build() {
        return new Book(bookId, title, author, isbn);
    }
}
