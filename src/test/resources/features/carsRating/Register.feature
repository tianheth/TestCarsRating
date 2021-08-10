@Register @Regression
Feature: Register on Buggy Cars Rating
  Test application will replace login Random with an UUID so it will not be duplicate.

  Scenario Outline: Register as a valid user with automated Random login
    Given User is on Register Page
    When User clicks Register with "<Login>", "<First Name>", "<Last Name>", "<Password>"
    Then The message "Err_Msg_RegOK" should be displayed

    Examples:
      | Login    | First Name | Last Name | Password     |
      | Random    | Joe        | Smith     | Password_123 |

  @Negative
  Scenario Outline: Register with invalid password or duplicate login
    Given User is on Register Page
    When User clicks Register with "<Login>", "<First Name>", "<Last Name>", "<Password>"
    Then The message "<ErrorMsg>" should be displayed

    Examples:
      | Login     | First Name | Last Name | Password     | ErrorMsg                   |
      | JoeSmith | Joe        | Smith     | password_123 | Err_Msg_PwdNoUpperCase     |
      | JoeSmith | Joe        | Smith     | Password     | Err_Msg_PwdNotLongerEnough |
      | JoeSmith | Joe        | Smith     | Password_123 | Err_Msg_UserAlreadyExist     |
