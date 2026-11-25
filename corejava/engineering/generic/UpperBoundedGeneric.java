package corejava.engineering.generic;

public class UpperBoundedGeneric {
    public static void displayAmount(Transaction<? extends Number> transaction) {
        Number amount = transaction.getTransactionData();

        System.out.println("Transaction amount: " + amount.doubleValue());
    }

    public static void main(String[] args){
        Transaction<Integer> test1 = new Transaction<>(1400);
        Transaction<Double> test2 = new Transaction<>(145.75);
        Transaction<Long> test3 = new Transaction<>(145L);

        displayAmount(test1);
        displayAmount(test2);
        displayAmount(test3);
    }
}
