public class Concepts {
    public static int calculateDeposit(int amount, int balance) {
        return amount + balance;
    }


    // method overloading
    public static int calculateDeposit(int amount, int balance, int bonus) {
        return amount + balance + bonus;
    }

    public static void displayBalance(int balance){
        System.out.println("updated wallet balance: " + balance);
    }

    public static void main(String[] args){
        int balance = calculateDeposit(1500, 5500, 800);
        displayBalance(balance);
    }
}

// +1 510 6378159 neetujs@gmail.com