package com.autoExercise.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ContactUsPage {

    public ContactUsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[.='Get In Touch']")
    WebElement getInTouch;

    @FindBy(css = "input[name='name']")
    WebElement name;

    @FindBy(css = "input[name='email']")
    WebElement email;

    @FindBy(css = "input[name='subject']")
    WebElement subject;

    @FindBy(css = "#message")
    WebElement message;

    @FindBy(css = "input[name='upload_file']")
    WebElement inputFile;

    @FindBy(css = "input[name='submit']")
    WebElement submit;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successMessage;

    @FindBy(xpath = "//a[@class='btn btn-success']")
    WebElement homeBtn;



    public String validateGetInTouch() {
        return BrowserUtils.getText(this.getInTouch);
    }

    public void nameEmail(String name, String email) {
        this.name.sendKeys(name);
        this.email.sendKeys(email);
    }

    public void subjectMessage(String subject, String message) {
        this.subject.sendKeys(subject);
        this.message.sendKeys(message);
    }

    public void uploadAFile(String path) {

        this.inputFile.sendKeys(path);

    }

    public void clickOkAndValidateAlertTxtAccept(WebDriver driver, String alertTxt) {
        this.submit.click();
        Assert.assertEquals(alertTxt, BrowserUtils.getTextAlert(driver));
        BrowserUtils.acceptAlert(driver);
    }

    public void validateMessageWasSent(String message){
        Assert.assertEquals(message, BrowserUtils.getText(this.successMessage));
        homeBtn.click();
    }




}
