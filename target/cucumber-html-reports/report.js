$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/test.feature");
formatter.feature({
  "name": "Automation test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Launch browser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UIT"
    }
  ]
});
formatter.step({
  "name": "Open \"\u003cbrowser\u003e\" with predefined options",
  "keyword": "Given "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser"
      ]
    },
    {
      "cells": [
        "chrome"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Launch browser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UIT"
    }
  ]
});
formatter.step({
  "name": "Open \"chrome\" with predefined options",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.stepDefinitions.openWithPredefinedOptions(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigate to automation practice and search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UIT"
    }
  ]
});
formatter.step({
  "name": "navigate to automation practice",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.stepDefinitions.navigateToAutomationPractice()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for eminem",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.stepDefinitions.searchForEminem()"
});
formatter.result({
  "status": "passed"
});
});