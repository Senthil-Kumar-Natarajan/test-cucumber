# Cucumber BDD Sample project

Cucumber BDD Demoproject 

This is a test project to showcase automation of  web app  

Path location of the feature file : <root_directory of the project>/test_cucumber/src/test/java/resources/Testing.feature

Feature: Web automation of the demo site

    Scenario: Adding the items to the cart
    
    Given I add four different products to my wish list
    When I view my wishlist table
    Then I  find total "4" selected items in my wishlist
    When I search for the lowest price product
    And I am able to add the lowest price item to my cart
    Then I am able to verify the item in my cart


Running test locally :
    
    1.  Clone the Repo 
    2.  Pre Requisties :

    Please update your local driver path in the file <root_directory of the project>/test_cucumber/src/main/java/com/test/bdd/servicetesting/UtilityHelper/UIDriverManager.java
    
    System.setProperty("webdriver.chrome.driver", "//usr/local//bin//chromedriver"

    3.Go to your project directory from terminal and hit any of the following commands

        mvn clean install 

        mvn clean verify

        mvn test
    
    4. Validate the logs in TestRunLog.out
 