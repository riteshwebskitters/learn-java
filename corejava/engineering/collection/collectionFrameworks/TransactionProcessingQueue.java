package corejava.engineering.collection.collectionFrameworks;

import java.util.Deque;
import java.util.LinkedList;

public class TransactionProcessingQueue {
    public static void main(String[] args) {

        Deque<Integer> transactions = new LinkedList<>();

        transactions.add(1001);
        transactions.add(1002);
        transactions.add(1003);

        System.out.println("Processing queue: " + transactions);

        transactions.add(1000);

        System.out.println("First Transaction: " + transactions);

        transactions.addLast(1004);

        System.out.println("Last Transaction: " + transactions);

        transactions.removeFirst();
        System.out.println("After Processing First: " + transactions);

        transactions.removeLast();
        System.out.println("After Removing Last: " + transactions);
    }
}
