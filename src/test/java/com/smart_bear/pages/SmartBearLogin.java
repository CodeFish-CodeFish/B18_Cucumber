package com.smart_bear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLogin {

    public SmartBearLogin(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[type='text']")
    WebElement username;

    @FindBy(css = "input[type='password']")
    WebElement password;

    @FindBy(css = "input[type='submit']")
    WebElement loginBtn;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginBtn.click();
    }

}
