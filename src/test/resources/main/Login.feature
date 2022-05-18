Feature: Login

  Scenario: Login to SwagLabs
      Given I login to SwagLabs app with username and password
        | username      | password     |
        | standard_user | secret_sauce |
      Then I print the credential in console