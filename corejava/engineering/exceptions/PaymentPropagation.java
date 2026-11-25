package corejava.engineering.exceptions;

public class PaymentPropagation {
    public static void validateAccount(boolean active){
        if(!active){
            throw new IllegalArgumentException("account inactive");
        }

        System.out.println("Account check completed");
    }

    public static void processPayment(){
        System.out.println("Processing started");

        validateAccount(false);

        System.out.println("Payment processed");
    }

    public static void main(String[] args){
         try {
            System.out.println("Payment request received");

            processPayment();

        } catch (IllegalArgumentException exception) {

            System.out.println("Payment failed: " + exception.getMessage());
        }

        System.out.println("Application continues running");
    }
}
