Feature: debug

  Scenario Outline: Verify calculator app
    Given I verify the "<title>" page title is displayed

    Examples:
    | title      |
    | Calculator |
    | Calc       |