package carsRating.automation;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/carsRating",
        glue = "carsRating.automation",
        tags = "@Regression")
//        tags = "@Smoke")

public class TestRunner {
}
