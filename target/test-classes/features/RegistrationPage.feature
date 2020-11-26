@registrationPageTest
Feature:System should not allow anyone to register with invalid credentials

  Background:
    When user on the registration page

  @RegistrationInvalid
  Scenario Outline:registration page negatif scenarios
    Given user types the "<SSN>" and the
    And user provides "<firstname>" and
    And user provides the lastname as  "<lastname>" and
    Then user provides the "<address>" information
    And user provides the "<mobile_phone_number>" and
    When user provides the username as "<username>" and
    Then user provides the email as "<email>" and the
    And user provides the new password as "<new_password>" and
    When user provides the confirm password "<confirm_password>" and the
    Then user click to register button
    Then  User assert that should see cant registration default credentials

    Examples:
      | SSN         | firstname           | lastname | address | mobile_phone_number | username | email | new_password | confirm_password |
      |             |                     |          |         |                     |          |       |              |                  |
      | x33-33-5555 | |          |         |                     |          |       |              |                  |
#      | 533-3x-5555 | Your SSN is invalid  |           |                             |          |                            |         |                          |                     |                                     |          |                           |                |                        |              |                           |                  |                                        |                                                          |
#      | 533-33-555x | Your SSN is invalid  |           |                             |          |                            |         |                          |                     |                                     |          |                           |                |                        |              |                           |                  |                                        |                                                          |
#      |             |                      |           |                             |          |                            |         |                          | 972-666-g680        | Your mobile phone number is invalid |          |                           |                |                        |              |                           |                  |                                        |                                                          |
#      |             |                      |           |                             |          |                            |         |                          | 972-666-g68         | Your mobile phone number is invalid |          |                           |                |                        |              |                           |                  |                                        |                                                          |
#      |             |                      |           |                             |          |                            |         |                          | 9736807889          | Your mobile phone number is invalid |          |                           |                |                        |              |                           |                  |                                        |                                                          |
#      |             |                      |           |                             |          |                            |         |                          |                     |                                     |          |                           | janny          | This field is invalid  |              |                           |                  |                                        |                                                          |
#      |             |                      |           |                             |          |                            |         |                          |                     |                                     |          |                           | janny@gmail    | This field is invalid  |              |                           |                  |                                        |                                                          |
#      |             |                      |           |                             |          |                            |         |                          |                     |                                     |          |                           | janny@gmail.c  | This field is invalid  |              |                           |                  |                                        |                                                          |
#      |             |                      |           |                             |          |                            |         |                          |                     |                                     |          |                           | janny@gmail.co | This field is invalid  |              |                           |                  |                                        |                                                          |