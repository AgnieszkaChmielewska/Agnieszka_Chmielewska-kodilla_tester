package wallet;

public class Cashier {
    private CashSlot cashSlot;
    final private String unsuccessfulMessage = "Not enough money in wallet";
    final private String incorrectAmountMessage = "Incorrect value. Please enter a valid amount";
    final private String minAmountMessage = "The minimum withdrawal amount is $ 1";

    public CashSlot getCashSlot() {
        return cashSlot;
    }

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount > wallet.getBalance()) {
            getUnsuccessfulMessage();
        } else if (amount < 0) {
            getIncorrectAmountMessage();
        } else if (amount == 0 && amount<1) {
            getMinAmountMessage();
        } else {
            cashSlot.dispense(amount);
            wallet.debit(amount);
        }
    }

    public void withdraw(Wallet wallet, double amountDouble) {
            getMinAmountMessage();
    }

    public String getUnsuccessfulMessage() {
        return unsuccessfulMessage;
    }

    public String getIncorrectAmountMessage() {
        return incorrectAmountMessage;
    }

    public String getMinAmountMessage() {
        return minAmountMessage;
    }
}
