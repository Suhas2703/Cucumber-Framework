Feature: Login 
Scenario Outline: Login to actitime and create task

Given when user enters "<url>"
When user enters valid "<email>" and "<password>"
Then click on login button
When user clicks on tasks
Then click on new task

Examples:
			|url||email||password|
			|https://demo.actitime.com/login.do||admin||manager|
			|https://demo.actitime.com/login.do||trainee||trainee|