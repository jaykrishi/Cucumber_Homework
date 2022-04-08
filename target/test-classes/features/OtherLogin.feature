@OtherLoginFeature @Regression
Feature: TechFios billing Other Login Functionality Validation

  Background: 
    Given User is on Techfios login page

  @OtherScenario1
  Scenario Outline: User should not be able to login with invalid credentials
    When User enters username as "<username>"
    When User enters password as "<password>"
    When User clicks signin button
    Then User should not land on dashboard page

    Examples: 
      | username           | password |
      | demo2@techfios.com | abc123   |
      | demo@techfios.com  | abc124   |
      | demo2@techfios.com | abc124   |
#@OtherScenario2
#Scenario: Login with invalid credentials
#When User enters username as "demo2@techfios.com"
#When User enters password as "abc1223"
#When User clicks signin button 
#Then User should not land on dashboard page
#Then User should not land on dashboard page
#Then User should not land on dashboard page
#Then User should not land on dashboard page
