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
@Rediff
Feature: validate RediffLoginLogout
  I want to validate login and logout with relogin later on Rediff

  @Login
  Scenario: This is login scenario of Rediff
    Given I open firefox browser
    And i enter the URl link https://www.rediff.com/
    Then I click on sign in Link
    And I enter rediffmail page
    And I enter the correct username and password
    Then i clicked signin button
    And I checked if I am inbox mail of RediffMail
    


  @Logout
  Scenario Outline: This is logout scenario of rediff
  Given I am inside mailbox of rediff
  And  I validate the presence of logout link
  When I clicked on logout link 
  Then i am logged out of the rediffmail
  And I can validate rediffHome page
  But I finally close the browser
  
  
  
  
  
  
  
  
