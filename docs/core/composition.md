Next: J-9.12 — Composition and Object Relationships
This is particularly important for backend development.

So far, we've learned:
- Inheritance: SavingsAccount extends BankAccount
- Interfaces: SavingsAccount implements Transferable
Now we'll learn composition.

Imagine a banking application:
- A BankAccount has a Customer.
- A Customer has an Address.
- A BankAccount has Transactions.
A BankAccount isn't a Customer, and a Customer isn't a BankAccount.

Instead, they are separate objects connected through references.

That's composition.








sutd50003.github.io


First demonstration
Consider these two classes:
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class BankAccount {

    private Customer customer;

    public BankAccount(Customer customer) {
        this.customer = customer;
    }

    public void displayAccountHolder() {
        System.out.println(customer.getName());
    }
}


Here, BankAccount contains a reference to a Customer object.

Usage:
Customer customer = new Customer("Ritesh");

BankAccount account = new BankAccount(customer);

account.displayAccountHolder();


Output:
Ritesh


The important distinction:
- Inheritance represents an is-a relationship.
- Composition represents a has-a relationship.
SavingsAccount is a BankAccount.

BankAccount has a Customer.