@Loginfeature @Regression
Feature: TechFios billing Login Functionality Validation

  Background: 
    Given User is on Techfios login page

  @Scenario1
  Scenario: User should be able to login with valid credentials
    When User enters username as "demo@techfios.com"
    When User enters password as "abc123"
    When User clicks signin button
    Then User should land on dashboard page

  @Scenario2
  Scenario: Login with invalid credentials
    When User enters username as "demo2@techfios.com"
    When User enters password as "abc1223"
    When User clicks signin button
    Then User should not land on dashboard page

  @TF_login2
  Scenario: User should be able to login with valid credentials from Database
    When User enters "username" from database
    When User enters "password" from database
    When User clicks signin button
    Then User should land on dashboard page
