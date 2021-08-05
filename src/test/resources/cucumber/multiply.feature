Feature: Multiply integers
  Multiply numbers description

  Scenario Outline: Add a with b
    Given <a> and <b>
    When we multiply them
    Then I should get <c>

    Examples:
      | a | b | c |
      | 1 | 2 | 2 |
      | -1 | 1 | -1 |
