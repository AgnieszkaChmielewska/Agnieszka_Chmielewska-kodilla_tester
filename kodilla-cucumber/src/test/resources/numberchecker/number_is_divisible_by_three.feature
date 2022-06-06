Feature: Number is divisible by three, five

  Scenario Outline: Number is divisible by three or not
    Given the <number>
    When I ask whether number is divisible by three and five
    Then I should have <answer>
    Examples:
      | number  | answer     |
      | one     | "None"     |
      | three   | "Fizz"     |
      | five    | "Buzz"     |
      | six     | "Fizz"     |
      | nine    | "Fizz"     |
      | ten     | "Buzz"     |
      | fifteen | "FizzBuzz" |
