@customerDBTest
  Feature:US_20_Validate All Customer Info
      @allCustomerValidate
      Scenario: TC_01_Read all customers you created and validate them from your data set
        Given user sets all response using end point "https://www.gmibank.com/api/tp-customers"
        And user deserialization data json to java pojo
        And user validates data.



    #@dBVerify1by1
    #  Scenario: TC_02_Read all customers you created and validate them 1 by 1
     #   Given user sets all response using end point "https://www.gmibank.com/api/tp-customers"
      #  And user deserialization data json to java pojo
       # And user validates data.
