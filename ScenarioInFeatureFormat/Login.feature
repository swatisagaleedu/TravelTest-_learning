Feature:Login
Background:
Given User navigate to travel test website

@smoke @sanity
Scenario: Verify the functionality of login link 

Given User launch an chrome browser 
When User click on login link
And verify login page has been open or not 
Then User close chrome browser

@validation
Scenario Outline: Verify the functionality of login link 

Given User launch an chrome browser
And User navigate to travel test website
And User click on login link
When User email address is "<email>" and user password is "<password>"
And User click on login button
And Verify user been login or not by checking its url should be "<url>" if test cases is 
Then User close chrome browser


Examples:
|email|password|url|message|
|softwaretestingai708@atomicmail.io|ITvedant@708|https://travel-test-bug.vercel.app/|Valid|
|softwaretestingai708@@@atomicmail.io|I|https://travel-test-khaki.vercel.app/login|Invalid|