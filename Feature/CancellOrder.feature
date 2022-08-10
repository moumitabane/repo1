Feature: Order validations
Scenario: order cancellation

  Given the user has logged in successfully
  Then user verifies for the active order
  When User clicks cancel order
  And user logout from the application
  Then user places another order