package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsNumberDivisibleByThreeAndFiveSteps implements En {
    private int number;
    private String answer;

    public IsNumberDivisibleByThreeAndFiveSteps() {

        Given("the zero", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 0;
        });

        Given("the one", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 1;
        });

        Given("the three", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 3;
        });

        Given("the five", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 5;
        });

        Given("the six", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 6;
        });

        Given("the nine", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 9;
        });

        Given("the ten", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 10;
        });

        Given("the fifteen", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 15;
        });

        When("I ask whether number is divisible by three and five", () -> {
            // Write code here that turns the phrase above into concrete actions
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfNumIsDivisibleByThreeAndFive(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
