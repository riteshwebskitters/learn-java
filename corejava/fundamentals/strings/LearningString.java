package corejava.fundamentals.strings;

public class LearningString {
    public static void main(String[] args) {
        // creating directly with String keyword
        String firstName = "John";
        String lastName = new String("Doe");

        String fullName = firstName.concat(" " + lastName);

        String upppercased = fullName.toUpperCase();

        System.out.println(fullName);

        System.out.println(fullName.length());

        System.out.println(upppercased);
        System.out.println(fullName.toLowerCase());

        System.out.println(fullName.charAt(fullName.length() - 1));
        System.out.println(fullName.charAt(0));

        // System.out.println(fullName.contains());

        // == compares whether two references point to the same object.

        // equals() compares the actual String content.


         String a = "Wallet";
        String b = "Wallet";

        String c = new String("Wallet");
        String d = new String("Wallet");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);

        System.out.println(a.equals(c));
        System.out.println(c.equals(d));
    }
}
