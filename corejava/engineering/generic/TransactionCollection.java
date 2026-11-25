package corejava.engineering.generic;

import java.util.ArrayList;
import java.util.List;

public class TransactionCollection {
    public static void addTransactions(List<? super Integer> transactions){
        transactions.add(1500);
        transactions.add(2500);
        transactions.add(3500);
    }

    public static void main(String[] args) {

        List<Integer> integerTransactions = new ArrayList<>();
        List<Number> numberTransactions = new ArrayList<>();
        List<Object> objectTransactions = new ArrayList<>();

        addTransactions(integerTransactions);
        addTransactions(numberTransactions);
        addTransactions(objectTransactions);

        System.out.println(integerTransactions);
        System.out.println(numberTransactions);
        System.out.println(objectTransactions);
    }
}
