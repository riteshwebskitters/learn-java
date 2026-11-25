package corejava.engineering.generic;

public class TransactionUtility {
    public static <T> void displayData(T data) {
        System.out.println("Data : " + data);
    }

    public static <T> T getData(T value) {
        return value;
    }

    public static void main(String[] args) {
        Integer amount = getData(1500);
        String status = getData("SUCCESS");
        Double balance = getData(147.24);

        displayData(amount);
        displayData(status);
        displayData(balance);
    }
}
