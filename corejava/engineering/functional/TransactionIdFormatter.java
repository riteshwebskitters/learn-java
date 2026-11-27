package corejava.engineering.functional;

import java.util.List;

public class TransactionIdFormatter {
    public static void main(String[] args) {
        List<String> transactionIds = List.of("txn1001", "txn1002", "txn1003");

        // lambda approach
        transactionIds.stream().map(transactionId -> transactionId.toUpperCase()).forEach(System.out::println);
        System.out.println("==============");
        // arbitary method reference
        transactionIds.stream().map(String::toUpperCase).forEach(System.out::println);
    }

}
