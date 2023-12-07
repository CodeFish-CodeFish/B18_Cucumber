package com.web_order.steps;

import com.web_order.pages.GroupOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class WebOrderSteps {

    WebDriver driver = DriverHelper.getDriver();

    GroupOrderPage groupOrderPage = new GroupOrderPage(driver);


    @When("user is on group order page user verifies that {string} is selected")
    public void user_is_on_group_order_page_user_verifies_that_is_selected(String location) throws InterruptedException {

        if (location.contains("My House")){
            groupOrderPage.setDropdownLocation(location);
        }else {
            groupOrderPage.dropdownForOffice(location);
        }

    }

    @Then("user validates address as {string}")
    public void user_validates_address_as(String address) throws InterruptedException {
        if (address.contains("3137 3137 Laguna Street")){
            groupOrderPage.validateAddress(address);
        }else {
            groupOrderPage.validateOfficeAddress(address);
        }

    }

    @Then("user enters notes for guests as {string}")
    public void user_enters_notes_for_guests_as(String notes) {
        groupOrderPage.notesForGuests(notes);
    }

    @Then("user enters emails for friends as {string} and {string}")
    public void user_enters_emails_for_friends_as_and(String email1, String email2) {
        groupOrderPage.sendEmails(email1, email2);
    }

    @Then("user finally clicks on create group order button")
    public void user_finally_clicks_on_create_group_order_button() {
        groupOrderPage.clickOnCreateGroupOrder();
    }

    @Then("user validates header is this {string} and participant number {int}")
    public void user_validates_header_is_this_and_participant_number(String header, Integer participant) throws InterruptedException {
        Thread.sleep(2000);
        groupOrderPage.validateHeaderParticipant(header, participant);
    }

}
