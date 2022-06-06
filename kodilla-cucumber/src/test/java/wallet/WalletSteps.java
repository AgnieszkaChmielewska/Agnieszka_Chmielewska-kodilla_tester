package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();


    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            // Write code here that turns the phrase above into concrete actions
           // throw new io.cucumber.java8.PendingException();
        Wallet wallet = new Wallet();
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance",200, wallet.getBalance());
        });

        When("I request $30", () -> {
            // Write code here that turns the phrase above into concrete actions
            // throw new io.cucumber.java8.PendingException();
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            // Write code here that turns the phrase above into concrete actions
            // throw new io.cucumber.java8.PendingException();
        Assert.assertEquals(30, cashSlot.getContents());
        });
    }
}
