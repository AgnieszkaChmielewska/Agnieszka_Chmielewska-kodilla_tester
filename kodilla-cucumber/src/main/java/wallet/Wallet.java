package wallet;

public class Wallet {
    private int balance;


    public Wallet() {
    }

    public void deposit(int money) {
        if (money<0){
            System.out.println("Negative numbers not allowed");
        } else
        this.balance += money;
    }
    public String deposit(double money) {
        System.out.println("Negative numbers not allowed");
        return "Negative numbers not allowed";
    }

    public void debit (int money){
        this.balance -=money;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }


}
