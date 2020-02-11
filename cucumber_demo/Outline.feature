Feature: Login Functionality Testing

  Scenario Outline: Login with multiple sets of data
    Given User is open the application
    When User clicks on to signin link
    When User enters "<username>" and "<password>"
    Then User will click on login button
    Then Demo webshop homepage will dispaly

    Examples: 
      | username | password   |
      | aravind.guggilla57@gmail.com | aravind    |
      | vidyapatagar246@gmail.com | Vidya@123 |
