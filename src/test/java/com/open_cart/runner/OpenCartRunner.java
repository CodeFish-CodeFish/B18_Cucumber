package com.open_cart.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/OpenCart",
        glue = "com/open_cart/step_definitions",
        dryRun = true

)
public class OpenCartRunner {
}
