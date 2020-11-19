@infoUpdate
  Feature: User Can't Update With Invalid Email
    Background: User go to user setting page
      Given user goes login with Employee
      And user click employee name
      And user select user info
    @emailInvalid
   Scenario Outline: TC_01_user can not update with invalid email address
      Given user send "<userInfoUpdateEmailBox>" into the email box
      And user click save button
      Then user assert that user account can not update with invalid email address
      Examples:
        |userInfoUpdateEmailBox|
        |abcdef-@gmail.com     |
        |abc..def@gmail.com    |
        |.abc@gmail.com        |
        |abc#def@gmail.com     |
        |abcdef@gmail.c        |
        |.abc@gmail#arcihe.com |
        |abcdef@gmail          |
        |.abc@gmail..com       |


