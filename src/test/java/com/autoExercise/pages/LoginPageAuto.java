package com.autoExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAuto {


    public LoginPageAuto(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='name']")
    WebElement name;

    @FindBy(css = "input[data-qa='signup-email']")
    WebElement email;

    @FindBy(xpath = "//button[.='Signup']")
    WebElement signUpBtn;

    public void setSignUpBtn(String name, String email){

        this.name.sendKeys(name);
        this.email.sendKeys(email);
        signUpBtn.click();

    }


}
