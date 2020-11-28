package com.team11.stepdefinitions;

import com.team11.pages.HomePage;
import com.team11.pages.LandingPage;
import com.team11.utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_Step_Definitions {
    LandingPage landingPage = new LandingPage();
    HomePage homePage = new HomePage();

    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String fullName) {

        homePage.verifyFullName(fullName);

    }


    @When("User login")
    public void userLogin() {
       MyMethods.login();

    }

    @And("User fill out {string} boxes with valid {string} credentials")
    public void userFillOutBoxesWithValidCredentials(String input, String validInfo) {
        MyMethods.fillBoxes(input, validInfo);
    }

//    @And("Check available language options")
//    public void checkAvailableLanguageOptions() {
//
//    }

    @And("Click to {string} dropdown")
    public void clickToDropdown(String dropdown) {
        MyMethods.selectDropDown(dropdown);
    }
}
