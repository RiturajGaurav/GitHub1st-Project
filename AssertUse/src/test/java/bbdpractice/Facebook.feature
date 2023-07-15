@Login
Feature: validate the facebook login

@validlogin
  Scenario: verify for valid login
    Given user has to be on login page
    When enter validusername and valid password and click login
    Then user should login successfully

@invalidlogin
   Scenario Outline: verify for invalid login
   Given user has to be on login page
   When enter valid <username> and invalid <password> and click login
   Then should display error message
   
   Examples:
   |username|password|
   |rgaurav.5555@gmail.com|lucky@1233|
   |pratimagupta529@gmail.com|898262547|