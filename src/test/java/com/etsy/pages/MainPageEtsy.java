package com.etsy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageEtsy {


    public MainPageEtsy(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#global-enhancements-search-query")
    WebElement searchbar;

    public void searchForProduct(String product){

        searchbar.sendKeys(product, Keys.ENTER);

    }

}
