package com.qa_fox.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.io.File;

public class QaFoxLoginPage {
    public QaFoxLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#input-email")
    WebElement email;

    @FindBy(css = "#input-password")
    WebElement password;

    @FindBy(css = "input[type='submit']")
    WebElement submit;

    @FindBy(xpath = "//div[.='Warning: No match for E-Mail Address and/or Password.']")
    WebElement errorMessage;


    public void setLogin(String email, String password, String errorMessage, WebDriver driver){

        this.email.sendKeys(email);
        this.password.sendKeys(password);
        BrowserUtils.clickOnElement(driver, this.submit);
        Assert.assertEquals(errorMessage, BrowserUtils.getText(driver, this.errorMessage));

    }


}
