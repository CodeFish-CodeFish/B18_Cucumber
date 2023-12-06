package com.smart_bear.steps;

import com.smart_bear.pages.SmartBearLogin;
import com.smart_bear.pages.SmartBearOrder;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriverHelper;

public class SmartBearStepDef {

    WebDriver driver = DriverHelper.getDriver();

    SmartBearLogin login = new SmartBearLogin(driver);

    SmartBearOrder order = new SmartBearOrder(driver);

    @When("user is on login page user provides {string} for username and {string} for password clicks on loginBtn")
    public void user_is_on_login_page_user_provides_for_username_and_for_password_clicks_on_login_btn(String userName, String password) {
        login.login(userName, password);
    }
    @Then("user chooses {string} from the dropdown and provide quantity as {string}")
    public void user_chooses_from_the_dropdown_and_provide_quantity_as(String screen, String quantity) {

        order.screenAndQuantity(screen, quantity);
    }
    @Then("user provides price as {int} and discount as {int}")
    public void user_provides_price_as_and_discount_as(Integer price, Integer discount) {
            order.priceAndDiscount(price, discount);
    }
    @Then("user provides total number as {string}")
    public void user_provides_total_number_as(String total) {
            order.setTotal(total);
    }
    @Then("user enters their name as {string} and street address as {string}")
    public void user_enters_their_name_as_and_street_address_as(String name, String address) {
        order.nameAndAddress(name, address);
    }
    @Then("user enters city as {string} and state as {string} and zip as {string}")
    public void user_enters_city_as_and_state_as_and_zip_as(String city, String state, String zipCode) {
        order.setCityStateZip(city,state, zipCode);
    }
    @Then("user clicks on visa and provides card number as {string} and expiration as {string}")
    public void user_clicks_on_visa_and_provides_card_number_as_and_expiration_as(String cc, String expiration) {
        order.ccAndExpiration(cc, expiration);
    }
    @Then("user finally clicks on process button")
    public void user_finally_clicks_on_process_button() {
        order.clickOnProcessBtn();
    }


}
