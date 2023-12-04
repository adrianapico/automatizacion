package com.adrianapico.project.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class book_flight_stepDefinition {
    @Managed
    private WebDriver driver;

    @Given("^I am on the despegar.com home page$")
    public void i_am_on_the_despegar_home_page() {
        driver.get("https://www.despegar.com.co");
    }

    @When("^I select the flight from MDE to BGA$)
    public void i_select_the_flight_from_MDE_to_BGA() {

    }

    @When("^I select the cheapest flights$")
    public void i_select_the_cheapest_flights() {

    }

    @Then("^I verify that the payment page is displayed$")
    public void i_verify_that_the_payment_page_is_displayed() {

    }
}
