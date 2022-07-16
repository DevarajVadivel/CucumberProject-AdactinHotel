@SearchHotel
Feature: Verifying the Adactin Search Hotel functionality

  Background: 
    Given User is on the Adactin login page

  Scenario Outline: Verifying Adactin Search Hotel functionality by entering all the details
    When User perform login "<Username>","<Password>"
    Then User should verify the message "Hello VishwaDevaraj!" after the login successful
    And User should search hotel by entering all the details "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then User should verify the message "Select Hotel" after successfully navigate to Select Hotel page

    Examples: 
      | Username | Password | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | UserName | PassWord | Sydney   | Hotel Creek | Standard  | 1 - One         | 03/07/2022    | 04/07/2022     | 1 - One         | 0 - None          |

  Scenario Outline: Verifying Adactin Search Hotel functionality by entering only mandatory details
    When User perform login "<Username>","<Password>"
    Then User should verify the message "Hello VishwaDevaraj!" after the login successful
    And User should search hotel by entering mandatory details "<Location>","<Number of Rooms>","<Check In Date>","<Check Out Date>" and "<Adults per Room>"
    Then User should verify the message "Select Hotel" after successfully navigate to Select Hotel page

    Examples: 
      | Username | Password | Location | Number of Rooms | Check In Date | Check Out Date | Adults per Room |
      | UserName | PassWord | Sydney   | 1 - One         | 03/07/2022    | 04/07/2022     | 1 - One         |

  Scenario Outline: Verifying Adactin Search Hotel functionality by entering all the details with incorrect Checkin and Checkout date
    When User perform login "<Username>","<Password>"
    Then User should verify the message "Hello VishwaDevaraj!" after the login successful
    And User should search hotel by entering all the details "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then User should verify the checkin and checkout error message "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | Username | Password | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | UserName | PassWord | Sydney   | Hotel Creek | Standard  | 1 - One         | 03/07/2023    | 04/07/2022     | 1 - One         | 0 - None          |

  Scenario Outline: Verifying Adactin Search Hotel functionality by without entering any fields
    When User perform login "<Username>","<Password>"
    Then User should verify the message "Hello VishwaDevaraj!" after the login successful
    And User should search hotel without entering any fields
    Then User should verify the Location error message "Please Select a Location" after search hotel

    Examples: 
      | Username | Password |
      | UserName | PassWord |
