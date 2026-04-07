Feature: Verify the functionalitty of Love icon and associated pages on Ask Ganesha site	

Scenario: Verify the fuunctionality of clicking the Love icon on the home pageGiven I am on the home page
And I click on Love icon
Then I verify the Love page appears

Scenario:Verify the functionality of clicking the Ask a question Love image on the Love page
Given I click on Askaquestiononlove image
Then I verify the Ask a question on love page appears
And I navigate back to love page

Scenario:Verify the functionality of clicking the Ask a question on Love link on the Love page
Given I click on Ask a question on Love link
Then I verify the Ask a question on love page appears
And the select option section is displayed
And Order report button is displayed
And I verify the list of questions is displayed
And I navigate back to love page


Scenario:Verify the functionality of clicking the Ask a question service link on love page
Given I click on Ask a question service link on love page
Then I verify the Ask a question on love page appears
And the select option section is displayed
And Order report button is displayed
And I verify the list of questions is displayed
And I navigate back to love page

Scenario:Verify the functionality of clicking Read More on Ask a question on Love section on love page
Given I click on Read More button in Ask a question on Love section on love page
Then I verify the Ask a question on love page appears
And the select option section is displayed
And Order report button is displayed
Then I verify the list of questions is displayed
And I navigate back to love page

Scenario: Verify the functionality of directly entering the love prediction page url 
Given I enter the direct url for landing to the love prediction page
Then I verify the Ask a question on love page appears
And the select option section is displayed
And Order report button is displayed
And I verify the list of questions is displayed
And I navigate back to love page



