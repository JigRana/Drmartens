Feature: giftCard

@jr
  Scenario: Gift Card Functionality
    Given User is on Home page
    And User search for GiftCard
    And User click on giftCard
    And User click Buy now
    And select gift card colour
    When User select giftCard amount "£125.00"
    And fill required recipient details
    And user select laterDate "25"
    And click on add to bag button
    Then User can see selected Gift card successfully added to shopping cart