
package corejava.fundamentals.strings;

public class StringNormalisation {

    public static boolean validateAccount(String accountNumber) {

        // 1. Reject null
        if (accountNumber == null) {
            System.out.println("Account number cannot be null");
            return false;
        }

        // 2. Normalize input
        String normalizedAccount = accountNumber.strip();

        // 3. Reject empty or whitespace-only input
        if (normalizedAccount.isEmpty()) {
            System.out.println("Account number cannot be empty");
            return false;
        }

        // 4. Validate complete account format
        if (!normalizedAccount.matches("ACC\\d{5}")) {
            System.out.println("Invalid account number format");
            return false;
        }

        // 5. Valid account
        System.out.println("Account found: " + normalizedAccount);
        return true;
    }

    public static void main(String[] args) {

        validateAccount("ACC12345");
        validateAccount(" ACC12345 ");
        validateAccount("");
        validateAccount("   ");
        validateAccount(null);
        validateAccount("ACC123");
        validateAccount("XYZ12345");
    }
}
