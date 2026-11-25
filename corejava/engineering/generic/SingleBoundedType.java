package corejava.engineering.generic;

public class SingleBoundedType {
     public static <T extends Number> double getTransactionValue(T value){
        return value.doubleValue();
    }

    public static void main(String[] args){
        double testCase1 = getTransactionValue(1500);
        double testCase2 = getTransactionValue(145.78);
        double testCase3 = getTransactionValue(145L);

        System.out.println(testCase1);
        System.out.println(testCase2);
        System.out.println(testCase3);
    }
}
