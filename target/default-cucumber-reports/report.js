$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/stateApi.feature");
formatter.feature({
  "name": "US_0022 States",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@StatesDBTest"
    }
  ]
});
formatter.scenario({
  "name": "States read all state you created and validate them from your data set",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@StatesDBTest"
    },
    {
      "name": "@allStatesValidate"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "In States user sets all response using end point \"https://www.gmibank.com/api/tp-states\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.team11.stepdefinitions.stateApiDefinations.In_States_user_sets_all_response_using_end_point(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In States user deserialization data json to java pojo",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.stateApiDefinations.In_States_user_deserialization_data_json_to_java_pojo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In States user validates data.",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.stateApiDefinations.In_States_user_validates_data()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});