@web
Feature: Login GmibankPage

  Background:
    Given I am on home page

  @Cuslogin
  Scenario Outline: verify  login functuality with valid creadential
    When user logs in as "<role>"
    Examples:
      | role     |
     # | Employee |
      | Admin    |
      | Manager  |
      | Customer |
      | User     |























