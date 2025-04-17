package src;

public class User {

    private String userId;
    private String name;
    private String email;
    private String userType;
    private String cardStatus;

    public User(String userId, String name, String email, String userType) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.userType = userType;
        this.cardStatus = "Active";
    }

    public void borrowBook(Book book) {
        if ("Active".equals(cardStatus)) {
            book.checkOut();
        }
    }

    public void returnBook(Book book) {
        book.returnBook();
    }

    public void payFine(Fine fine) {
        fine.pay();
    }

    public String getUserId() { return userId; }
    public String getCardStatus() { return cardStatus; }
}
