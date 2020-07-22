#Author:Vipin
Feature: My First Feature File

Background: Chrome Browser Launched
Given Launching the flipkard website
#======================================================================
Scenario: Launch FaceBook
Given User Launches Chrome Browser
And Verify the title
When User Enters UserName
And User Enters Password
Then User Click Submit Button
#========================================================================
Scenario: Launch SnapDeal Website
Given User Launches SnapDeal Website
#=========================================================================
Scenario: Launch FaceBook
Given User Launches Chrome Browser
And Verify the title
Then User enter Username "vip" and Password "pass"
#==============================================================================
Scenario: Launch Firefox
Given User Launches SnapDeal Website in firefox
#===============================================================================
Scenario: Launch Firefox
Given User Launches Amazon Webisite in firefox
##===============================================================================
Scenario: Launch Instagram Social Media Page
Given User Launches Chrome Browser
And Verify the title
When User Enters UserName
And User Enters Password
Then User Click Submit Button
##===============================================================================







