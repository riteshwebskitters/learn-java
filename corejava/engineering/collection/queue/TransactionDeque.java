package corejava.engineering.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TransactionDeque {
    public static void main(String[] args) {

        Deque<String> transactions = new ArrayDeque<>();

        transactions.offerLast("TXN1001");
        transactions.offerLast("TXN1002");
        transactions.offerLast("TXN1003");

        transactions.offerFirst("TXN1000");

        System.out.println(transactions);

        System.out.println("First: " + transactions.peekFirst());
        System.out.println("Last: " + transactions.peekLast());

        System.out.println("Remove First: " + transactions.pollFirst());
        System.out.println("Remove Last: " + transactions.pollLast());

        System.out.println("Final: " + transactions);
    }
}
