package corejava.oop;

public interface Transferable {
    void transfer(double amount);

    default void showTransferStatus() {
        System.out.println("Transfer service available");
    }

    static void showTransferRules() {
        System.out.println("Maximum transfer limit: 100000");
    }
}
