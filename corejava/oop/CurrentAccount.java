
package corejava.oop;

import corejava.oop.composition.Customer;

public class CurrentAccount extends BankAccount implements Transferable {

    public CurrentAccount(
            String accountNumber,
            double accountBalance,
            Customer customer) {

        super(accountNumber, accountBalance, customer);
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Current account");
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account interest");
    }

    @Override
    public void transfer(double amount) {
        System.out.println("Transferring from current account: " + amount);
    }
}
