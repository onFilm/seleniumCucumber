Feature: division

  @division
  Scenario Outline: Verify division works in calculator app
    Given I verify the "Calculator" page title is displayed
    And I select "<num1>" and "<operator>" and "<num2>"
    When I select equal to perform operation
    Then I validate the result "<result>" is displayed

    Examples:
      | num1  | num2 | operator | result |
      | 4     | 2    | /        | 2      |
      | 6     | 2    | /        | 3      |