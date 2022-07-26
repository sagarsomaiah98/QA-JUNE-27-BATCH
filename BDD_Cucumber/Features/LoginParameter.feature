Feature: Login Functionality with values
Scenario: Valid Login values

Given I launch the chrome browser and enter the url "https://saucedemo.com/"
And I enter the username "performance_glitch_user"  and password "secret_sauce"
And I click on login
Then I am logged in successfully
And I close the browser