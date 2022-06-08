package wallet;

public class Cashier {
    final private CashSlot cashSlot;

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
        } else if (amount == 0) {
            getMinAmountMessage();
        } else {
            cashSlot.dispense(amount);
            wallet.debit(amount);
        }
    }

    public void withdraw(Wallet wallet, double amountDouble) {
    }

    public String getUnsuccessfulMessage() {
        return "Not enough money in wallet";
    }

    public String getIncorrectAmountMessage() {
        return "Incorrect value. Please enter a valid amount";
    }

    public String getMinAmountMessage() {
        return "The minimum withdrawal amount is $ 1";
    }
}
