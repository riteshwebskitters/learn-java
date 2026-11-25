package corejava.engineering.generic;

public class MultipleBoundType {
    public static <T extends Number & Comparable<T>> T compareTo(T first, T second) {
        if (first.compareTo(second) > 0) {
            return first;
        }

        return second;
    }

    public static void main(String[] args) {
        Integer amount1 = compareTo(5000, 7500);
        Double amount2 = compareTo(2500.50, 1500.75);

        System.out.println(amount1);
        System.out.println(amount2);
    }
}
