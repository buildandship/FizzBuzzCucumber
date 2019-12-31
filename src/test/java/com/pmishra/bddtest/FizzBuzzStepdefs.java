package com.pmishra.bddtest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class FizzBuzzStepdefs {

    private FizzBuzz fizzBuzz;
    private String result;

    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() {
        fizzBuzz = new FizzBuzz();
        //throw new PendingException();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int num) {
        result=fizzBuzz.play(num);
    }

/*
    @Then("^The result is Fizz$")
    public void theResultIsFizz() {
        Assertions.assertEquals(result,"Fizz");
    }
*/

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String resultString) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(result,resultString);

        //throw new PendingException();
    }
}
