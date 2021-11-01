Feature: giftCard

@jr
  Scenario: Gift Card Functionality
    Given User is on Home page
    And User search for GiftCard
    And User click on giftCard
    And User click Buy now
    And select gift card colour
    When User select giftCard amount
    And fill required recipient details
    And click on add to bag button
    Then User can see selected Gift card successfully added to shopping cart