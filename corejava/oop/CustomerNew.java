package corejava.oop;

import java.util.Objects;

public class CustomerNew {
    private String customerId;
    private String name;
    private String emailId;

    public CustomerNew(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.emailId = email;
    }

    @Override
    public String toString() {
        return "Customer{id='" + customerId + "', name='" + name + "', email='" + emailId + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CustomerNew other)) {
            return false;
        }

        return Objects.equals(customerId, other.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }
}