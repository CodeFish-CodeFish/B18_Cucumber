package com.qa_fox.step_definitions;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

public class QaFoxHook {

    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void setDriver(){
        BrowserUtils.getURL(driver, "qaFoxURL");
    }
}
