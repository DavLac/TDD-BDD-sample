Feature: Add integers
  Add numbers description

  Scenario Outline: Add a with b
    Given <a> and <b>
    When we add them
    Then I should get <c>

    Examples:
      | a | b | c |
      | 1 | 2 | 3 |
      | -1 | 1 | 0 |
      | 0 | 5 | 5 |
      | -2 | -3 | -5 |
      | 100 | 1000 | 1100 |
