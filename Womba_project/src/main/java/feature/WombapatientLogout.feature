@gggg
Feature: Logout womba 

 

Scenario: After successfull login we should be able to logout
Given User should be already logged in
And User click on loggout button
Then User should be able to logout succesfully