package com.team11.stepdefinitions;

import com.team11.pages.CreateANewAccount;
import com.team11.pages.EditPasswordPage;
import com.team11.pages.GmiSignInPage;
import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class ChoosingDateStepDefinitions {

    CreateANewAccount createANewAccount = new CreateANewAccount();
    GmiSignInPage gmiSignInPage = new GmiSignInPage();
    EditPasswordPage editPasswordPage =new EditPasswordPage();


    @Given("Click on My Operations dropdown menu")
    public void click_on_My_Operations_dropdown_menu() {
       Driver.waitAndClick(createANewAccount.myOperations,3);
    }


    @And("Click on Manage Accounts")
    public void clickOnManageAccounts() {
        Driver.waitAndClick(createANewAccount.manageAccounts,3);
    }

    @And("Click on +Create a new Account")
    public void clickOnCreateANewAccount() {
        Driver.waitAndClick(createANewAccount.newAccount,3);
    }


    @And("Click on the Create Date input box and enter the {string}")
    public void clickOnTheCreateDateInputBoxAndEnterThe(String creatingDate) {
        Driver.waitAndSendText(createANewAccount.createDate,creatingDate,3);
    }


    @And("Click on the Closed Date input box and enter the  {string} as later than the time of {string}")
    public void clickOnTheClosedDateInputBoxAndEnterTheAsLaterThanTheTimeOf(String closingDate, String creatingDate) {

        createANewAccount.enterDate(closingDate,creatingDate);


        }



    }
