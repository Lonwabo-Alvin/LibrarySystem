package src.patterns.abstractfactory;

public class Librarian implements User{
    @Override
    public void getRole() {
        System.out.println("Librarian: Can manage inventory and user accounts.");
    }
}
