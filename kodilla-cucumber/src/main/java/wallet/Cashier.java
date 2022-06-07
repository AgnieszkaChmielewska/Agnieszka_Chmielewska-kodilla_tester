package wallet;

public class Cashier {
    private CashSlot cashSlot;
    final private String unsuccessfulMessage = "Not enough money in wallet";
    final private String wrongValueMessage = "Wrong amount";

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount > wallet.getBalance()) {
            return;
        } else {
            cashSlot.dispense(amount);
            wallet.debit(amount);
        }
    }

    public String getUnsuccessfulMessage() {
        return unsuccessfulMessage;
    }

    public String getWrongValueMessage() {
        return wrongValueMessage;
    }
}
