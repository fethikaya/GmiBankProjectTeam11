@US12
Feature: An Employee can manage Customer

  @US12TC01
  Scenario:All customers should show up on manage customers module populating the account information of the customer
    Given Go to gmibank.com home page
    And Click to User Account Menu and Click to Sign In
    And Enter the username with valid credentail
    And Enter the pasword with valid credentail
    And Click to Sign in button
    And Click to My Operations drop down menu and Click to Manage Costumers
    And click to last page button
    Then A customer should show up at total nine head on account information of the customer

  @US12TC02
  Scenario:There should be a View option where customer can be navigated to all customer info and see edit button there
    And Click to View button.
    Then There should be Edit button.

  @US12TC03
  Scenario:There should be an Edit button where all customer information can be populated
    And go back to manage costumers page
    Then There should be Edit button where all customer

  @US12TC04
  Scenario:There should be Edit button where all customerThe Edit portal can allow user to create or update the user info
    And Click to Edit button
    And City textbox is updated
    And Click to Save button in the Edit Page
    Then The Edit portal can allow user to update the user info

  @US12TC05
  Scenario:User can delete a customer, but seeing a message if the user is sure about deletion
    And Confirming that a customer is registered with ID number
    And Click to Delete button
    And seeing a message if the user is sure about deletion
    Then User can delete a customer