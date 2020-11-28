package com.team11.pages;



import com.team11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateANewAccountPage {

    public CreateANewAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(
            xpath = "//span[contains(text(),'My Operations')]"
    )
    public WebElement myOperations;
    @FindBy(
            xpath = "//span[contains(text(),'Manage Accounts')]"
    )
    public WebElement manageAccounts;
    @FindBy(
            xpath = "//span[contains(text(),'Create a new Account')]"
    )
    public WebElement newAccount;
    @FindBy(
            xpath = "//input[@name='description']"
    )
    public WebElement description;
    @FindBy(
            xpath = "//select[@class='form-control is-touched is-dirty av-valid form-control']/option "
    )
    public WebElement accountType;
    @FindBy(
            xpath = "//select[@id='tp-account-accountStatusType']/option "
    )
    public WebElement accountStatusType;


    @FindBy(xpath="//input[@id='tp-account-createDate']")
    public WebElement createDate;
    @FindBy(xpath="//input[@id='tp-account-closedDate']")
    public WebElement closedDate;
    @FindBy(xpath="//select[@id='tp-account-employee']")
    public WebElement employee;


    public void enterDate(String closing, String opening) {

        CreateANewAccountPage createANewAccountPage = new CreateANewAccountPage();
        int firstDate = Integer.parseInt(opening.substring(0, 4));
        int secondDate = Integer.parseInt(closing.substring(0, 4));

        if (firstDate > secondDate) {
            Driver.waitAndSendText(createANewAccountPage.closedDate, closing, 2);
        }else {
            System.out.println("Closing date can not be earlier than creating date!!!");
        }

    }
    @FindBy(xpath = "(//div[.='This field is required.'])[2]")
    public WebElement thisFieldIsRequeiredMessage;

    @FindBy(xpath = "//input[@name='balance']")
    public WebElement balance;

    @FindBy(xpath = "//select[@name='accountType']")
    public WebElement accountTypeSelect;

    @FindBy(xpath = "//*[@id='tp-account-accountType']/option")
    public List<WebElement> accountTypeLink;

    @FindBy(xpath = "//*[@id='tp-account-accountStatusType']")
    public WebElement accountStatusTypeBox;

    @FindBy(xpath = "//*[@id='tp-account-accountStatusType']/option")
    public List<WebElement> accountStatusTypeLink;

    @FindBy(xpath = "//select[@name='employee.id']")
    public WebElement employeeBox;
}
