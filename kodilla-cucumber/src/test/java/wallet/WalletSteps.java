package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("In may wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());

        });

        When("I request $201", () -> {
            cashier.withdraw(wallet, 201);

        });

        Then("I should see message {string}", (String string) -> {
            Assert.assertEquals(string, cashier.getUnsuccessfulMessage());

        });

        Then("In may wallet should be $200", () -> {
            Assert.assertEquals(200, wallet.getBalance());
        });

    }
}