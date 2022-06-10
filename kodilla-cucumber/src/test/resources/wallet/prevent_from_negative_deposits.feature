Feature: Prevent from negative deposits

  Scenario: User tries to deposit negative amount
    Given I have deposited $0 in my wallet
    When I withdraw -1
    Then nothing should be deposited
    And The message should be displayed "Incorrect value. Please enter a valid amount"
