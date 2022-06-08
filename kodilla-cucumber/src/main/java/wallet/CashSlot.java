package wallet;

public class CashSlot {
    private int contents;
    private double contentsDouble;

    public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }

    public void dispense(double amount) {
        this.contentsDouble = amount;
    }

}