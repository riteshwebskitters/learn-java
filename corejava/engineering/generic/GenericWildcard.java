package corejava.engineering.generic;

public class GenericWildcard {
    public static void displayTransaction(Transaction<?> transaction) {
        System.out.println(transaction.getTransactionData());
    }

    public static void main(String[] args) {
        Transaction<Integer> test1 = new Transaction<>(1400);
        Transaction<String> test2 = new Transaction<>("SUCCESS");
        Transaction<Double> test3 = new Transaction<>(145.75);

        displayTransaction(test1);
        displayTransaction(test2);
        displayTransaction(test3);
    }
}
