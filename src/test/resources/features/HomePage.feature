@homepage
Feature: As a user I should be able to navigate to home page


  Background:
    When User goes to given url


  Scenario Outline: Login with valid <Username>
    And Click to "Account Menu"
    And Click to "Sign in" button
    And Enter the "<Username>" and "<Password>"
    And Verify "Cancel" button is displayed
    And Click to "Sign in" button
    Then Verify "<FullName>" is displayed
    Examples:
      | Username       | Password       | FullName                |
      | hasemployee    | hasemployee    | myname mylastname       |
      | team11admin    | Team11admin    | team11aaaaa team11bbbbb |
      | team11customer | Team11customer | team11 team11b          |
      | team11user     | Team11user     | tulip tulip             |
      | team11manager  | Team11manager  | team11aaa team11bbb     |


  Scenario Outline: Login with IN-VALID <Username>
    And Click to "Account Menu"
    And Click to "Sign in" button
    And Enter the "<Username>" and "<Password>"
    And Verify "Cancel" button is displayed
    And Click to "Sign in" button
    Then Verify "<Alert>" message is displayed
    Examples:
      | Username      | Password     | Alert                                        |
      | jdfkbsdfjs322 | hasemployee  | Please check your credentials and try again. |
      | hasemployee   | ajkfnas      | Did you forget your password?                |
      | jsdfkaj       | quuqhhfn312. | Register a new account                       |


  Scenario Outline: User info segment should be editable on Homepage
    When User login
    And Click to "Account menu"
    And Click to "User Info" button
    And User fill out "<input>" boxes with valid "<info>" credentials
    And Click to "langKey" dropdown

    Examples:
      | input     | info             |
      | firstName | Ancelina         |
      | lastName  | culi             |
      | email     | unkown@gmail.com |


  Scenario Outline: System should not allow to make updates with invalid credentials

    When User login
    And Click to "Account menu"
    And Click to "User Info" button
    And Invalid "<input>" entered to "<credentials>" box user see "<Error Message>" displayed

    Examples:Email id cannot contain just digits or chars without "@" sign or ".com" extension
      | input | credentials     | Error Message         |
      | email | abcdefgmail.com | This field is invalid |
      | email | abcdef@gmail.   | This field is invalid |
      | email | abcdefgmailcom  | This field is invalid |
      | email | abcdef@gmail.co | Settings saved!       |