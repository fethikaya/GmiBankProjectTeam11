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



}
