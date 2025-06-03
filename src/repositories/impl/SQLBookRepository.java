package src.repositories.impl;

import src.Book;
import src.repositories.BookRepository;

import java.util.List;
import java.util.Optional;

public class SQLBookRepository implements BookRepository {

    @Override
    public void save(Book book) {
        throw new UnsupportedOperationException("SQLBookRepository.save() not implemented yet.");
    }

    @Override
    public Optional<Book> findById(String id) {
        throw new UnsupportedOperationException("SQLBookRepository.findById() not implemented yet.");
    }

    @Override
    public List<Book> findAll() {
        throw new UnsupportedOperationException("SQLBookRepository.findAll() not implemented yet.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("SQLBookRepository.delete() not implemented yet.");
    }

    @Override
    public List<Book> findByAuthor(String author) {
        throw new UnsupportedOperationException("SQLBookRepository.findByAuthor() not implemented yet.");
    }

    @Override
    public Optional<Book> findByTitle(String title) {
        throw new UnsupportedOperationException("SQLBookRepository.findByTitle() not implemented yet.");
    }

}
