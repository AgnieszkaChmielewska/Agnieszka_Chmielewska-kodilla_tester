package wallet;

import io.cucumber.java8.En;

public class PreventFromTakingOutMoreThanBalanceSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public PreventFromTakingOutMoreThanBalanceSteps() {

        When("I withdraw $200", () -> {
            cashier.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            cashSlot.dispense(0);
        });

        When("I withdraw $200.{int}", (Integer int1) -> {
            cashier.withdraw(wallet, 200.1);
        });
    }
}
