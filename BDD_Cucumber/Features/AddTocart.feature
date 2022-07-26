Feature: Add To Cart
Scenario: Adding items to cart

Given I launch the chrome browser and enter the url
When I enter the username and password
And I click on login
Then I am logged in successfully
When I add the item to cart
Then item is added to cart successfully
And I close the browser