$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/api.feature");
formatter.feature({
  "name": "US_20_Validate All Customer Info",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@customerDBTest"
    }
  ]
});
formatter.scenario({
  "name": "TC_01_Read all customers you created and validate them from your data set",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@customerDBTest"
    },
    {
      "name": "@allCustomerValidate"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user sets all response using end point \"https://www.gmibank.com/api/tp-customers\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiStepDefinitions.user_sets_all_response_using_end_point(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deserialization data json to java pojo",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiStepDefinitions.user_deserialization_data_json_to_java_pojo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates data.",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiStepDefinitions.user_validates_data()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});