package com.team11.stepdefinitions;

import com.team11.pages.UserInfoPage;
import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;

public class UserInfoUpdateStepDefinitions {

    UserInfoPage userInfoPage=new UserInfoPage();

    @Given("user goes login with Employee")
    public void user_goes_login_with_Employee() {
    Driver.login("Employee");
    Driver.wait(1);
         }

    @Given("user click employee name")
    public void user_click_employee_name() {
        Driver.waitAndClick(userInfoPage.userInfoaccountMenu,2);
    }

    @Given("user select user info")
    public void user_select_user_info() {
       Driver.waitAndClick(userInfoPage.userInfoSelect,2);
    }

    @Given("user send {string} into the email box")
    public void user_send_into_the_email_box(String invalidEmail) {
        userInfoPage.userInfoUpdateEmailBox.clear();
        Driver.wait(2);
        Driver.waitAndSendText(userInfoPage.userInfoUpdateEmailBox, invalidEmail,3);
    }

    @Given("user click save button")
    public void user_click_save_button() {
        Driver.waitAndClick(userInfoPage.userInfoSaveButton,3);
        Driver.wait(3);
    }

    @Then("user assert that user account can not update with invalid email address")
    public void user_assert_that_user_account_can_not_update_with_invalid_email_address() {
        Driver.verifyElementDisplayed(userInfoPage.userInfoUpdateFailed);
    }

    List<WebElement> languageOptions;
    @Given("user give an option language dropdown")
    public void user_give_an_option_language_dropdown() {
        Select select =new Select(userInfoPage.languageDropdown);
        languageOptions=select.getOptions();
        System.out.println(languageOptions.get(0).getText());
        System.out.println(languageOptions.get(1).getText());

    }

    @Then("user assert that there is no option other than English and Turkish")
    public void user_assert_that_there_is_no_option_other_than_English_and_Turkish() {
        for (WebElement w:languageOptions) {
            boolean lang=w.getText().equals("Türkçe")||w.getText().equals("English") ;
            Assert.assertTrue("user can only select English or Turkish",lang);
        }
    }

}
