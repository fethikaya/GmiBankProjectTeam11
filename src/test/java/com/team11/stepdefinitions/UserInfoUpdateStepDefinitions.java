package com.team11.stepdefinitions;

import com.team11.pages.UserInfoPage;
import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserInfoUpdateStepDefinitions {

    UserInfoPage userInfoPage=new UserInfoPage();

    @Given("user goes login with Employee")
    public void user_goes_login_with_Employee() {
    Driver.login("Employee");
    Driver.wait(3);
         }

    @Given("user click employee name")
    public void user_click_employee_name() {
        userInfoPage.userInfoaccountMenu.click();
    }

    @Given("user select user info")
    public void user_select_user_info() {
        Driver.selectDropdownByVisibleText(Driver.getDriver(),userInfoPage.userInfoaccountMenu,"User Info");

    }

    @Given("user send {string} into the email box")
    public void user_send_into_the_email_box(String invalidEmail) {
        Driver.waitAndSendText(userInfoPage.userInfoUpdateEmailBox, invalidEmail,5);
    }

    @Given("user click save button")
    public void user_click_save_button() {
        Driver.waitAndClick(userInfoPage.userInfoSaveButton,5);
    }

    @Then("user assert that user account can not update with invalid email address")
    public void user_assert_that_user_account_can_not_update_with_invalid_email_address() {
        Driver.verifyElementDisplayed(userInfoPage.userInfoUpdateFailed);
        Driver.closeDriver();
    }
}
