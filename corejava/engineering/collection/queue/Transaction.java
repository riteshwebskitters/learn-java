package corejava.engineering.collection.queue;

public class Transaction implements Comparable<Transaction> {

    private String transactionId;
    private int amount;

    public Transaction(String transactionId, int amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public int getAmount() {
        return amount;
    }

    // Natural ordering: amount ascending
    @Override
    public int compareTo(Transaction other) {
        return Integer.compare(this.amount, other.amount);
    }

    @Override
    public String toString() {
        return transactionId + " : " + amount;
    }
}