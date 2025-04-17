package src;

public class Fine {
    private String fineId;
    private double amount;
    private String reason;
    private boolean isPaid;

    public Fine(String fineId, double amount, String reason) {
        this.fineId = fineId;
        this.amount = amount;
        this.reason = reason;
        this.isPaid = false;
    }

    public void pay() {
        isPaid = true;
    }

    public boolean isPaid() { return isPaid; }
}
