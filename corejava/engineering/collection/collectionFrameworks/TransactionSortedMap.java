package corejava.engineering.collection.collectionFrameworks;


import java.util.NavigableMap;
import java.util.TreeMap;

public class TransactionSortedMap {
    public static void main(String[] args) {

        NavigableMap<String, Integer> transactions = new TreeMap<>();

        transactions.put("TXN1005", 5000);
        transactions.put("TXN1002", 2500);
        transactions.put("TXN1008", 8000);
        transactions.put("TXN1001", 1500);

        System.out.println(transactions);

        System.out.println("First key : " + transactions.firstKey());
        System.out.println("Last key : " + transactions.lastKey());
        System.out.println("Remove : " + transactions.remove("TXN1005"));

          System.out.println("Final : " + transactions);
    }
}
