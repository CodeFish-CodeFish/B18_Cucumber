package com.smart_bear.steps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class SmartBearHook {

    WebDriver driver = DriverHelper.getDriver();

    @Before // This @Before annotation that is coming from cucumber is not dependent on runner class
            // instead this annotation is looking at only on feature file
            // that means whenever we run our test from feature file, this @Before annotation
            // will run for all feature file and vice versa no matter how many feature files are there.
            // what we mean is if we have multiple @Before annotations all of them are will be triggered
    public void setDriver(){
        driver.get(ConfigReader.readProperty("smartBearURL"));
    }

}
