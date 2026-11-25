package corejava.engineering.exceptions;

public class WithdrawalService {
    public static void withdraw(int balance, int withdrawalAmount) {
        if (withdrawalAmount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        if (withdrawalAmount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }

        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + (balance - withdrawalAmount));
    }

    public static void main(String[] args) {
        try {
            withdraw(5000, 0);
        } catch (IllegalArgumentException exception) {
            System.out.println("Transaction failed: " + exception.getMessage());
        }
    }
}
