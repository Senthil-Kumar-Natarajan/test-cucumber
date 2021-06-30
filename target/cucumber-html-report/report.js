$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Testing.feature");
formatter.feature({
  "line": 1,
  "name": "Test Cucumber scripts",
  "description": "",
  "id": "test-cucumber-scripts",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14416548571,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "select lowest price item in cart",
  "description": "",
  "id": "test-cucumber-scripts;select-lowest-price-item-in-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I add four different products to my wish list",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I view my wishlist table",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I  find total \"4\" selected items in my wishlist",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I search for the lowest price product",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I am able to add the lowest price item to my cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am able to verify the item in my cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.search4Products()"
});
formatter.result({
  "duration": 12189840262,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.viewWichList()"
});
formatter.result({
  "duration": 2348139715,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 15
    }
  ],
  "location": "StepDef.validateMyWishList(String)"
});
formatter.result({
  "duration": 13199009,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.searchLowestPriceItemInWishList()"
});
formatter.result({
  "duration": 10774296,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.addLowestPriceItemToCart()"
});
formatter.result({
  "duration": 125583955,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.verifyAbleToCheckOut()"
});
formatter.result({
  "duration": 689407737,
  "status": "passed"
});
formatter.after({
  "duration": 511713034,
  "status": "passed"
});
});