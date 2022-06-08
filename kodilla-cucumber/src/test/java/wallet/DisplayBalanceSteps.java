package wallet;

import io.cucumber.java8.En;

public class DisplayBalanceSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public DisplayBalanceSteps() {
        Given("there is $100 in my wallet", () -> {
            wallet.setBalance(100);
        });

        When("I check the balance of my wallet", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });

        Then("I should see that the balance is $100", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });
    }
}