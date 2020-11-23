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


}
