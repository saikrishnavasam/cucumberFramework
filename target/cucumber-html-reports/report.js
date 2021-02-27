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
      "name": "@Precondition"
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
      "name": "@Precondition"
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
});