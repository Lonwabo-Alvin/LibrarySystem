package src;

import java.time.LocalDate;

public class Reservation {

    private String reservationId;
    private LocalDate reservationDate;
    private LocalDate expiryDate;
    private String status;
    private Book book;
    private User user;

    public Reservation(String reservationId, Book book, User user) {
        this.reservationId = reservationId;
        this.book = book;
        this.user = user;
        this.reservationDate = LocalDate.now();
        this.expiryDate = reservationDate.plusDays(2);
        this.status = "Active";
    }

    public void cancelReservation() {
        this.status = "Expired";
    }

    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }
}

