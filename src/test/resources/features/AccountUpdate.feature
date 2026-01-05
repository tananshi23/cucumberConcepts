Feature: User updates Admin account

  Scenario: updating Admin account
    Given user sends a request of admin account updation
    When user updates an admin account
    Then user logs into admin account

  Scenario: updating regular account
    Given user sends a request of regular account updation
    When user updates an regular account
    Then user logs into regular account

  Scenario: updates superuser account
    Given user sends a request of superuser account updation
    When user updates an superuser account
    Then user logs into superuser account