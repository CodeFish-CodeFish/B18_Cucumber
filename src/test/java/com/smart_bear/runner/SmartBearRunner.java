package com.smart_bear.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/smartBear",
        glue = "com/smart_bear/steps",
        dryRun = false,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "pretty", "json:target/cucumber-reports/Cucumber.json"} // extentReport Spark

)
public class SmartBearRunner {

}
