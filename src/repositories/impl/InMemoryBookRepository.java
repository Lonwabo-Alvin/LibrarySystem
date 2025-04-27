package src.repositories.impl;

import src.Book;
import src.repositories.BookRepository;

import java.util.*;

public class InMemoryBookRepository implements BookRepository {

    private final Map<String, Book> storage = new HashMap<>();

    @Override
    public void save(Book book) {
        if (book == null || book.getBookId() == null) {
            throw new IllegalArgumentException("Book or Book ID cannot be null.");
        }
        storage.put(book.getBookId(), book);
    }

    @Override
    public Optional<Book> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}
