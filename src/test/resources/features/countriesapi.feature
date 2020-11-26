@countriesDBTest
Feature:Validate All Customer Info
  @allCountriesValidate
  Scenario: TC_01_Read all customers you created and validate them from your data set
    Given user sets all response using end point "https://www.gmibank.com/api/tp-countries" "
    And user deserialization data json to java pojo
    And user validates data.
