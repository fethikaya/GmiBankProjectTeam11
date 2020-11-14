@createNewAccount
  Feature:User Create A New Account
    Scenario: TC_01_User should create a description for the new account and it cannot be blank
      Given User goes login with Employee
      And User click  My Operations button
      And User select Manage Accounts button
      And User click Create a new Account button
      And User  dont send anything to Description box
      And User click save button

