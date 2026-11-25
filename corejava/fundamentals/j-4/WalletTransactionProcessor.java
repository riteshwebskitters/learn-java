public class WalletTransactionProcessor {
    // 1. Validate account identity
    public static boolean validateAccount(
            String userAccountNumber,
            String accountNumber) {

        return userAccountNumber != null
                && userAccountNumber.equals(accountNumber);
    }

    // 2. Validate withdrawal amount
    public static boolean validateAmount(int withdrawalAmount) {
        return withdrawalAmount > 0;
    }

    // 3. Check available wallet balance
    public static boolean checkBalance(int balance, int withdrawalAmount) {
        return balance >= withdrawalAmount;
    }

    // 4. Calculate remaining balance
    public static int deductBalance(int balance, int withdrawalAmount) {
        return balance - withdrawalAmount;
    }

    // 5. Display updated balance
    public static void displayBalance(int updatedBalance) {
        System.out.println("Your available balance: " + updatedBalance);
    }

    // 6. Coordinate the withdrawal process
    public static boolean processWithdrawal(
            String userAccountNumber,
            String accountNumber,
            int balance,
            int withdrawalAmount) {

        if (!validateAccount(userAccountNumber, accountNumber)) {
            System.out.println("Account does not exist");
            return false;
        }

        if (!validateAmount(withdrawalAmount)) {
            System.out.println("Invalid withdrawal amount");
            return false;
        }

        if (!checkBalance(balance, withdrawalAmount)) {
            System.out.println("Insufficient funds");
            return false;
        }

        int updatedBalance = deductBalance(balance, withdrawalAmount);

        System.out.println("Withdrawal successful");
        displayBalance(updatedBalance);

        return true;
    }

    public static void main(String[] args) {

        String userAccountNumber = "ABC147";
        String accountNumber = "ABC147";

        int balance = 5000;
        int withdrawalAmount = 1500;

        boolean isWithdrawalSuccessful = processWithdrawal(
                userAccountNumber,
                accountNumber,
                balance,
                withdrawalAmount);

        System.out.println("Transaction status: " + isWithdrawalSuccessful);
    }

}
