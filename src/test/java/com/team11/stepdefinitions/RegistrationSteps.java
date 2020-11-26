package com.team11.stepdefinitions;

import com.team11.pages.GmiRegistirationPage;
import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class RegistrationSteps {
        GmiRegistirationPage registrationPage=new GmiRegistirationPage();
        @When("user go to on the registration page")
        public void user_on_the_registration_page() {
            Driver.getDriver().get(ConfigurationReader.getProperty("registration_url"));
        }

        @Given("user types the {string}")
        public void user_types_the(String SSN) {
            registrationPage.ssnTextbox.sendKeys(SSN+ Keys.ENTER);
            Assert.assertEquals("translation-not-found[Your SSN is required]",registrationPage.ssnMessage.getText());
        }
        @Given("user provides {string}")
        public void user_provides(String firstname) {
            registrationPage.firstname.sendKeys(firstname+Keys.ENTER);
            Assert.assertEquals("Your First Name is required",registrationPage.firstnameInvalidMsj.getText());

        }

        @Given("user provides the lastname as  {string}")
        public void user_provides_the_lastname_as(String lastname) {
            registrationPage.lastname.sendKeys(lastname+Keys.ENTER);
            Assert.assertEquals("Your Last Name is required",registrationPage.lastnameInvalidMsj.getText());
        }

        @Then("user provides the {string} information")
        public void user_provides_the_information(String address) {
//        registrationPage.address.sendKeys(address+Keys.ENTER);
//        Assert.assertEquals("your adress invalid",registrationPage.addressInvalidMsj.getText());
        }

        @Then("user provides the {string}")
        public void user_provides_the(String string) {

        }

        @When("user provides the username as {string}")
        public void user_provides_the_username_as(String string) {

        }

        @Then("user provides the email as {string}")
        public void user_provides_the_email_as(String string) {

        }

        @Then("user provides the new password as {string}")
        public void user_provides_the_new_password_as(String string) {

        }

        @When("user provides the confirm password {string}")
        public void user_provides_the_confirm_password(String string) {

        }

        @Then("user click to register button")
        public void user_click_to_register_button() {

        }

        @Then("User assert that should see cant registration default credentials")
        public void user_assert_that_should_see_cant_registration_default_credentials() {

        }


    }
