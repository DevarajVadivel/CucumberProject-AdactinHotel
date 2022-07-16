@SelectHotel
Feature: Verifying the Adactin Select Hotel functionality

  Background: 
    Given User is on the Adactin login page

  Scenario Outline: Verifying Adactin Select Hotel functionality by selecting Hotel
    When User perform login "<Username>","<Password>"
    Then User should verify the message "Hello VishwaDevaraj!" after the login successful
    And User should search hotel by entering all the details "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then User should verify the message "Select Hotel" after successfully navigate to Select Hotel page
    And User should select a hotel and click continue
    Then User should verify the message "Book A Hotel" after successfully navigate to Book Hotel Page

    Examples: 
      | Username | Password | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | UserName | PassWord | Sydney   | Hotel Creek | Standard  | 1 - One         | 03/07/2022    | 04/07/2022     | 1 - One         | 0 - None          |

  Scenario Outline: Verifying Adactin Select Hotel functionality by without selecting Hotel
    When User perform login "<Username>","<Password>"
    Then User should verify the message "Hello VishwaDevaraj!" after the login successful
    And User should search hotel by entering all the details "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then User should verify the message "Select Hotel" after successfully navigate to Select Hotel page
    And User should click continue without selecting the hotel
    Then User Should verify the select hotel error message"Please Select a Hotel" in Select Hotel Page

    Examples: 
      | Username | Password | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | UserName | PassWord | Sydney   | Hotel Creek | Standard  | 1 - One         | 03/07/2022    | 04/07/2022     | 1 - One         | 0 - None          |
