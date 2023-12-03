package com.lambda.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LambdaMain {

    public LambdaMain(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.='Table Sort & Search']")
    WebElement tableSort;

    public void clickOnTableSort(){
        tableSort.click();
    }

}
