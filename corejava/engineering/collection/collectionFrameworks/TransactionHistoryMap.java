package corejava.engineering.collection.collectionFrameworks;

import java.util.LinkedHashMap;
import java.util.Map;

public class TransactionHistoryMap {
    public static void main(String[] args) {
        Map<String, Integer> transactions = new LinkedHashMap<>();

        transactions.put("TXN1005", 5000);
        transactions.put("TXN1002", 2500);
        transactions.put("TXN1008", 8000);
        transactions.put("TXN1001", 1500);

        System.out.println(transactions);

        //update
        transactions.put("TXN1002", 9500);
        System.out.println("After Update TXN1002 : " + transactions);
        

        // remove
        transactions.remove("TXN1008");
        System.out.println("After Remove TXN1008 : " + transactions);

        //add
        transactions.put("TXN1010", 3000);
        System.out.println("After add TXN1010 : " + transactions);


        System.out.println("Final map : " + transactions);
    }
}
