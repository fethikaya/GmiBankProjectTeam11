package com.team11.stepdefinitions;

import com.team11.pages.GmiRegistirationPage;
import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class RegistratiionSteps {
    GmiRegistirationPage registirationPage = new GmiRegistirationPage();
    @Given("user on the registration page")
    public void user_on_the_registration_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("registration_url"));
    }

    @Given("user types the {string} and the {string}")
    public void user_types_the_and_the(String ssn, String message1) {
        registirationPage.ssnTextbox.sendKeys(ssn+ Keys.ENTER);
        System.out.println("actual message: "+registirationPage.ssnMessage.getText());
        System.out.println("expected message: "+message1);
        Assert.assertEquals(registirationPage.ssnMessage.getText(),message1);

    }

    @Given("user provides {string} and {string}")
    public void user_provides_and(String string, String string2) {

    }

    @Given("user provides the lastname as  {string} and  {string}")
    public void user_provides_the_lastname_as_and(String string, String string2) {

    }

    @Then("user provides the {string} information {string}")
    public void user_provides_the_information(String string, String string2) {

    }

    @Then("user provides the {string} and {string}")
    public void user_provides_the_and(String string, String string2) {

    }

    @When("user provides the username as {string} and {string}")
    public void user_provides_the_username_as_and(String string, String string2) {

    }

    @Then("user provides the email as {string} and the  {string}")
    public void user_provides_the_email_as_and_the(String string, String string2) {

    }

    @Then("user provides the new password as {string} and {string}")
    public void user_provides_the_new_password_as_and(String string, String string2) {

    }

    @When("user provides the confirm password\"\" and the {string}")
    public void user_provides_the_confirm_password_and_the(String string) {

    }

    @Then("user gets the {string} message")
    public void user_gets_the_message(String failure) {

    }

}
