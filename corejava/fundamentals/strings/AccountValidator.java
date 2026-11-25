package corejava.fundamentals.strings;

public class AccountValidator {
    public static void main(String[] args) {
        // String registeredAccount = "ACC12345";
        // String enteredAccount = new String("ACC12345");
        // String user = "Ritesh";

        // System.out.println(registeredAccount == enteredAccount);
        // System.out.println(registeredAccount.equals(enteredAccount));

        // System.out.println(user.equalsIgnoreCase("ritesh"));

        // substring() — Extract part of a String
        String transactionId = "TXN20261110";

        System.out.println(transactionId.substring(3));
        System.out.println(transactionId.substring(0, 3));

        // replace() — Replace characters or sequences
        String account = "ACC-123-456";

        System.out.println(account.replace("-", ""));

        // split() — Divide a String into an array

        String transaction = "DEPOSIT:1500";

        String[] transactionData = transaction.split(":");

        System.out.println(transactionData[0]);
        System.out.println(transactionData[1]);

        // trim() and strip() — Remove unwanted whitespace

        /**
         * 
         * Difference:
         * - trim() removes leading and trailing characters with code points up to
         * U+0020.
         * - strip() uses Java's Unicode-aware whitespace definition.
         */

        String email = "  john@gmail.com  ";

        System.out.println(email.trim());
        System.out.println(email.strip());

        /**
         * startsWith() checks the beginning of a String.
         * indexOf() returns the position of the first occurrence.
         * If indexOf() cannot find the requested value, it returns -1
         */


        System.out.println(transactionId.startsWith("TXN"));
        System.out.println(transactionId.indexOf("2026"));
    }

}
