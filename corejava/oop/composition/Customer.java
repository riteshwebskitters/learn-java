
package corejava.oop.composition;

public class Customer {

    private String name;
    private Address address;

    public Customer(String name, Address address) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Customer name cannot be null or blank");
        }

        if (address == null) {
            throw new IllegalArgumentException(
                    "Customer address cannot be null");
        }

        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void displayCustomerDetails() {

        System.out.println("Customer: " + name);
        address.displayAddress();
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid customer name");
        }

        this.name = name;
    }
}
