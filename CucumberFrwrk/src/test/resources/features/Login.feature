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

Feature: To Validate the Login Functinolity of well canada Online Store web application
 


  Scenario: To Validate Login Functionality with Invalid Login Credentials.
    Given To User Should be in Home Page Of Well.ca Application
    And The User Can Click the Signin/Register button
    When The User Can Enter Invalid Email and Password
    Then The User Can Click The SignIn button
    
