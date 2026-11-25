package corejava.engineering.exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawal = 1000;

        try {
            int remainingBalance = balance / 0;
            System.out.println("Remaining Balance: " + remainingBalance);

        } catch (ArithmeticException exception) {
            System.out.println("Transaction failed: " + exception.getMessage());
        }

        System.out.println("Banking application is still running");
    }
}
