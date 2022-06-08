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

        Then("I should see {string}", (String string) -> {
            Assert.assertEquals(string, cashier.getMinAmountMessage());
        });

        When("I request $-{int}", (Integer int1) -> {
            cashier.withdraw(wallet, -1);
        });

        Then("The message should be displayed {string}", (String string) -> {
            Assert.assertEquals(string, cashier.getIncorrectAmountMessage());
        });

        When("I request {double}", (Double double1) -> {
            cashier.withdraw(wallet, 0.5);
        });

        When("I request zero $0", () -> {
            cashier.withdraw(wallet, 0);
        });

        Then("I should see message that  {string}", (String string) -> {
            Assert.assertEquals(string, cashier.getMinAmountMessage());

        });

        Given("I have deposited $0 in my wallet", () -> {
            wallet.deposit(0);
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });

        When("I request $1", () -> {
            cashier.withdraw(wallet, 1);
        });

        Then("In may wallet should be $0", () -> {
            Assert.assertEquals(0, wallet.getBalance());
        });

        Given("I have deposited $-{int} in my wallet", (Integer int1) -> {
            wallet.deposit(-1);
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });


    }
}