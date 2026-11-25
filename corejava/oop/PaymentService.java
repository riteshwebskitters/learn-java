package corejava.oop;

public class PaymentService implements Transferable {
    @Override
    public void transfer(double amount) {
        System.out.println("Processing online payment: " + amount);
    }

    @Deprecated(since = "1.0", forRemoval = false)
    public void makePayment() {
        System.out.println("Using old payment method");
    }

    @Auditable("UPI payment")
    public void processUpiPayment() {
        System.out.println("Processing UPI payment");
    }

    @Auditable("Card payment")
    public void processCardPayment() {
        System.out.println("Processing card payment");
    }

    public void showPaymentStatus() {
        System.out.println("Payment successful");
    }
}
