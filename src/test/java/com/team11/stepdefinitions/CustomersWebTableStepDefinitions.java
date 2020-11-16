package com.team11.stepdefinitions;

import com.team11.pages.EmployeManageCustomerPage;
import com.team11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.Struct;

public class CustomersWebTableStepDefinitions {
EmployeManageCustomerPage employeManageCustomerPage=new EmployeManageCustomerPage();

    @Given("user is on manage customer page")
    public void user_is_on_manage_customer_page() {
        Driver.login("Employee");
        employeManageCustomerPage.myOperations.click();
        employeManageCustomerPage.manageCustomers.click();
    }

    @Given("get the web table header")
    public void get_the_web_table_header() {
        Driver.getDriver();
        String webTableElements=employeManageCustomerPage.tableHeader.getText();


    }

    @Then("verify the table header contains {string}  {string}  {string}  {string}  {string}  {string}  {string}  {string}")
    public void verify_the_table_header_contains(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        String webTableElements=employeManageCustomerPage.tableHeader.getText();

    }

}
