package com.qa_fox.step_definitions;

import com.qa_fox.pages.QaFoxLoginPage;
import com.qa_fox.pages.QaFoxMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

public class QaFoxSteps {

    WebDriver driver = DriverHelper.getDriver();

    QaFoxMainPage mainPage = new QaFoxMainPage(driver);

    QaFoxLoginPage loginPage = new QaFoxLoginPage(driver);

    @Given("user is on main page of qa fox user clicks on myAccount and clicks on login")
    public void user_is_on_main_page_of_qa_fox_user_clicks_on_my_account_and_clicks_on_login() {
        mainPage.clickOnAccountAndLogin(driver);
    }
    @Then("user is on login page and validates title {string}")
    public void user_is_on_login_page_and_validates_title(String title) {
        Assert.assertEquals(title, BrowserUtils.getTitle(driver));
    }
    @Then("user enters {string} and then {string} and clicks on login button and validate {string}")
    public void user_enters_and_then_and_clicks_on_login_button_and_validate(String email, String password, String errorMessage) {
        loginPage.setLogin(email, password, errorMessage, driver);
    }
}
