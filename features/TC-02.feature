Feature: createLead Functionality for LeafTaps Application
Background: 
Given Launch the browser and load the url

Scenario: createLead with single data

When Enter the username as 'democsr2'
When Enter the password as 'crmsfa'
And click on Login 
And Click on crmsfa link
And click on Leads
And Click on CreateLeads link
And Enter the company Name
And enter the firstName
And enter the LastName
And click on Submit button
Then viewLeads page is displayed

