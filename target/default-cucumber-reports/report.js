$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/passwordLevel.feature");
formatter.feature({
  "name": "",
  "description": "  US_Story08\n  Password segment on Homepage should be editable",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@passwordLevel"
    }
  ]
});
formatter.scenarioOutline({
  "name": "The old password should not be used",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_001"
    }
  ]
});
formatter.step({
  "name": "Enter the \"\u003cCurrent Password\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter a \"\u003cNew Password\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify \"fifth level bar\" is displayed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Current Password",
        "New Password"
      ]
    },
    {
      "cells": [
        "Beck11",
        "NewPs1*"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Go to given URL",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User login",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click Account Menu",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select Password button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "See Password Edit Form",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "The old password should not be used",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@passwordLevel"
    },
    {
      "name": "@TC_001"
    }
  ]
});
formatter.step({
  "name": "Enter the \"Beck11\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter a \"NewPs1*\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify \"fifth level bar\" is displayed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});