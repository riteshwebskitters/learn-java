package corejava.oop;

public class WalletDemo {

    public static void main(String[] args) {

        Wallet wallet1 = new Wallet();

        wallet1.accountNumber = "ACC1001";
        wallet1.holderName = "Ritesh";
        wallet1.balance = 5000;
        wallet1.isActive = true;

        Wallet wallet2 = new Wallet();

        wallet2.accountNumber = "ACC1002";
        wallet2.holderName = "Rahul";
        wallet2.balance = 10000;
        wallet2.isActive = true;

        System.out.println(wallet1.holderName);
        System.out.println(wallet1.balance);

        System.out.println(wallet2.holderName);
        System.out.println(wallet2.balance);
    }
}