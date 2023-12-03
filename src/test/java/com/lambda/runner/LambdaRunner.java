package com.lambda.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/lambda",
        glue = "com/lambda/step_definitions",
        dryRun = false,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                   "pretty", "json:target/cucumber-reports/Cucumber.json"},
        monochrome = true


)
public class LambdaRunner {
}
