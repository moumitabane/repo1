Feature: login validation for all the registered users

  Scenario Outline: login validation with valid credentials
    Given testme application is launched successfully
    When user enters the valid "<Username>" # reference to the variables "<>" string, <> int
    And valid "<Password>"
    Then submits the credentials by clicking on login button in testme
    And verfies the login status in testmeapp
    When user add <Quantity> itemes to the cart

    
    Examples: 
      | Username | Password   | Quantity |
      | Srinivas | password23 |        5 |
      | Divya    | Pass@13    |        3 |
      | Moumita  | Pas45!@    |        2 |