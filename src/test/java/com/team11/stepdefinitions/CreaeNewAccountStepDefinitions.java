package com.team11.stepdefinitions;

import com.team11.pages.CreateANewAccount;
import com.team11.utilities.ConfigurationReader;
import com.team11.utilities.Driver;
import io.cucumber.java.en.Given;
public class CreaeNewAccountStepDefinitions {





    CreateANewAccount createANewAccount=new CreateANewAccount();
        @Given(value = "User goes login with Employee")
        public void user_goes_login_with_Employee() {
            Driver.login("Employee");

        }


        @Given("User click  My Operations button")
        public void user_click_My_Operations_button() {
            Driver.waitAndClick(createANewAccount.myOperations,5);

        }
        @Given("User select Manage Accounts button")
        public void user_select_Manage_Accounts_button() {

        }
        @Given("User click Create a new Account button")
        public void user_click_Create_a_new_Account_button() {

        }
        @Given("User  send invesment in Description box")
        public void user_send_invesment_in_Description_box() {
            Driver.waitAndSendText(createANewAccount.description, ConfigurationReader.getProperty("DescriptionValue"),5);

        }
        @Given("User  dont send anything to Description box")
        public void user_dont_send_anything_to_Description_box() {

        }

        @Given("User click save button")
        public void user_click_save_button() {

        }





    }
