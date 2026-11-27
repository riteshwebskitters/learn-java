package corejava.engineering.functional;

import java.util.function.Predicate;

public class StaticMethodReferenceDemo {
    public static void main (String[] args){
        Predicate<Integer> lambdaExp = amount -> TransactionUtils.isValidAmount(amount);
        Predicate<Integer> validator = TransactionUtils::isValidAmount;


        System.out.println("Lambda Exp : " + lambdaExp.test(500));
        System.out.println("Method ref : " + validator.test(2500));
        System.out.println("Method ref : " + validator.test(0));
        System.out.println("Method ref : " + validator.test(-2500));
    }
}
