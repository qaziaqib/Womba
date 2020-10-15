Feature: Login for patient

@smoketest

Scenario: Login functionality with valid credentials

 

When Enter the url for womba application and userid 
And Enter password
Then I should be login to womba application


@smoketest
Scenario: Patient change language feature

 

When User is logged in to womba application 
And Clicks on Change language button from navigation bar
Then Select language and application language is changed
