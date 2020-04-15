$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("multicart_user_login.feature");
formatter.feature({
  "line": 1,
  "name": "User Login Mechanism",
  "description": "In order to get all membership benefit from multicart ecommerce \nAs a User I want to perform a online login",
  "id": "user-login-mechanism",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5553017,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "Langing on MCT Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I land on multicart landing page",
  "keyword": "And "
});
formatter.match({
  "location": "CommonSteps.i_open_browser_chrome()"
});
formatter.result({
  "duration": 4903681875,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.i_land_on_multicart_landing_page()"
});
formatter.result({
  "duration": 2463111699,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Successfull login",
  "description": "",
  "id": "user-login-mechanism;successfull-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I complete login with James valid credentails",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I expect to seee profile Name as James Williams",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_complete_login_for_James_valid_credentails()"
});
formatter.result({
  "duration": 5417294704,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_expect_to_seee_profile_Name_as_James_Williams()"
});
formatter.result({
  "duration": 571973848,
  "status": "passed"
});
formatter.after({
  "duration": 338436572,
  "status": "passed"
});
});