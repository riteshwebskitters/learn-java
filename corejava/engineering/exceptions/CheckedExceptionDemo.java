package corejava.engineering.exceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) {

        try {
            Thread.sleep(2000);

            System.out.println("Processing completed");

        } catch (InterruptedException exception) {

            System.out.println("Processing interrupted");
        }
    }
}
