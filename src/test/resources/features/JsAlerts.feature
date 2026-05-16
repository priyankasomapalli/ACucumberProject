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
@javascriptAlerts
Feature: Validating JavaScript Alerts

  Background:
    Given User is on Website
    When User clicked on JsAlerts
    Then User should land on JavaScriptAlertspage

  @jsAlert
  Scenario: Testing JS Alert button
    When I click on "jsAlert()"
    And clicked on "OK" in step
    Then I verify the "You successfully clicked an alert"

 