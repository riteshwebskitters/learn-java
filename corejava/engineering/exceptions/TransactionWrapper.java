package corejava.engineering.exceptions;

public class TransactionWrapper {
    public static void main(String[] args) {

        // Primitive
        int balance = 5000;

        // Autoboxing
        Integer accountBalance = balance;

        System.out.println("Primitive balance: " + balance);
        System.out.println("Wrapper balance: " + accountBalance);

        // Unboxing
        int updatedBalance = accountBalance;

        System.out.println("Unboxed balance: " + updatedBalance);

        // Wrapper utility method
        String transactionAmount = "2500";

        int amount = Integer.parseInt(transactionAmount);

        System.out.println("Parsed transaction amount: " + amount);
    }
}
