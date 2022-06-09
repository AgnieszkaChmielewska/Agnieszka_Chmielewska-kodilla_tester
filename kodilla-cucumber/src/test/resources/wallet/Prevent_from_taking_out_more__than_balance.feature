Feature: Prevent users from taking out more money than their wallet contains
  Scenario: User tries to take out more money than their balance
    Given there is $100 in my wallet
    When I withdraw $200
    Then nothing should be dispensed
    And I should see message "Not enough money in wallet"

  Scenario: User deposited 200 and tries to take out 200.01
    Given I have deposited $200 in my wallet
    When I withdraw $200.1
    Then nothing should be dispensed
    And The message should be displayed "Incorrect value. Please enter a valid amount"
    And In may wallet should be $200

  Scenario: User tries to take out money when balance zero
    Given I have deposited $0 in my wallet
    When I withdraw $0.512345123
    Then nothing should be dispensed
    And The message should be displayed "Incorrect value. Please enter a valid amount"