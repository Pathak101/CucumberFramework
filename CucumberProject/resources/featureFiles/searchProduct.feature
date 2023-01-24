Feature: Search and place order for Products

@OffersPage
Scenario Outline: Search experice for the product search in home and Offers Page

Given User is on GreenCart Landing Page
When User searched with Shortname <Name> and extract actual name of the product
Then User searched for the <Name> Shortname in offers Page to check if product exist
And  validate the product name in offer page matches with Landing Page

Examples:
|Name|
|Tom|
|Beet|