package com.amazon.step_definitions;

import com.amazon.pages.AmazonMain;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

public class AmazonSteps {

    WebDriver driver = DriverHelper.getDriver();

    AmazonMain amazonMain = new AmazonMain(driver);

    @When("User is on amazon main page user searches for {string}")
    public void user_is_on_amazon_main_page_user_searches_for(String item) throws InterruptedException {
        Thread.sleep(1000);
        amazonMain.searchForItem(item);
    }
    @Then("User validates that title is {string}")
    public void user_validates_that_title_is(String title) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(title, BrowserUtils.getTitle(driver));
    }
}
