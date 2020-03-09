$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/Feature/Shopping.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping",
  "description": "",
  "id": "shopping",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": ":Purchase of a sweater by a logged in user",
  "description": "",
  "id": "shopping;:purchase-of-a-sweater-by-a-logged-in-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "I log in to the application using my \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I seek out Hummingbird Printed Sweater",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I choose size M",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I add five pieces",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I confirm my adress",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Choose shipment type",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "and I choose payment method",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I check I agree therms of service",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click order with obligation to pay",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Information is displayed: You order is confirmed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I\u0027m doing a screenshot]",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the browser closes",
  "keyword": "And "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "shopping;:purchase-of-a-sweater-by-a-logged-in-user;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 21,
      "id": "shopping;:purchase-of-a-sweater-by-a-logged-in-user;;1"
    },
    {
      "cells": [
        "presset@gmail.com",
        "Pass123"
      ],
      "line": 22,
      "id": "shopping;:purchase-of-a-sweater-by-a-logged-in-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": ":Purchase of a sweater by a logged in user",
  "description": "",
  "id": "shopping;:purchase-of-a-sweater-by-a-logged-in-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "I log in to the application using my \"presset@gmail.com\" and \"Pass123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I seek out Hummingbird Printed Sweater",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I choose size M",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I add five pieces",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I confirm my adress",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Choose shipment type",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "and I choose payment method",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I check I agree therms of service",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click order with obligation to pay",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Information is displayed: You order is confirmed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I\u0027m doing a screenshot]",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the browser closes",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "presset@gmail.com",
      "offset": 38
    },
    {
      "val": "Pass123",
      "offset": 62
    }
  ],
  "location": "Shopping.iLogInToTheApplicationUsingMyAnd(String,String)"
});
formatter.result({
  "duration": 13507733506,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.iSeekOutHummingbirdPrintedSweater()"
});
formatter.result({
  "duration": 810631135,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.iChooseSizeM()"
});
formatter.result({
  "duration": 2377585484,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.iAddFivePieces()"
});
formatter.result({
  "duration": 2256843353,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.iGoToCheckout()"
});
formatter.result({
  "duration": 3395734362,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.iConfirmMyAdress()"
});
formatter.result({
  "duration": 1353505452,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.chooseShipmentType()"
});
formatter.result({
  "duration": 1285313179,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.andIChoosePaymentMethod()"
});
formatter.result({
  "duration": 280246069,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.iCheckIAgreeThermsOfService()"
});
formatter.result({
  "duration": 368304939,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.clickOrderWithObligationToPay()"
});
formatter.result({
  "duration": 1308628831,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.informationIsDisplayedYouOrderIsConfirmed()"
});
formatter.result({
  "duration": 123100,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.iMDoingAScreenshot()"
});
formatter.result({
  "duration": 845009610,
  "status": "passed"
});
formatter.match({
  "location": "Shopping.theBrowserCloses()"
});
formatter.result({
  "duration": 3930506272,
  "status": "passed"
});
});