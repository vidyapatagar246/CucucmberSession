Feature: Testing demo webshop register page

  Scenario: User will fill mandatory fields
    Given the registration page is opened
    When user enters First name as vidya
    And user enters last name as patagar
    And user enters email as vidyapatagar246@gmail.com
    And user enters password as Vidya@123
    And user enters Confirm password as Vidya@123
    Then user clicks on Register button
    Then Register should be succussfully
