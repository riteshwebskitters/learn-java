package corejava.engineering.exceptions.customs;

public class CustomExceptionDemo {

    public static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient account balance");
        }

        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 7000);

        } catch (InsufficientBalanceException exception) {

            System.out.println("Banking error: " + exception.getMessage());

        } catch (IllegalArgumentException exception) {

            System.out.println("Validation error: " + exception.getMessage());
        }
    }
}