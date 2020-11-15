package com.team11.stepdefinitions;

import com.team11.pages.EmployeeLoginPage;
import com.team11.pages.EmployeeManageCustomerPage_2;
import com.team11.pages.UserInfoEditPage;
import com.team11.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.hssf.record.UseSelFSRecord;

public class UserInfoEditPageStepDefinition {
    EmployeeManageCustomerPage_2 employeeManageCustomerPage_2 = new EmployeeManageCustomerPage_2();
    UserInfoEditPage userInfoEditPage = new UserInfoEditPage();
    EmployeeLoginPage loginPage =new EmployeeLoginPage();

    @Given("Employee login in the account")
    public void employee_login_in_the_account() {
       loginPage.LoginMethod();
    }

    @When("Employee click my operations")
    public void employee_click_my_operations() {

        employeeManageCustomerPage_2.myOperationsClick();


    }

    @Then("Employee click the any of customer Edit Button")
    public void employee_click_the_any_of_customer_Edit_Button() {
        employeeManageCustomerPage_2.manageCustomersClick();
        employeeManageCustomerPage_2.editButtonClick();


    }

    @Then("Employee leave empty address row")
    public void employee_leave_empty_address_row() {

        userInfoEditPage.addressClear();
        userInfoEditPage.setAddressRow(ConfigurationReader.getProperty("addressRow"));

    }

    @Then("System show this filed is required message")
    public void system_show_this_filed_is_required_message() {
        userInfoEditPage.setAddressRow(ConfigurationReader.getProperty("addressRow"));

    }

    @Then("Employee filled out the address row")
    public void employee_filled_out_the_address_row() {

        userInfoEditPage.setAddressRow(ConfigurationReader.getProperty("filledAddress"));



    }

    @Then("Employee leave empty City row")
    public void employee_leave_empty_City_row() {
        userInfoEditPage.cityClear();
        userInfoEditPage.setCityRow(ConfigurationReader.getProperty("city"));

    }

}
