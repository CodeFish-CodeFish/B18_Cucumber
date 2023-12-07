package com.web_order.steps;

import com.web_order.pages.WebOrderLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverHelper;

import java.util.List;

public class AuthenticationWebOrder{

    WebDriver driver = DriverHelper.getDriver();

    WebOrderLoginPage loginPage = new WebOrderLoginPage(driver);

    @Given("user enters email as {string} and password as {string} and clicks on signIn")
    public void user_enters_email_as_and_password_as_and_clicks_on_sign_in(String email, String password) {
        loginPage.setSignInBtn(email, password);
    }
    @Then("user validates title of login page as {string}")
    public void user_validates_title_of_login_page_as(String title) {
        Assert.assertEquals(title, driver.getTitle());
    }
    @When("user clicks on group order radio button and clicks on next button")
    public void user_clicks_on_group_order_radio_button_and_clicks_on_next_button() {
        loginPage.checkRadioAndClickOnNext();
    }
}
