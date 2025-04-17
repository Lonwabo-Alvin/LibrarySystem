package src.patterns.prototype;

import src.Book;

public class BookPrototype implements Cloneable {
    private Book book;

    public BookPrototype(Book book) {
        this.book = book;
    }

    public Book cloneBook() {
        try {
            return new Book(
                    "COPY_" + book.getBookId(),
                    book.getTitle(),
                    "Cloned " + book.getTitle(),
                    "CLONE_" + System.currentTimeMillis()
            );
        } catch (Exception e) {
            return null;
        }
    }
}
