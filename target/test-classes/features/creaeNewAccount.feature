@createNewAccount
Feature:User Create A New Account
  Background: User Goes Create New Account Page
    Given User goes login with Employee
    And User click  My Operations button
    And User select Manage Accounts button
    And User click Create a new Account button

  @InDescription
  Scenario:User should create a description for the new account and it cannot be blank
    And User  dont send anything to Description box
    And User click save button
    Then  User takes warning message

  @VaCreateNewAcount
  Scenario Outline:User should create a  new account
    And User  send anything to Description box
    And User provide a balance for the first time account creation as Dollar
    And User  select <Account Type> click save button
    And User  select <Account Status Type> click save button
    And User selects  a Employee from the dropdown
    Then User click save button

    Examples:

      |Account Type  |Account Status Type |
      |CHECKING      |ACTIVE              |
      |SAVING        |SUESPENDED          |
      |CREDIT_CARD   |CLOSED              |
      |INVESTING     |                    |



