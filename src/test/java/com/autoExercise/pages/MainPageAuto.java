package com.autoExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageAuto {

    public MainPageAuto(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[.=' Signup / Login']")
    WebElement signUpBtn;

    @FindBy(xpath = "//a[.=' Contact us']")
    WebElement contactUs;



    public void clickOnSignUpLink(){

        signUpBtn.click();

    }

    public void clickOnContactUs(){
        contactUs.click();
    }


}
