package com.web_order.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrderLoginPage {

    public WebOrderLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#Email")
    WebElement email;

    @FindBy(css = "#Password")
    WebElement password;

    @FindBy(xpath = "//button[.='Sign In']")
    WebElement signInBtn;

    @FindBy(css = ".custom-control-label")
    WebElement radioBtn;

    @FindBy(css = "#getAddressNextButton")
    WebElement nextBtn;



    public void setSignInBtn(String email, String password){

        this.email.clear();
        this.email.sendKeys(email);
        this.password.clear();
        this.password.sendKeys(password);
        signInBtn.click();
    }

    public void checkRadioAndClickOnNext(){

        radioBtn.click();
        nextBtn.click();

    }


}
