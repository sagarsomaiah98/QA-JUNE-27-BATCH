Feature: Login Functionality
Scenario: Valid Login

Given I launch the chrome browser and enter the url
When I enter the username and password
And I click on login
Then I am logged in successfully
And I close the browser