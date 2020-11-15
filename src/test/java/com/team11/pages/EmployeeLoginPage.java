package com.team11.pages;

import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class EmployeeLoginPage extends BasePage{


    @FindBy(css ="#account-menu")
    WebElement firstButton;


    @FindBy(xpath = "//*[@id='login-item']")
    WebElement signInButton;

    @FindBy(xpath = "//*[@id='username']")
    WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    WebElement password;

    @FindBy(xpath = "//*[@id='login-page']/div/form/div[3]/button[2]/span")
    WebElement signIn_2;


    public static void firstButtonClick(WebElement firstButton){
        firstButton.click();
    }

    public static void signInButtonClick(WebElement signInButton){
        signInButton.click();
    }
    public void LoginMethod() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        wait.until(ExpectedConditions.invisibilityOfAllElements());
            firstButton.click();
            signInButton.click();
            wait.until(ExpectedConditions.invisibilityOf(username));
        username.sendKeys(ConfigurationReader.getProperty("employeeUserName"));
        password.sendKeys(ConfigurationReader.getProperty("employeePassword") + Keys.ENTER);
       // signIn_2.click();

    }

}
