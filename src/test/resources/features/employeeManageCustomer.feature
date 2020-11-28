@tableHeaderCustomers
Feature:An Employee can manage Customer
Background: User goes to employee page clicks to my operations and clicks to manage Customers
Scenario: TC01 All customers should show up on manage customers module populating the account information of the customer "First Name  Last Name  Middle Initial  Email  Mobile Phone Number  Phone Number  Address  Create Date "
Given user is on manage customer page
And get the web table header
Then verify the table header contains "First Name"  "Last Name"  "Middle Initial"  "Email"  "Mobile Phone Number"  "Phone Number"  "Address"  "Create Date"


