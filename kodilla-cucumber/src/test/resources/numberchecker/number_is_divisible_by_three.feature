Feature: Number is divisible by three, five

  Scenario Outline: Number is divisible by three or not
    Given the <number>
    When I ask whether number is divisible by 3 and 5
    Then I should be told <answer>
    Examples:
      | number | answer     |
      | 0      | "Fizz"     |
      | 1      | "None"     |
      | 3      | "Fizz"     |
      | 5      | "Buzz"     |
      | 6      | "Fizz"     |
      | 9      | "Fizz"     |
      | 10     | "Buzz"     |
      | 15     | "FizzBuzz" |
