package com.team11.pages;

import com.team11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeManageCustomerPage {
    public EmployeManageCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "entity-menu")
    public WebElement myOperations;

    @FindBy(xpath = "//a[@class='dropdown-item active']")
    public WebElement manageCustomers;

    @FindBy(xpath = "//thead")
    public WebElement tableHeader;

}
