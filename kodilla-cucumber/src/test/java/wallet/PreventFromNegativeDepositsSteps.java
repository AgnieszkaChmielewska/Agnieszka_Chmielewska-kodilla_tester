package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventFromNegativeDepositsSteps implements En {

    private Wallet wallet = new Wallet();

    public void preventFromNegativeDeposits(){
        When("I try to deposit {double}", (Double double1) -> {
            wallet.deposit(-0.123456);
        });

        Then("nothing should be deposited", () -> {
            Assert.assertEquals("Incorrect balance after negative deposit",200, wallet.getBalance());

        });
        When("I try to deposit {double}", (Double double1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });

    }
}
