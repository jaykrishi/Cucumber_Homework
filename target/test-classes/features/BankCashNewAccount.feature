Feature: Techfios bank and cash New Account Functionality

  @BankCash
  Scenario Outline: User should be able to login with valid credentials
                   and open a new account

    Given User is on Techfios login page
    When User enters username as "<username>"
    When User enters password as "<password>"
    When User clicks signin button
    Then User should land on dashboard page
    When User clicks on "bankCashMenu"
    When User clicks on "newAccountMenu"
    When User enters accountTitle as "<accountTitle>" in accounts page
    When User enters description as "<description>" in accounts page
    When User enters initialBalance as "<initialBalance>" in accounts page
    When User enters accountNumber as "<accountNumber>" in accounts page
    When User enters contactPerson as "<contactPerson>" in accounts page
    When User enters Phone as "<Phone>" in accounts page
    When User enters internetBankingUrl as "<internetBankingURL>" in accounts page
    When User clicks on "submitButton"
    Then User should be able to validate account created successfully

    Examples: 
      | username          | password | accountTitle | description | initialBalance | accountNumber | contactPerson | Phone | internetBankingURL  |
      | demo@techfios.com | abc123   | sav          | My Savings  |           2000 |           200 | Jackie        |   243 | http://www.bank.com |
