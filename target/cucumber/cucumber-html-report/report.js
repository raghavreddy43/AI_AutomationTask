$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginLogOutAndHomePage.feature");
formatter.feature({
  "name": "As a user I should be able to Login, Log Out and Land on Home Page Successfully",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "1. Verify that the user able to Login, Log out and Land on Home Page successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Automated"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Login"
    },
    {
      "name": "@LogOut"
    },
    {
      "name": "@HomePage"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user navigate to Gateley login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on next button",
  "keyword": "When "
});
formatter.step({
  "name": "I enter \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on login in button",
  "keyword": "When "
});
formatter.step({
  "name": "I click on yes button",
  "keyword": "When "
});
formatter.step({
  "name": "the company logo is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on company navigation button",
  "keyword": "When "
});
formatter.step({
  "name": "I enter \"GDUB\" in search text box",
  "keyword": "And "
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "I clicks on right top user credentials icon",
  "keyword": "When "
});
formatter.step({
  "name": "click on Sign out button",
  "keyword": "Then "
});
formatter.step({
  "name": "able to redirect page to login page after sign out successful",
  "keyword": "And "
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
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
        "raghavender.mutpuri@intelligent-ds.co.uk",
        "Raghav27@"
      ]
    }
  ]
});
formatter.scenario({
  "name": "1. Verify that the user able to Login, Log out and Land on Home Page successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Automated"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Login"
    },
    {
      "name": "@LogOut"
    },
    {
      "name": "@HomePage"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user navigate to Gateley login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.user_navigate_to_field_fisher_login_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: Chrome version must be between 70 and 73\n  (Driver info: chromedriver\u003d73.0.3683.68 (47787ec04b6e38e22703e856e101e840b65afe72),platform\u003dWindows NT 10.0.18363 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.34 seconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-4SDBNLF\u0027, ip: \u0027192.168.1.19\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: driver.version: ChromeDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$errorHandler$0(JsonWireProtocolResponse.java:54)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.gateley.util.BasePage.initialization(BasePage.java:51)\r\n\tat com.gateley.stepDefinations.LoginLogOutAndHomePageSteps.user_navigate_to_field_fisher_login_page(LoginLogOutAndHomePageSteps.java:26)\r\n\tat ✽.user navigate to Gateley login page(file:src/test/resources/features/LoginLogOutAndHomePage.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters \"raghavender.mutpuri@intelligent-ds.co.uk\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.user_enters_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on next button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.user_clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter \"Raghav27@\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.i_enter_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on login in button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.user_clicks_on_login_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on yes button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.i_click_on_yes_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the company logo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.the_Company_Logo_Is_Displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on company navigation button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.iClickOnCompanyNavigationButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter \"GDUB\" in search text box",
  "keyword": "And "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.enterInSearchTextBox(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.clickOnSearchButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I clicks on right top user credentials icon",
  "keyword": "When "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.iClicksOnRightTopUserCredentialsIcon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Sign out button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.clickOnSignOutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "able to redirect page to login page after sign out successful",
  "keyword": "And "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.ableToRedirectPageToLoginPageAfterSignOutSuccessful()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginLogOutAndHomePageSteps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});