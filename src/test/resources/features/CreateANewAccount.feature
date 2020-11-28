@CreateNewAcountUS13
Feature: US13 tests

  Background: user anters gmibank homepage then reaches create new costomers link
    Given user enters gmibank homepage
    Then user navigate createNewAccount Page


  @US13TC01
  Scenario: user enter Description
    Given  user click Description
    And   user click Balance
    And  user sees required message



  @US13TC02
  Scenario: user should provide a balance as a Dollar
    Given  user create as a dollar account "200" and verify


  @US13TC03
  Scenario: User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING
    Given user select an acount as CHECKING and verify
    And user select an acount as a SAVING and verify
    And user select an acount as a CREDIT_CARD and verify
    And user select an acount as a INVESTING and verify


  @US13TC04
  Scenario: User should account status defined as ACTIVE, SUSPENDED or CLOSED
    Given user click Account Status Type definied as a ACTIVE and verify
    And user click Account Status Type definied as a  SUESPENDED and verify
    And user click Account Status Type definied as a  CLOSED and verify

  @US13TC05
  Scenario: User can select an employee from the drop-down
    Given user select Employee and verify the selectet Employee
