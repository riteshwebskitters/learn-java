package corejava.engineering.generic;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedGeneric {

    public static void addTransaction(List<? super Integer> transactions) {

        transactions.add(7500);
        transactions.add(9500);
    }

    public static void main(String[] args) {

        List<Integer> integerTransactions = new ArrayList<>();
        List<Number> numberTransactions = new ArrayList<>();
        List<Object> objectTransactions = new ArrayList<>();

        addTransaction(integerTransactions);
        addTransaction(numberTransactions);
        addTransaction(objectTransactions);

        System.out.println(integerTransactions);
        System.out.println(numberTransactions);
        System.out.println(objectTransactions);
    }
}