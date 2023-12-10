package com.tumblr.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class TumblrMain {

    public TumblrMain(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.='Sign me up']")
    WebElement signMeUpLink;

    @FindBy(xpath = "//button[.='Continue with email']")
    WebElement continueWithEmail;

    @FindBy(css = "input[type='email']")
    WebElement email;

    @FindBy(xpath = "//button[.='Next']")
    List<WebElement> nextBtn;

    @FindBy(css = "input[placeholder='Set a password']")
    WebElement password1;

    @FindBy(css = "input[placeholder='Repeat password']")
    WebElement password2;

    @FindBy(xpath = "//div[@class='a0A37 hAkP2']")
    WebElement errorMessage;

    public void clickOnSigMeUp(WebDriver driver){
        BrowserUtils.clickOnElement(driver, signMeUpLink);

    }

    public void clickOnContinueWithEmail(WebDriver driver){

        BrowserUtils.clickOnElement(driver, continueWithEmail);

    }

    public void enterEmailAndClickNextBtn(WebDriver driver, String email){

        this.email.sendKeys(email);
        for (int i = 0; i < 1; i++) {
            BrowserUtils.clickOnElement(driver, nextBtn.get(i));
        }

    }

    public void enterPasswords(WebDriver driver, String password1, String password2, String errorMessage){

        this.password1.sendKeys(password1);
        this.password2.sendKeys(password2);
        BrowserUtils.clickOnElement(driver, nextBtn.get(0));
        Assert.assertEquals(BrowserUtils.getText(driver, this.errorMessage), errorMessage);

    }


}
