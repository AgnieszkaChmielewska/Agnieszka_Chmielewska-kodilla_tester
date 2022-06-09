Feature: Prevent from negative deposits
  Scenario: User tries to deposit negative amount
    Given I have deposited $200 in my wallet
    When I try to deposit -0.123456
    Then nothing should be deposited
    And The message should be displayed "Incorrect value. Please enter a valid amount"
