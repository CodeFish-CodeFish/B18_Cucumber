package com.amazon.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMain {

    public AmazonMain(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#twotabsearchtextbox")
    WebElement searchBar;

    public void searchForItem(String item){

        searchBar.sendKeys(item, Keys.ENTER);

    }


}
