Feature: payment options in amazon

@SIT, @Regression
Scenario: user access to make the payment using CC
Given user has valid CC registed in the portal
Then user provides the valid CVV
And enters the OTP recieved
Then payment success through CC

@SIT, @Smoke
Scenario: user access to make the payment using DC
Given user has valid DC and enters the details
Then user enters the ATM PIN
And proceeds to enter the OTP
Then payment success with selected DC

@SIT, @Regression, @UAT
Scenario: user access to make the payment using UPI
Given user has valid UPI
Then user opts by entering the upi ID
And accepts the request payment in UPI app
Then payemnt is success in UPI