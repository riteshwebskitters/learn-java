package corejava.engineering.generic;

public interface TransactionProcessor<T> {
    void process(T transactionData);

    T getTransactionData();
}
