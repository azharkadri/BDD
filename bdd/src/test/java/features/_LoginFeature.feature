Feature: login feature
Scenario Outline: login scenario

Given open the browser
When enter the URL
Then login page should be displayed
When enter the username "<username>" and password "<password>"
And click on login button
Then home page should be displayed

Examples:
| username | password |
| azharkadrigj | nAWADA@1992 |
| azharkadrigj@gmail.com | NAWADA@1992 |
| azharkadrigj | NAWADA@1992 |
| azharkadrigj@gmail.com | nAWADA@1992 |