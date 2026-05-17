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
Feature: Practice Test Automation Table verification

  
     @table
Scenario: Verify all courses in the automation courses table
  Given User is on the Test Table page
  Then the table should contain the following courses
    | ID      | Course Name          | Language | Level        | Enrollments |
    | 1517620 | Selenium Framework   | Java     | Advanced     | 2667        |
    | 1693880 | Selenium with Java   | Java     | Beginner     | 64284       |
    | 1743612 | XPath Locators       | Any      | Beginner     | 14762       |
    | 1904956 | Advanced Selenium    | Java     | Intermediate | 16452       |
    | 2854476 | REST Assured         | Java     | Intermediate | 8254        |
    | 3970682 | Selenium Grid        | Java     | Advanced     | 2207        |
    | 4536644 | Java for Testers     | Java     | Beginner     | 6678        |
    | 4824578 | Selenium with Python | Python   | Beginner     | 10705       |
    | 5393658 | Python for Testers   | Python   | Beginner     | 1365        |