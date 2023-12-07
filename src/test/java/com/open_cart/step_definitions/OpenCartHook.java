package com.open_cart.step_definitions;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.util.Collections;

public class OpenCartHook {

    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void setDriver(){
        driver.get(ConfigReader.readProperty("openCartURL"));
    }



}
