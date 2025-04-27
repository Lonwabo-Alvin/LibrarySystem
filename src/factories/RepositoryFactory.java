package src.factories;

import src.repositories.BookRepository;
import src.repositories.impl.FileBookRepository;
import src.repositories.impl.InMemoryBookRepository;
import src.repositories.impl.SQLBookRepository;

public class RepositoryFactory {

    public static BookRepository getBookRepository(String type) {
        if (type.equalsIgnoreCase("memory")) {
            return new InMemoryBookRepository();
        } else if (type.equalsIgnoreCase("file")) {
            return new FileBookRepository();
        } else if (type.equalsIgnoreCase("db")) {
            return new SQLBookRepository();
        }

        throw new IllegalArgumentException("Unsupported repository type: " + type);
    }
}
