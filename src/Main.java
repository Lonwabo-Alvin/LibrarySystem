package src;

import src.patterns.abstractfactory.UserFactory;
import src.patterns.builder.BookBuilder;
import src.patterns.factory.BookFactory;
import src.patterns.lazyinit.Configuration;
import src.patterns.prototype.BookPrototype;
import src.patterns.singleton.LibrarySystem;

public class Main {
    public static void main(String[] args) {

            System.out.println("===== Testing Design Patterns =====");


            Book novel = BookFactory.createBook("novel");
            System.out.println("Factory Created: " + novel.getTitle());

            src.patterns.abstractfactory.User user = UserFactory.getUser("student");
            user.getRole();

            Book builtBook = new BookBuilder().setTitle("Builder Book").setAuthor("Dev").setIsbn("9999").build();
            System.out.println("Built Book: " + builtBook.getTitle());

            BookPrototype prototype = new BookPrototype(novel);
            Book clonedBook = prototype.cloneBook();
            System.out.println("Cloned Book: " + clonedBook.getTitle());

            LibrarySystem system = LibrarySystem.getInstance();
            system.showSystemStatus();

            Configuration config = Configuration.getInstance();
            System.out.println("Database URL: " + config.getDbUrl());

            System.out.println("\n===== Running Library Management System =====");

            Library library = new Library();
            library.run();
        }
}
