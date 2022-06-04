package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.time.MonthDay;

public class IsItSummerSteps implements En {
    private MonthDay today;
    private String answer;

    public IsItSummerSteps() {
        Given("today is last day of December", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(12,31);
           // throw new io.cucumber.java8.PendingException();
        });
        Given("today is first day of August", () -> {
            this.today = MonthDay.of(9, 1);
        });
        Given("today is 21th day of June", () -> {
            this.today = MonthDay.of(6, 21);
        });
        Given("today is second day of January", () -> {
            this.today = MonthDay.of(1, 2);
        });
        When("I ask whether it's Summer", () -> {
            // Write code here that turns the phrase above into concrete actions
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
          //  throw new io.cucumber.java8.PendingException();
        });
       Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
          // throw new io.cucumber.java8.PendingException();
            Assert.assertEquals(string, this.answer);
        });

    }
}

