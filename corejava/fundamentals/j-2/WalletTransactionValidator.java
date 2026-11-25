public class WalletTransactionValidator {

    public static void walletStarter() {
        int balance = 3000;
        boolean isAccountActive = true;
        boolean isAccountVerified = true;
        int withdrawalAmount = 2500;
        // int withdrawalAmount = -2500;
        // int withdrawalAmount = 4000;
        // int withdrawalAmount = 0;

        if (!isAccountActive) {
            System.out.println("Account is not active");
        } else if (!isAccountVerified) {
            System.out.println("Account verification needed");
        } else if (withdrawalAmount < 0) {
            System.out.println("invalid amount");
        } else if (withdrawalAmount == 0) {
            System.out.println("Amount must be greater than 0");
        } else if (balance >= withdrawalAmount) {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successfull.");
            System.out.println("Remaining balance " + balance);
        } else {
            System.out.println("insufficient fund");
        }
    }

    public static void walletValidator() {
        String transactionType = "TRANSFER";

        int balance = 3000;
        boolean isAccountActive = true;
        boolean isAccountVerified = true;
        int amount = 100;

        if (!isAccountActive) {
            System.out.println("Account is not active");
            return;
        } else if (!isAccountVerified) {
            System.out.println("Account verification needed");
            return;
        } else if (amount <= 0) {
            System.out.println("amount must be grater than 0");
            return;
        }

        switch (transactionType) {
            case "TRANSFER":
                if (balance < amount) {
                    System.out.println("In sufficient balance");
                    return;
                }

                // balance -= amount;
                System.out.println("Transfering amount " + amount + ", reamining " + balance);
                break;
            case "DEPOSIT":

                balance += amount;
                System.out.println("Amount deposited." + " You avl balance " + balance);
                break;

            case "WITHDRAWAL":
                if (balance < amount) {
                    System.out.println("In sufficient balance");
                    return;
                }
                balance -= amount;
                System.out.println("Amount withdrawn." + " You avl balance " + balance);
                break;

            default:
                System.out.print("invalid operation");
                break;
        }
    }

    public static void calculateTransactionFee() {
        String transactionType = "REFUND";

        int balance = 100;
        boolean isAccountActive = true;
        boolean isAccountVerified = true;
        int amount = 100;

        if (!isAccountActive) {
            System.out.println("Account is not active");
            return;
        } else if (!isAccountVerified) {
            System.out.println("Account verification needed");
            return;
        } else if (amount <= 0) {
            System.out.println("amount must be grater than 0");
            return;
        }

        int fee = switch (transactionType) {
            case "TRANSFER":
                int baseFee = 10;

                if (baseFee <= 0) {
                    System.out.println("Amount must be greater than 0");
                    yield -1;
                } else if (balance < amount) {
                    System.out.println("In sufficient balance");
                    yield -1;
                }

                 yield baseFee + amount;

            case "DEPOSIT":

                if (balance < amount) {
                    System.out.println("In sufficient balance");
                    yield -1;
                } 
                

                    yield balance + amount;

                

            case "WITHDRAW":

                if (balance < amount) {
                    System.out.println("In sufficient balance");
                    yield -1;
                }   
                
                yield balance - amount;
                

            case "REFUND":
                int refundAmount = 150;
                int transactionFee = 10;
                if (refundAmount <= 0 || transactionFee < 0) {
                    System.out.println("amount must be greater than 0");
                    yield -1;
                }


                 yield balance + refundAmount - transactionFee;
            default:
                yield -1;
        };

        System.out.println(fee);
    }

    public static void main(String[] args) {

        // Wallet();
        // walletValidator();
        calculateTransactionFee();
    }
}
