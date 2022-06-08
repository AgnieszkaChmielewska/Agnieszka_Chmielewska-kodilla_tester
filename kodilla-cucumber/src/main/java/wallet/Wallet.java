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

    public void debit (int money){
        this.balance -=money;
    }

    public void debit (double money){
        this.balance -=money;
    }

    public int getBalance() {
        return balance;
    }


}
