package com.autoExercise.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class SignUpAuto {

    public SignUpAuto(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#id_gender1")
    WebElement mrRadio;

    @FindBy(css = "#name")
    WebElement name;

    @FindBy(css = "#email")
    WebElement email;

    @FindBy(css = "#password")
    WebElement password;

    @FindBy(css = "#days")
    WebElement days;

    @FindBy(css = "#months")
    WebElement months;

    @FindBy(css = "#years")
    WebElement years;

    @FindBy(css = "#first_name")
    WebElement firstName;

    @FindBy(css = "#last_name")
    WebElement lastName;

    @FindBy(css = "#address1")
    WebElement address;

    @FindBy(css = "#country")
    WebElement country;

    @FindBy(css = "#state")
    WebElement state;

    @FindBy(css = "#city")
    WebElement city;

    @FindBy(css = "#zipcode")
    WebElement zipCode;

    @FindBy(css = "#mobile_number")
    WebElement phone;

    @FindBy(xpath = "//button[.='Create Account']")
    public WebElement createAccountBtn;

    @FindBy(xpath = "//b")
    WebElement accountCreatedMsg;

    public void checkMrRadio(String name) {

        mrRadio.click();
        this.name.clear();
        this.name.sendKeys(name);
    }

    public void validateEmailProvidePassword(String email, String password) {

        Assert.assertEquals(this.email.getAttribute("value"), email);
        this.password.sendKeys(password);

    }

    public void chooseBirthdate(String days, String months, String years) {
        BrowserUtils.selectBy(this.days, days, "visibleText");
        BrowserUtils.selectBy(this.months, months, "visibleText");
        BrowserUtils.selectBy(this.years, years, "visibleText");
    }

    public void firstNameLastName(String firstName, String lastName) {

        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
    }

    public void addresses(String address, String country) {

        this.address.sendKeys(address);
        BrowserUtils.selectBy(this.country, country, "visibleText");
    }

    public void stateAndCity(String state, String city) {

        this.state.sendKeys(state);
        this.city.sendKeys(city);

    }

    public void zipCodePhone(String zipCode, String phone) {

        this.zipCode.sendKeys(zipCode);
        this.phone.sendKeys(phone);

    }

    public void clickOnCreateAccountBtn() {
        createAccountBtn.click();
    }

    public String successMsg() {

        return BrowserUtils.getText(accountCreatedMsg);

    }


}
