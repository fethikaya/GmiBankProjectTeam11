@registration
Feature:System should not allow anyone to register with invalid credentials

  Background:
    When user go to on the registration page

  @RegistrationBlankCredentials
  Scenario Outline:registration page negatif scenarios
    Given user types the "<SSN>"
    And user provides "<firstname>"
    And user provides the lastname as  "<lastname>"
    Then user provides the "<address>" information
    And user provides the "<mobile_phone_number>"
    When user provides the username as "<username>"
    Then user provides the email as "<email>"
    And user provides the new password as "<new_password>"
    When user provides the confirm password "<confirm_password>"
    Then user click to register button
    Then  User assert that should see cant registration default credentials

    Examples:
      | SSN | firstname | lastname | address | mobile_phone_number | username | email | new_password | confirm_password |
      |     |           |          |         |                     |          |       |              |                  |

  @RegistrationInvalidSSN
  Scenario Outline: invalid SSN
    Given user types the "<SSN>"
    Then user should see "Your SSN is invalid " msj
    Examples:
      | SSN         |
      | x33-33-5555 |
      | 533-3x-5555 |
      | 533-33-555x |

  @RegistrationInvalidPhoneNumber
  Scenario Outline: invalid Phone Number
    Given user provides the "<mobile_phone_number>"
    Then see "Your mobile phone number is invalid"
    Examples:
      | mobile_phone_number |
      | 972-666-g680        |
      | 972-666-68          |
      | 972-v90-6768        |
      | 9736807889          |
      |972-666-689v         |

    @RegistrationInvalidMail
    Given user provides the email as "<email>"
    Then see "This field is invalid" msj
    Examples:
      | email          |
      | janny          |
      | janny@gmail    |
      | janny@gmail.c  |
      | janny@gmail.co |
