package com.luma.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/luma",
        glue = "com/luma/steps",
        dryRun = false
)
public class LumaRunner {
}
