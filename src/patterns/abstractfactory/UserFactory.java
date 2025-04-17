package src.patterns.abstractfactory;

public class UserFactory {
    public static User getUser(String type) {
        if (type.equalsIgnoreCase("student")) {
            return new Student();
        } else if (type.equalsIgnoreCase("librarian")) {
            return new Librarian();
        } else {
            return null;
        }
    }
}
