package com.qa_fox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class QaFoxMainPage {

    public QaFoxMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.='My Account']")
    WebElement myAccountLink;

    @FindBy(xpath = "//a[.='Login']")
    WebElement loginLink;

    public void clickOnAccountAndLogin(WebDriver driver){

        BrowserUtils.clickOnElement(driver, myAccountLink);
        BrowserUtils.clickOnElement(driver, loginLink);

    }

}
