package corejava.fundamentals.arrays;

import java.util.Arrays;

public class ArraysInJava {

    public static void validateTransactions(int[] transactions) {
        if (transactions == null) {
            throw new IllegalArgumentException("Transactions cannot be null");
        }

        if (transactions.length == 0) {
            throw new IllegalArgumentException("Transactions cannot be empty");
        }
    }

    public static int calculateTotal(int[] transactions) {
        validateTransactions(transactions);
        int total = 0;
        for (int i = 0; i < transactions.length; i++) {
            total += transactions[i];
        }
        return total;
    }

    public static int findLargestTransaction(int[] transactions) {

        validateTransactions(transactions);
        int current = transactions[0];

        for (int i = 1; i < transactions.length; i++) {
            if (transactions[i] >= current) {
                current = transactions[i];
            }
        }

        return current;
    }

    public static int findSmallestTransaction(int[] transactions) {
        validateTransactions(transactions);

        int current = transactions[0];
        for (int i = 1; i < transactions.length; i++) {
            if (transactions[i] <= current) {
                current = transactions[i];
            }
        }

        return current;
    }

    public static boolean containsTransaction(int[] transactions, int target) {
        validateTransactions(transactions);

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int countTransactions(int[] transactions, int target) {
        validateTransactions(transactions);
        int count = 0;

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] == target) {
                count++;
            }
        }

        return count;
    };

    public static void reverseTransactions(int[] transactions) {
        validateTransactions(transactions);
        int firstIndex = 0;
        int secondIndex = transactions.length - 1;

        while (firstIndex < secondIndex) {
            int temp = transactions[firstIndex];

            transactions[firstIndex] = transactions[secondIndex];
            transactions[secondIndex] = temp;

            firstIndex++;
            secondIndex--;
        }

    }

    public static int[] prepareTransactions(int[] transactions) {
        validateTransactions(transactions);
        int[] copied = Arrays.copyOf(transactions, transactions.length);
        Arrays.sort(copied);

        return copied;
    }

    public static int searchTransaction(int[] transactions, int target) {
        validateTransactions(transactions);

        // Create a copy to preserve the original array
        int[] sortedTransactions = Arrays.copyOf(transactions, transactions.length);

        // Sort the copied array
        Arrays.sort(sortedTransactions);

        // Search using Java's built-in binary search
        return Arrays.binarySearch(sortedTransactions, target);
    }

    public static void analyzeTransactions(int[] transactions) {
        validateTransactions(transactions);

        int target = 2500;

        int total = calculateTotal(transactions);
        int largest = findLargestTransaction(transactions);
        int smallest = findSmallestTransaction(transactions);
        int count = countTransactions(transactions, target);

        System.out.println("Total " + total);
        System.out.println("Largest Found " + largest);
        System.out.println("Smallest found " + smallest);
        System.out.println("Repetitive count " + count);
        System.out.println("Copied & sorted " + Arrays.toString(transactions));

    }

    public static void main(String[] args) {
        // int[] transactions = { 1500, 2500, 3500, 4500, 5500 };
        // int[] transactions = { 100, 200, 300, 400 };
        // int target = 700;
        // int[] transactions = {-500, -200, -900, -100};
        // int[] transactions = {};
        // int[] transactions = { 700, 700, 700 };

        // transactions[1] = 3000;
        // transactions[transactions.length - 1] = 6000;

        // for (int i = 0; i < transactions.length; i++) {
        // System.out.println(transactions[i]);
        // }

        // int total = calculateTotal(transactions);
        // int largest = findLargestTransaction(transactions);
        // int smallest = findSmallestTransaction(transactions);
        // boolean contains = containsTransaction(transactions, target);
        // int count = countTransactions(transactions, target);
        // reverseTransactions(transactions);

        // for (int i = 0; i < transactions.length; i++) {
        // System.out.println(transactions[i]);
        // }

        int[] transactions = {4500, 2500, 1500, 2500, 3500, 1000};

        // int[] sortedTransactions = prepareTransactions(transactions);

        analyzeTransactions(transactions);

        // System.out.println(Arrays.toString(transactions));
        // System.out.println(Arrays.toString(sortedTransactions));

        // System.out.println(count);
    }
}
