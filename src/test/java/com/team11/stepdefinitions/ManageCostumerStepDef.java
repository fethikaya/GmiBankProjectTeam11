package com.team11.stepdefinitions;

import com.team11.pages.ManageCustomerPage;
import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class ManageCostumerStepDef {
    ManageCustomerPage manageCostumerPage= new ManageCustomerPage();


    @Given("Go to gmibank.com home page")
    public void goToGmibankComHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("Click to User Account Menu and Click to Sign In")
    public void clickToUserAccountMenuAndClickToSignIn() {
        manageCostumerPage.dropDownAccount.click();
        manageCostumerPage.accountSignIn.click();
    }
    @And("Enter the username with valid credentail")
    public void enterTheUsernameWithValidCredentail() {
        manageCostumerPage.username.sendKeys(ConfigurationReader.getProperty("EmployeeUsername"));
    }

    @And("Enter the pasword with valid credentail")
    public void enterThePaswordWithValidCredentail() {
        manageCostumerPage.password.sendKeys(ConfigurationReader.getProperty("EmployeePassword"));
    }

    @And("Click to Sign in button")
    public void clickToSignInButton() {
        manageCostumerPage.buttonSignin.click();
    }

    @And("Click to My Operations drop down menu and Click to Manage Costumers")
    public void clickToMyOperationsDropDownMenuAndClickToManageCostumers() {
        manageCostumerPage.myOperations.click();
        manageCostumerPage.manageCostumer.click();
    }
    @And("click to last page button")
    public void clickToLastPageButton() {
        manageCostumerPage.lastPageButton.click();
    }
    @Then("A customer should show up at total nine head on account information of the customer")
    public void aCustomerShouldShowUpAtTotalNineHeadOnAccountInformationOfTheCustomer() {
        Assert.assertTrue(manageCostumerPage.headList.get(0).getText().contains("ID"));
        Assert.assertTrue(manageCostumerPage.headList.get(1).getText().contains("First Name"));
        Assert.assertTrue(manageCostumerPage.headList.get(2).getText().contains("Last Name"));
        Assert.assertTrue(manageCostumerPage.headList.get(3).getText().contains("Middle Initial"));
        Assert.assertTrue(manageCostumerPage.headList.get(4).getText().contains("Email"));
        Assert.assertTrue(manageCostumerPage.headList.get(5).getText().contains("Mobile Phone Number"));
        Assert.assertTrue(manageCostumerPage.headList.get(6).getText().contains("Phone Number"));
        Assert.assertTrue(manageCostumerPage.headList.get(7).getText().contains("Address"));
        Assert.assertTrue(manageCostumerPage.headList.get(8).getText().contains("Create Date"));
        Assert.assertTrue(manageCostumerPage.rowList.size()==10);
    }

    @And("Click to View button.")
    public void clickToViewButton() {
        //Driver.waitForVisibility(manageCostumerPage.buttonWiew, 3);
        Driver.getDriver().navigate().refresh();
        manageCostumerPage.buttonWiew.click();
    }

    @Then("There should be Edit button.")
    public void thereShouldBeEditButton() {
        Assert.assertTrue(manageCostumerPage.ButtonViewEdit.isDisplayed());
    }


    @And("go back to manage costumers page")
    public void goBackToManageCostumersPage() {
        manageCostumerPage.ButtonViewBack.click();
    }

    @Then("There should be Edit button where all customer")
    public void thereShouldBeEditButtonWhereAllCustomer() {
        manageCostumerPage.lastPageButton.click();
        Assert.assertTrue(manageCostumerPage.buttonEdit.isDisplayed());
    }

    @And("Click to Edit button")
    public void clickToEditButton() {
        Driver.doubleClick(manageCostumerPage.buttonEdit);
    }

    @And("City textbox is updated")
    public void cityTextboxIsUpdated() {
        manageCostumerPage.cityUpdate.clear();
        manageCostumerPage.cityUpdate.sendKeys(ConfigurationReader.getProperty("cityName"));
    }

    @And("Click to Save button in the Edit Page")
    public void clickToSaveButtonInTheEditPage() {
        manageCostumerPage.ButtonEditSave.click();
    }

    @Then("The Edit portal can allow user to update the user info")
    public void theEditPortalCanAllowUserToUpdateTheUserInfo() {
        Driver.waitForVisibility(manageCostumerPage.alertUpdate, 2);
        Assert.assertTrue(manageCostumerPage.alertUpdate.isDisplayed());
    }

    @And("Confirming that a customer is registered with ID number")
    public void confirmingThatACustomerIsRegisteredWithIDNumber() {
        Assert.assertTrue(manageCostumerPage.userDelete.isDisplayed());
    }

    @And("Click to Delete button")
    public void clickToDeleteButton() {
        Driver.getDriver().navigate().refresh();
        manageCostumerPage.buttonDelete.click();
    }

    @And("seeing a message if the user is sure about deletion")
    public void seeingAMessageIfTheUserIsSureAboutDeletion() {
        Driver.waitForVisibility(manageCostumerPage.alertDeleteQuestion, 2);
        Assert.assertTrue(manageCostumerPage.alertDeleteQuestion.isDisplayed());
    }

    @Then("User can delete a customer")
    public void userCanDeleteACustomer() {
        manageCostumerPage.alertDeleteButton.click();
        Driver.waitForVisibility(manageCostumerPage.popupDeleted,2);
        Assert.assertTrue(manageCostumerPage.popupDeleted.isDisplayed());
    }



}