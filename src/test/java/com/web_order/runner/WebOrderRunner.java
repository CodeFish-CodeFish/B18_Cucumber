package com.web_order.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/webOrder",
        glue = "com/web_order/steps",
        dryRun = false,
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}

        // this plugin is regular cucumber report generator that will generate a report inside target fodler

)
public class WebOrderRunner {
}
