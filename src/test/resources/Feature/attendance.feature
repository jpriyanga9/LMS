#Auth or : your.email@your.domain.com
#Keyw or ds Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes  or  validation
#And,But: To enumerate m or e Given,When,Then steps
#Scenario Outline: List of steps f or  data-driven as an Examples and <placeholder>
#Examples: Container f or  s table
#Background: List of steps run bef or e each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags or Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: attendance

  Scenario: Validating the Attendance Header
    Given Admin or User or Staff Logged on to LMS Website
    When Admin or User or Staff Clicks on Attendance button
    Then Admin or User or Staff see header text as Manage Attendance

  Scenario: Validating the Attendance Footer
    Given Admin or User or Staff Logged on to LMS Website
    When Admin or User or Staff is on Manage Attandance page
    Then Admin or User or Staff see Footer text as In total there are 5 entries

  Scenario: Validating the Attendance Paginat or
    Given Admin or User or Staff Logged on to LMS Website
    When Admin or User or Staff is on Manage Attendance page
    Then Admin or User or Staff see the text as Showing 1 to 5 of 5 entries

  Scenario: Verify All pagination button on the Attendance page
    Given Admin or User or Staff Logged on to LMS Website
    When Admin or User or Staff is on Manage Attendance page 
    Then Admin or User or Staff see all paginator  buttons are Disabled

  Scenario: Verify the Edit button
    Given User or Staff is on Manage Attendance page
    When User or Staff Clicks on Edit buttons
    Then Admin see header text as Attendance Details

  Scenario: Edit ProgramName in Attendance Details window
    Given User or Staff Click on Edit page
    When User or Staff clicks on Save button after changing Program Name
    Then User or Staff see the success messageone Updated Successfully

  Scenario: Edit User Name Attendance Details window
    Given User or Staff Clicks on Edit button
    When User or Staff clicks on Save button after changing User name
    Then User or Staff see the success messagetwo Updated Successfully

  Scenario: Edit Present in Attendance Details window
    Given User or Staff Clicks on Edit button
    When User or Staff clicks on Save button after disabling Present details
    Then User or Staff see the success messagethree Updated Successfully

  Scenario: Edit Absent in Attendance Details window
    Given User or Staff Clicks on Edit button
    When User or Staff clicks on Save button after enabling Absent details
    Then User or Staff see the success messagefour Updated Successfully

  Scenario: Click on Cancel button in Attendance Details window
    Given User or Staff Clicks on Edit button
    When User or Staff clicks on Cancel button after entering details
    Then User or Staff see a Attendance Details window getting closed

  Scenario: Admin Verify the Edit button
    Given Admin is on Manage Attendance page
    When Admin Clicks on Edit button
    Then Admin see Err or  Message Admin Has View Only Permission

  Scenario: Verify the Delete Functionality
    Given User or Staff is on Manage Attendance page
    When User or Staff Clicks on Delete button
    Then Admin see header text as Delete Confirm

  Scenario: Click on Yes button in Delete Confirm window
    Given User or Staff Clicks on Delete Confirm
    When User or Staff Clicks on Yes button
    Then User or Staff see Success message Program Deleted Succesfully

  Scenario: Click on No button in Delete Confirm window
    Given User or Staff Clicks on Delete option
    When User or Staff Clicks on No button
    Then User or Staff can see Program Name not deleted

  Scenario: Admin Verify the Delete Functionality
    Given Admin is on Manage Attendance page
    When Admin Clicks on Delete button
    Then Admin see Err or  Message Admin Has View Only Permission

  Scenario: Verifying the Checkbox functionality of a Program Name
    Given Admin or User or Staff is on Manage Attendance page
    When Admin or User or Staff Clicks on Checkbox
    Then Admin or User or Staff see list of Users in that Program

  Scenario: Verifying the Functionality of a Present button
    Given Admin or User or Staff is on Manage Attendance page
    When Admin or User or Staff Clicks on Present
    Then Admin or User or Staff see the list of User Name who are Present

  Scenario: Verifying the Functionality of a Absent button
    Given Admin or User or Staff is on Manage Attendance page
    When Admin or User or Staff Clicks on Absent
    Then Admin or User or Staff see the list of User Name who are Absent
