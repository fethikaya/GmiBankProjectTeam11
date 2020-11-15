
@us_010
Feature: US_010
  Address of customer can be created

  Scenario:Address as street and number should be provided and cannot be left blank


    Given Employee login in the account
    When Employee click my operations
    Then Employee click the any of customer Edit Button
    Then Employee leave empty address row
    Then System show this filed is required message


  Scenario:City should be provided and cannot be left as blank


    Given Employee login in the account
    When Employee click my operations
    Then Employee click the any of customer Edit Button
    Then Employee filled out the address row
    Then Employee leave empty City row
    Then System show this filed is required message


