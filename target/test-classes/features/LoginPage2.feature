Feature: Login Page Functionality Test

Scenario: User logs in successfully with valid credentials

Given User is on application login screen
When User enters username as "yudd@gmail.com"
And User enters password as "67"
And User clicks on login button
Then User is logged in successfully and "7gc@gmail.com" is visible