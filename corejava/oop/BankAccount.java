
package corejava.oop;

import corejava.oop.composition.Customer;

public abstract class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private boolean isActive;

    private Customer customer;

    static String bankName = "Global Bank";

    // Every bank account must have a valid Customer.
    protected BankAccount(
            String accountNumber,
            double accountBalance,
            Customer customer) {

        this.accountNumber = validateAccountNumber(accountNumber);
        this.accountBalance = validateOpeningBalance(accountBalance);
        this.customer = validateCustomer(customer);
    }

    private static Customer validateCustomer(Customer customer) {

        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }

        return customer;
    }

    private static String validateAccountNumber(String accountNumber) {

        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Account number cannot be null or blank");
        }

        return accountNumber;
    }

    private static double validateOpeningBalance(double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Opening balance cannot be negative");
        }

        return balance;
    }

    public void displayAccountHolder() {
        customer.displayCustomerDetails();
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }

        accountBalance += amount;
    }

    public void displayBalance() {
        System.out.println("Balance: " + accountBalance);
    }

    public static void changeBankName(String value) {
        BankAccount.bankName = value;
    }

    public double getBalance() {
        return accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Account holder name comes from Customer.
    public String getAccountHolder() {
        return customer.getName();
    }

    public void displayDetails() {

        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + customer.getName());
        System.out.println("Is Account Active: " + isActive);
        System.out.println("Account Balance: " + accountBalance);
    }

    public void transferTo(String targetAccount, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid transfer amount");

        } else if (accountBalance >= amount) {

            accountBalance -= amount;

            System.out.println(
                    "Transferring amount " + amount + " to " + targetAccount);

            System.out.println("Transfer successful");

        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }

        if (amount > accountBalance) {
            System.out.println("Insufficient funds");
            return;
        }

        accountBalance -= amount;

        System.out.println("Withdrawal successful: " + amount);
    }

    public void setIsActive(boolean active) {
        this.isActive = active;
    }

    public void displayAccountType() {
        System.out.println("General Bank Account");
    }

    public abstract void calculateInterest();
}
