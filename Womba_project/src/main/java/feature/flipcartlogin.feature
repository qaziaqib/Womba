Feature: Login
  

 
 Scenario Outline: login functionality with valid credentials 
 Given Open flipcart login page
 And Enter username "<phoneno>"and password "<password>" and click on submit 
    
 Then System should be able to login
 Examples:
 |password|phoneno|
 |admin@123|9731014207|
   

