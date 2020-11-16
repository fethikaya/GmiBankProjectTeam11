$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_012EmployeeCanManageCustomer.feature");
formatter.feature({
  "name": "An Employee can manage Customer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tableHeaderCustomers"
    }
  ]
});
formatter.background({
  "name": "User goes to employee page clicks to my operations and clicks to manage Customers",
  "description": "",
  "keyword": "Background"
});
formatter.scenario({
  "name": "TC01 All customers should show up on manage customers module populating the account information of the customer \"First Name  Last Name  Middle Initial  Email  Mobile Phone Number  Phone Number  Address  Create Date \"",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tableHeaderCustomers"
    }
  ]
});
formatter.step({
  "name": "user is on manage customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.team11.stepdefinitions.CustomersWebTableStepDefinitions.user_is_on_manage_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get the web table header",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.CustomersWebTableStepDefinitions.get_the_web_table_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the table header contains \"First Name\"  \"Last Name\"  \"Middle Initial\"  \"Email\"  \"Mobile Phone Number\"  \"Phone Number\"  \"Address\"  \"Create Date\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.team11.stepdefinitions.CustomersWebTableStepDefinitions.verify_the_table_header_contains(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});