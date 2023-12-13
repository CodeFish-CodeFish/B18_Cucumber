package com.luma.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
    public CreateAccountPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='firstname' or @name='firstname']")
    WebElement firstname;

    @FindBy(xpath = "//input[@id='lastname' and @name='lastname']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='email_address' or @name='email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='password' and @name='password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='password-confirmation' and @name='password_confirmation']")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[.='Create an Account']")
    WebElement createAccountBtn;

    @FindBy(xpath = "//div[.='Thank you for registering with Main Website Store.']")
    WebElement successMsg;

    public void firstnameLastname(String firstname, String lastname){
       this.firstname.sendKeys(firstname);
       this.lastname.sendKeys(lastname);
    }

    public void enterEmail(String email){
        this.email.sendKeys(email);
    }

    public void providePasswords(String password, String confirmPassword){

        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(confirmPassword);

    }

    public void clickOnCreateAndValidateText(String successMessage){

        createAccountBtn.click();
        Assert.assertEquals(successMessage, this.successMsg.getText());

    }


}
