Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And In may wallet should be $170

  Scenario: Unsuccessful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $201
    Then I should see message "Not enough money in wallet"
    And In may wallet should be $200

  Scenario Outline: Unsuccessful withdrawal from a wallet when incorrect amount
    Given I have deposited $200 in my wallet
    When I request <amount>
    Then I should see <message>
    And In may wallet should be $200
    Examples:
      | amount      | message                                |
      | 1.5         | "The minimum withdrawal amount is $ 1" |
      | 0.512345123 | "The minimum withdrawal amount is $ 1" |

  Scenario: Unsuccessful withdrawal from a wallet when negative amount
    Given I have deposited $200 in my wallet
    When I request $-1
    Then The message should be displayed "Incorrect value. Please enter a valid amount"
    And In may wallet should be $200

  Scenario: Unsuccessful withdrawal from a wallet when requested amount is zero
    Given I have deposited $200 in my wallet
    When I request zero $0
    Then I should see message that  "The minimum withdrawal amount is $ 1"
    And In may wallet should be $200

  Scenario: Do not change wallet balance when zero deposited
    Given I have deposited $0 in my wallet
    When I request $1
    Then I should see message "Not enough money in wallet"

  Scenario: Do not change wallet balance when negative amount deposited
    Given I have deposited $-1 in my wallet
    When I request $1
    Then I should see message "Not enough money in wallet"