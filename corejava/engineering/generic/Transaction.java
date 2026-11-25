package corejava.engineering.generic;

public class Transaction<T> {
    
    private T transactionData;

    public Transaction(T transactionData) {
        this.transactionData = transactionData;
    }

    public T getTransactionData() {
        return transactionData;
    }
}
