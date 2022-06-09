Feature: Prevent from negative deposits

  Scenario: User tries to deposit negative amount
    Given I have deposited $200 in my wallet
    When I try to deposit -1
    Then 0 should be deposited
    And The message should be displayed "Incorrect value. Please enter a valid amount"
