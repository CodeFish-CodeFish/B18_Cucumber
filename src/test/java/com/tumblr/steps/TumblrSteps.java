package com.tumblr.steps;

import com.tumblr.pages.TumblrMain;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class TumblrSteps {

    WebDriver driver = DriverHelper.getDriver();

    TumblrMain main = new TumblrMain(driver);

    @Given("user is main page and clicks on sing me up link")
    public void user_is_main_page_and_clicks_on_sing_me_up_link() {
        main.clickOnSigMeUp(driver);
    }
    @Then("user clicks on continue with email link")
    public void user_clicks_on_continue_with_email_link() {
        main.clickOnContinueWithEmail(driver);
    }
    @Then("user enters {string} and clicks on next button")
    public void user_enters_and_clicks_on_next_button(String email) {
       main.enterEmailAndClickNextBtn(driver, email);
    }
    @Then("user enters two passwords as {string} and {string} and validate {string}")
    public void user_enters_two_passwords_as_and_and_validate(String password1, String password2, String errorMessage) {
       main.enterPasswords(driver, password1, password2, errorMessage);
    }
}
