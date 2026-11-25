package corejava.engineering.exceptions;

public class TransactionScheduler {
    public static void scheduleTransaction() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Transaction scheduled successfully");
    }

    public static void main(String[] args){
        try {
            
            scheduleTransaction();
        } catch (InterruptedException exception) {

            System.out.println("Transaction interrupted");
        }
    }
}
