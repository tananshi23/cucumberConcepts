Feature: User want to crate account

  Scenario: Creating a account
    Given user sends a request of "admin" account creation
    When user creates an admin account
    Then user logs into admin account

  Scenario: Creating regular account
    Given user sends a request of "regular" account creation
    When user creates an regular account
    Then user logs into regular account

  Scenario: Creating superuser account
    Given user sends a request of "superuser" account creation
    When user creates an superuser account
    Then user logs into superuser account