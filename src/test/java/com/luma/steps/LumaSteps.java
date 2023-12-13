package com.luma.steps;

import com.luma.pages.CreateAccountPage;
import com.luma.pages.LumaMain;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.util.Date;
import java.util.Map;

public class LumaSteps {

    WebDriver driver = DriverHelper.getDriver();

    LumaMain lumaMain = new LumaMain(driver);

    CreateAccountPage accountPage = new CreateAccountPage(driver);

    @Given("user is on main page and clicks on create account link")
    public void user_is_on_main_page_and_clicks_on_create_account_link() {
        lumaMain.clickOnCreateAccount();
    }
    @Then("user enters firstname and lastname as follows")
    public void user_enters_firstname_and_lastname_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> firstLast = dataTable.asMap();
        accountPage.firstnameLastname(firstLast.get("firstname"), firstLast.get("lastname"));
    }
    @Then("user enters their email as follows")
    public void user_enters_their_email_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> email = dataTable.asMap();
        accountPage.enterEmail(email.get("email"));
    }
    @Then("user provides strong passwords and confirms passwords")
    public void user_provides_strong_passwords_and_confirms_passwords(io.cucumber.datatable.DataTable dataTable) {
       Map<String, String> passwords = dataTable.asMap();
       accountPage.providePasswords(passwords.get("password1"), passwords.get("password2"));
    }
    @Then("user clicks on create account button and validates successMessage")
    public void user_clicks_on_create_account_button_and_validates_success_message(io.cucumber.datatable.DataTable dataTable) {
      Map<String, String> map = dataTable.asMap();
      accountPage.clickOnCreateAndValidateText(map.get("successMessage"));
    }
}
