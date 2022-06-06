package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsNumberDivisibleByThreeAndFiveSteps implements En {
    private int number;
    private String answer;

    public IsNumberDivisibleByThreeAndFiveSteps() {

        Given("the one", () -> {
            this.number = 1;
        });

        Given("the three", () -> {
            this.number = 3;
        });

        Given("the five", () -> {
            this.number = 5;
        });

        Given("the six", () -> {
            this.number = 6;
        });

        Given("the nine", () -> {
            this.number = 9;
        });

        Given("the ten", () -> {
            this.number = 10;
        });

        Given("the fifteen", () -> {
            this.number = 15;
        });

        When("I ask whether number is divisible by three and five", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfNumIsDivisibleByThreeAndFive(this.number);
        });

        Then("I should have {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
