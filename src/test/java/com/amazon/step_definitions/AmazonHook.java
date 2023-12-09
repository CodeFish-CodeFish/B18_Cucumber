package com.amazon.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class AmazonHook {

    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void setDriver(){

        driver.get(ConfigReader.readProperty("amazonURL"));

    }

    @After
    public void tearDown(Scenario scenario){

        BrowserUtils.takeScreenshotCucumber(scenario, driver);

    }
}
