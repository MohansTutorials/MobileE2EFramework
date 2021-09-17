Feature: Validate the Lori App Functionality

Background: Get Android Setup
 Given Emulator is Launched
 And Appium Server is started

Scenario: Validate Get Started Button

Given Lori App is Launched
When Clicked on the get Started button
Then User should see the help support window