Feature: multiplication

  @multiplication
  Scenario Outline: Verify multiplication works in calculator app
    Given I verify the "Calculator" page title is displayed
    And I select "<num1>" and "<operator>" and "<num2>"
    When I select equal to perform operation
    Then I validate the result "<result>" is displayed

    Examples:
      | num1  | num2 | operator | result |
      | 5     | 3    | *        | 15     |
      | 2     | 4    | *        | 8      |