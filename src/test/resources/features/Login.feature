#Author: priyanka.mandava1412.com

@tag
Feature: Testing for Login functionality 
  @tag1
  Scenario: Login functionality with valid credentials
    Given User landed on the Internet herouk website
    When User clicked on Form authentication link
     
    Then user should land on login page
    When user enters username "tomsmith"
    And user enters password "SuperSecretPassword!"
    When user clicked on Login button 
    Then I verify that the user has logged in succesfully
    And validate the user has landed on the secure area page

 