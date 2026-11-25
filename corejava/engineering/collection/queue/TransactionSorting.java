package corejava.engineering.collection.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TransactionSorting {
    public static void main(String[] args) {

        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction("TXN1005", 5000));
        transactions.add(new Transaction("TXN1002", 1200));
        transactions.add(new Transaction("TXN1008", 8000));
        transactions.add(new Transaction("TXN1001", 2500));

        // Original list
        System.out.println("Original Transactions:");
        System.out.println(transactions);

        // Comparable: ascending amount
        Collections.sort(transactions);

        System.out.println("\nAscending Order:");
        System.out.println(transactions);

        // Comparator: descending amount
        Comparator<Transaction> amountDescending = (t1, t2) -> Integer.compare(
                t2.getAmount(),
                t1.getAmount());

        transactions.sort(amountDescending);

        System.out.println("\nDescending Order:");
        System.out.println(transactions);
    }
}
