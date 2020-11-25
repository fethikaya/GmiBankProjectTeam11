package com.team11.pages;

import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EditPasswordPage {


    public EditPasswordPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//span[.='Password']")
    public WebElement passwordButton;

    @FindBy(id = "password-form")
    public WebElement passwordEditForm;


    @FindBy(xpath = "//input[@id='currentPassword']")
    public WebElement currentPasswordBox;
    @FindBy(xpath = "//input[@id='newPassword']")
    public WebElement newPasswordBox;
    @FindBy(xpath = "//input[@id='confirmPassword']")
    public WebElement newPasswordConfirmationBox;
    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;
    @FindBy(xpath = "//strong[contains(text(),'Password changed!')]")
    public WebElement passwordChangedMessage;

    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);'][5]")
    public WebElement fifthLevelBar;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);'][2]")
    public WebElement secondLevelBar;

    @FindBy(xpath = "//*[.='Sign out']")
    public WebElement signOutButton;



    public void login(String role){
        GmiSignInPage gmiSignInPage =new GmiSignInPage();

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        if (role.equalsIgnoreCase("beck")){

            Driver.waitAndClick(gmiSignInPage.accountMenu, 3);
            Driver.waitAndClick(gmiSignInPage.SignIn, 3);

        gmiSignInPage.username.sendKeys(ConfigurationReader.getProperty("BeckUserName"));
        gmiSignInPage.password.sendKeys(ConfigurationReader.getProperty("BeckPassword"));
        gmiSignInPage.submit.click();
                Driver.wait(2);
                // Driver.closeDriver();

            }
        }

        public void signOut(){
            GmiSignInPage gmiSignInPage =new GmiSignInPage();
            Driver.waitAndClick(gmiSignInPage.accountMenu, 3);
            Driver.waitAndClick(signOutButton, 3);

        }


    public void enterCurrentPassword(String currentPassword) {
        currentPasswordBox.sendKeys(currentPassword);
    }

    public void enterANewPassword(String newPassword) {

        newPasswordBox.sendKeys(newPassword);

    }


}
