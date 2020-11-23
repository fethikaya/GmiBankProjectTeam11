@infoUpdate
  Feature:US_07_User Can't Update Invalid Credentials
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
        |abcdefghgmail.com     |
        |abc..def@gmail.com    |
        |.abc@gmail.com        |
        |       @gmail.com     |
        |abcdef@gmail.         |
        |abc@gmail#arcihe.com  |
        |abcdef@gmail          |
        |abc@gmail..com        |
      @languageOption
      Scenario: TC_02_There should not be an option of any other language other than English or Turkish
        Given user give an option language dropdown
        Then user assert that there is no option other than English and Turkish


