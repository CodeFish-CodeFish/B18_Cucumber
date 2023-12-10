package com.tumblr.steps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

public class TumblrHook {

    WebDriver driver = DriverHelper.getDriver();

    @Before
    public void setDriver(){
        BrowserUtils.getURL(driver, "tumblrURL");
    }
}
