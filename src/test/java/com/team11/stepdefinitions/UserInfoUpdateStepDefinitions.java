package com.team11.stepdefinitions;

import com.team11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoUpdateStepDefinitions {

    public UserInfoUpdateStepDefinitions(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "email")
    public WebElement userInfoUpdateEmailBox;
    @FindBy(id = "langKey")
    public WebElement userInfoUpdateLanguageBox;






}
