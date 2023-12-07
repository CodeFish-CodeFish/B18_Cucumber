package com.open_cart.step_definitions;

import com.open_cart.pages.OpenCartMainPage;
import com.open_cart.pages.OpenCartRecordPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class OpenCartSteps {

    WebDriver driver = DriverHelper.getDriver();

    OpenCartMainPage mainPage = new OpenCartMainPage(driver);

    OpenCartRecordPage recordPage = new OpenCartRecordPage(driver);

    @Then("user scrolls down and validates all status column values are displayed")
    public void user_scrolls_down_and_validates_all_status_column_values_are_displayed() throws InterruptedException {
        Thread.sleep(1000);
        mainPage.validateStatusColumn(driver);
    }
    @Then("user validates dates column values are displayed")
    public void user_validates_dates_column_values_are_displayed() throws InterruptedException {
        Thread.sleep(1000);
            mainPage.validateDatesColumn();
    }


    @Then("user scrolls down and clicks on record from the table")
    public void user_scrolls_down_and_clicks_on_record_from_the_table() throws InterruptedException {
        Thread.sleep(1000);
        mainPage.clickOnRecord(driver);
    }
    @Then("user comments in the box as {string} and clicks add to history button")
    public void user_comments_in_the_box_as_and_clicks_add_to_history_button(String comment) throws InterruptedException {
        Thread.sleep(1000);
        recordPage.commentInTheBox(comment, driver);
    }

}
