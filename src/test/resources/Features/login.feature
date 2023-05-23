Feature: Login functionality

  @smoke
  Scenario Outline: Verify login is successfull with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And click on login button
    Then user is navigate to the home page

    Examples: 
      | username   | password |
      | mngr448552 | zamugur  |

  @smoke
  Scenario Outline: Verify login is failed with invalid credentials
    Given user is on login page
    When user enters <username> and <password>
    And click on login button
    Then warning message is displayed

    Examples: 
      | username   | password |
      | mngr448552 | test     |
      
      