@dbtest
  Feature:API Test
    Background: connect to API Address
      Given user go to Gmibank Api adress and assert it.
      @daverifyall
      Scenario: TC_01_Read all customers you created and validate them from your data set
        Given user gets all data and read
        And user verifies user data and previously created data.
      @dbverify1by1
      Scenario: TC_02_Read all customers you created and validate them 1 by 1
        Given user gets all data and read
        And user verifies user data and previously created data one by one
