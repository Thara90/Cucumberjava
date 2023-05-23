Feature: feature to test deposit functionality

Background: user is logged in
    Given user is on login page
    When user enters mngr448552 and zamugur
    And click on login button
    Then user is navigate to the home page
        
  @smoke
  Scenario Outline: Verify user can deposit money successfully
    When user clicks on deposit option
    And user specify account number as <account_number>
    And user specify amount as <amount>
    And user specify description as <description>
    When user clicks on submit button

    Examples: 
      | account_number | amount | description |
      |         113313 |   2500 | testAmount  |
