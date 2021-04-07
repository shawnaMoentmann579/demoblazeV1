$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"https://www.demoblaze.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Log in",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.clicks_on_Log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters username and password",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"STORE\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on log out",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_clicks_on_log_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"STORE\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login Data Driven",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user launches browser",
  "keyword": "Given "
});
formatter.step({
  "name": "user opens URL \"https://www.demoblaze.com/\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on Log in",
  "keyword": "And "
});
formatter.step({
  "name": "enters invalid username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on login",
  "keyword": "And "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Tbone",
        "c"
      ]
    },
    {
      "cells": [
        "Melissa",
        "test123"
      ]
    },
    {
      "cells": [
        "",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Data Driven",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"https://www.demoblaze.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Log in",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.clicks_on_Log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters invalid username as \"Tbone\" and password as \"c\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enters_invalid_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Data Driven",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"https://www.demoblaze.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Log in",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.clicks_on_Log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters invalid username as \"Melissa\" and password as \"test123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enters_invalid_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Data Driven",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"https://www.demoblaze.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Log in",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.clicks_on_Log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters invalid username as \"\" and password as \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enters_invalid_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});