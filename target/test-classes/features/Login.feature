Feature: Verify Login functionality on askganesha application 

Scenario: Sign up for free by using dont have an account link 
Given I am on the home page
When I click on Login page and verify the login page appears
Then  I click on Dont have an account link
And I am on the home page

Scenario: Try to sign in using invalid password 
Given I am on the home page
When I click on Login page and verify the login page appears
And i enter valid email and invalid password
Then I verify the error message appears
And I click on the close button of error message

Scenario Outline:Verify the functionality of free sign up link
Given I am on the home page
When I click on Login page and verify the login page appears
And I click on Sign up for free link
Then I enter "<Full Name>", "<Email>", "<Password>", "<Confirm Password>" and "<Phone Number>"
And i click on Sign up button
And i get a message of Email being registered successfully
And I click on ask ganesha icon
Examples:
| Full Name | Email              | Password | Confirm Password | Phone Number |	
| Full Name | Email    | Password | Confirm Password | Phone Number |	


Scenario:Try to sign in using valid username and password 
Given I am on the home page
When I click on Login page and verify the login page appears
And i enter valid email and valid password
Then I verify the user is able to login successfully













