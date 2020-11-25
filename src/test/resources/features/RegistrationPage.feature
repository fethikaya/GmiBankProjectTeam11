@Applicant
  Feature: All Applicants

    Background: registration page navigation
      Given user on the registration page


    @applicant12
      Scenario Outline: all negative scenarios
        Given user types the "<SSN>" and the "<message1>"
        And user provides "<firstname>" and "<message2>"
        And user provides the lastname as  "<lastname>" and  "<message3>"
        Then user provides the "<address>" information "<message4>"
        And user provides the "<mobile_phone_number>" and "<message5>"
        When user provides the username as "<username>" and "<message6>"
        Then user provides the email as "<email>" and the  "<message7>"
        And user provides the new password as "<new_password>" and "<message8>"
        When user provides the confirm password"<confirm_password>" and the "<message9>"
        Then user gets the "<failure>" message
        Examples: all data
        |SSN|message1|firstname|message2|lastname|message3|address|message4|mobile_phone_number|message5|username|message6|email|message7|new_password|message8|confirm_password|message9|failure|
        |   | translation-not-found[Your SSN is required]        |        |       |                   |        |     |            |                |       ||        |     |        |            |        |                |        |       |
        |hjkll | translation-not-found[Your SSN is required]        |        |       |                   |        |     |            |                |       ||        |     |        |            |        |            |            |       |
        |hjkll | translation-not-found[Your SSN is required]        |        |       |                   |        |     |            |                |       ||        |     |        |            |        |            |            |       |
        |hjkll | translation-not-found[Your SSN is required]        |        |       |                   |        |     |            |                |       ||        |     |        |            |        |            |            |       |
        |hjkll | translation-not-found[Your SSN is required]        |        |       |                   |        |     |            |                |       ||        |     |        |            |        |            |            |       |
        |hjkll | translation-not-found[Your SSN is required]        |        |       |                   |        |     |            |                |       ||        |     |        |            |        |            |            |       |
        |hjkll | translation-not-found[Your SSN is required]        |        |       |                   |        |     |            |                |       ||        |     |        |            |        |            |            |       |
        |hjkll | translation-not-found[Your SSN is required]        |        |       |                   |        |     |            |                |       ||        |     |        |            |        |            |            |       |
