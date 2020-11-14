package com.team11.pages;

import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import java.sql.SQLOutput;

public class US_004Page {

    public US_004Page() {
        PageFactory.initElements(Driver.getDriver(),this);
      }
    @FindBy(css ="#account-menu")
    public WebElement accountMenu;

    @FindBy(id="login-item")
    public WebElement SignIn;

    @FindBy(xpath = "//input[contains(@id,'username')]")
    public WebElement username;

    @FindBy(xpath = "//input[contains(@id,'password')]")
    public WebElement password;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath ="//span[contains(text(),'Operations')]")
    public WebElement myOperations;
    @FindBy(xpath =" //*[text()='Cancel']")
    public WebElement cancelButton;
//
//


    public void login (String role) {
      if (role.equals("Employee")) {
          username.sendKeys(ConfigurationReader.getProperty("EmployeeUsername"));
          password.sendKeys(ConfigurationReader.getProperty("EmployeePassword"));
          Driver.waitForVisibility(cancelButton,5);
          Assert.assertTrue("Cancel button is  not avilable before submit button,test failed!",cancelButton.isDisplayed());
          System.out.println("Cancel button is Displayed");
          submit.click();
          Driver.wait(2);
          Driver.closeDriver();
      } else if (role.equals("Admin")) {
          username.sendKeys(ConfigurationReader.getProperty("AdminUsername"));
          password.sendKeys(ConfigurationReader.getProperty("AdminPassword"));
          Driver.waitForVisibility(cancelButton,5);
          Assert.assertTrue("Cancel button is  not avilable before submit button,test failed!",cancelButton.isDisplayed());
          System.out.println("Cancel button is Displayed");
          submit.click();
          Driver.wait(2);
          Driver.closeDriver();
      } else if (role.equals("Customer")) {
          username.sendKeys(ConfigurationReader.getProperty("CustomerUsername"));
          password.sendKeys(ConfigurationReader.getProperty("CustomerPassword"));
          Driver.waitForVisibility(cancelButton,5);
          Assert.assertTrue("Cancel button is  not avilable before submit button,test failed!",cancelButton.isDisplayed());
          System.out.println("Cancel button is Displayed");
          submit.click();
          Driver.wait(2);
          Driver.closeDriver();
      }else if (role.equals("User")) {
          username.sendKeys(ConfigurationReader.getProperty("UserUsername"));
          password.sendKeys(ConfigurationReader.getProperty("UserPassword"));
          Driver.waitForVisibility(cancelButton,5);
          Assert.assertTrue("Cancel button is  not avilable before submit button,test failed!",cancelButton.isDisplayed());
          System.out.println("Cancel button is Displayed");
          submit.click();
          Driver.wait(2);
          Driver.closeDriver();

    }else if (role.equals("Manager")) {
          username.sendKeys(ConfigurationReader.getProperty("ManagerUsername"));
          password.sendKeys(ConfigurationReader.getProperty("ManagerPassword"));
          Driver.waitForVisibility(cancelButton,5);
          Assert.assertTrue("Cancel button is  not avilable before submit button,test failed!",cancelButton.isDisplayed());
          System.out.println("Cancel button is Displayed");
          submit.click();
          Driver.wait(2);
          Driver.closeDriver();
      }

}
}

