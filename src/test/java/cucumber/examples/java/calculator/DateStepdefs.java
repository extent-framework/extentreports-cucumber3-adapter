package cucumber.examples.java.calculator;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DateStepdefs {
    private String result;
    private DateCalculator calculator;

    @Given("today is {iso-date}")
    public void today_is(Date date) {
        calculator = new DateCalculator(date);
    }
    
    @After
    public void after(Scenario scenario) throws IOException {
        scenario.embed(extractBytes("src/test/resources/img.png"), "image/png");
    }

    public byte[] extractBytes (String imageName) throws IOException {
        return Files.readAllBytes(new File(imageName).toPath());
    }

    @When("I ask if {date} is in the past")
    public void I_ask_if_date_is_in_the_past(Date date) {
        result = calculator.isDateInThePast(date);
    }

    @Then("the result should be (.+)")
    public void the_result_should_be(String expectedResult) {
        assertEquals(expectedResult, result);
    }
}
