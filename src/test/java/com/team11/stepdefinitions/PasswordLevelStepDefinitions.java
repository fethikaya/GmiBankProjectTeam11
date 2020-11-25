package com.team11.stepdefinitions;

import com.team11.pages.EditPasswordPage;
import com.team11.pages.GmiSignInPage;
import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PasswordLevelStepDefinitions {
    GmiSignInPage gmiSignInPage = new GmiSignInPage();
    EditPasswordPage editPasswordPage = new EditPasswordPage();

    //Background

    @Given("Go to given URL")
    public void go_to_given_URL() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("User login")
    public void user_login() {
       editPasswordPage.login("Beck");
    }

    @When("Click Account Menu")
    public void click_Account_Menu() {
        Driver.waitAndClick(gmiSignInPage.accountMenu,3);
    }

    @When("Select Password button")
    public void select_Password_button() {
      Driver.waitAndClick(editPasswordPage.passwordButton,2);
    }

    @When("See Password Edit Form")
    public void see_Password_Edit_Form() {
        Assert.assertTrue("FAILED!!Password Edit Form is not displayed!!",
                editPasswordPage.passwordEditForm.isDisplayed());

    }

    //TC_001

    @And("Enter the {string}")
    public void enterThe(String currentPassword) {
        System.out.println("currentPassword = " + currentPassword);
        editPasswordPage.enterCurrentPassword(currentPassword);
    }

    @And("Enter a {string}")
    public void enterA(String newPassword) {
        System.out.println("newPassword = " + newPassword);
        editPasswordPage.enterANewPassword(newPassword);

    }

    @And("Verify fifth level bar is displayed")
    public void verifyFifthLevelBarIsDisplayed() {
        Assert.assertTrue("FAILED!!! 5th level bar is not displayed!!",
                editPasswordPage.fifthLevelBar.isDisplayed());
        Driver.wait(2);
        editPasswordPage.signOut();
      Driver.closeDriver();
    }




    //tc_002
    @And("Enter the  {string} as new password")
    public void enterTheAsNewPassword(String oldPassword) {
        Driver.waitAndSendText(editPasswordPage.newPasswordBox,oldPassword,2);

    }

    @And("Enter the {string} in Confirmation box")
    public void enterTheInConfirmationBox(String samePassword) {
        Driver.waitAndSendText(editPasswordPage.newPasswordConfirmationBox,samePassword,2);
    }

    @And("Click the save button")
    public void clickTheSaveButton() {
        Driver.waitAndClick(editPasswordPage.saveButton,3);
    }

    @Then("Verify {string} message is displayed")
    public void verifyMessageIsDisplayed(String Expected) {
        String actual=editPasswordPage.passwordChangedMessage.getText();
        System.out.println("actual = " + actual);
        Assert.assertEquals("Same password can not be used. FAILED!!",Expected,actual);

        editPasswordPage.signOut();
    Driver.closeDriver();

    }



    //TC_003



    @And("Enter a {string} with at least ONE upper case char")
    public void enterAWithAtLeastONEUpperCaseChar(String newPassword) {
        Driver.waitAndSendText(editPasswordPage.newPasswordBox,newPassword,2);
        System.out.println("newPassword with upper case char= " + newPassword);
    }


    @And("Verify second level bar is displayed")
    public void verifySecondLevelBarIsDisplayed() {
        Assert.assertTrue("FAILED!!! 2nd level bar is not displayed!!",
                editPasswordPage.secondLevelBar.isDisplayed());
        Driver.wait(2);

      Driver.closeDriver();

    }


    //TC_004

    @And("Enter a {string} with at least ONE lower case char")
    public void enterAWithAtLeastONELowerCaseChar(String newPassword) {

        Driver.waitAndSendText(editPasswordPage.newPasswordBox,newPassword,2);
        System.out.println("newPassword with lower case char= " + newPassword);


    }


    //TC_005
    @And("Enter a {string} with at least ONE digit")
    public void enterAWithAtLeastONEDigit(String newPassword) {
        Driver.waitAndSendText(editPasswordPage.newPasswordBox,newPassword,2);
        System.out.println("newPassword with at least 1 digit= " + newPassword);

    }

    //TC_006
    @And("Enter a {string} with at least seven character long")
    public void enterAWithAtLeastSevenCharacterLong(String newPassword) {
        Driver.waitAndSendText(editPasswordPage.newPasswordBox,newPassword,2);
        System.out.println("newPassword with at least 7 char long= " + newPassword);
    }
}
