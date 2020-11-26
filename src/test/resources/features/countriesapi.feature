@countriesDBTest
Feature:Validate All Customer Info
  @allCountriesValidate
  Scenario: TC_01_In countries read all customers you created and validate them from your data set
    Given In countries user sets all response using end point
    And In countries user deserialization data json to java pojo
    And In countries user validates data.
