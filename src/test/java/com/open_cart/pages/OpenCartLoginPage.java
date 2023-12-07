package com.open_cart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCartLoginPage {

    public OpenCartLoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "#input-username")
    WebElement username;

    @FindBy(css = "#input-password")
    WebElement password;

    @FindBy(css = "button[type='submit']")
    WebElement loginBtn;

    public void login(String username, String password){

        this.username.sendKeys(username);
        this.password.sendKeys(password);

    }

    public void clickOnLogin(){
        loginBtn.click();
    }

}
