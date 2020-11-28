@StatesDBTest
Feature:US_0022 States
  @allStatesValidate
  Scenario: States read all state you created and validate them from your data set
    Given In States user sets all response using end point "https://www.gmibank.com/api/tp-states"
    And In States user deserialization data json to java pojo
    And In States user validates data.
