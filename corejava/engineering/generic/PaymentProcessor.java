package corejava.engineering.generic;

public class PaymentProcessor implements TransactionProcessor<Integer> {
    private Integer amount;

    @Override
    public void process(Integer transactionData) {
        this.amount = transactionData;
        System.out.println("Processing payment: " + amount);
    }

    @Override
    public Integer getTransactionData() {
        return amount;
    }

    public static void main(String[] args) {
        PaymentProcessor payment = new PaymentProcessor();
        payment.process(7500);
        Integer storedAmount = payment.getTransactionData();

        System.out.println("Retrieved payment amount: " + storedAmount);
    }
}
