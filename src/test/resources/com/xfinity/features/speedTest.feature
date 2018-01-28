@smoke
Feature: The xfinity project

Scenario: The xfinity speed projects
	Given The user Sets Implicit wait to 30 seconds
	When The user Navigate to http://speedtest.xfinity.com/
	When The user Wait until Start Test button is clickable
	When The user Click on Start Test button
	And  The user  Wait until Blinking Download icon disappears
	When The user  Read Download speed value into a variable
	When The user  Wait until Blinking Upload icon disappears
	When The user  Read Upload speed value into a variable
	Then The user Set Following Conditions: 


