package com.team11.pages;


        import com.team11.utilities.Driver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class CreateANewAccount {
    public CreateANewAccount() {
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

        CreateANewAccount createANewAccount = new CreateANewAccount();
        int firstDate = Integer.parseInt(opening.substring(0, 4));
        int secondDate = Integer.parseInt(closing.substring(0, 4));

        if (firstDate > secondDate) {
            Driver.waitAndSendText(createANewAccount.closedDate, closing, 2);
        }else {
            System.out.println("Closing date can not be earlier than creating date!!!");
        }

    }
}
