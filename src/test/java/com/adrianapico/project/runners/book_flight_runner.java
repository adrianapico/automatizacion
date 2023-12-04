package com.adrianapico.project.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/book_flight.feature"},
        glue = {"com.adrianapico.project.step_definitions.book_flight_step_definitions"},
        snippets = CucumberOptions.SnippetType.UNDERSCORE
)

public class book_flight_runner{

}