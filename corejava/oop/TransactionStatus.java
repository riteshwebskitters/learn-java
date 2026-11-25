package corejava.oop;

public enum TransactionStatus {
    PENDING("Waiting for processing"),
    PROCESSING("Transaction is being processed"),
    FAILED("Transaction failed"),
    SUCCESS("Transaction completed"),
    REFUNDED("Amount has been refunded");

    private final String description;

    TransactionStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
