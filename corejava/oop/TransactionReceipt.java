
package corejava.oop;

public record TransactionReceipt(
    String transactionId,
    double amount,
    TransactionStatus status
) {
}
