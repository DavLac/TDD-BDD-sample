package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.davlac.tddbddsample.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StepDefs {

    private Integer number1;
    private Integer number2;
    private Integer result;

    @Given("{int} and {int}")
    public void and(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @When("we add them")
    public void weAddThem() {
        result = Calculator.add(number1, number2);
    }

    @Then("I should get {int}")
    public void iShouldGet(int number) {
        assertEquals(result, number);
    }

}
