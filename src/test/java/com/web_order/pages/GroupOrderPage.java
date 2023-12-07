package com.web_order.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;

public class GroupOrderPage {
    public GroupOrderPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#ConfirmAddressID")
    WebElement dropdownLocation;

    @FindBy(xpath = "//div[@id='addressPreview']")
    WebElement address;

    @FindBy(css = "#InviteNote")
    WebElement inviteNote;

    @FindBy(css = "#InviteList")
    WebElement inviteList;

    @FindBy(css = "#createGroupOrder")
    WebElement createGroupOrderBtn;

    @FindBy(xpath = "//h1")
    WebElement header;

    @FindBy(xpath = "//label[.='Total Participants:']//following-sibling::div")
    WebElement participant;

    public void setDropdownLocation(String location) throws InterruptedException {
        Thread.sleep(1000);
        Select select = new Select(dropdownLocation);
        String myHouse = select.getFirstSelectedOption().getText();
        Assert.assertEquals(location, myHouse);
    }

    public void dropdownForOffice(String location) throws InterruptedException {
        Thread.sleep(1000);
        BrowserUtils.selectBy(this.dropdownLocation, location, "visibleText");
    }

    public void validateAddress(String address) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(this.address.getText().contains(address));

    }

    public void validateOfficeAddress(String address) throws InterruptedException {
       Thread.sleep(1000);
        Assert.assertTrue(this.address.getText().contains(address));

    }

    public void notesForGuests(String notes) {
        this.inviteNote.sendKeys(notes);
    }

    public void sendEmails(String email1, String email2) {

        this.inviteList.sendKeys(email1 + " " + email2);

    }

    public void clickOnCreateGroupOrder() {

        createGroupOrderBtn.click();

    }

    public void validateHeaderParticipant(String header, Integer participant) {

        Assert.assertEquals(header, this.header.getText());
        Integer number = Integer.parseInt(BrowserUtils.getText(this.participant));
        Assert.assertEquals(participant, number);


    }


}
