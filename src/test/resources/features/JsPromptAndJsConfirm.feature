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
Feature: Title of your feature
  I want to use this template for my feature file
  
   Background:
    Given User is on Website
    When User clicked on JsAlerts
    Then User should land on JavaScriptAlertspage

  @tag1
  Scenario Outline: JsConfirm tests
   Examples:
   
    When I click on "jsConfirm()"
      | name        | value  | status             |
      | jsConfirm() |  OK    | You clicked: Ok    |
      | jsConfirm() | Cancel | You clicked: Cancel|
    
    

  @tag2
  Scenario:
   @tag1
  Scenario Outline: JsPrompt tests
   Examples:
   
    When I click on "jsPrompt()"
      | name       | value1 | value2             | status             |
      | jsPrompt() |  priya | You clicked: Ok    |You entered: priya  |
      | jsPrompt() | !!!!!  | You clicked: Cancel|You entered: null   |
    
   
      