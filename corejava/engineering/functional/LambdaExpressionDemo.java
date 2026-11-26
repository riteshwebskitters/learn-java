package corejava.engineering.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        // 1st approach without lambda (anonymous class)

        // TransactionValidator validator = new TransactionValidator() {
        // @Override
        // public boolean isValid(int amount){
        // return amount > 0;
        // }
        // };

        // // with lamda expression

        // TransactionValidator validator2 = amount -> amount > 0;

        // TransactionCalculator calculator = (amount, fee) -> amount - fee ;

        // System.out.println("With Zero : " + validator2.isValid(0));
        // System.out.println("With Positive : " + validator2.isValid(2500));
        // System.out.println("With Negative : " + validator2.isValid(-150));

        // System.out.println("Test 1 : " + calculator.calculate(2500, 100));

        int testAmount = 9000;

        Predicate<Integer> isValidAmount = amount -> amount > 0;

        Function<Integer, Double> calculate = (amount) -> amount * 0.02;

        Consumer<String> transactionLogger = transactionId -> System.out.println("PROCESSED : " + transactionId);
        Supplier<String> transactionIdGenerator = () -> "TXN-" + System.currentTimeMillis();

        if (isValidAmount.test(testAmount)) {
            Double fee = calculate.apply(testAmount);
            transactionLogger.accept("TXN1001");
            String transactionId = transactionIdGenerator.get();

            transactionLogger.accept(transactionId + " | Fee: " + fee);
        } else {
            System.out.println("Transaction rejected: Invalid amount");
        }

    }
}
