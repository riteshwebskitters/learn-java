public class Reverse {
    public static String reverseString(String value) {
        StringBuilder reversed = new StringBuilder();
        for (int i = value.length() - 1; i >= 0; i--) {
            reversed.append(value.charAt(i));
        }

        // String reversed = "";

        // for (int i = value.length() - 1; i >= 0; i--) {
        // reversed = reversed + value.charAt(i);
        // }

        // return reversed;

        return reversed.toString();
    }


    public static boolean pallindrome(String value){
        String reversed = reverseString(value);

        return reversed.equals(value);
    }
}
