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