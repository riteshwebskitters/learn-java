package corejava.fundamentals.strings;

public class TransactionDescription {

    public static void main(String[] args) {
        StringBuilder description = new StringBuilder("TRANSACTION");

        /**
         * Important StringBuilder methods
         * Method Purpose
         * append() Add content at the end
         * insert() Insert content at a specified index
         * replace() Replace a range of characters
         * delete() Remove a range of characters
         * reverse() Reverse the content
         * length() Get current length
         * toString() Convert to String
         */

        // description.append(":DEPOSIT");
        // description.append(":ACC12345");
        // description.replace(0, 7, "TRANSACTION");
        // description.insert(0, "SUCCESS:");

        // System.out.println(description);
        // System.out.println(description.length());
    }

}
