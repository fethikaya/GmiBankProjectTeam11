package com.team11.stepdefinitions;

import com.team11.pages.CreateANewAccountPage;
import com.team11.pages.EditPasswordPage;
import com.team11.pages.GmiSignInPage;
import com.team11.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class ChoosingDateStepDefinitions {

    CreateANewAccountPage createANewAccountPage = new CreateANewAccountPage();
    GmiSignInPage gmiSignInPage = new GmiSignInPage();
    EditPasswordPage editPasswordPage =new EditPasswordPage();


    @Given("Click on My Operations dropdown menu")
    public void click_on_My_Operations_dropdown_menu() {
       Driver.waitAndClick(createANewAccountPage.myOperations,3);
    }


    @And("Click on Manage Accounts")
    public void clickOnManageAccounts() {
        Driver.waitAndClick(createANewAccountPage.manageAccounts,3);
    }

    @And("Click on +Create a new Account")
    public void clickOnCreateANewAccount() {
        Driver.waitAndClick(createANewAccountPage.newAccount,3);
    }


    @And("Click on the Create Date input box and enter the {string}")
    public void clickOnTheCreateDateInputBoxAndEnterThe(String creatingDate) {
        Driver.waitAndSendText(createANewAccountPage.createDate,creatingDate,3);
    }


    @And("Click on the Closed Date input box and enter the  {string} as later than the time of {string}")
    public void clickOnTheClosedDateInputBoxAndEnterTheAsLaterThanTheTimeOf(String closingDate, String creatingDate) {

        createANewAccountPage.enterDate(closingDate,creatingDate);


        }



    }
