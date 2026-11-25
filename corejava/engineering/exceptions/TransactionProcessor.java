package corejava.engineering.exceptions;

public class TransactionProcessor {
    public static void main(String[] args) {
        try {
            // CASE 1
            // String transactionAmount = "ABC";

            // CASE 2
            // String transactionAmount = "0";

            // CASE 3
            String transactionAmount = "0";

            int amount = Integer.parseInt(transactionAmount);

            int balance = 5000;
            int remainingBalance = balance / amount;

            int[] transactions = { 1000, 2000, 3000 };

            System.out.println(transactions[5]);
            System.out.println("Remaining balance: " + remainingBalance);

        } catch (ArithmeticException exception) {
            System.out.println("Invalid transaction amount: " + exception.getMessage());
        } catch (NumberFormatException exception) {
            System.out.println("Invalid format supplied: " + exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid transaction index" + exception.getMessage());
        } finally {

            System.out.println("Transaction processing finished");
        }

        System.out.println("Transaction processor completed");
    }
}
