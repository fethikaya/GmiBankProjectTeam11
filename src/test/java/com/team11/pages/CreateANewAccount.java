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


}
