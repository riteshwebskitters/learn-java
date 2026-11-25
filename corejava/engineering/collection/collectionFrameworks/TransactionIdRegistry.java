package corejava.engineering.collection.collectionFrameworks;

// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TransactionIdRegistry {
    public static void main(String[] args) {

        // Set<String> transactionIds = new HashSet<>();
        Set<String> transactionIds = new LinkedHashSet<>();

        transactionIds.add("TXN1005");
        transactionIds.add("TXN1002");
        transactionIds.add("TXN1008");
        transactionIds.add("TXN1001");
        transactionIds.add("TXN1002");
        transactionIds.add("TXN1006");

        System.out.println(transactionIds);
        System.out.println("Total unique transactions: " + transactionIds.size());
        System.out.println("Exists in transactions: " + transactionIds.contains("TXN1003"));

        transactionIds.add("TXN1003");

        System.out.println("After adding again: " + transactionIds);

        transactionIds.remove("TXN1002");

        System.out.println("Printing final set: " + transactionIds);
    }
}
