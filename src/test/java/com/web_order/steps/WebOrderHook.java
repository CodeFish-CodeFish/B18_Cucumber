package com.web_order.steps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class WebOrderHook {

    WebDriver driver = DriverHelper.getDriver();

    @Before
    public void setDriver(){
        driver.get(ConfigReader.readProperty("webOrderURL"));
    }
}
