import java.util.Objects;

public class FrequencyCounter {
    public static int frequencyCount(String value, char target) {
        Objects.requireNonNull(value, "value cannot be null");
        int count = 0;

        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // int val = frequencyCount("TXN2026TXN", 'T');
        // int val = frequencyCount("TXN2026TXN", 'T');
        // int val = frequencyCount("TXN2026TXN", 'T');

        // frequencyCount("TXN2026TXN", 'N'); //
        int val1 = frequencyCount("WALLET", 'L'); // ?
        int val2 = frequencyCount("JAVA", 'Z'); // ?
        int val3 = frequencyCount("AAAA", 'A'); // ?

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
    }
}
