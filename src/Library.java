package src;

import src.factories.RepositoryFactory;
import src.repositories.BookRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
public class Library {

    //private List<Book> books = new ArrayList<>();

    private final BookRepository bookRepository;

    public Library() {

        this.bookRepository = RepositoryFactory.getBookRepository("memory");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nsrc.Library Menu:");
            System.out.println("1. Add src.Book");
            System.out.println("2. List Books");
            System.out.println("3. Check Out src.Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    listBooks();
                    break;
                case 3:
                    checkoutBook(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void addBook(Scanner scanner) {
        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        Book book = new Book(id, title, author, isbn);
        bookRepository.save(book);
        System.out.println("Book added successfully.");
    }

    private void listBooks() {
        List<Book> books = bookRepository.findAll();
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available Books:");
            for (Book book : books) {
                System.out.println("- " + book.getTitle() + " (ID: " + book.getBookId() + ")");
            }
        }
    }

    private void checkoutBook(Scanner scanner) {
        System.out.print("Enter Book ID to check out: ");
        String id = scanner.nextLine();
        Optional<Book> optionalBook = bookRepository.findById(id);

        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            System.out.println("Book found: " + book.getTitle());
            System.out.print("Are you sure you want to check out this book? (Y/N): ");
            String confirmation = scanner.nextLine().trim();

            if ("Y".equalsIgnoreCase(confirmation)) {
                bookRepository.delete(id);
                System.out.println("Book checked out successfully.");
            } else {
                System.out.println("Checkout canceled.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }
}
