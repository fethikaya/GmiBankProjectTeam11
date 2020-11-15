package com.team11.pages;

import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.SQLOutput;

public class UserInfoEditPage extends BasePage{

    @FindBy(xpath = "//*[@id='tp-customer-address']")
    WebElement addressRow;

    @FindBy(xpath = "//*[@id='tp-customer-city']")
    WebElement cityRow;

    @FindBy(xpath = "//*[@id=tp-customer-country']")
    WebElement selectCountry;

    @FindBy(xpath = "//*[@id=tp-customer-country']")
    WebElement stateRow;

    @FindBy(xpath = "//*[@id='save-entity']")
    WebElement saveButton;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    WebElement invalidFeedback;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    WebElement invalidFeedback_2;

    public void addressClear(){
        addressRow.clear();
    }
    public void cityClear(){
        cityRow.clear();
    }


    public void setAddressRow(String address){

        addressRow.sendKeys(address + Keys.ENTER);


        String expectedResult = "This field is required.";
        String actualResult =invalidFeedback.getText();

           Assert.assertEquals("mesah gorulmedi", expectedResult, actualResult);
           System.out.println("Address row does not leave empty");

       }
       public void setCityRow(String string){

            cityRow.sendKeys(string+ Keys.ENTER);

           String expectedResult = "This field is required.";
           String actualResult =invalidFeedback_2.getText();

           Assert.assertEquals("mesah gorulmedi", expectedResult, actualResult);
           System.out.println("City row does not leave empty");



       }
    }







