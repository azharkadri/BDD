Feature: login

Scenario Outline: login scenario

When launch the browser
Given enter the URL "https://www.linkedin.com/login"
And enter emailOrPhone "<emailOrPhone>" and password "<password>" 
And click on sign in button
Then check sign in page title "https://www.linkedin.com/feed/?trk=guest_homepage-basic_nav-header-signin"
#And sign out
And close the browser

Examples:
| emailOrPhone | password |
| azharkadrigj | nAWADA@1992 |
| azharkadrigj@gmail.com | NAWADA@1992 |
| azharkadrigj | NAWADA@1992 |
| azharkadrigj@gmail.com | nAWADA@1992 |