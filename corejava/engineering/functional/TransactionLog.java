package corejava.engineering.functional;

public class TransactionLog {

    private String transactionId;

    public TransactionLog(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId;
    }
}