@BookHotel
Feature: Verifying the Adactin Book Hotel functionality

  Background: 
    Given User is on the Adactin login page

  Scenario Outline: Verifying Adactin Book Hotel functionality by entering all the fields
    When User perform login "<Username>","<Password>"
    Then User should verify the message "Hello VishwaDevaraj!" after the login successful
    And User should search hotel by entering all the details "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then User should verify the message "Select Hotel" after successfully navigate to Select Hotel page
    And User should select a hotel and click continue
    Then User should verify the message "Book A Hotel" after successfully navigate to Book Hotel Page
    And User should book hotel by entering all the fields "<First Name>","<Last Name>" and "<Billing Address>"
      | Credit Card No.  | Credit Card Type | Expiry Month | Expiry Year | CVV Number |
      | 1234567890098765 | American Express | January      |        2022 |        123 |
      | 1234567890098767 | VISA             | February     |        2022 |        321 |
      | 1234567890098768 | Master Card      | March        |        2022 |        132 |
      | 1234567890098761 | Other            | April        |        2022 |        213 |
    Then User should verify the Booking confirmation message "Booking Confirmation" after successfully navigate to Booking confirmation page

    Examples: 
      | Username | Password | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address |
      | UserName | PassWord | Sydney   | Hotel Creek | Standard  | 1 - One         | 03/07/2022    | 04/07/2022     | 1 - One         | 0 - None          | Vishwa     | Devaraj   | Chennai         |

  Scenario Outline: Verifying Adactin Book Hotel functionality by without entering any fields
    When User perform login "<Username>","<Password>"
    Then User should verify the message "Hello VishwaDevaraj!" after the login successful
    And User should search hotel by entering all the details "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then User should verify the message "Select Hotel" after successfully navigate to Select Hotel page
    And User should select a hotel and click continue
    Then User should verify the message "Book A Hotel" after successfully navigate to Book Hotel Page
    And User should book a hotel by without entering any fields
    Then User should verify the First Name error message "Please Enter your First Name", Last Name error message"Please Enter you Last Name",Address error message"Please Enter your Address", Credit card no. error message"Please Enter your 16 Digit Credit Card Number",credit card type error message"Please Select your Credit Card Type",Expiry Date error message"Please Select your Credit Card Expiry Month"and CVV Number error message"Please Enter your Credit Card CVV Number" in Book Hotel page

    Examples: 
      | Username | Password | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | UserName | PassWord | Sydney   | Hotel Creek | Standard  | 1 - One         | 03/07/2022    | 04/07/2022     | 1 - One         | 0 - None          |
