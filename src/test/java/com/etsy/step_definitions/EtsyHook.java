package com.etsy.step_definitions;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class EtsyHook {

    WebDriver driver = DriverHelper.getDriver();

    @Before
    public void setDriver(){
        driver.get(ConfigReader.readProperty("etsyURL"));
    }

}
