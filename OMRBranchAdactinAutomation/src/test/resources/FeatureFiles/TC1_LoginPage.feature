@Login
Feature: Verifying the Adactin login functionality

  Background: 
    Given User is on the Adactin login page

  @valid
  Scenario Outline: Verifying Adactin login functionality with valid credentials
    When User perform login "<Username>","<Password>"
    Then User should verify the message "Hello VishwaDevaraj!" after the login successful

    Examples: 
      | Username | Password |
      | UserName | PassWord |

  @validwithEnter
  Scenario Outline: Verifying Adactin login functionality with valid credentials using Enter key
    When User perform login "<Username>","<Password>" using Enter key
    Then User should verify the message "Hello VishwaDevaraj!" after the login successful

    Examples: 
      | Username | Password |
      | UserName | PassWord |

  @invalid
  Scenario Outline: Verifying Adactin login functionality with invalid credentials
    When User perform login "<Username>","<Password>"
    Then User should verify the error message which contains "Invalid Login details or Your Password might have expired."

    Examples: 
      | Username        | Password        |
      | invalidUserName | invalidpassword |