$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("H:/Edureka/Selenium/WorkSpace/CucumberPOM/src/main/java/com/qa/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Appliction test",
  "description": "",
  "id": "free-crm-appliction-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM Home Page Test",
  "description": "",
  "id": "free-crm-appliction-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user logs into app",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate home page titile",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_the_browser()"
});
formatter.result({
  "duration": 46804127362,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 427028155,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_pasword()"
});
formatter.result({
  "duration": 32404038499,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_home_page_titile()"
});
formatter.result({
  "duration": 10280345,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_username()"
});
formatter.result({
  "duration": 272055381,
  "status": "passed"
});
});