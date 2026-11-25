package corejava.engineering.collection.queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TransactionIteration {
    public static void main(String[] args) {
        List<Integer> transactionAmounts = new ArrayList<>();

        transactionAmounts.add(2500);
        transactionAmounts.add(4500);
        transactionAmounts.add(1200);
        transactionAmounts.add(8000);
        transactionAmounts.add(3000);

        Iterator<Integer> iterator = transactionAmounts.iterator();
        int totalAmount = 0;

        // Method 1 — Enhanced for loop

        for (Integer transaction : transactionAmounts) {
            totalAmount += transaction;
        }
        
        System.out.println("Removed---> " + totalAmount);
        System.out.println("\n");
        // Method 2 — Iterator

        while (iterator.hasNext()) {
            Integer transaction = iterator.next();

            System.out.println("Iterator way ---> " + transaction);
        }

        System.out.println("\n");
        // Method 3 — forEach

        transactionAmounts.forEach(transaction -> {
            System.out.println("For Each ---> " + transaction);
        });

    }
}
