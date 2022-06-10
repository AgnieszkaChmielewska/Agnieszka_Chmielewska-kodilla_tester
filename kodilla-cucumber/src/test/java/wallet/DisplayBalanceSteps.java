package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplayBalanceSteps implements En {

    private final Wallet wallet = new Wallet();

    public DisplayBalanceSteps() {
        Given("there is $100 in my wallet", () -> wallet.setBalance(100));

        When("I check the balance of my wallet", () -> wallet.getBalance());

        Then("I should see that the balance is $100", () -> {
        Assert.assertEquals(100, wallet.getBalance());
        });
    }
}