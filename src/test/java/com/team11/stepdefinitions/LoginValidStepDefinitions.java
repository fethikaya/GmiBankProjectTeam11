package com.team11.stepdefinitions;

import com.team11.pages.GmiSignInPage;
import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;




public class LoginValidStepDefinitions {


    GmiSignInPage gmiSignInPage = new GmiSignInPage();


    @Given("I am on home page")
    public void iAmOnHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.waitAndClick(gmiSignInPage.accountMenu, 3);
        Driver.waitAndClick(gmiSignInPage.SignIn, 3);

    }


    @And("user logs in as {string}")
    public void userLogsInAs(String role) {
        gmiSignInPage.login(role);

    }
}