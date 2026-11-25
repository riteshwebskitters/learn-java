public class MethodOverloading {
    public static int accountBalance(int balance, int amount){
        return balance + amount;
    }

    public static int accountBalance(int balance, int amount, int bonus){
        return balance + amount + bonus;
    }

    
    public static void main(String[] args){
        System.out.println("WORKS");
    }
}
