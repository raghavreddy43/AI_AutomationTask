Feature:  As a user I should be launch and navigate to Ao Home page Successfully, and complete rest of the user journey

@Automated @Regression
Scenario: 1. Verify that the user able to navigate to Ao Home page and ensure that returned results are filtered product based on the selection Successfully
Given user navigate to Ao Home page
When user entered text as Washing machines in search box
And click on search button
And select a brand called Beko from brand lister page
When I select energy rating as A+++ check box
And select colour as White option
And select Wash Load option as Large
Then validate the return results are expected colour and wash load
And also validate the return results are expected energy rating
Then Close the browser