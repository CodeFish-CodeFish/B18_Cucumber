package com.open_cart.step_definitions;

import com.open_cart.pages.OpenCartLoginPage;
import com.open_cart.pages.OpenCartMainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

public class Authentication {

    WebDriver driver = DriverHelper.getDriver();

    OpenCartLoginPage loginPage = new OpenCartLoginPage(driver);

    OpenCartMainPage mainPage = new OpenCartMainPage(driver);

    @When("user is on login page user validates title is {string}")
    public void user_is_on_login_page_user_validates_title_is(String title) {
        Assert.assertEquals(title, BrowserUtils.getTitleWithJS(driver));
    }

    @Then("user provides username as {string} and password as {string}")
    public void user_provides_username_as_and_password_as(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLogin();
    }

    @When("user is mainpage user clicks on x button to close popup")
    public void user_is_mainpage_user_clicks_on_x_button_to_close_popup() {
        mainPage.clickOnXBtn();
    }
}
