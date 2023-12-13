package com.luma.steps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class LumaHook {

    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void setDriver(){
      //driver.get(ConfigReader.readProperty("lumaURL"));
        BrowserUtils.getURL(driver, "lumaURL");

    }

}
