package com.lambda.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortPage {

    public SortPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tr/td[1]")
    List<WebElement> allNames;

    @FindBy(xpath = "//tr/td[2]")
    List<WebElement> allPositions;


    @FindBy(xpath = "//tr/td[4]")
    List<WebElement> ages;

    @FindBy(css = "#example_next")
    WebElement nextBtn;


    public void validateAge() throws InterruptedException {

        Map<String, String> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < ages.size(); i++) {

            if (Integer.parseInt(BrowserUtils.getText(ages.get(i))) > 10){
                String nameAndPosition = allNames.get(i).getText() + "-"+allPositions.get(i).getText();
                map.put(nameAndPosition, ages.get(i).getText());
                Thread.sleep(1000);
            }


            count++;
            if (count == 10){
                nextBtn.click();
                count = 0;
                i = -1;
            }


        }
        System.out.println(map.size());
    }



}
