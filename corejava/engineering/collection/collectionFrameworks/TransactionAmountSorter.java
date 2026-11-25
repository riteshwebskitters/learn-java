package corejava.engineering.collection.collectionFrameworks;

import java.util.SortedSet;
import java.util.TreeSet;

public class TransactionAmountSorter {
    public static void main(String[] args) {

        SortedSet<Integer> amounts = new TreeSet<>();

        amounts.add(500);
        amounts.add(1200);
        amounts.add(2500);
        amounts.add(4500);
        amounts.add(8000);

        System.out.println(amounts);

        System.out.println("Smallest : " + amounts.first());
        System.out.println("Largest : " + amounts.last());
        System.out.println("Largest : " + amounts.remove(2500));
        System.out.println(amounts);
    }
}
