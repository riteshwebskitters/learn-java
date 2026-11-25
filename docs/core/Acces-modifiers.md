# J-9.7 — Access Modifiers

This is an important step because we're moving from simply creating objects to controlling how other classes interact with them.

### Subphase 1 — Understanding the problem
Imagine your BankAccount class contains:
public class BankAccount {
    double accountBalance = 5000;
}


Another class can directly modify the balance:
BankAccount account = new BankAccount();

account.accountBalance = -100000;


That is a problem. A bank account shouldn't allow another class to arbitrarily change its balance.

We need a way to control access to fields and methods.
Subphase 2 — Introducing private
Java provides access modifiers to control visibility.

For now, focus on these two:
- public — accessible from other classes, subject to the applicable access context.
- private — accessible only within the declaring class.
Working demonstration

public class BankAccount {

    private double accountBalance = 5000;

    public void displayBalance() {
        System.out.println(accountBalance);
    }
}



Another class:
public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.displayBalance(); // Allowed

        account.accountBalance = 1000; // Compilation error
    }
}


Why?
- displayBalance() is public, so the other class can call it.
- accountBalance is private, so the other class cannot access it directly.
The account itself can still access and modify its private field through its own methods.