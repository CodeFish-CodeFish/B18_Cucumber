package com.open_cart.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                   // feature path will always start with 'src'
        features = "src/test/resources/OpenCart", // this is the path for feature files, to get the path
                                                 // we need to do rightClick on top of directory/folder where
                                                // our feature file is located. And we click on copy Path/Reference
                                                // and click on Path From Content Root
                                                // NOTE: if the path is not available, then we need to enable version control
                                                 // on top of the window in intellij

        // glue will always start with com or name of the package
        glue = "com/open_cart/step_definitions", // This is the path for stepDefinitions package
                                                // to get the path we need to rightClick on top of package
                                                // and click on copy Path/Reference and click on Path From Source Root
        dryRun = false,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "pretty", "json:target/cucumber-reports/Cucumber.json"} // this plugin is used for reports

)
public class OpenCartRunner{
}
