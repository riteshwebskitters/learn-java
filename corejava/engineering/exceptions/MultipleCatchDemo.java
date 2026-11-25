package corejava.engineering.exceptions;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String transactionAmount = "ABC";

            int amount = Integer.parseInt(transactionAmount);

            int balance = 5000;
            int remainingBalance = balance / amount;

            int[] transactions = { 1000, 2000, 3000 };

            System.out.println(transactions[5]);
            System.out.println("Remaining balance: " + remainingBalance);
        } catch (ArithmeticException exception) {
           System.out.println("Arithmetic error: " + exception.getMessage());
        } catch (NumberFormatException exception){
            System.out.println("Invalid transaction amount: " + exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Invalid transaction index: " + exception.getMessage());
        }

        System.out.println("Banking application continues running");
    }
}
