Feature: debug

  @debug
  Scenario Outline: Verify calculator app
    Given I verify the "<title>" page title is displayed

    Examples:
    | title           |
    | Calculator App  |
    | AngularCalc     |

  @smoke
  Scenario Outline: Verify addition subtraction multiplication and division works in calculator app
    Given I verify the "Calculator App" page title is displayed
    And I select "<num1>" and "<operator>" and "<num2>"
    When I select equal to perform operation
    Then I validate the result "<result>" is displayed

    Examples:
      | num1  | num2 | operator | result |
      | 5     | 3    | +        | 8      |
      | 9     | 4    | -        | 5      |
      | 5     | 3    | *        | 15     |
      | 6     | 3    | /        | 2      |