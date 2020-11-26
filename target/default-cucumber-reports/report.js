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
  "name": "TC_01_In countries read all customers you created and validate them from your data set",
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
  "status": "passed"
});
formatter.step({
  "name": "In countries user sets all response using end point",
  "keyword": "Given "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiCountriesStepDefination.In_countries_user_sets_all_response_using_end_point()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In countries user deserialization data json to java pojo",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiCountriesStepDefination.In_countries_user_deserialization_data_json_to_java_pojo()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat com.team11.stepdefinitions.ApiCountriesStepDefination.In_countries_user_deserialization_data_json_to_java_pojo(ApiCountriesStepDefination.java:44)\n\tat ✽.In countries user deserialization data json to java pojo(file:///Users/zekeriyaiyimaya/IdeaProjects/GmiBankProjectTeam11/src/test/resources/features/countriesapi.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "In countries user validates data.",
  "keyword": "And "
});
formatter.match({
  "location": "com.team11.stepdefinitions.ApiCountriesStepDefination.In_countries_user_validates_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});