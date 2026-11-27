package corejava.engineering.functional;

import java.util.function.Consumer;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        Consumer<String> lambdaLogger = transactionId -> System.out.println(transactionId);
        Consumer<String> methodLogger = System.out::println;

        // logger
        TransactionLogger logger = new TransactionLogger();
        Consumer<String> lambdaLogger2 = transactionId -> logger.log(transactionId);
        Consumer<String> methodLogger2 = logger::log;

        lambdaLogger2.accept("TXN1001");
        methodLogger2.accept("TXN1001");
    }
}
