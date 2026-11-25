package corejava.oop.composition;

public class Address {
    private String city;
    private String state;
    private String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public void displayAddress() {
        System.out.println(city + ", " + state + ", " + country);
    }
}
