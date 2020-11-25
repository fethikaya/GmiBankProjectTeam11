$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EmployeeManageCustomer.feature");
formatter.feature({
  "name": "An Employee can manage Customer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US12"
    }
  ]
});
formatter.scenario({
  "name": "All customers should show up on manage customers module populating the account information of the customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US12"
    },
    {
      "name": "@US12TC01"
    }
  ]
});
formatter.step({
  "name": "Go to gmibank.com home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ManageCostumerStepDef.goToGmibankComHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click to User Account Menu and Click to Sign In",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ManageCostumerStepDef.clickToUserAccountMenuAndClickToSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username with valid credentail",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ManageCostumerStepDef.enterTheUsernameWithValidCredentail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the pasword with valid credentail",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ManageCostumerStepDef.enterThePaswordWithValidCredentail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click to Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ManageCostumerStepDef.clickToSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click to My Operations drop down menu and Click to Manage Costumers",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ManageCostumerStepDef.clickToMyOperationsDropDownMenuAndClickToManageCostumers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click to last page button",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ManageCostumerStepDef.clickToLastPageButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A customer should show up at total nine head on account information of the customer",
  "keyword": "Then "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ManageCostumerStepDef.aCustomerShouldShowUpAtTotalNineHeadOnAccountInformationOfTheCustomer()"
});
formatter.result({
  "status": "passed"
});
});