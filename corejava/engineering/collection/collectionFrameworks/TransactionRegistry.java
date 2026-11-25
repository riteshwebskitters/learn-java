package corejava.engineering.collection.collectionFrameworks;

import java.util.HashMap;
import java.util.Map;

public class TransactionRegistry {
    public static void main(String[] args) {
        Map<String, Integer> transactions = new HashMap<>();

        transactions.put("TXN1001", 2500);
        transactions.put("TXN1002", 4500);
        transactions.put("TXN1003", 1200);
        transactions.put("TXN1004", 3500);

        System.out.println(transactions);

        //remove by id
        transactions.remove("TXN1003");
        System.out.println("After Remove : " + transactions);

        //check existance
        System.out.println("Contains Key : " + transactions.containsKey("TXN1002"));
        

        // udpate
        transactions.put("TXN1001", 1300);
        System.out.println("After Updating: " + transactions);

        System.out.println("Get: " + transactions.get("TXN9999"));
        System.out.println("Checking for exist: " + transactions.containsKey("TXN9999"));
        System.out.println("Total size : " + transactions.size());


        //
          transactions.put("TXN1002", 9000);

        System.out.println("Final list: " + transactions);
    }
}
