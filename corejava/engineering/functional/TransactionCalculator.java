package corejava.engineering.functional;

@FunctionalInterface
public interface TransactionCalculator {

    int calculate(int amount, int fee);
    
}
