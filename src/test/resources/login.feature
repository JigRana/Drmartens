Feature: Login Function

  Scenario Outline: Login with valid and Invalid credential
    Given User is on Home page
    And click on sign In link
    When User enter "<username>" and "<password>"
    And User click on SignIn Button
    Then User check "<status>" of Login

    Examples:
      |username                | password   | status |
      |rana_jigar@yahoo.com    | William123 |valid   |
      |rana_jigar@yahoo.com    |  ghf324    |invalid |
      |abcdefg@gmail           | abcdefg123 |invalid |

