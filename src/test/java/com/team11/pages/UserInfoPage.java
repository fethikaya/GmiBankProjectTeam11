package com.team11.pages;

import com.team11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoPage {
    public UserInfoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "email")
    public WebElement userInfoUpdateEmailBox;
    @FindBy(id = "langKey")
    public WebElement userInfoUpdateLanguageBox;
    @FindBy(id = "account-menu")
    public WebElement userInfoaccountMenu;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement userInfoSaveButton;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement userInfoUpdateFailed;

}
