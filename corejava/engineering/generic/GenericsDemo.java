package corejava.engineering.generic;

public class GenericsDemo {
    public static void main(String[] args){
        Transaction<Integer> transaction = new Transaction<>(7500);

        Integer amount = transaction.getTransactionData();

        Transaction<String> example = new Transaction<String>("TEST VALUE");

        String val = example.getTransactionData();

        System.out.println(amount);
        System.out.println(val);
    }
}
