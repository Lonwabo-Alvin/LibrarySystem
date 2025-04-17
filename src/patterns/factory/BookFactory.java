package src.patterns.factory;

import src.Book;

public class BookFactory {
    public static Book createBook(String type) {
        switch (type.toLowerCase()) {
            case "textbook":
                return new Book("T001", "Mathematics 101", "Dr. Albert", "1111");
            case "novel":
                return new Book("N001", "The Great Gatsby", "F. Scott Fitzgerald", "2222");
            case "science":
                return new Book("S001", "Physics Principles", "Isaac Newton", "3333");
            default:
                return new Book("GEN001", "General Book", "Unknown", "0000");
        }
    }
}
