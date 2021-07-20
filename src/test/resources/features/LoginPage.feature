Feature: Login Page Functionality Test

Scenario: User logs in successfully with valid credentials

Given User is on application login screen
When User enters username as "ak2058546@gmail.com"
And User enters password as "anil123"
And User clicks on login button
Then User is logged in successfully and "ak2058646@gmail.com" is visible