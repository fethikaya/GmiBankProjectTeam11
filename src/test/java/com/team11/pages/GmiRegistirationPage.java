package com.team11.pages;

import com.team11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmiRegistirationPage {
    public GmiRegistirationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "ssn")
    public WebElement ssnTextbox;

    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public WebElement ssnMessage;

    @FindBy(xpath="//input[@name='firstname']")
    public WebElement firstname;

    @FindBy(xpath = "//div[contains(text(),'Your First Name is required')]")
    public  WebElement firstnameInvalidMsj;

    @FindBy(xpath = "//input[@name='lastname']")
    public  WebElement lastname;

    @FindBy(xpath = "//div[@class=\'text-danger form-group\']/div")
    public WebElement lastnameInvalidMsj;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(xpath="")
    public WebElement addressInvalidMsj;

    @FindBy(id="mobilephone")
    public WebElement mobilephone;

    @FindBy(xpath="")
    public WebElement mobilePhoneInvalidMsj;

    @FindBy(id="username")
    public WebElement username;

    @FindBy(className = "invalid-feedback")
    public WebElement userNameInvalidMsj;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(xpath = "//div[contains(text(),'Your email is required.')]")
    public WebElement emailInvalidMsj;

    @FindBy(id="firstPassword")
    public WebElement newPassword;

    @FindBy(xpath="//div[contains(text(),' password')]")
    public WebElement newPasswordInvalidMsj;

    @FindBy(id="secondPassword")
    public WebElement passwordConfirmation;

    @FindBy(xpath = "//div[contains(text(),'confirmation do not match!')]")
    public WebElement passwordNotMatchMsj;

    @FindBy(id="register-submit")
    public WebElement registerationButton;







}
