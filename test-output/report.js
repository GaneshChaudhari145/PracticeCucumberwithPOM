$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("..\\bCucumberPOM\\src\\main\\java\\com\\features\\OrangeHRM.feature");
formatter.feature({
  "line": 1,
  "name": "Orange Hrm Application Test",
  "description": "",
  "id": "orange-hrm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Orange Hrm Home Page Test",
  "description": "",
  "id": "orange-hrm-application-test;validate-orange-hrm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opnes browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user logs into app",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validate the home Page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "admin add New User",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opnes_browser()"
});
formatter.result({
  "duration": 8951537756,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_Page()"
});
formatter.result({
  "duration": 48587133,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_logs_into_app()"
});
formatter.result({
  "duration": 1977216434,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.Validate_the_home_Page_title()"
});
formatter.result({
  "duration": 13920006,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_username()"
});
formatter.result({
  "duration": 59578693,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.admin_add_New_User()"
});
formatter.result({
  "duration": 3039179128,
  "status": "passed"
});
});