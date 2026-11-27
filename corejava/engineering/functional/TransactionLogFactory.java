package corejava.engineering.functional;

import java.util.List;
import java.util.function.Function;

public class TransactionLogFactory {
    public static void main(String[] args) {

        List<String> transactionIds = List.of(
                "TXN1001",
                "TXN1002",
                "TXN1003");

        // Lambda approach
        Function<String, TransactionLog> lambdaFactory = transactionId -> new TransactionLog(transactionId);

        // Constructor reference approach
        Function<String, TransactionLog> constructorFactory = TransactionLog::new;

        transactionIds.stream()
                .map(constructorFactory)
                .forEach(System.out::println);
    }
}
