package com.amazon.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/amazon",
        glue = "com/amazon/step_definitions",
        dryRun = false,
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"} // this will allow reRunner in case test fail
//  plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                   "pretty", "json:target/cucumber-reports/Cucumber.json"}  no reRunner as of now
)
public class AmazonRunner {
}
