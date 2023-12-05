package com.adrianapico.project.step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.URL;

import static java.sql.DriverManager.getDriver;

public class book_flight_stepDefinition {
    private WebDriver driver;
    private static final String xpath_origin_airport = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input";
    private static final String xpath_destination_airport = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div[2]/div/div/input";
    @Given("^I am on the despegar.com home page$")
    public void i_am_on_the_despegar_home_page() {
        String url = "https://www.despegar.com.co/";
        driver = new EdgeDriver();
        driver.get(url);
    }
    @When("^I select the flight from MDE to BGA$")
    public void i_select_the_flight_from_MDE_to_BGA() {
        driver.findElement(By.xpath(xpath_origin_airport)).sendKeys("MDE");
        driver.findElement(By.xpath(xpath_destination_airport)).sendKeys("BGA");
    }



}
