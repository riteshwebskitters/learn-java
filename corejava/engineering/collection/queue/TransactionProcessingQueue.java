package corejava.engineering.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TransactionProcessingQueue {
    public static void main(String[] args) {

        Queue<String> transactions = new LinkedList<>();

        transactions.offer("TXN1001");
        transactions.offer("TXN1002");
        transactions.offer("TXN1003");
        transactions.offer("TXN1004");

        System.out.println(transactions);

        System.out.println("Next transaction: " + transactions.peek());

        System.out.println("Processing: " + transactions.poll());

        System.out.println("Remaining: " + transactions);
    }
}
