
Feature: To Validate the Login Functinolity of well Singapore Online Store web application
 Background:


  Scenario: To Validate Login Functionality with Invalid Login Credentials.
    Given To User Should be in Home Page Of Lazada Application
    And The User Can Click the Signin/Register button
    When The User Can Enter Invalid Email and Password
    
    |Manojkumar|123456|
    |Ramesh|56488|
    Then The User Can Click The SignIn button
    
    Scenario Outline: To Validate Registration Functionality with valid Login Credentials.
    Given To User Should be in Home Page Of Application
    And The User Can Click the Signin/Register button
    When The User Can Enter Invalid Email and Password
   |Username|PassWord|
    |Manojkumar|123456|
    |Ramesh|56488|
   
    Then The User Can Click The SignIn button
    