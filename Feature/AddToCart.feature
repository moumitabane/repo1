Feature: cart validation in testmeapp

Background: login validation # it is a common step before every scenario
Given user  launches the application 
Then enters the valid username
And  enter valid password
When clicks on submit user login is success

Scenario: add item to the cart
Given user search resulted in a valid prodcut
Then user clicks on button to add the item to cart


Scenario: remove the item from cart
Given user has atleast one item in the cart
Then user clicks minus symbol next to cart
But the item is not deletd from the cart