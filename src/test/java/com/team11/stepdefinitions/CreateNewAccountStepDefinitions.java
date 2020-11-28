package com.team11.stepdefinitions;

import com.team11.pages.CreateANewAccountPage;
import com.team11.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import org.junit.Assert;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;

public class CreateNewAccountStepDefinitions {
    CreateANewAccountPage createANewAccountpage = new CreateANewAccountPage();

    Actions actions = new Actions(Driver.getDriver());

    @Given("user enters gmibank homepage")
    public void user_enters_gmibank_homepage() {
        Driver.login("Employee");
        Driver.wait(3);
    }

    @Then("user navigate createNewAccount Page")
    public void user_clicks_myOperations_link() {
        createANewAccountpage.myOperations.click();
        Driver.wait(3);
        Driver.hover(createANewAccountpage.manageAccounts);
        createANewAccountpage.manageAccounts.click();
        Driver.wait(5);
        createANewAccountpage.newAccount.click();
    }


    @Given("user click Description")
    public void one_user_click_Description() {
        Driver.wait(3);
        createANewAccountpage.description.click();
    }

    @And("user click Balance")
    public void twoUserClickBalance() {
        createANewAccountpage.balance.click();
    }

    @And("user sees required message")
    public void threeUserSeesRequiredMessage() {
        Assert.assertTrue(createANewAccountpage.thisFieldIsRequeiredMessage.isDisplayed());
    }


    @Given("user create as a dollar account {string} and verify")
    public void oneUserTheFirstTimeAccountCreationAsDollarAndVerifieData(String dolarAccount) {
        createANewAccountpage.balance.sendKeys(dolarAccount);
        Assert.assertTrue(createANewAccountpage.balance.isEnabled());

    }

    @Given("user select an acount as CHECKING and verify")
    public void userSelectAnAcountAsCHECKINGAndVerifieData() {

        Driver.wait(3);
        for (WebElement w : createANewAccountpage.accountTypeLink) {
            String accountType = w.getText();
            System.out.println(accountType);
            if (w.getText().contains("CHECKING")) {
                w.click();
                Assert.assertTrue(createANewAccountpage.accountTypeLink.contains(w));
                break;
            }
        }
    }

    @And("user select an acount as a SAVING and verify")
    public void userSelectAnAcountAsASAVINGAndVerifieData() {
        Driver.wait(3);
        for (WebElement w : createANewAccountpage.accountTypeLink) {
            String accountType = w.getText();
            System.out.println(accountType);
            if (w.getText().contains("SAVING")) {
                w.click();
                Assert.assertTrue(createANewAccountpage.accountTypeLink.contains(w));
                break;
            }
        }
    }

    @And("user select an acount as a CREDIT_CARD and verify")
    public void userSelectAnAcountAsACREDIT_CARDAndVerifieData() {

        Driver.wait(3);
        for (WebElement w : createANewAccountpage.accountTypeLink) {
            String accountType = w.getText();
            System.out.println(accountType);
            if (w.getText().contains("CREDIT_CARD")) {
                w.click();
                Assert.assertTrue(createANewAccountpage.accountTypeLink.contains(w));
                break;
            }
        }
    }

    @And("user select an acount as a INVESTING and verify")
    public void userSelectAnAcountAsAINVESTINGAndVerifieData() {

        Driver.wait(3);
        for (WebElement w : createANewAccountpage.accountTypeLink) {
            String accountType = w.getText();
            System.out.println(accountType);
            if (w.getText().contains("INVESTING")) {
                w.click();
                Driver.wait(3);
                Assert.assertTrue(createANewAccountpage.accountTypeLink.contains(w));
                break;
            }
        }
    }

    @Given("user click Account Status Type definied as a ACTIVE and verify")
    public void userClickAccountStatusTypeDefiniedAsAACTIVEAndVerifiesData() {
        createANewAccountpage.accountStatusTypeBox.click();
        Driver.wait(3);
        String myStatusType[] = {"ACTIVE", "SUESPENDED", "CLOSED",};
        int i = 0;
        for (WebElement w : createANewAccountpage.accountStatusTypeLink) {
            String statusType = w.getText();
            System.out.println(statusType);
            Assert.assertEquals(statusType, myStatusType[i]);
            i++;
        }

    }

    @And("user click Account Status Type definied as a  SUESPENDED and verify")
    public void userClickAccountStatusTypeDefiniedAsASUSPENDENDEDAndVerifiesData() {
        createANewAccountpage.accountStatusTypeBox.click();

        Driver.wait(3);
        for (WebElement w : createANewAccountpage.accountStatusTypeLink) {
            String accountType = w.getText();
            System.out.println(accountType);
            if (w.getText().contains("SUESPENDED")) {
                w.click();
                Driver.wait(3);
                Assert.assertTrue(createANewAccountpage.accountStatusTypeLink.contains(w));
                break;
            }
        }
    }

    @And("user click Account Status Type definied as a  CLOSED and verify")
    public void userClickAccountStatusTypeDefiniedAsACLOSEDAndVerifiesData() {

        Driver.wait(3);
        for (WebElement w : createANewAccountpage.accountStatusTypeLink) {
            String accountType = w.getText();
            System.out.println(accountType);
            if (w.getText().contains("CLOSED")) {
                w.click();
                Driver.wait(3);
                Assert.assertTrue(createANewAccountpage.accountStatusTypeLink.contains(w));
                break;
            }
        }
    }

    @Given("user select Employee and verify the selectet Employee")
    public void userSelectEmployeeAndVerifeiTheSelectetEmployee() {
        createANewAccountpage.employeeBox.click();
        //Select select =new Select(us13Page.employeeBox);
        System.out.println("Employee has a bug");

    }

}
