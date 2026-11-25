package corejava.engineering.collection.collectionFrameworks;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    public static void main(String[] args) {
        List<Integer> transactionAmounts = new ArrayList<>();

        transactionAmounts.add(1000);
        transactionAmounts.add(2500);
        transactionAmounts.add(1500);
        transactionAmounts.add(4000);
        transactionAmounts.add(2500);

        System.out.println(transactionAmounts);
        System.out.println("Third transaction: " + transactionAmounts.get(2));
        System.out.println("Changed 2nd transaction: " + transactionAmounts.set(1, 3000));
        System.out.println("Remove occurance: " + transactionAmounts.remove(Integer.valueOf(2500)));
        System.out.println("Contains: " + transactionAmounts.contains(4000));
        System.out.println("Is empty: " + transactionAmounts.isEmpty());
        System.out.println("Total transactions: " + transactionAmounts.size());
    }
}
