@accountRegistrationsDBTest
Feature:US_23_Validate All accountRegistrations Info
  @allaccountRegistrationsValidate
  Scenario: TC_01_In accountRegistrations read all accountRegistrations you created and validate them from your data set
    Given In accountRegistrations user sets all response using end point "https://www.gmibank.com/api/tp-account-registrations"
    And In accountRegistrations user deserialization data json to java pojo
    And In accountRegistrations user validates data.