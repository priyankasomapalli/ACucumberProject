#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: WithBugs page Login tests
  As a user, I want to test login functionality
  with multiple credential combinations

  @login
  Scenario: Testing multiple invalid login attempts
    Given User is on the Website
    When Clicked on Signin button
    And landed on login page
    Then I send multiple data for email and password
      | email                       | password       |
      | priyanka.sompalli@gmail.com | abcpriavf241   |
      | abcd.man@gmail.com          | bjcshdsdamsal  |
  

  