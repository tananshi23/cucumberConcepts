Feature: User want to delete account

  Scenario: deleting Admin account
    Given user sends a request of admin account deleteion
    When user deletes an admin account
    Then user unable to log into admin account


  Scenario: deleting regular account
    Given user sends a request of regular account deletion
    When user deletes an regular account
    Then user unable to log into regular account


  Scenario: deleting superuser account
    Given user sends a request of superuser account deletion
    When user deletes an superuser account
    Then user unable to log into superuser account