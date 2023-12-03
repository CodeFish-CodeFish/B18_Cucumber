package com.autoExercise.steps;

import com.autoExercise.pages.LoginPageAuto;
import com.autoExercise.pages.MainPageAuto;
import com.autoExercise.pages.SignUpAuto;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

public class AutoStepDefs {

    WebDriver driver = DriverHelper.getDriver();

    MainPageAuto mainPageAuto = new MainPageAuto(driver);

    LoginPageAuto loginPageAuto = new LoginPageAuto(driver);

    SignUpAuto signUpAuto = new SignUpAuto(driver);

    @Given("user is on main page and provides username and email and clicks signUp")
    public void user_is_on_main_page_and_provides_username_and_email_and_clicks_sign_up() {
        mainPageAuto.clickOnSignUpLink();
        loginPageAuto.setSignUpBtn("TEST", "ii@ii.io");
    }
    @When("user is sign up page user verifies that user is on sign up page")
    public void user_is_sign_up_page_user_verifies_that_user_is_on_sign_up_page() {
        Assert.assertEquals("https://www.automationexercise.com/signup", driver.getCurrentUrl());
    }
    @Then("user checks mr radio and provides full name")
    public void user_checks_mr_radio_and_provides_full_name() {
        signUpAuto.checkMrRadio("Kuba Abdy");
    }
    @Then("user verifies entered email and provides password")
    public void user_verifies_entered_email_and_provides_password() {
        signUpAuto.validateEmailProvidePassword("ii@ii.io", "12345");
    }
    @Then("user provides their birthdate")
    public void user_provides_their_birthdate() {
        signUpAuto.chooseBirthdate("21","September","1989");
    }
    @Then("user enters first name and last name")
    public void user_enters_first_name_and_last_name() {
        signUpAuto.firstNameLastName("Kubanych", "Abdy");
    }
    @Then("user enters address and chooses their country")
    public void user_enters_address_and_chooses_their_country() {
        signUpAuto.addresses("123 N West ave","United States");
    }
    @Then("user provides state and city")
    public void user_provides_state_and_city() {
        signUpAuto.stateAndCity("Illinois", "Springfield");
    }
    @Then("user enters zipCode and phone number")
    public void user_enters_zip_code_and_phone_number() {
        signUpAuto.zipCodePhone("60656", "31232323232");
    }
    @Then("user clicks on create button")
    public void user_clicks_on_create_button() {
        BrowserUtils.scrollWithPoint(driver, signUpAuto.createAccountBtn);
        signUpAuto.clickOnCreateAccountBtn();
    }
    @Then("finally user verifies account created message")
    public void finally_user_verifies_account_created_message() {
        Assert.assertEquals("ACCOUNT CREATED!", signUpAuto.successMsg());
    }

}
