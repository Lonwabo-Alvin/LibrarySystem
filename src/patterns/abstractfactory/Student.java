package src.patterns.abstractfactory;

public class Student implements User {

    @Override
    public void getRole() {
        System.out.println("Student: Can borrow up to 5 books.");
    }
}
