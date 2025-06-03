package src.repositories.impl;

import src.Book;
import src.repositories.BookRepository;

import java.util.List;
import java.util.Optional;

public class FileBookRepository implements BookRepository {

    @Override
    public void save(Book book) {
        throw new UnsupportedOperationException("FileBookRepository.save() not implemented yet.");
    }

    @Override
    public Optional<Book> findById(String id) {
        throw new UnsupportedOperationException("FileBookRepository.findById() not implemented yet.");
    }

    @Override
    public List<Book> findAll() {
        throw new UnsupportedOperationException("FileBookRepository.findAll() not implemented yet.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("FileBookRepository.delete() not implemented yet.");
    }

    @Override
    public List<Book> findByAuthor(String author) {
        throw new UnsupportedOperationException("FileBookRepository.findByAuthor() not implemented yet.");
    }

    @Override
    public Optional<Book> findByTitle(String title) {
        throw new UnsupportedOperationException("FileBookRepository.findByTitle() not implemented yet.");
    }
}
