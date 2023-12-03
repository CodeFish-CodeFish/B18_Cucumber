package com.lambda.step_definitions;

import com.lambda.pages.LambdaMain;
import com.lambda.pages.SortPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class LambdaSteps {

    WebDriver driver = DriverHelper.getDriver();

    LambdaMain lambdaMain = new LambdaMain(driver);

    SortPage sortPage = new SortPage(driver);

    @Given("User is on main page of lambda")
    public void user_is_on_main_page_of_lambda() {
        Assert.assertEquals("https://www.lambdatest.com/selenium-playground/", driver.getCurrentUrl());
    }

    @Then("User clicks on table sorting link")
    public void user_clicks_on_table_sorting_link() {
        lambdaMain.clickOnTableSort();
    }

    @Then("User validates that there are ages thirty and up")
    public void user_validates_that_there_are_ages_thirty_and_up() throws InterruptedException {
        sortPage.validateAge();
    }

    @Then("User closes the window")
    public void user_closes_the_window() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


}
