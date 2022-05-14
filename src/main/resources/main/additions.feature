Feature: addition

  Rule: This is positive scenario

  Background:
    Given I verify the "Calculator App" page title is displayed

  @addition
  Scenario Outline: Verify addition works in calculator app
    When I select "<num1>" and "<operator>" and "<num2>"
    And I select equal to perform operation
    Then I validate the result "<result>" is displayed

    Examples:
      | num1  | num2 | operator | result |
      | 5     | 3    | +        | 8      |
      | 2     | 4    | +        | 6      |