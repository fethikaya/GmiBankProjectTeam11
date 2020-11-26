$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/countriesapi.feature");
formatter.feature({
  "name": "Validate All Customer Info",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@countriesDBTest"
    }
  ]
});
formatter.scenario({
  "name": "TC_01_Read all customers you created and validate them from your data set",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@countriesDBTest"
    },
    {
      "name": "@allCountriesValidate"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user sets all response using end point \"https://www.gmibank.com/api/tp-countries\" \"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user deserialization data json to java pojo",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiStepDefinitions.user_deserialization_data_json_to_java_pojo()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user validates data.",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiStepDefinitions.user_validates_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});