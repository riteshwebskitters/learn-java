package corejava.engineering.exceptions;

public class ExceptionPropagationDemo {

    public static void accountService() {

        System.out.println("Account service started");

        int balance = 5000;
        int withdrawalAmount = 7000;

        if (withdrawalAmount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        System.out.println("Account service completed");
    }

    public static void paymentService() {

        System.out.println("Payment service started");

        accountService();

        System.out.println("Payment service completed");
    }

    public static void main(String[] args) {

        try {
            System.out.println("Payment request received");

            paymentService();

        } catch (IllegalArgumentException exception) {

            System.out.println("Payment failed: " + exception.getMessage());
        }

        System.out.println("Application continues running");
    }
}