package corejava.engineering.functional;

@FunctionalInterface 
public interface TransactionValidator {
    boolean isValid(int amount);
}
