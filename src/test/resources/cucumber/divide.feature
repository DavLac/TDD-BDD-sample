Feature: Divide integers
  Divide numbers description

  Scenario Outline: Add a with b
    Given <a> and <b>
    When we divide them
    Then I should get <c>

    Examples:
      | a | b | c |
      | 10 | 5 | 2 |
      | 6 | 3 | 2 |
