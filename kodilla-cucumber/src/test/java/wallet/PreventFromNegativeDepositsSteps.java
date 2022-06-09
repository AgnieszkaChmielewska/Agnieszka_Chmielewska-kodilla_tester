package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventFromNegativeDepositsSteps implements En {

    final private Wallet wallet = new Wallet();

    public void preventFromNegativeDepositsSteps() {

        When("I try to deposit {int}", (Integer int1) -> {
            wallet.deposit(-1);
        });

        Then("{int} should be deposited", (Integer int1) -> {
            wallet.deposit(0);
            Assert.assertEquals(200, wallet.getBalance());
        });

    }
}
