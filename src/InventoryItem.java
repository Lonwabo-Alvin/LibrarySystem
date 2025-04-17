package src;

public class InventoryItem {
    private String inventoryId;
    private String location;
    private String condition;
    private String shelfNumber;

    public InventoryItem(String inventoryId, String location, String condition, String shelfNumber) {
        this.inventoryId = inventoryId;
        this.location = location;
        this.condition = condition;
        this.shelfNumber = shelfNumber;
    }

    public void updateCondition(String newCondition) {
        this.condition = newCondition;
    }

    public void markAsRemoved() {
        this.condition = "Removed";
    }

    public String getCondition() { return condition; }
}
