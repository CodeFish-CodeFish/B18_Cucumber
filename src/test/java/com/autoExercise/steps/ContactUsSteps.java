package com.autoExercise.steps;

import com.autoExercise.pages.ContactUsPage;
import com.autoExercise.pages.MainPageAuto;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.util.Map;

public class ContactUsSteps {

    WebDriver driver = DriverHelper.getDriver();

    MainPageAuto mainPageAuto = new MainPageAuto(driver);

    ContactUsPage contactUsPage = new ContactUsPage(driver);


    @Given("user is on main page and user validates home page as")
    public void user_is_on_main_page_and_user_validates_home_page_as(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> title =dataTable.asMap();
        Assert.assertEquals(title.get("title"), driver.getTitle());
    }
    @Given("user clicks on contact us button")
    public void user_clicks_on_contact_us_button() {
        mainPageAuto.clickOnContactUs();
    }
    @Then("user verifies on contact us page the header")
    public void user_verifies_on_contact_us_page_the_header(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> header =dataTable.asMap();
        Assert.assertEquals(header.get("header"), contactUsPage.validateGetInTouch());
    }
    @Then("user enters name and email as follows")
    public void user_enters_name_and_email_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> nameEmail =dataTable.asMap();

        contactUsPage.nameEmail(nameEmail.get("name"), nameEmail.get("email"));
    }
    @Then("user enters subject line followed by message body")
    public void user_enters_subject_line_followed_by_message_body(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> subjectMessage =dataTable.asMap();
        contactUsPage.subjectMessage(subjectMessage.get("subject"), subjectMessage.get("message"));
    }
    @Then("user uploads a file as an evidence")
    public void user_uploads_a_file_as_an_evidence() {
        contactUsPage.uploadAFile("/Users/codefish/Desktop/SparkReport.html");
    }
    @Then("user clicks on submit button and validates the text on alert as follows and accepts it")
    public void user_clicks_on_submit_button_and_validates_the_text_on_alert_as_follows_and_accepts_it(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> validateTxt =dataTable.asMap();
        contactUsPage.clickOkAndValidateAlertTxtAccept(driver, validateTxt.get("textOnAlert"));
    }
    @Then("user validates that message was sent successfully as follows")
    public void user_validates_that_message_was_sent_successfully_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> sentMessage =dataTable.asMap();
        contactUsPage.validateMessageWasSent(sentMessage.get("successMessage"));
    }
    @Then("user clicks on home button and verifies that user is landed on home page by title")
    public void user_clicks_on_home_button_and_verifies_that_user_is_landed_on_home_page_by_title(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> homeTitle =dataTable.asMap();
        Assert.assertEquals(homeTitle.get("title"), driver.getTitle());
    }
}
