Feature: Search and place order for Products

@PlaceOrder
Scenario Outline: Search experice for the product search in home and Offers Page

Given User is on GreenCart Landing Page
When User searched with Shortname <Name> and extract actual name of the product
And Added "2" items of the selected product to cart
Then User proceeds to Checkout and validate the <Name> items in checkout page
And Verify that user has ability to enter the promo code and place the order

Examples:
|Name|
|Tom|
