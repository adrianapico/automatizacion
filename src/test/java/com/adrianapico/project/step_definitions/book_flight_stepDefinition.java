package com.adrianapico.project.step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class book_flight_stepDefinition {
    private WebDriver driver;
    private static final String xpath_origin_airport = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input";
    private static final String xpath_destination_airport = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div[2]/div/div/input";
    private static final String xpath_departure_date = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[3]/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/input";
    private static final String xpath_return_date = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div/div/div/input";
    private static final String xpath_search_button = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[3]/div[3]/button";
    private static final String xpath_cheapest_flight = "//*[@id=\"flights-container\"]/div/div[2]/div/div[2]/div/div[4]/app-root/app-common/new-sorting-tabs/div/tab-component[2]";
    private static final String xpath_buy_flight = "//*[@id=\"clusters\"]/span[1]/div/span/cluster/div/div/div[2]/fare/span/span/div/buy-button";


    @Given("^I am on the despegar.com home page$")
    public void i_am_on_the_despegar_home_page() {
        String url = "https://www.despegar.com.co/";
        driver = new EdgeDriver();
        driver.get(url);
    }
    @When("^I select the flight from MDE to BOG$")
    public void i_select_the_flight_from_MDE_to_BOG() {
        driver.findElement(By.xpath(xpath_origin_airport)).sendKeys("MDE");
        driver.findElement(By.xpath(xpath_destination_airport)).sendKeys("BOG");
    }
    @And ("^I select the departure and return date$")
    public void i_select_the_departure_and_return_date() {
        driver.findElement(By.xpath(xpath_departure_date)).sendKeys("20-12-2023");
        driver.findElement(By.xpath(xpath_return_date)).sendKeys("30-12-2023");
    }
    @And("^I buy the cheapest flights$")
    public void i_buy_the_cheapest_flights() {
        //Step1: search flight
        driver.findElement(By.xpath(xpath_search_button)).click();
        //Step2: cheapest flight
        driver.findElement(By.xpath(xpath_cheapest_flight)).click();
        //Step3: buy flight
        driver.findElement(By.xpath(xpath_buy_flight)).click();
    }
    @Then("I verify that the payment page is displayed")
    public void i_verify_that_the_payment_page_is_displayed() {
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("/checkout"));
    }

}
