package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaMain {

    public LumaMain(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='header content']//preceding-sibling::div//child::a[.='Create an Account']")
    WebElement createAccountLink;

    public void clickOnCreateAccount(){
        this.createAccountLink.click();
    }
}
