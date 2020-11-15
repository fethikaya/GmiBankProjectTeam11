@createNewAccount
Feature:User Create A New Account
  Background: User Goes Create New Account Page
    Given User goes login with Employee
    And User click  My Operations button
    And User select Manage Accounts button
    And User click Create a new Account button
    @InDescription
    Scenario: TC_01_User should create a description for the new account and it cannot be blank
      And User  dont send anything to Description box
      And User click save button

      @VaDescription
      Scenario: TC_02_User should create a description for the new account and it cannot be blank
        And User  dont send anything to Description box
        And User click save button

     @InBalance
     Scenario: TC_03_User should provide a balance for the first time account creation as Dollar
      And User  dont send anything to Balance box
      And User click save button


