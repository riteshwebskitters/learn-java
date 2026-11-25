
package corejava.oop;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import corejava.oop.composition.Address;
import corejava.oop.composition.Customer;

public class BankAccountDemo {

        public static void main(String[] args) {
                // CustomerNew customer1 = new CustomerNew("CUS101", "Ritesh",
                // "ritesh@example.com");
                // CustomerNew customer2 = new CustomerNew("CUS101", "Ritesh Updated",
                // "new@example.com");
                // CustomerNew customer3 = new CustomerNew("CUS102", "Amit",
                // "amit@example.com");

                // System.out.println(customer1.equals(customer2));
                // System.out.println(customer1.equals(customer3));
                // System.out.println(customer1 == customer2);
                // System.out.println(customer1);

                // Set<CustomerNew> customers = new HashSet<>();

                // customers.add(customer1);
                // customers.add(customer2);
                // customers.add(customer3);

                // System.out.println("Total customers: " + customers.size());

                // Address address = new Address(
                // "Kolkata",
                // "West Bengal",
                // "India");

                // Customer customer = new Customer("Ritesh", address);

                // AccountType accountType = AccountType.SAVIINGS;
                // TransactionStatus transactionStatus = TransactionStatus.PENDING;

                // TransactionReceipt receipt = new TransactionReceipt(
                // "TXN1001",
                // 2500.00,
                // TransactionStatus.SUCCESS);

                // PaymentDetails payment = new PaymentDetails("PAY1001", 155.55, "UPI",
                // TransactionStatus.SUCCESS);

                PaymentService service = new PaymentService();

                service.processUpiPayment();
                service.processCardPayment();
                service.showPaymentStatus();

                System.out.println("\n--- Audit Information ---");

                Method[] methods = PaymentService.class.getDeclaredMethods();

                for (Method method : methods) {

                        if (method.isAnnotationPresent(Auditable.class)) {

                                Auditable audit = method.getAnnotation(Auditable.class);

                                System.out.println(
                                                method.getName() + " requires audit: " + audit.value());
                        }
                }

                // System.out.println(payment);

                // System.out.println("Payment ID: " + payment.paymentId());
                // System.out.println("Amount: " + payment.amount());
                // System.out.println("Status: " + payment.status());

                // System.out.println("\n================");
                // System.out.println(receipt);

                // System.out.println("Transaction ID: " + receipt.transactionId());
                // System.out.println("Amount: " + receipt.amount());
                // System.out.println("Status: " + receipt.status());

                // for (TransactionStatus type : TransactionStatus.values()) {
                // System.out.println(type);
                // }

                // for (AccountType type : AccountType.values()) {
                // System.out.println(type);
                // }

                // if (transactionStatus == TransactionStatus.PENDING) {
                // System.out.println("PENDING TRANSACTION");
                // }

                // if (accountType == AccountType.SAVIINGS) {
                // System.out.println("This is savings account");
                // }

                // // Both accounts share the same Customer object.
                // BankAccount account1 = new SavingsAccount(
                // "ACC1001",
                // 5000,
                // customer);

                // BankAccount account2 = new CurrentAccount(
                // "ACC1002",
                // 10000,
                // customer);

                // System.out.println("=== Account 1 Details ===");
                // account1.displayDetails();

                // System.out.println("\n=== Account 2 Details ===");
                // account2.displayDetails();

                // System.out.println("\n=== Account 1 Customer ===");
                // account1.displayAccountHolder();

                // System.out.println("\n=== Account 2 Customer ===");
                // account2.displayAccountHolder();

                // System.out.println("\n=== Account Types ===");
                // account1.displayAccountType();
                // account2.displayAccountType();

                // System.out.println("\n=== Interest Calculation ===");
                // account1.calculateInterest();
                // account2.calculateInterest();

                // System.out.println("\n=== Account Operations ===");
                // account1.deposit(1000);
                // account1.displayBalance();

                // account2.withdraw(2000);
                // account2.displayBalance();

                // System.out.println("\n=== Before Customer Update ===");

                // account1.displayAccountHolder();
                // account2.displayAccountHolder();

                // customer.setName("Rahul");

                // System.out.println("\n=== After Customer Update ===");

                // account1.displayAccountHolder();
                // account2.displayAccountHolder();
        }
}
