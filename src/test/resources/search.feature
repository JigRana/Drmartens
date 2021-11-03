Feature: Search Functionality
  AS a Customer
  I want to search product
  So That I can buy or view product

  Scenario Outline: search
    Given User is on Home page
    When User search for Particular "<product>"
    Then User can see respective "<productRange>" list
    Examples:
    |product | productRange |
    |BOOTS   | BOOTS        |
    |SHOES   | SHOES        |
@regression
  Scenario Outline: filterBy subFilter
    Given User is on Home page
    When User search for Particular "<product>"
    And User select facet "<filter>"
    And User select as per requirement "<subFilter>"
    And User click on apply button
    Then User able to see respective product as per "<selectedFilter>"

    Examples:
      |product  |filter        |subFilter   | selectedFilter |
      |SHOES    | STYLE        | BROGUES    | BROGUES        |
      |BOOTS    | GENDER       | MENS       | MENS           |
      |SHOES    | PRODUCT TYPE | ACCESSORIES| ACCESSORIES    |
