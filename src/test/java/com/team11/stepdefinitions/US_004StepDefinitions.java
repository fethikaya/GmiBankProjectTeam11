package com.team11.stepdefinitions;

import com.team11.pages.US_004Page;
import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import io.cucumber.java.en.*;





public class US_004StepDefinitions {


    US_004Page US_004Page = new US_004Page();


    @Given("I am on home page")
    public void iAmOnHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.waitAndClick(US_004Page.accountMenu,3);
        Driver.waitAndClick(US_004Page.SignIn,3);

    }



    @And("user logs in as {string}")
    public void userLogsInAs(String role) {
        US_004Page.login(role);

    }



}

