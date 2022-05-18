Feature: debug

  @debug
  Scenario Outline: Verify title of the sauce labs demo app
    Given I verify the "<title>" page title is displayed
    Examples:
      | title     |
      | Swag Labs |
      | Swag Labs |
      | Swag Labs |

  Scenario Outline: Verify title of the sauce labs demo app
    Given I verify the "<title>" page title is displayed
    Examples:
      | title     |
      | Swag Labs |
      | Swag Labs |
      | Swag Labs |
