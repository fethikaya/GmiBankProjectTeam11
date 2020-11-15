package com.team11.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeManageCustomerPage_2 extends BasePage {


@FindBy(xpath = "//*[@id='entity-menu']/a/span")
WebElement myOperrations;


@FindBy(xpath = "//*[@id='entity-menu']/div/a[1]/span")
    WebElement manageCustomers;

@FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[1]/div/table/tbody/tr[4]/td[10]/div/a[2]/span/span")
WebElement editbutton;

public void myOperationsClick(){
    myOperrations.click();
}

    public void manageCustomersClick(){
        manageCustomers.click();
    }

    public void editButtonClick(){
    editbutton.click();
    }
}
