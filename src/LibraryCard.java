package src;

import java.time.LocalDate;

public class LibraryCard {

    private String cardId;
    private LocalDate issuedDate;
    private LocalDate expiryDate;
    private String status; // Active, Suspended

    public LibraryCard(String cardId) {
        this.cardId = cardId;
        this.issuedDate = LocalDate.now();
        this.expiryDate = issuedDate.plusYears(2);
        this.status = "Active";
    }

    public void renewCard() {
        this.expiryDate = LocalDate.now().plusYears(2);
        this.status = "Active";
    }

    public void suspendCard() {
        this.status = "Suspended";
    }

    public void activateCard() {
        this.status = "Active";
    }
}
