Feature: Login Page

@Single
Scenario: Successful Login with Valid Credentials

 
   Given User launch application 
 
   When  User enters Username as "Admin"  and Password as "admin123" 
   
   And   Click on Login 
  
   Then  Page title should be "Dashboard / nopCommerce administration" 
  
   #Pre_Requisite condition close/quite browsers code put in hooks class
   #
   #@Multiple 
   #Scenario Outline: Login Data Driven
#
   #precondition
   #Given  User launch application 
   #When   User enters Email as "<email>"  and Password as "<password>"
   #And    Click on Login
   #Then   Page title should be "<Title>"
   #When   User click on Log out link
  #
  #
   #
   #Examples:
       #|email               |password|Title                                 |
       #|admin@yourstore.com |admin   |Dashboard / nopCommerce administration|
       #|admin1@yourstore.com|admin   |Dashboard / nopCommerce administration|
   