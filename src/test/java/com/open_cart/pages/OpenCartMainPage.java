package com.open_cart.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class OpenCartMainPage {

    public OpenCartMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".btn-close")
    WebElement xBtn;

    @FindBy(xpath = "//tr//td[3]")
    List<WebElement> statusColumn;

    @FindBy(xpath = "//tr//td[4]")
    List<WebElement> datesColumn;

    @FindBy(xpath = "//a[@class='btn btn-info']")
    List<WebElement> allRecords;



    public void validateStatusColumn(WebDriver driver){

        BrowserUtils.scrollWithJS(driver, statusColumn.get(0));
        for (int i = 1; i < statusColumn.size(); i++) {
            Assert.assertTrue(statusColumn.get(i).isDisplayed());

        }

    }

    public void validateDatesColumn(){

        for (int i = 1; i <datesColumn.size() ; i++) {

            Assert.assertTrue(datesColumn.get(i).isDisplayed());

        }

    }

    public void clickOnRecord(WebDriver driver){
        BrowserUtils.scrollByAmount(driver, 1000, 1000);
        for (int i = 0; i < allRecords.size(); i++) {

            if (allRecords.get(i).getAttribute("href").contains("2412")){
                allRecords.get(i).click();
            }

        }

    }



    public void clickOnXBtn(){
        xBtn.click();
    }


}
