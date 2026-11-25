package corejava.oop;

public record PaymentDetails(
        String paymentId,
        double amount,
        String paymentMethod,
        TransactionStatus status) {

    public boolean isSuccessful() {
        return status == TransactionStatus.SUCCESS;
    }

    public boolean isHighValuePayment() {
        return amount >= 10000;
    }

    public void displayPaymentSummary() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Payment Amount: " + amount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Payment Status: " + status);
    }
}