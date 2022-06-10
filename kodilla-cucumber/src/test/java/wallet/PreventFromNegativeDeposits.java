package wallet;

import io.cucumber.java8.En;

public class PreventFromNegativeDeposits implements En {
    final private Wallet wallet = new Wallet();

    public void preventFromNegativeDeposits() {

        When("I deposit {int}", (Integer int1) -> {
            wallet.deposit(-1);
        });

        Then("nothing should be deposited", () -> {
            throw new io.cucumber.java8.PendingException();
        });

    }
}
