package corejava.engineering.exceptions.customs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class TransactionFileReader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("./transaction.txt"))) {
            String transaction;

            while ((transaction = reader.readLine()) != null) {
                System.out.println("Processing: " + transaction);
            }
        } catch (IOException exception) {
            System.out.println("Reading failed: " + exception.getMessage());
        }

        System.out.println("Transaction processing completed");
    }
}
