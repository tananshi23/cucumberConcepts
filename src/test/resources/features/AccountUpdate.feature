Feature: User wants to update account

  Scenario: updating Admin account
    Given user sends a request of admin account updation
    When user updates an admin account
    Then user logs into admin account with updated details

  Scenario: updating regular account
    Given user sends a request of regular account updation
    	|username	|password	|
    	|user1		|pass1		|
    	|user2		|pass2		|
    When user updates an regular account
    Then user logs into regular account with updated details

  Scenario Outline: updates superuser account
    Given user sends a request of superuser account updation for "<username>" "<password>"
    When user updates an superuser account
    Then user logs into superuser account with updated details
    Examples:
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |