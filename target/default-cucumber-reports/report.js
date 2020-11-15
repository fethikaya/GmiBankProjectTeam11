$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_0013.feature");
formatter.feature({
  "name": "User Create A New Account",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@createNewAccount"
    }
  ]
});
formatter.background({
  "name": "User Goes Create New Account Page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User goes login with Employee",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click  My Operations button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User select Manage Accounts button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click Create a new Account button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "TC_03_User should provide a balance for the first time account creation as Dollar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@createNewAccount"
    },
    {
      "name": "@InBalance"
    }
  ]
});
formatter.step({
  "name": "User  dont send anything to Balance box",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click save button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});