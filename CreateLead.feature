Feature: CreateLead functionality in LeafTaps


Background:
Given Open the chrome browser
Given Load the application url

Scenario: CreateLead with manadatory informations

Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' Page should be displayed
When Click on 'Leads' link
Then 'My Leads' Page should be displayed
When Click on 'Create Lead' link
Then 'Create Lead' Page should be displayed
Given Enter the CompanyName as 'TestLeaf'
And Enter the FirstName as 'sanjana'
And Enter the LastName as 'u'
And Enter the phone number as  '98'
When Click on Create Lead button
Then New Lead should be created



