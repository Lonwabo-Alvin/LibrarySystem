package src;

import src.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Library {

    private List<Book> books = new ArrayList<>();

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
            scanner.nextLine(); // Consume newline

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
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        books.add(new Book(title));
        System.out.println("src.Book added successfully.");
    }

    private void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available Books:");
            for (Book book : books) {
                System.out.println("- " + book.getTitle());
            }
        }
    }

    private void checkoutBook(Scanner scanner) {
        System.out.print("Enter book title to check out: ");
        String title = scanner.nextLine();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("src.Book checked out successfully.");
                return;
            }
        }
        System.out.println("src.Book not found.");
    }
}
