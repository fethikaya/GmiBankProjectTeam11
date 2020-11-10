package com.team11.pages;

import com.team11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmiPage {

    public GmiPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "li.nav-item")
    public WebElement pageHead;

    @FindBy(xpath = "//li[@id='account-menu']")
    public  WebElement accountMenu;


    @FindBy(id = "login-item")
    public WebElement signInButton;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement registerButton;

    @FindBy(id = "username")
    public WebElement userNameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;





}
