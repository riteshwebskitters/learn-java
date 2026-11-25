
package corejava.oop;

import corejava.oop.composition.Customer;

public class SavingsAccount extends BankAccount implements Transferable {

    public SavingsAccount(
            String accountNumber,
            double accountBalance,
            Customer customer) {

        super(accountNumber, accountBalance, customer);
    }

    public void displaySavingsAccountDetails() {
        displayDetails();
    }

    @Override
    public void calculateInterest() {
        System.out.println("Calculating savings interest");
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Savings account");
    }

    @Override
    public void transfer(double amount) {
        System.out.println("Transferring from savings account: " + amount);
    }
}


