package wallet;

import io.cucumber.java8.En;

public class PreventFromNegativeDeposits implements En {

    public void preventFromNegativeDeposits(){
        When("I withdraw {int}", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });

        Then("nothing should be deposited", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });
    }
}
