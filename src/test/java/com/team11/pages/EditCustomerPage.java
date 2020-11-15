package com.team11.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerPage extends BasePage {


    @FindBy(xpath = "//*[@id='tp-customer-address']")
    WebElement customerAddress;


    @FindBy(xpath = "//*[@id='tp-customer-city']")
    WebElement customerCity;


    @FindBy(xpath = "//*[@id='tp-customer-country']")
    WebElement customerCountry;


    @FindBy(xpath = "//*[@id='save-entity']")
    WebElement saveButton;


    public void setCustomerAddress(String address){
        customerAddress.sendKeys(address);

    }



















}
