package com.etsy.step_definitions;

import com.etsy.pages.MainPageEtsy;
import com.etsy.pages.ProductList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.util.List;

public class StepDefinitions {

    WebDriver driver = DriverHelper.getDriver();

    MainPageEtsy mainPageEtsy = new MainPageEtsy(driver);

    ProductList productList = new ProductList(driver);


    @Given("as a user I want to navigate to etsy webpage")
    public void as_a_user_i_want_to_navigate_to_etsy_webpage() {
      // driver.get(ConfigReader.readProperty("etsyURL"));
    }

    @Then("as a user I want to search for iphone")
    public void as_a_user_i_want_to_search_for_iphone() {
       mainPageEtsy.searchForProduct("iphone");
    }

    @Then("as a user I want to verify that all products have iphone keyword")
    public void as_a_user_i_want_to_verify_that_all_products_have_iphone_keyword() {
        productList.validateIphone("iphone");
    }

    @Then("as a user I want to add all iphone in one list of array")
    public void as_a_user_i_want_to_add_all_iphone_in_one_list_of_array() {
        List<String> list = productList.addToList("iphone");
        System.out.println(list);

    }


}
