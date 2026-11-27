package corejava.engineering.functional;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalInterface {
    public static void main(String[] args) {
        BiPredicate<Double, Double> hasSufficientBalance = (balance, withdrawal) -> balance >= withdrawal;
        BiFunction<Double, Double, Double> withdraw = (balance, withdrawaAmount) -> balance - withdrawaAmount;
        BiConsumer<String, Double> transactionLogger = (transactionId, amount) ->  System.out.println("Transaction: " + transactionId + " | Amount: " + amount);


        Double testBalance = 10000.0;
        Double withdrawalamount = 2500.0;


        boolean hasFund = hasSufficientBalance.test(testBalance, withdrawalamount);

        if(hasFund){
            Double remainingBalance = withdraw.apply(testBalance, withdrawalamount);
            System.out.println("Remaining balance : " + remainingBalance);
            transactionLogger.accept("TXN1001", withdrawalamount);
        } else {
            System.out.println("Insufficent fund");
        }
    }
}
