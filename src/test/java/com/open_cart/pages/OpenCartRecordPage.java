package com.open_cart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OpenCartRecordPage {

    public OpenCartRecordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "textarea[id='input-history']")
    WebElement textarea;

    @FindBy(css = "button[id='button-history']")
    WebElement submitBtn;

    public void commentInTheBox(String comment, WebDriver driver){
        BrowserUtils.scrollByAmount(driver, 1500, 1500);
        this.textarea.sendKeys(comment);
        submitBtn.click();

    }

}
