Feature: Login functionality of Leaftaps Application
Background:
Given Launch the browser and load the url

Scenario: Login with positive credentials

And Enter the username as 'democsr2'
And Enter the password as 'crmsfa'
And click on login button
Then Homepage is displayed

Scenario: Login with negative credentials

And Enter the username as 'demo'
And Enter the password as 'crmsfa'
And click on login button
Then Homepage is displayed