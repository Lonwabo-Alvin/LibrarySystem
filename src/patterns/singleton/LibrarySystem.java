package src.patterns.singleton;

public class LibrarySystem {
    private static LibrarySystem instance;

    private LibrarySystem() {
        System.out.println("LibrarySystem initialized.");
    }

    public static LibrarySystem getInstance() {
        if (instance == null) {
            instance = new LibrarySystem();
        }
        return instance;
    }

    public void showSystemStatus() {
        System.out.println("LibrarySystem is active.");
    }
}
