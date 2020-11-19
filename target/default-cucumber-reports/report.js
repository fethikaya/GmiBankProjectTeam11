$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/api.feature");
formatter.feature({
  "name": "API Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dbtest"
    }
  ]
});
formatter.background({
  "name": "connect to API Address",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user go to Gmibank Api adress and assert it.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiStepDefinitions.user_go_to_Gmibank_Api_adress_and_assert_it()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_01_Read all customers you created and validate them from your data set",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dbtest"
    },
    {
      "name": "@daverifyall"
    }
  ]
});
formatter.step({
  "name": "user gets all data and read",
  "keyword": "Given "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiStepDefinitions.user_gets_all_data_and_read()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies user data and previously created data.",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiStepDefinitions.user_verifies_user_data_and_previously_created_data()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "connect to API Address",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user go to Gmibank Api adress and assert it.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiStepDefinitions.user_go_to_Gmibank_Api_adress_and_assert_it()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_02_Read all customers you created and validate them 1 by 1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dbtest"
    },
    {
      "name": "@dbverify1by1"
    }
  ]
});
formatter.step({
  "name": "user gets all data and read",
  "keyword": "Given "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiStepDefinitions.user_gets_all_data_and_read()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies user data and previously created data one by one",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiStepDefinitions.user_verifies_user_data_and_previously_created_data_one_by_one()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});